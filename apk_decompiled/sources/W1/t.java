package W1;

import android.content.Context;
import b2.InterfaceC0271d;
import f0.C0338b;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static volatile l f1957e;

    /* renamed from: a, reason: collision with root package name */
    public final C0338b f1958a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338b f1959b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0271d f1960c;

    /* renamed from: d, reason: collision with root package name */
    public final c2.l f1961d;

    public t(C0338b c0338b, C0338b c0338b2, InterfaceC0271d interfaceC0271d, c2.l lVar, c2.n nVar) {
        this.f1958a = c0338b;
        this.f1959b = c0338b2;
        this.f1960c = interfaceC0271d;
        this.f1961d = lVar;
        nVar.getClass();
        nVar.f4281a.execute(new F2.f(nVar, 7));
    }

    public static t a() {
        l lVar = f1957e;
        if (lVar != null) {
            return (t) lVar.f1943g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, W1.k] */
    public static void b(Context context) {
        if (f1957e == null) {
            synchronized (t.class) {
                try {
                    if (f1957e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f1936a = context;
                        f1957e = obj.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final r c(U1.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(U1.a.f1777d) : Collections.singleton(new T1.c("proto"));
        R0.h a2 = j.a();
        aVar.getClass();
        a2.f1413a = "cct";
        String str = aVar.f1779a;
        String str2 = aVar.f1780b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f1414b = bytes;
        return new r(unmodifiableSet, a2.b(), this);
    }
}
