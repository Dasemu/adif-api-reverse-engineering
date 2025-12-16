package o0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540q {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8022a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f8023b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f8024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8025d;

    /* renamed from: e, reason: collision with root package name */
    public final StateFlow f8026e;

    /* renamed from: f, reason: collision with root package name */
    public final StateFlow f8027f;

    /* renamed from: g, reason: collision with root package name */
    public final V f8028g;
    public final /* synthetic */ AbstractC0544v h;

    public C0540q(AbstractC0544v abstractC0544v, V navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.h = abstractC0544v;
        this.f8022a = new ReentrantLock(true);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f8023b = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.f8024c = MutableStateFlow2;
        this.f8026e = FlowKt.asStateFlow(MutableStateFlow);
        this.f8027f = FlowKt.asStateFlow(MutableStateFlow2);
        this.f8028g = navigator;
    }

    public final void a(C0537n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f8022a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f8023b;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection<? extends C0537n>) mutableStateFlow.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0537n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        MutableStateFlow mutableStateFlow = this.f8023b;
        mutableStateFlow.setValue(CollectionsKt.plus((Collection<? extends C0537n>) CollectionsKt.minus((Iterable<? extends Object>) mutableStateFlow.getValue(), CollectionsKt.last((List) mutableStateFlow.getValue())), backStackEntry));
    }

    public final void c(C0537n popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        AbstractC0544v abstractC0544v = this.h;
        V b4 = abstractC0544v.f8066v.b(popUpTo.f8006b.f7920a);
        if (!Intrinsics.areEqual(b4, this.f8028g)) {
            Object obj = abstractC0544v.f8067w.get(b4);
            Intrinsics.checkNotNull(obj);
            ((C0540q) obj).c(popUpTo, z3);
            return;
        }
        C0542t c0542t = abstractC0544v.f8069y;
        if (c0542t != null) {
            c0542t.invoke(popUpTo);
            d(popUpTo);
            return;
        }
        a0.b onComplete = new a0.b(this, popUpTo, z3);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ArrayDeque arrayDeque = abstractC0544v.f8054g;
        int indexOf = arrayDeque.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != arrayDeque.size()) {
            abstractC0544v.r(((C0537n) arrayDeque.get(i)).f8006b.h, true, false);
        }
        AbstractC0544v.t(abstractC0544v, popUpTo);
        onComplete.invoke();
        abstractC0544v.z();
        abstractC0544v.c();
    }

    public final void d(C0537n popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f8022a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f8023b;
            Iterable iterable = (Iterable) mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.areEqual((C0537n) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void e(C0537n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        AbstractC0544v abstractC0544v = this.h;
        V b4 = abstractC0544v.f8066v.b(backStackEntry.f8006b.f7920a);
        if (!Intrinsics.areEqual(b4, this.f8028g)) {
            Object obj = abstractC0544v.f8067w.get(b4);
            if (obj == null) {
                throw new IllegalStateException(C.w.r(new StringBuilder("NavigatorBackStack for "), backStackEntry.f8006b.f7920a, " should already be created").toString());
            }
            ((C0540q) obj).e(backStackEntry);
            return;
        }
        ?? r02 = abstractC0544v.f8068x;
        if (r02 != 0) {
            r02.invoke(backStackEntry);
            a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f8006b + " outside of the call to navigate(). ");
        }
    }
}
