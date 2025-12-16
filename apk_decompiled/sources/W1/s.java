package W1;

import B0.C0031i;
import T1.h;
import W1.i;
import W1.j;
import b2.C0269b;
import java.util.HashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class s implements T1.f {

    /* renamed from: a, reason: collision with root package name */
    public final j f1952a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1953b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.c f1954c;

    /* renamed from: d, reason: collision with root package name */
    public final T1.e f1955d;

    /* renamed from: e, reason: collision with root package name */
    public final t f1956e;

    public s(j jVar, String str, T1.c cVar, T1.e eVar, t tVar) {
        this.f1952a = jVar;
        this.f1953b = str;
        this.f1954c = cVar;
        this.f1955d = eVar;
        this.f1956e = tVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [I0.g, java.lang.Object] */
    public final void a(T1.a aVar, final T1.h hVar) {
        j jVar = this.f1952a;
        String str = this.f1953b;
        T1.e eVar = this.f1955d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        T1.c cVar = this.f1954c;
        t tVar = this.f1956e;
        final j b4 = jVar.b(aVar.f1654b);
        ?? obj = new Object();
        obj.f758f = new HashMap();
        obj.f756d = Long.valueOf(tVar.f1958a.q());
        obj.f757e = Long.valueOf(tVar.f1959b.q());
        obj.f753a = str;
        obj.f755c = new m(cVar, (byte[]) eVar.apply(aVar.f1653a));
        obj.f754b = null;
        final i d4 = obj.d();
        final C0269b c0269b = (C0269b) tVar.f1960c;
        c0269b.getClass();
        c0269b.f4176b.execute(new Runnable() { // from class: b2.a
            @Override // java.lang.Runnable
            public final void run() {
                j jVar2 = b4;
                String str2 = jVar2.f1933a;
                h hVar2 = hVar;
                i iVar = d4;
                C0269b c0269b2 = C0269b.this;
                c0269b2.getClass();
                Logger logger = C0269b.f4174f;
                try {
                    X1.h a2 = c0269b2.f4177c.a(str2);
                    if (a2 != null) {
                        ((d2.h) c0269b2.f4179e).Y(new C0031i(c0269b2, jVar2, ((U1.c) a2).a(iVar), 1));
                        hVar2.a(null);
                        return;
                    }
                    String str3 = "Transport backend '" + str2 + "' is not registered";
                    logger.warning(str3);
                    hVar2.a(new IllegalArgumentException(str3));
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    hVar2.a(e4);
                }
            }
        });
    }
}
