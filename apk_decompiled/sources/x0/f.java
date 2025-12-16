package x0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final g f8860a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f8861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f8860a = callbackName;
        this.f8861b = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8861b;
    }
}
