package h3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6778a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6779b;

    /* renamed from: c, reason: collision with root package name */
    public c f6780c;

    /* renamed from: d, reason: collision with root package name */
    public long f6781d;

    public a(String name, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6778a = name;
        this.f6779b = z3;
        this.f6781d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f6778a;
    }
}
