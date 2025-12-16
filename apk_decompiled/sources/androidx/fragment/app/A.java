package androidx.fragment.app;

import d.AbstractC0294c;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class A extends AbstractC0294c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2977a;

    public A(AtomicReference atomicReference) {
        this.f2977a = atomicReference;
    }

    @Override // d.AbstractC0294c
    public final void a(Object obj) {
        AbstractC0294c abstractC0294c = (AbstractC0294c) this.f2977a.get();
        if (abstractC0294c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC0294c.a(obj);
    }
}
