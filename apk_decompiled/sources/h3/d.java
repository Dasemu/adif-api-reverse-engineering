package h3;

import G2.f;
import I2.k;
import O.D0;
import O.InterfaceC0080v;
import O.X;
import P.t;
import a.AbstractC0106b;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.main.BottomNavFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.M;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l.C0428f;
import l.InterfaceC0433k;
import l.RunnableC0427e;
import l.SubMenuC0422E;
import l.ViewOnKeyListenerC0429g;
import l.m;
import l.o;
import l.x;
import m.C0472l;
import m.InterfaceC0478o;
import m.InterfaceC0498y0;
import m.O0;
import m.S0;
import o0.AbstractC0544v;
import o0.C0525b;
import o0.E;
import o0.H;
import o0.K;
import p2.InterfaceC0552a;
import s0.InterfaceC0584c;
import z2.InterfaceC0679i;

/* loaded from: classes3.dex */
public final class d implements InterfaceC0498y0, t, x, InterfaceC0433k, InterfaceC0080v, InterfaceC0552a, InterfaceC0584c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6790a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6791b;

    public /* synthetic */ d(Object obj, int i) {
        this.f6790a = i;
        this.f6791b = obj;
    }

    private final void j(m mVar) {
    }

    @Override // s0.InterfaceC0584c
    public void a(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6791b).setResultCode(i);
    }

    @Override // l.x
    public void b(m mVar, boolean z3) {
        if (mVar instanceof SubMenuC0422E) {
            ((SubMenuC0422E) mVar).f7179z.k().c(false);
        }
        x xVar = ((C0472l) this.f6791b).f7680e;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.InterfaceC0433k
    public boolean c(m mVar, MenuItem item) {
        boolean onMenuItemSelected;
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        Object obj = this.f6791b;
        switch (this.f6790a) {
            case 6:
                InterfaceC0478o interfaceC0478o = ((ActionMenuView) obj).f2412A;
                if (interfaceC0478o == null) {
                    return false;
                }
                Toolbar toolbar = ((O0) interfaceC0478o).f7602a;
                if (toolbar.f2467G.a(item)) {
                    onMenuItemSelected = true;
                } else {
                    S0 s02 = toolbar.f2469I;
                    onMenuItemSelected = s02 != null ? ((M) s02).f6555a.f6557b.f6671a.onMenuItemSelected(0, item) : false;
                }
                return onMenuItemSelected;
            default:
                BottomNavigationView bottomNavigationView = (BottomNavigationView) obj;
                if (bottomNavigationView.f9093f == null || item.getItemId() != bottomNavigationView.getSelectedItemId()) {
                    InterfaceC0679i interfaceC0679i = bottomNavigationView.f9092e;
                    if (interfaceC0679i == null) {
                        return false;
                    }
                    AbstractC0544v navController = (AbstractC0544v) ((k) interfaceC0679i).f823b;
                    Intrinsics.checkNotNullParameter(navController, "$navController");
                    Intrinsics.checkNotNullParameter(item, "item");
                    Intrinsics.checkNotNullParameter(item, "item");
                    Intrinsics.checkNotNullParameter(navController, "navController");
                    E g4 = navController.g();
                    Intrinsics.checkNotNull(g4);
                    H h = g4.f7921b;
                    Intrinsics.checkNotNull(h);
                    if (h.j(item.getItemId(), true) instanceof C0525b) {
                        i = R.anim.nav_default_enter_anim;
                        i4 = R.anim.nav_default_exit_anim;
                        i5 = R.anim.nav_default_pop_enter_anim;
                        i6 = R.anim.nav_default_pop_exit_anim;
                    } else {
                        i = R.animator.nav_default_enter_anim;
                        i4 = R.animator.nav_default_exit_anim;
                        i5 = R.animator.nav_default_pop_enter_anim;
                        i6 = R.animator.nav_default_pop_exit_anim;
                    }
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i5;
                    int i11 = i6;
                    if ((item.getOrder() & 196608) == 0) {
                        int i12 = H.f7930n;
                        i7 = AbstractC0106b.h(navController.i()).h;
                        z3 = true;
                    } else {
                        i7 = -1;
                        z3 = false;
                    }
                    try {
                        navController.m(item.getItemId(), null, new K(true, true, i7, false, z3, i8, i9, i10, i11));
                        E g5 = navController.g();
                        if (g5 != null) {
                            if (AbstractC0106b.u(g5, item.getItemId())) {
                                return false;
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    BottomNavFragment.f((BottomNavFragment) ((k) bottomNavigationView.f9093f).f823b, item);
                }
                return true;
        }
    }

    @Override // P.t
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f6791b;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = X.f1226a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f5534e;
        view.offsetLeftAndRight((!(i == 0 && z3) && (i != 1 || z3)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        f fVar = swipeDismissBehavior.f5531b;
        if (fVar != null) {
            fVar.a(view);
        }
        return true;
    }

    @Override // m.InterfaceC0498y0
    public void e(m mVar, o oVar) {
        ((ViewOnKeyListenerC0429g) this.f6791b).f7208f.removeCallbacksAndMessages(mVar);
    }

    @Override // l.x
    public boolean f(m mVar) {
        C0472l c0472l = (C0472l) this.f6791b;
        if (mVar == c0472l.f7678c) {
            return false;
        }
        c0472l.f7697y = ((SubMenuC0422E) mVar).f7178A.f7268a;
        x xVar = c0472l.f7680e;
        if (xVar != null) {
            return xVar.f(mVar);
        }
        return false;
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        o2.e eVar = (o2.e) this.f6791b;
        o2.d dVar = eVar.f8097m;
        if (dVar != null) {
            eVar.f8092f.f5558W.remove(dVar);
        }
        o2.d dVar2 = new o2.d(eVar.i, d02);
        eVar.f8097m = dVar2;
        dVar2.b(eVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = eVar.f8092f;
        o2.d dVar3 = eVar.f8097m;
        ArrayList arrayList = bottomSheetBehavior.f5558W;
        if (!arrayList.contains(dVar3)) {
            arrayList.add(dVar3);
        }
        return d02;
    }

    @Override // s0.InterfaceC0584c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.InterfaceC0433k
    public void i(m mVar) {
        switch (this.f6790a) {
            case 6:
                InterfaceC0433k interfaceC0433k = ((ActionMenuView) this.f6791b).f2418v;
                if (interfaceC0433k != null) {
                    interfaceC0433k.i(mVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // m.InterfaceC0498y0
    public void m(m mVar, o oVar) {
        ViewOnKeyListenerC0429g viewOnKeyListenerC0429g = (ViewOnKeyListenerC0429g) this.f6791b;
        viewOnKeyListenerC0429g.f7208f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0429g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C0428f) arrayList.get(i)).f7202b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        viewOnKeyListenerC0429g.f7208f.postAtTime(new RunnableC0427e(this, i4 < arrayList.size() ? (C0428f) arrayList.get(i4) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    public d() {
        this.f6790a = 1;
        this.f6791b = new LinkedHashSet();
    }

    public d(f3.b threadFactory) {
        this.f6790a = 0;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f6791b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}
