package F;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f502c;

    public /* synthetic */ o(int i, int i4, Object obj) {
        this.f500a = i4;
        this.f502c = obj;
        this.f501b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f500a) {
            case 0:
                ((b) this.f502c).g(this.f501b);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f502c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f501b, false);
                    return;
                }
                return;
        }
    }
}
