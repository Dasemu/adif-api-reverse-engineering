package e3;

import kotlin.jvm.internal.Intrinsics;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class K extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f6276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f6278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6279d;

    public K(A a2, byte[] bArr, int i, int i4) {
        this.f6276a = a2;
        this.f6277b = i;
        this.f6278c = bArr;
        this.f6279d = i4;
    }

    @Override // e3.M
    public final long contentLength() {
        return this.f6277b;
    }

    @Override // e3.M
    public final A contentType() {
        return this.f6276a;
    }

    @Override // e3.M
    public final void writeTo(InterfaceC0577i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.L(this.f6279d, this.f6277b, this.f6278c);
    }
}
