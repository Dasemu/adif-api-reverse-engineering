package r3;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0570b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0573e d4;
        while (true) {
            try {
                reentrantLock = C0573e.h;
                reentrantLock.lock();
                try {
                    d4 = m3.l.d();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (d4 == C0573e.f8277l) {
                C0573e.f8277l = null;
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (d4 != null) {
                d4.j();
            }
        }
    }
}
