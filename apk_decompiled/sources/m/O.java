package m;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class O extends F.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7601g;
    public final /* synthetic */ T h;

    public O(T t2, int i, int i4, WeakReference weakReference) {
        this.h = t2;
        this.f7599e = i;
        this.f7600f = i4;
        this.f7601g = weakReference;
    }

    @Override // F.b
    public final void g(int i) {
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        int i = this.f7599e;
        if (i != -1) {
            typeface = S.a(typeface, i, (this.f7600f & 2) != 0);
        }
        T t2 = this.h;
        if (t2.f7618m) {
            t2.f7617l = typeface;
            TextView textView = (TextView) this.f7601g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.recyclerview.widget.I(textView, typeface, t2.f7615j));
                } else {
                    textView.setTypeface(typeface, t2.f7615j);
                }
            }
        }
    }
}
