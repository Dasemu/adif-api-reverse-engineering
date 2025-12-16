package androidx.fragment.app;

import android.os.Handler;
import g.AbstractActivityC0364k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class V extends T {

    /* renamed from: a, reason: collision with root package name */
    public final P f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3075b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3076c;

    /* renamed from: d, reason: collision with root package name */
    public final C0160m0 f3077d;

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.fragment.app.m0, androidx.fragment.app.l0] */
    public V(AbstractActivityC0364k context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f3074a = context;
        this.f3075b = context;
        this.f3076c = handler;
        this.f3077d = new AbstractC0158l0();
    }
}
