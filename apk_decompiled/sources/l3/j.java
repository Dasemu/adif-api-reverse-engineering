package l3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class j extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f7408e = i;
        this.f7409f = obj;
        this.f7410g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, l3.C] */
    @Override // h3.a
    public final long a() {
        long a2;
        y[] yVarArr;
        int i = 0;
        switch (this.f7408e) {
            case 0:
                q qVar = (q) this.f7409f;
                qVar.f7429a.a(qVar, (C) ((Ref.ObjectRef) this.f7410g).element);
                return -1L;
            case 1:
                try {
                    ((q) this.f7409f).f7429a.b((y) this.f7410g);
                } catch (IOException e4) {
                    m3.n nVar = m3.n.f7829a;
                    m3.n nVar2 = m3.n.f7829a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f7409f).f7431c;
                    nVar2.getClass();
                    m3.n.i(4, str, e4);
                    try {
                        ((y) this.f7410g).c(EnumC0439b.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f7409f;
                C settings = (C) this.f7410g;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                q qVar2 = lVar.f7415b;
                synchronized (qVar2.f7448w) {
                    synchronized (qVar2) {
                        try {
                            C c4 = qVar2.f7442q;
                            ?? c5 = new C();
                            c5.b(c4);
                            c5.b(settings);
                            objectRef.element = c5;
                            a2 = c5.a() - c4.a();
                            if (a2 != 0 && !qVar2.f7430b.isEmpty()) {
                                yVarArr = (y[]) qVar2.f7430b.values().toArray(new y[0]);
                                C c6 = (C) objectRef.element;
                                Intrinsics.checkNotNullParameter(c6, "<set-?>");
                                qVar2.f7442q = c6;
                                qVar2.f7436j.c(new j(qVar2.f7431c + " onSettings", qVar2, objectRef, i), 0L);
                                Unit unit = Unit.INSTANCE;
                            }
                            yVarArr = null;
                            C c62 = (C) objectRef.element;
                            Intrinsics.checkNotNullParameter(c62, "<set-?>");
                            qVar2.f7442q = c62;
                            qVar2.f7436j.c(new j(qVar2.f7431c + " onSettings", qVar2, objectRef, i), 0L);
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f7448w.d((C) objectRef.element);
                    } catch (IOException e5) {
                        qVar2.e(e5);
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                if (yVarArr != null) {
                    int length = yVarArr.length;
                    while (i < length) {
                        y yVar = yVarArr[i];
                        synchronized (yVar) {
                            yVar.f7484f += a2;
                            if (a2 > 0) {
                                Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type java.lang.Object");
                                yVar.notifyAll();
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
