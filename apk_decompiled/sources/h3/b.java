package h3;

import i3.m;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3.l;
import l3.q;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i, String str) {
        super(str, true);
        this.f6782e = i;
        this.f6783f = obj;
    }

    @Override // h3.a
    public final long a() {
        int i = 0;
        switch (this.f6782e) {
            case 0:
                ((l) this.f6783f).invoke();
                return -1L;
            case 1:
                m mVar = (m) this.f6783f;
                long nanoTime = System.nanoTime();
                Iterator it = mVar.f6889d.iterator();
                long j4 = Long.MIN_VALUE;
                i3.l lVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    i3.l connection = (i3.l) it.next();
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (mVar.b(connection, nanoTime) > 0) {
                            i4++;
                        } else {
                            i++;
                            long j5 = nanoTime - connection.f6885q;
                            if (j5 > j4) {
                                lVar = connection;
                                j4 = j5;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
                long j6 = mVar.f6886a;
                if (j4 < j6 && i <= 5) {
                    if (i > 0) {
                        return j6 - j4;
                    }
                    if (i4 > 0) {
                        return j6;
                    }
                    return -1L;
                }
                Intrinsics.checkNotNull(lVar);
                synchronized (lVar) {
                    if (!lVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar.f6885q + j4 != nanoTime) {
                        return 0L;
                    }
                    lVar.f6879j = true;
                    mVar.f6889d.remove(lVar);
                    Socket socket = lVar.f6875d;
                    Intrinsics.checkNotNull(socket);
                    f3.c.d(socket);
                    if (!mVar.f6889d.isEmpty()) {
                        return 0L;
                    }
                    mVar.f6887b.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f6783f;
                qVar.getClass();
                try {
                    qVar.f7448w.Y(2, 0, false);
                } catch (IOException e4) {
                    qVar.e(e4);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, String str) {
        super(str, true);
        this.f6782e = 1;
        this.f6783f = mVar;
    }
}
