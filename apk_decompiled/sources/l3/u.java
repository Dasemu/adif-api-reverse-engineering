package l3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.InterfaceC0578j;

/* loaded from: classes3.dex */
public final class u implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f7464d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0578j f7465a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7466b;

    /* renamed from: c, reason: collision with root package name */
    public final C0441d f7467c;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f7464d = logger;
    }

    public u(InterfaceC0578j source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7465a = source;
        t tVar = new t(source);
        this.f7466b = tVar;
        this.f7467c = new C0441d(tVar);
    }

    public final void O(l lVar, int i, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i4 & 8) != 0) {
            byte readByte = this.f7465a.readByte();
            byte[] bArr = f3.c.f6469a;
            i6 = readByte & UByte.MAX_VALUE;
        } else {
            i6 = 0;
        }
        int readInt = this.f7465a.readInt() & Integer.MAX_VALUE;
        List requestHeaders = s(s.a(i - 4, i4, i6), i6, i4, i5);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        q qVar = lVar.f7415b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (qVar) {
            if (qVar.f7450y.contains(Integer.valueOf(readInt))) {
                qVar.a0(readInt, EnumC0439b.PROTOCOL_ERROR);
                return;
            }
            qVar.f7450y.add(Integer.valueOf(readInt));
            qVar.i.c(new n(qVar.f7431c + '[' + readInt + "] onRequest", qVar, readInt, requestHeaders), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7465a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0256, code lost:
    
        throw new java.io.IOException(com.google.android.gms.measurement.internal.a.l(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r20, l3.l r21) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.u.d(boolean, l3.l):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, r3.h] */
    public final void e(l lVar, int i, int i4, int i5) {
        int i6;
        boolean z3;
        long j4;
        boolean z4;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i4 & 8) != 0) {
            byte readByte = this.f7465a.readByte();
            byte[] bArr = f3.c.f6469a;
            i6 = readByte & UByte.MAX_VALUE;
        } else {
            i6 = 0;
        }
        int a2 = s.a(i, i4, i6);
        InterfaceC0578j source = this.f7465a;
        Intrinsics.checkNotNullParameter(source, "source");
        lVar.f7415b.getClass();
        long j5 = 0;
        if (i5 != 0 && (i5 & 1) == 0) {
            q qVar = lVar.f7415b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            ?? obj = new Object();
            long j6 = a2;
            source.P(j6);
            source.read(obj, j6);
            qVar.i.c(new m(qVar.f7431c + '[' + i5 + "] onData", qVar, i5, obj, a2, z5), 0L);
        } else {
            y s4 = lVar.f7415b.s(i5);
            if (s4 == null) {
                lVar.f7415b.a0(i5, EnumC0439b.PROTOCOL_ERROR);
                long j7 = a2;
                lVar.f7415b.Y(j7);
                source.l(j7);
            } else {
                Intrinsics.checkNotNullParameter(source, "source");
                byte[] bArr2 = f3.c.f6469a;
                w wVar = s4.i;
                long j8 = a2;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                long j9 = j8;
                while (true) {
                    if (j9 <= j5) {
                        byte[] bArr3 = f3.c.f6469a;
                        wVar.f7477f.f7480b.Y(j8);
                        break;
                    }
                    synchronized (wVar.f7477f) {
                        z3 = wVar.f7473b;
                        j4 = j5;
                        z4 = wVar.f7475d.f8284b + j9 > wVar.f7472a;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z4) {
                        source.l(j9);
                        wVar.f7477f.e(EnumC0439b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z3) {
                        source.l(j9);
                        break;
                    }
                    long read = source.read(wVar.f7474c, j9);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j9 -= read;
                    y yVar = wVar.f7477f;
                    synchronized (yVar) {
                        try {
                            if (wVar.f7476e) {
                                wVar.f7474c.d();
                            } else {
                                C0576h c0576h = wVar.f7475d;
                                boolean z6 = c0576h.f8284b == j4;
                                c0576h.D(wVar.f7474c);
                                if (z6) {
                                    Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type java.lang.Object");
                                    yVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j5 = j4;
                }
                if (z5) {
                    s4.i(f3.c.f6470b, true);
                }
            }
        }
        this.f7465a.l(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f7387a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List s(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.u.s(int, int, int, int):java.util.List");
    }

    public final void x(l lVar, int i, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (i5 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z3 = false;
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 8) != 0) {
            byte readByte = this.f7465a.readByte();
            byte[] bArr = f3.c.f6469a;
            i6 = readByte & UByte.MAX_VALUE;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            InterfaceC0578j interfaceC0578j = this.f7465a;
            interfaceC0578j.readInt();
            interfaceC0578j.readByte();
            byte[] bArr2 = f3.c.f6469a;
            i -= 5;
        }
        List requestHeaders = s(s.a(i, i4, i6), i6, i4, i5);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        lVar.f7415b.getClass();
        if (i5 != 0 && (i5 & 1) == 0) {
            z3 = true;
        }
        if (z3) {
            q qVar = lVar.f7415b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            qVar.i.c(new n(qVar.f7431c + '[' + i5 + "] onHeaders", qVar, i5, requestHeaders, z4), 0L);
            return;
        }
        q qVar2 = lVar.f7415b;
        synchronized (qVar2) {
            y s4 = qVar2.s(i5);
            if (s4 != null) {
                Unit unit = Unit.INSTANCE;
                s4.i(f3.c.u(requestHeaders), z4);
                return;
            }
            if (qVar2.f7434f) {
                return;
            }
            if (i5 <= qVar2.f7432d) {
                return;
            }
            if (i5 % 2 == qVar2.f7433e % 2) {
                return;
            }
            y yVar = new y(i5, qVar2, false, z4, f3.c.u(requestHeaders));
            qVar2.f7432d = i5;
            qVar2.f7430b.put(Integer.valueOf(i5), yVar);
            qVar2.f7435g.e().c(new j(qVar2.f7431c + '[' + i5 + "] onStream", qVar2, yVar, i7), 0L);
        }
    }
}
