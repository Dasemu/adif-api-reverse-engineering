package androidx.fragment.app;

import android.view.ViewGroup;
import b.C0253b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3033a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3034b;

    public boolean a() {
        return this instanceof C0153j;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(C0253b backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void e(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }
}
