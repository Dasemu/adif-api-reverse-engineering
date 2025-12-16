package s3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.I;
import r3.p;

/* loaded from: classes3.dex */
public final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f8481a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8482b;

    /* renamed from: c, reason: collision with root package name */
    public long f8483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(I delegate, long j4, boolean z3) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8481a = j4;
        this.f8482b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, r3.h] */
    @Override // r3.p, r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j5 = this.f8483c;
        long j6 = this.f8481a;
        if (j5 > j6) {
            j4 = 0;
        } else if (this.f8482b) {
            long j7 = j6 - j5;
            if (j7 == 0) {
                return -1L;
            }
            j4 = Math.min(j4, j7);
        }
        long read = super.read(sink, j4);
        if (read != -1) {
            this.f8483c += read;
        }
        long j8 = this.f8483c;
        if ((j8 >= j6 || read != -1) && j8 <= j6) {
            return read;
        }
        if (read > 0 && j8 > j6) {
            long j9 = sink.f8284b - (j8 - j6);
            ?? obj = new Object();
            obj.D(sink);
            sink.z(obj, j9);
            obj.d();
        }
        throw new IOException("expected " + j6 + " bytes but got " + this.f8483c);
    }
}
