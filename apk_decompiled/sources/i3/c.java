package i3;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.G;

/* loaded from: classes3.dex */
public final class c extends r3.o {

    /* renamed from: b, reason: collision with root package name */
    public final long f6831b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6832c;

    /* renamed from: d, reason: collision with root package name */
    public long f6833d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f6835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, G delegate, long j4) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6835f = eVar;
        this.f6831b = j4;
    }

    @Override // r3.o, r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6834e) {
            return;
        }
        this.f6834e = true;
        long j4 = this.f6831b;
        if (j4 != -1 && this.f6833d != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            d(null);
        } catch (IOException e4) {
            throw d(e4);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f6832c) {
            return iOException;
        }
        this.f6832c = true;
        return this.f6835f.a(false, true, iOException);
    }

    @Override // r3.o, r3.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e4) {
            throw d(e4);
        }
    }

    @Override // r3.o, r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f6834e) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f6831b;
        if (j5 == -1 || this.f6833d + j4 <= j5) {
            try {
                super.z(source, j4);
                this.f6833d += j4;
                return;
            } catch (IOException e4) {
                throw d(e4);
            }
        }
        throw new ProtocolException("expected " + j5 + " bytes but received " + (this.f6833d + j4));
    }
}
