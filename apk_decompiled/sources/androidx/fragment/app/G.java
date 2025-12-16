package androidx.fragment.app;

import d.AbstractC0300i;
import d.InterfaceC0293b;
import d.InterfaceC0301j;
import e.AbstractC0311a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0311a f3009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0293b f3010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f3011e;

    public G(K k4, F f2, AtomicReference atomicReference, AbstractC0311a abstractC0311a, InterfaceC0293b interfaceC0293b) {
        this.f3011e = k4;
        this.f3007a = f2;
        this.f3008b = atomicReference;
        this.f3009c = abstractC0311a;
        this.f3010d = interfaceC0293b;
    }

    @Override // androidx.fragment.app.I
    public final void a() {
        AbstractC0300i activityResultRegistry;
        K k4 = this.f3011e;
        String generateActivityResultKey = k4.generateActivityResultKey();
        F f2 = this.f3007a;
        switch (f2.f2995a) {
            case 0:
                K k5 = (K) f2.f2996b;
                Object obj = k5.mHost;
                if (!(obj instanceof InterfaceC0301j)) {
                    activityResultRegistry = k5.requireActivity().getActivityResultRegistry();
                    break;
                } else {
                    activityResultRegistry = ((InterfaceC0301j) obj).getActivityResultRegistry();
                    break;
                }
            default:
                activityResultRegistry = (AbstractC0300i) f2.f2996b;
                break;
        }
        this.f3008b.set(activityResultRegistry.c(generateActivityResultKey, k4, this.f3009c, this.f3010d));
    }
}
