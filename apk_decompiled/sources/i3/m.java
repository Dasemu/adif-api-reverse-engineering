package i3;

import C.w;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f6886a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.c f6887b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.b f6888c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f6889d;

    public m(h3.e taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f6886a = timeUnit.toNanos(5L);
        this.f6887b = taskRunner.e();
        this.f6888c = new h3.b(this, w.r(new StringBuilder(), f3.c.f6475g, " ConnectionPool"));
        this.f6889d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if ((r0.f6878g != null) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(e3.C0315a r5, i3.j r6, java.util.ArrayList r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.concurrent.ConcurrentLinkedQueue r4 = r4.f6889d
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            i3.l r0 = (i3.l) r0
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            monitor-enter(r0)
            r2 = 1
            if (r8 == 0) goto L2d
            l3.q r3 = r0.f6878g     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L2b
            r1 = r2
        L2b:
            if (r1 == 0) goto L3a
        L2d:
            boolean r1 = r0.h(r5, r7)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            r6.b(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            return r2
        L38:
            r4 = move-exception
            goto L3e
        L3a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L10
        L3e:
            monitor-exit(r0)
            throw r4
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.m.a(e3.a, i3.j, java.util.ArrayList, boolean):boolean");
    }

    public final int b(l lVar, long j4) {
        byte[] bArr = f3.c.f6469a;
        ArrayList arrayList = lVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                String str = "A connection to " + lVar.f6873b.f6311a.h + " was leaked. Did you forget to close a response body?";
                m3.n nVar = m3.n.f7829a;
                m3.n.f7829a.j(((h) reference).f6858a, str);
                arrayList.remove(i);
                lVar.f6879j = true;
                if (arrayList.isEmpty()) {
                    lVar.f6885q = j4 - this.f6886a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
