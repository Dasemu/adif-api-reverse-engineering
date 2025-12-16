package n3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f0.C0338b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f7872f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f7873a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f7874b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f7875c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f7876d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f7877e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n3.e] */
    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        f7872f = new Object();
    }

    public f(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f7873a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f7874b = declaredMethod;
        this.f7875c = sslSocketClass.getMethod("setHostname", String.class);
        this.f7876d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f7877e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // n3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f7873a.isInstance(sslSocket);
    }

    @Override // n3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f7876d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e5);
        }
    }

    @Override // n3.m
    public final boolean c() {
        boolean z3 = m3.c.f7810e;
        return m3.c.f7810e;
    }

    @Override // n3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f7874b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f7875c.invoke(sslSocket, str);
                }
                Method method = this.f7877e;
                m3.n nVar = m3.n.f7829a;
                method.invoke(sslSocket, C0338b.j(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
