package i3;

import e3.C0330p;
import e3.InterfaceC0320f;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0320f f6855a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f6856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f6857c;

    public g(j jVar, InterfaceC0320f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f6857c = jVar;
        this.f6855a = responseCallback;
        this.f6856b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0330p c0330p;
        String str = "OkHttp " + this.f6857c.f6861b.f6267a.g();
        j jVar = this.f6857c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            jVar.f6863d.h();
            boolean z3 = false;
            try {
                try {
                    try {
                        this.f6855a.onResponse(jVar, jVar.g());
                        c0330p = jVar.f6860a.f6233a;
                    } catch (IOException e4) {
                        e = e4;
                        z3 = true;
                        if (z3) {
                            m3.n nVar = m3.n.f7829a;
                            m3.n nVar2 = m3.n.f7829a;
                            String str2 = "Callback failure for " + j.a(jVar);
                            nVar2.getClass();
                            m3.n.i(4, str2, e);
                        } else {
                            this.f6855a.onFailure(jVar, e);
                        }
                        c0330p = jVar.f6860a.f6233a;
                        c0330p.b(this);
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        jVar.cancel();
                        if (!z3) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ExceptionsKt.addSuppressed(iOException, th);
                            this.f6855a.onFailure(jVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    jVar.f6860a.f6233a.b(this);
                    throw th2;
                }
            } catch (IOException e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
            c0330p.b(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
