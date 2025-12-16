package c2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e2.C0312a;
import e2.InterfaceC0313b;
import e2.InterfaceC0314c;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f4263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W1.j f4264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f4266d;

    public /* synthetic */ k(l lVar, W1.j jVar, int i, Runnable runnable) {
        this.f4263a = lVar;
        this.f4264b = jVar;
        this.f4265c = i;
        this.f4266d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final W1.j jVar = this.f4264b;
        final int i = this.f4265c;
        Runnable runnable = this.f4266d;
        final l lVar = this.f4263a;
        InterfaceC0314c interfaceC0314c = lVar.f4272f;
        try {
            try {
                d2.d dVar = lVar.f4269c;
                Objects.requireNonNull(dVar);
                ((d2.h) interfaceC0314c).Y(new I2.k(dVar, 6));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) lVar.f4267a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((d2.h) interfaceC0314c).Y(new InterfaceC0313b() { // from class: c2.g
                        @Override // e2.InterfaceC0313b
                        public final Object execute() {
                            l.this.f4270d.a(jVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    lVar.a(jVar, i);
                }
                runnable.run();
            } catch (C0312a unused) {
                lVar.f4270d.a(jVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
