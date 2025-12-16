package F2;

import O.X;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551a;

    /* renamed from: b, reason: collision with root package name */
    public int f552b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f553c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.b f555e;

    public g(SideSheetBehavior sideSheetBehavior) {
        this.f551a = 0;
        this.f555e = sideSheetBehavior;
        this.f554d = new f(this, 0);
    }

    public final void a(int i) {
        Runnable runnable = this.f554d;
        A.b bVar = this.f555e;
        switch (this.f551a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bVar;
                WeakReference weakReference = sideSheetBehavior.p;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.f552b = i;
                if (this.f553c) {
                    return;
                }
                WeakHashMap weakHashMap = X.f1226a;
                ((View) sideSheetBehavior.p.get()).postOnAnimation((f) runnable);
                this.f553c = true;
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
                WeakReference weakReference2 = bottomSheetBehavior.f5556U;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f552b = i;
                if (this.f553c) {
                    return;
                }
                WeakHashMap weakHashMap2 = X.f1226a;
                ((View) bottomSheetBehavior.f5556U.get()).postOnAnimation((F0.c) runnable);
                this.f553c = true;
                return;
        }
    }

    public g(BottomSheetBehavior bottomSheetBehavior) {
        this.f551a = 1;
        this.f555e = bottomSheetBehavior;
        this.f554d = new F0.c(this, 12);
    }
}
