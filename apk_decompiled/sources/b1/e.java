package b1;

import O.C0079u;
import a.AbstractC0106b;
import android.os.Bundle;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.C0221i;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.SnackBarEvents;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import com.adif.elcanomovil.main.MainActivity;
import com.adif.elcanomovil.main.MainActivity$showSnackBar$1$WhenMappings;
import com.adif.elcanomovil.uiDepartures.adapters.CirculationAdapter;
import com.adif.elcanomovil.uiDepartures.databinding.FragmentCirculationBinding;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel;
import d1.i;
import f0.C0338b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import o0.AbstractC0544v;
import o0.C0526c;
import o0.C0537n;
import o0.C0540q;
import o0.E;
import o0.H;
import o0.K;
import o0.L;
import o0.V;

/* loaded from: classes.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        super(1);
        this.f4165a = i;
        this.f4166b = obj;
        this.f4167c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [o0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [o0.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        V v3;
        Bundle bundle;
        E destination;
        Object obj2 = this.f4166b;
        Object obj3 = this.f4167c;
        switch (this.f4165a) {
            case 0:
                d dVar = (d) obj;
                if (dVar instanceof C0267b) {
                    ((Function1) obj2).invoke(((C0267b) dVar).f4164a);
                    f fVar = (f) obj3;
                    fVar.f4168a.k(fVar.f4169b);
                }
                return Unit.INSTANCE;
            case 1:
                SnackBarEvents it = (SnackBarEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (MainActivity$showSnackBar$1$WhenMappings.$EnumSwitchMapping$0[it.ordinal()] == 3) {
                    MainActivity.access$getViewModel((MainActivity) obj2).handleSnackBarTap((NotificationPayload) obj3);
                }
                return Unit.INSTANCE;
            case 2:
                List<Object> list = (List) obj;
                FragmentCirculationBinding fragmentCirculationBinding = (FragmentCirculationBinding) obj2;
                if (list.isEmpty()) {
                    RecyclerView recyclerView = fragmentCirculationBinding.circulations;
                    CirculationsFragment circulationsFragment = (CirculationsFragment) obj3;
                    CirculationType pageType = CirculationsFragment.access$getViewModel(circulationsFragment).getPageType();
                    if (pageType == null) {
                        pageType = CirculationType.DEPARTURE;
                    }
                    recyclerView.setAdapter(new CirculationAdapter(pageType, new com.adif.elcanomovil.uiDepartures.main.c(1, CirculationsFragment.access$getViewModel(circulationsFragment), CirculationsViewModel.class, "handleCirculationObservationTap", "handleCirculationObservationTap(Ljava/lang/String;)V", 0, 6), new com.adif.elcanomovil.uiDepartures.main.c(circulationsFragment)));
                } else {
                    AbstractC0220h0 adapter = fragmentCirculationBinding.circulations.getAdapter();
                    CirculationAdapter circulationAdapter = adapter instanceof CirculationAdapter ? (CirculationAdapter) adapter : null;
                    if (circulationAdapter != null) {
                        circulationAdapter.submitList(list);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                C0221i c0221i = (C0221i) obj2;
                ?? event = (Lambda) obj3;
                Intrinsics.checkNotNullParameter(event, "event");
                ((i) c0221i.f3825c).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - c0221i.f3824b >= 1000) {
                    event.invoke(obj);
                    c0221i.f3824b = currentTimeMillis;
                }
                return Unit.INSTANCE;
            case 4:
                L navOptions = (L) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.getClass();
                C0526c animBuilder = C0526c.f7978d;
                Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
                ?? obj4 = new Object();
                obj4.f7986a = -1;
                obj4.f7987b = -1;
                animBuilder.invoke(obj4);
                int i = obj4.f7986a;
                C0079u c0079u = navOptions.f7944a;
                c0079u.f1298a = i;
                c0079u.f1299b = obj4.f7987b;
                E e4 = (E) obj2;
                if (e4 instanceof H) {
                    int i4 = E.f7919j;
                    Intrinsics.checkNotNullParameter(e4, "<this>");
                    Iterator it2 = SequencesKt.generateSequence(e4, C0526c.h).iterator();
                    while (true) {
                        AbstractC0544v abstractC0544v = (AbstractC0544v) obj3;
                        if (it2.hasNext()) {
                            E e5 = (E) it2.next();
                            E g4 = abstractC0544v.g();
                            if (Intrinsics.areEqual(e5, g4 != null ? g4.f7921b : null)) {
                            }
                        } else {
                            int i5 = H.f7930n;
                            int i6 = AbstractC0106b.h(abstractC0544v.i()).h;
                            C0526c popUpToBuilder = C0526c.f7979e;
                            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                            navOptions.f7946c = i6;
                            ?? obj5 = new Object();
                            popUpToBuilder.invoke(obj5);
                            navOptions.f7947d = obj5.f7968a;
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                C0537n backStackEntry = (C0537n) obj;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                E e6 = backStackEntry.f8006b;
                if (e6 == null) {
                    e6 = null;
                }
                if (e6 == null || (destination = (v3 = (V) obj2).c(e6, (bundle = backStackEntry.f8007c), (K) obj3)) == null) {
                    return null;
                }
                if (Intrinsics.areEqual(destination, e6)) {
                    return backStackEntry;
                }
                C0540q b4 = v3.b();
                Bundle b5 = destination.b(bundle);
                Intrinsics.checkNotNullParameter(destination, "destination");
                AbstractC0544v abstractC0544v2 = b4.h;
                return C0338b.k(abstractC0544v2.f8048a, destination, b5, abstractC0544v2.j(), abstractC0544v2.p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(C0221i c0221i, Function1 function1) {
        super(1);
        this.f4165a = 3;
        this.f4166b = c0221i;
        this.f4167c = (Lambda) function1;
    }
}
