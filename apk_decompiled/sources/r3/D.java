package r3;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8248a;

    /* renamed from: b, reason: collision with root package name */
    public int f8249b;

    /* renamed from: c, reason: collision with root package name */
    public int f8250c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8251d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8252e;

    /* renamed from: f, reason: collision with root package name */
    public D f8253f;

    /* renamed from: g, reason: collision with root package name */
    public D f8254g;

    public D() {
        this.f8248a = new byte[8192];
        this.f8252e = true;
        this.f8251d = false;
    }

    public final D a() {
        D d4 = this.f8253f;
        if (d4 == this) {
            d4 = null;
        }
        D d5 = this.f8254g;
        Intrinsics.checkNotNull(d5);
        d5.f8253f = this.f8253f;
        D d6 = this.f8253f;
        Intrinsics.checkNotNull(d6);
        d6.f8254g = this.f8254g;
        this.f8253f = null;
        this.f8254g = null;
        return d4;
    }

    public final void b(D segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f8254g = this;
        segment.f8253f = this.f8253f;
        D d4 = this.f8253f;
        Intrinsics.checkNotNull(d4);
        d4.f8254g = segment;
        this.f8253f = segment;
    }

    public final D c() {
        this.f8251d = true;
        return new D(this.f8248a, this.f8249b, this.f8250c, true);
    }

    public final void d(D sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f8252e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = sink.f8250c;
        int i5 = i4 + i;
        byte[] bArr = sink.f8248a;
        if (i5 > 8192) {
            if (sink.f8251d) {
                throw new IllegalArgumentException();
            }
            int i6 = sink.f8249b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i6, i4, 2, (Object) null);
            sink.f8250c -= sink.f8249b;
            sink.f8249b = 0;
        }
        int i7 = sink.f8250c;
        int i8 = this.f8249b;
        ArraysKt.copyInto(this.f8248a, bArr, i7, i8, i8 + i);
        sink.f8250c += i;
        this.f8249b += i;
    }

    public D(byte[] data, int i, int i4, boolean z3) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f8248a = data;
        this.f8249b = i;
        this.f8250c = i4;
        this.f8251d = z3;
        this.f8252e = false;
    }
}
