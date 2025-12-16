package e3;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public final class Q extends T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6307a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f6308b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6309c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0578j f6310d;

    public Q(A a2, long j4, InterfaceC0578j interfaceC0578j) {
        this.f6309c = a2;
        this.f6308b = j4;
        this.f6310d = interfaceC0578j;
    }

    @Override // e3.T
    public final long contentLength() {
        switch (this.f6307a) {
            case 0:
                return this.f6308b;
            default:
                return this.f6308b;
        }
    }

    @Override // e3.T
    public final A contentType() {
        Object obj = this.f6309c;
        switch (this.f6307a) {
            case 0:
                return (A) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = A.f6197d;
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    return z.a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // e3.T
    public final InterfaceC0578j source() {
        switch (this.f6307a) {
            case 0:
                return this.f6310d;
            default:
                return (r3.C) this.f6310d;
        }
    }

    public Q(String str, long j4, r3.C source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6309c = str;
        this.f6308b = j4;
        this.f6310d = source;
    }
}
