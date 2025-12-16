package g;

import O.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u extends m3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6670b;

    public /* synthetic */ u(Object obj, int i) {
        this.f6669a = i;
        this.f6670b = obj;
    }

    @Override // O.i0
    public final void a() {
        Object obj = this.f6670b;
        switch (this.f6669a) {
            case 0:
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = ((RunnableC0371s) obj).f6666b;
                layoutInflaterFactory2C0351E.f6537v.setAlpha(1.0f);
                layoutInflaterFactory2C0351E.f6540y.d(null);
                layoutInflaterFactory2C0351E.f6540y = null;
                return;
            case 1:
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E2 = (LayoutInflaterFactory2C0351E) obj;
                layoutInflaterFactory2C0351E2.f6537v.setAlpha(1.0f);
                layoutInflaterFactory2C0351E2.f6540y.d(null);
                layoutInflaterFactory2C0351E2.f6540y = null;
                return;
            default:
                F.i iVar = (F.i) obj;
                ((LayoutInflaterFactory2C0351E) iVar.f491c).f6537v.setVisibility(8);
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E3 = (LayoutInflaterFactory2C0351E) iVar.f491c;
                PopupWindow popupWindow = layoutInflaterFactory2C0351E3.f6538w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0351E3.f6537v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0351E3.f6537v.getParent();
                    WeakHashMap weakHashMap = X.f1226a;
                    O.J.c(view);
                }
                layoutInflaterFactory2C0351E3.f6537v.e();
                layoutInflaterFactory2C0351E3.f6540y.d(null);
                layoutInflaterFactory2C0351E3.f6540y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0351E3.f6495A;
                WeakHashMap weakHashMap2 = X.f1226a;
                O.J.c(viewGroup);
                return;
        }
    }

    @Override // m3.l, O.i0
    public void c() {
        Object obj = this.f6670b;
        switch (this.f6669a) {
            case 0:
                ((RunnableC0371s) obj).f6666b.f6537v.setVisibility(0);
                return;
            case 1:
                LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) obj;
                layoutInflaterFactory2C0351E.f6537v.setVisibility(0);
                if (layoutInflaterFactory2C0351E.f6537v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0351E.f6537v.getParent();
                    WeakHashMap weakHashMap = X.f1226a;
                    O.J.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
