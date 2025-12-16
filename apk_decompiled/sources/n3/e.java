package n3;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class e implements k {
    @Override // n3.k
    public final boolean a(SSLSocket sslSocket) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "com.google.android.gms.org.conscrypt.", false, 2, null);
        return startsWith$default;
    }

    @Override // n3.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = f.f7872f;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new f(cls2);
    }
}
