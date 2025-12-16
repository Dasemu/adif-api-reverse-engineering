package i3;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.I;
import r3.p;

/* loaded from: classes3.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f6836a;

    /* renamed from: b, reason: collision with root package name */
    public long f6837b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6838c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6839d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f6841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, I delegate, long j4) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6841f = eVar;
        this.f6836a = j4;
        this.f6838c = true;
        if (j4 == 0) {
            d(null);
        }
    }

    @Override // r3.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6840e) {
            return;
        }
        this.f6840e = true;
        try {
            super.close();
            d(null);
        } catch (IOException e4) {
            throw d(e4);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f6839d) {
            return iOException;
        }
        this.f6839d = true;
        e eVar = this.f6841f;
        if (iOException == null && this.f6838c) {
            this.f6838c = false;
            eVar.getClass();
            j call = eVar.f6842a;
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // r3.p, r3.I
    public final long read(C0576h sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f6840e) {
            throw new IllegalStateException("closed");
        }
        try {
            long read = delegate().read(sink, j4);
            if (this.f6838c) {
                this.f6838c = false;
                e eVar = this.f6841f;
                eVar.getClass();
                j call = eVar.f6842a;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            if (read == -1) {
                d(null);
                return -1L;
            }
            long j5 = this.f6837b + read;
            long j6 = this.f6836a;
            if (j6 == -1 || j5 <= j6) {
                this.f6837b = j5;
                if (j5 == j6) {
                    d(null);
                }
                return read;
            }
            throw new ProtocolException("expected " + j6 + " bytes but received " + j5);
        } catch (IOException e4) {
            throw d(e4);
        }
    }
}
