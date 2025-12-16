package N;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1123c;

    public d(int i) {
        super(i);
        this.f1123c = new Object();
    }

    @Override // N.c
    public final Object a() {
        Object a2;
        synchronized (this.f1123c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // N.c
    public final boolean c(Object instance) {
        boolean c4;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f1123c) {
            c4 = super.c(instance);
        }
        return c4;
    }
}
