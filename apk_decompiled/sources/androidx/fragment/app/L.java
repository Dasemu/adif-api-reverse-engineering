package androidx.fragment.app;

import android.os.Bundle;
import v0.InterfaceC0638c;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements InterfaceC0638c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3051b;

    public /* synthetic */ L(Object obj, int i) {
        this.f3050a = i;
        this.f3051b = obj;
    }

    @Override // v0.InterfaceC0638c
    public final Bundle a() {
        switch (this.f3050a) {
            case 0:
                P p = (P) this.f3051b;
                p.markFragmentsCreated();
                p.mFragmentLifecycleRegistry.f(androidx.lifecycle.A.ON_STOP);
                return new Bundle();
            default:
                return ((AbstractC0158l0) this.f3051b).a0();
        }
    }
}
