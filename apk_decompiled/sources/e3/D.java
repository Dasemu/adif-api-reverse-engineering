package e3;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.C0579k;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class D extends M {

    /* renamed from: e, reason: collision with root package name */
    public static final A f6207e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f6208f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f6209g;
    public static final byte[] h;
    public static final byte[] i;

    /* renamed from: a, reason: collision with root package name */
    public final C0579k f6210a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6211b;

    /* renamed from: c, reason: collision with root package name */
    public final A f6212c;

    /* renamed from: d, reason: collision with root package name */
    public long f6213d;

    static {
        Pattern pattern = A.f6197d;
        f6207e = z.a("multipart/mixed");
        z.a("multipart/alternative");
        z.a("multipart/digest");
        z.a("multipart/parallel");
        f6208f = z.a("multipart/form-data");
        f6209g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public D(C0579k boundaryByteString, A type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f6210a = boundaryByteString;
        this.f6211b = parts;
        Pattern pattern = A.f6197d;
        this.f6212c = z.a(type + "; boundary=" + boundaryByteString.q());
        this.f6213d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(InterfaceC0577i interfaceC0577i, boolean z3) {
        C0576h c0576h;
        InterfaceC0577i interfaceC0577i2;
        if (z3) {
            Object obj = new Object();
            c0576h = obj;
            interfaceC0577i2 = obj;
        } else {
            c0576h = null;
            interfaceC0577i2 = interfaceC0577i;
        }
        List list = this.f6211b;
        int size = list.size();
        long j4 = 0;
        int i4 = 0;
        while (true) {
            C0579k c0579k = this.f6210a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i4 >= size) {
                Intrinsics.checkNotNull(interfaceC0577i2);
                interfaceC0577i2.E(bArr);
                interfaceC0577i2.F(c0579k);
                interfaceC0577i2.E(bArr);
                interfaceC0577i2.E(bArr2);
                if (!z3) {
                    return j4;
                }
                Intrinsics.checkNotNull(c0576h);
                long j5 = j4 + c0576h.f8284b;
                c0576h.d();
                return j5;
            }
            C c4 = (C) list.get(i4);
            C0334u c0334u = c4.f6205a;
            Intrinsics.checkNotNull(interfaceC0577i2);
            interfaceC0577i2.E(bArr);
            interfaceC0577i2.F(c0579k);
            interfaceC0577i2.E(bArr2);
            if (c0334u != null) {
                int size2 = c0334u.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    interfaceC0577i2.Q(c0334u.b(i5)).E(f6209g).Q(c0334u.f(i5)).E(bArr2);
                }
            }
            M m4 = c4.f6206b;
            A contentType = m4.contentType();
            if (contentType != null) {
                interfaceC0577i2.Q("Content-Type: ").Q(contentType.f6199a).E(bArr2);
            }
            long contentLength = m4.contentLength();
            if (contentLength != -1) {
                interfaceC0577i2.Q("Content-Length: ").R(contentLength).E(bArr2);
            } else if (z3) {
                Intrinsics.checkNotNull(c0576h);
                c0576h.d();
                return -1L;
            }
            interfaceC0577i2.E(bArr2);
            if (z3) {
                j4 += contentLength;
            } else {
                m4.writeTo(interfaceC0577i2);
            }
            interfaceC0577i2.E(bArr2);
            i4++;
        }
    }

    @Override // e3.M
    public final long contentLength() {
        long j4 = this.f6213d;
        if (j4 != -1) {
            return j4;
        }
        long a2 = a(null, true);
        this.f6213d = a2;
        return a2;
    }

    @Override // e3.M
    public final A contentType() {
        return this.f6212c;
    }

    @Override // e3.M
    public final void writeTo(InterfaceC0577i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
