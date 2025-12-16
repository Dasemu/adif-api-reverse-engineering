package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2514c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2515d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2516a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f2517b;

    static {
        if (j.GENERATE_CANCELLATION_CAUSES) {
            f2515d = null;
            f2514c = null;
        } else {
            f2515d = new b(false, null);
            f2514c = new b(true, null);
        }
    }

    public b(boolean z3, CancellationException cancellationException) {
        this.f2516a = z3;
        this.f2517b = cancellationException;
    }
}
