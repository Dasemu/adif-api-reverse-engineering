package T0;

import F.n;
import Y.o;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.databinding.FragmentBottomNavBinding;
import com.adif.elcanomovil.main.BottomNavFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import o0.AbstractC0544v;
import o0.C0537n;

/* loaded from: classes.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f1645a = i;
        this.f1646b = obj;
        this.f1647c = obj2;
        this.f1648d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        n0 n0Var;
        n0 n0Var2;
        switch (this.f1645a) {
            case 0:
                k kVar = (k) this.f1648d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f1647c;
                f fVar = (f) this.f1646b;
                fVar.getClass();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(kVar);
                } else {
                    fVar.f1637a.getViewTreeObserver().removeOnPreDrawListener(kVar);
                }
                return Unit.INSTANCE;
            case 1:
                Throwable th = (Throwable) obj;
                ((I1.b) this.f1646b).invoke(th);
                A.j jVar = (A.j) this.f1647c;
                ((Channel) jVar.f29c).close(th);
                do {
                    Object m1645getOrNullimpl = ChannelResult.m1645getOrNullimpl(((Channel) jVar.f29c).mo1635tryReceivePtdJZtk());
                    if (m1645getOrNullimpl == null) {
                        unit = null;
                    } else {
                        ((o) this.f1648d).invoke(m1645getOrNullimpl, th);
                        unit = Unit.INSTANCE;
                    }
                } while (unit != null);
                return Unit.INSTANCE;
            case 2:
                BottomNavInitialTab it = (BottomNavInitialTab) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((FragmentBottomNavBinding) this.f1646b).bottomNavigationView.setSelectedItemId(it.getTabId());
                ChildDirections directions = it.getDirections();
                if (directions != null) {
                    BottomNavFragment bottomNavFragment = (BottomNavFragment) this.f1647c;
                    AbstractC0544v abstractC0544v = (AbstractC0544v) this.f1648d;
                    BottomNavFragment.access$popExistingViewIfNeeded(bottomNavFragment, abstractC0544v, directions);
                    new Handler(Looper.getMainLooper()).post(new n(4, abstractC0544v, directions));
                }
                return Unit.INSTANCE;
            default:
                if (obj != null) {
                    ((Function1) this.f1646b).invoke(obj);
                    AbstractC0544v abstractC0544v2 = (AbstractC0544v) this.f1647c;
                    C0537n c0537n = (C0537n) abstractC0544v2.f8054g.lastOrNull();
                    String key = (String) this.f1648d;
                    if (c0537n != null && (n0Var2 = (n0) c0537n.f8014l.getValue()) != null) {
                        Intrinsics.checkNotNullParameter(key, "key");
                        n0Var2.f3404a.remove(key);
                        m0 m0Var = (m0) n0Var2.f3406c.remove(key);
                        if (m0Var != null) {
                            m0Var.f3402m = null;
                        }
                        n0Var2.f3407d.remove(key);
                    }
                    C0537n k4 = abstractC0544v2.k();
                    if (k4 != null && (n0Var = (n0) k4.f8014l.getValue()) != null) {
                        n0Var.d(null, key);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
