package androidx.recyclerview.widget;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3554d;

    public /* synthetic */ I(Object obj, int i, int i4, Object obj2) {
        this.f3551a = i4;
        this.f3554d = obj;
        this.f3553c = obj2;
        this.f3552b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3551a) {
            case 0:
                N n4 = (N) this.f3554d;
                RecyclerView recyclerView = n4.f3601r;
                if (recyclerView == null || !recyclerView.f3705s) {
                    return;
                }
                H h = (H) this.f3553c;
                if (h.f3539k) {
                    return;
                }
                I0 i02 = h.f3535e;
                if (i02.getAbsoluteAdapterPosition() != -1) {
                    AbstractC0230m0 itemAnimator = n4.f3601r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList = n4.p;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            if (((H) arrayList.get(i)).f3540l) {
                            }
                        }
                        n4.f3597m.onSwiped(i02, this.f3552b);
                        return;
                    }
                    n4.f3601r.post(this);
                    return;
                }
                return;
            case 1:
                ((TextView) this.f3553c).setTypeface((Typeface) this.f3554d, this.f3552b);
                return;
            default:
                ((BottomSheetBehavior) this.f3554d).K((View) this.f3553c, this.f3552b, false);
                return;
        }
    }

    public I(TextView textView, Typeface typeface, int i) {
        this.f3551a = 1;
        this.f3553c = textView;
        this.f3554d = typeface;
        this.f3552b = i;
    }
}
