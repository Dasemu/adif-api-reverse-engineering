package l3;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.InterfaceC0577i;

/* loaded from: classes3.dex */
public final class z implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f7491f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0577i f7492a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576h f7493b;

    /* renamed from: c, reason: collision with root package name */
    public int f7494c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7495d;

    /* renamed from: e, reason: collision with root package name */
    public final e f7496e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r3.h] */
    public z(InterfaceC0577i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f7492a = sink;
        ?? obj = new Object();
        this.f7493b = obj;
        this.f7494c = 16384;
        this.f7496e = new e(obj);
    }

    public final synchronized void O(boolean z3, int i, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f7495d) {
            throw new IOException("closed");
        }
        this.f7496e.d(headerBlock);
        long j4 = this.f7493b.f8284b;
        long min = Math.min(this.f7494c, j4);
        int i4 = j4 == min ? 4 : 0;
        if (z3) {
            i4 |= 1;
        }
        s(i, (int) min, 1, i4);
        this.f7492a.z(this.f7493b, min);
        if (j4 > min) {
            long j5 = j4 - min;
            while (j5 > 0) {
                long min2 = Math.min(this.f7494c, j5);
                j5 -= min2;
                s(i, (int) min2, 9, j5 == 0 ? 4 : 0);
                this.f7492a.z(this.f7493b, min2);
            }
        }
    }

    public final synchronized void Y(int i, int i4, boolean z3) {
        if (this.f7495d) {
            throw new IOException("closed");
        }
        s(0, 8, 6, z3 ? 1 : 0);
        this.f7492a.r(i);
        this.f7492a.r(i4);
        this.f7492a.flush();
    }

    public final synchronized void Z(int i, EnumC0439b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f7495d) {
            throw new IOException("closed");
        }
        if (errorCode.f7379a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        s(i, 4, 3, 0);
        this.f7492a.r(errorCode.f7379a);
        this.f7492a.flush();
    }

    public final synchronized void a0(int i, long j4) {
        if (this.f7495d) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        s(i, 4, 8, 0);
        this.f7492a.r((int) j4);
        this.f7492a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7495d = true;
        this.f7492a.close();
    }

    public final synchronized void d(C peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f7495d) {
                throw new IOException("closed");
            }
            int i = this.f7494c;
            int i4 = peerSettings.f7370a;
            if ((i4 & 32) != 0) {
                i = peerSettings.f7371b[5];
            }
            this.f7494c = i;
            if (((i4 & 2) != 0 ? peerSettings.f7371b[1] : -1) != -1) {
                e eVar = this.f7496e;
                int i5 = (i4 & 2) != 0 ? peerSettings.f7371b[1] : -1;
                eVar.getClass();
                int min = Math.min(i5, 16384);
                int i6 = eVar.f7397d;
                if (i6 != min) {
                    if (min < i6) {
                        eVar.f7395b = Math.min(eVar.f7395b, min);
                    }
                    eVar.f7396c = true;
                    eVar.f7397d = min;
                    int i7 = eVar.h;
                    if (min < i7) {
                        if (min == 0) {
                            ArraysKt___ArraysJvmKt.fill$default(eVar.f7398e, (Object) null, 0, 0, 6, (Object) null);
                            eVar.f7399f = eVar.f7398e.length - 1;
                            eVar.f7400g = 0;
                            eVar.h = 0;
                        } else {
                            eVar.a(i7 - min);
                        }
                    }
                }
            }
            s(0, 0, 4, 1);
            this.f7492a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(boolean z3, int i, C0576h c0576h, int i4) {
        if (this.f7495d) {
            throw new IOException("closed");
        }
        s(i, i4, 0, z3 ? 1 : 0);
        if (i4 > 0) {
            Intrinsics.checkNotNull(c0576h);
            this.f7492a.z(c0576h, i4);
        }
    }

    public final synchronized void flush() {
        if (this.f7495d) {
            throw new IOException("closed");
        }
        this.f7492a.flush();
    }

    public final void s(int i, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = f7491f;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i, i4, i5, i6));
        }
        if (i4 > this.f7494c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f7494c + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "reserved bit set: ").toString());
        }
        byte[] bArr = f3.c.f6469a;
        InterfaceC0577i interfaceC0577i = this.f7492a;
        Intrinsics.checkNotNullParameter(interfaceC0577i, "<this>");
        interfaceC0577i.y((i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        interfaceC0577i.y((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        interfaceC0577i.y(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        interfaceC0577i.y(i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        interfaceC0577i.y(i6 & KotlinVersion.MAX_COMPONENT_VALUE);
        interfaceC0577i.r(i & Integer.MAX_VALUE);
    }

    public final synchronized void x(int i, EnumC0439b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f7495d) {
            throw new IOException("closed");
        }
        if (errorCode.f7379a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        s(0, debugData.length + 8, 7, 0);
        this.f7492a.r(i);
        this.f7492a.r(errorCode.f7379a);
        if (debugData.length != 0) {
            this.f7492a.E(debugData);
        }
        this.f7492a.flush();
    }
}
