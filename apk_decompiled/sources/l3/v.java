package l3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;
import r3.G;
import r3.K;

/* loaded from: classes3.dex */
public final class v implements G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7468a;

    /* renamed from: b, reason: collision with root package name */
    public final C0576h f7469b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f7470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f7471d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r3.h] */
    public v(y yVar, boolean z3) {
        this.f7471d = yVar;
        this.f7468a = z3;
    }

    @Override // r3.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        y yVar = this.f7471d;
        byte[] bArr = f3.c.f6469a;
        synchronized (yVar) {
            if (this.f7470c) {
                return;
            }
            synchronized (yVar) {
                z3 = yVar.f7489m == null;
                Unit unit = Unit.INSTANCE;
            }
            y yVar2 = this.f7471d;
            if (!yVar2.f7486j.f7468a) {
                if (this.f7469b.f8284b > 0) {
                    while (this.f7469b.f8284b > 0) {
                        d(true);
                    }
                } else if (z3) {
                    yVar2.f7480b.Z(yVar2.f7479a, true, null, 0L);
                }
            }
            synchronized (this.f7471d) {
                this.f7470c = true;
                Unit unit2 = Unit.INSTANCE;
            }
            this.f7471d.f7480b.flush();
            this.f7471d.a();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void d(boolean z3) {
        long min;
        boolean z4;
        y yVar = this.f7471d;
        synchronized (yVar) {
            try {
                yVar.f7488l.h();
                while (yVar.f7483e >= yVar.f7484f && !this.f7468a && !this.f7470c) {
                    try {
                        synchronized (yVar) {
                            EnumC0439b enumC0439b = yVar.f7489m;
                            if (enumC0439b != null) {
                                break;
                            } else {
                                yVar.k();
                            }
                        }
                    } catch (Throwable th) {
                        yVar.f7488l.k();
                        throw th;
                    }
                }
                yVar.f7488l.k();
                yVar.b();
                min = Math.min(yVar.f7484f - yVar.f7483e, this.f7469b.f8284b);
                yVar.f7483e += min;
                z4 = z3 && min == this.f7469b.f8284b;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7471d.f7488l.h();
        try {
            y yVar2 = this.f7471d;
            yVar2.f7480b.Z(yVar2.f7479a, z4, this.f7469b, min);
        } finally {
            this.f7471d.f7488l.k();
        }
    }

    @Override // r3.G, java.io.Flushable
    public final void flush() {
        y yVar = this.f7471d;
        byte[] bArr = f3.c.f6469a;
        synchronized (yVar) {
            yVar.b();
            Unit unit = Unit.INSTANCE;
        }
        while (this.f7469b.f8284b > 0) {
            d(false);
            this.f7471d.f7480b.flush();
        }
    }

    @Override // r3.G
    public final K timeout() {
        return this.f7471d.f7488l;
    }

    @Override // r3.G
    public final void z(C0576h source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = f3.c.f6469a;
        C0576h c0576h = this.f7469b;
        c0576h.z(source, j4);
        while (c0576h.f8284b >= 16384) {
            d(false);
        }
    }
}
