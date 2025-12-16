package androidx.lifecycle;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194o implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3409a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3410b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3411c;

    public /* synthetic */ C0194o(int i, Object obj, Object obj2) {
        this.f3409a = i;
        this.f3410b = obj;
        this.f3411c = obj2;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J owner, A event) {
        Object obj = this.f3411c;
        Object obj2 = this.f3410b;
        switch (this.f3409a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                InterfaceC0192m interfaceC0192m = (InterfaceC0192m) obj2;
                switch (AbstractC0193n.$EnumSwitchMapping$0[event.ordinal()]) {
                    case 1:
                        interfaceC0192m.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 2:
                        interfaceC0192m.x(owner);
                        break;
                    case 3:
                        interfaceC0192m.d(owner);
                        break;
                    case 4:
                        interfaceC0192m.getClass();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        break;
                    case 5:
                        interfaceC0192m.O(owner);
                        break;
                    case 6:
                        interfaceC0192m.e(owner);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                H h = (H) obj;
                if (h != null) {
                    h.onStateChanged(owner, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == A.ON_START) {
                    ((C) obj2).c(this);
                    ((C0639d) obj).d();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C0184e) obj).f3353a;
                I i = (I) obj2;
                C0184e.a((List) hashMap.get(event), owner, event, i);
                C0184e.a((List) hashMap.get(A.ON_ANY), owner, event, i);
                return;
            case 3:
                androidx.viewpager2.adapter.f fVar = (androidx.viewpager2.adapter.f) obj;
                if (fVar.shouldDelayFragmentTransactions()) {
                    return;
                }
                owner.getLifecycle().c(this);
                androidx.viewpager2.adapter.g gVar = (androidx.viewpager2.adapter.g) obj2;
                FrameLayout frameLayout = (FrameLayout) gVar.itemView;
                WeakHashMap weakHashMap = O.X.f1226a;
                if (frameLayout.isAttachedToWindow()) {
                    fVar.placeFragmentInViewHolder(gVar);
                    return;
                }
                return;
            default:
                if (event == A.ON_DESTROY) {
                    ((Handler) obj2).removeCallbacks((androidx.viewpager2.adapter.a) obj);
                    owner.getLifecycle().c(this);
                    return;
                }
                return;
        }
    }

    public C0194o(InterfaceC0192m defaultLifecycleObserver, H h) {
        this.f3409a = 0;
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3410b = defaultLifecycleObserver;
        this.f3411c = h;
    }

    public C0194o(I i) {
        this.f3409a = 2;
        this.f3410b = i;
        C0186g c0186g = C0186g.f3369c;
        Class<?> cls = i.getClass();
        C0184e c0184e = (C0184e) c0186g.f3370a.get(cls);
        this.f3411c = c0184e == null ? c0186g.a(cls, null) : c0184e;
    }

    public C0194o(androidx.viewpager2.adapter.f fVar, androidx.viewpager2.adapter.g gVar) {
        this.f3409a = 3;
        this.f3411c = fVar;
        this.f3410b = gVar;
    }
}
