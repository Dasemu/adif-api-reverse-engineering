package l0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends c {
    public /* synthetic */ d(int i) {
        this(C0435a.f7312b);
    }

    @Override // l0.c
    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f7313a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7313a.put(key, obj);
    }

    public d(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.f7313a.putAll(initialExtras.f7313a);
    }
}
