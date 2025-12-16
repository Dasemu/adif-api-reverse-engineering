package l3;

import java.net.SocketTimeoutException;
import kotlin.Unit;
import r3.C0573e;

/* loaded from: classes3.dex */
public final class x extends C0573e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f7478m;

    public x(y yVar) {
        this.f7478m = yVar;
    }

    @Override // r3.C0573e
    public final void j() {
        this.f7478m.e(EnumC0439b.CANCEL);
        q qVar = this.f7478m.f7480b;
        synchronized (qVar) {
            long j4 = qVar.f7440n;
            long j5 = qVar.f7439m;
            if (j4 < j5) {
                return;
            }
            qVar.f7439m = j5 + 1;
            qVar.f7441o = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            qVar.h.c(new h3.b(qVar, 2, C.w.r(new StringBuilder(), qVar.f7431c, " ping")), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
