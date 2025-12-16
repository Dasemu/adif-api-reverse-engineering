package J0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r3.InterfaceC0578j;
import r3.u;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: a, reason: collision with root package name */
    public final m3.l f960a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f961b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0578j f962c;

    public s(InterfaceC0578j interfaceC0578j, Function0 function0, m3.l lVar) {
        this.f960a = lVar;
        this.f962c = interfaceC0578j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f961b = true;
        InterfaceC0578j interfaceC0578j = this.f962c;
        if (interfaceC0578j != null) {
            W0.f.a(interfaceC0578j);
        }
    }

    @Override // J0.p
    public final m3.l d() {
        return this.f960a;
    }

    @Override // J0.p
    public final synchronized InterfaceC0578j e() {
        InterfaceC0578j interfaceC0578j;
        try {
            if (this.f961b) {
                throw new IllegalStateException("closed");
            }
            interfaceC0578j = this.f962c;
            if (interfaceC0578j == null) {
                u uVar = r3.n.f8299a;
                Intrinsics.checkNotNull(null);
                uVar.h(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0578j;
    }
}
