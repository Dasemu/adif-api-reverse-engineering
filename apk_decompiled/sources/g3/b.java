package g3;

import F.i;
import e3.C0334u;
import e3.G;
import e3.I;
import e3.N;
import e3.O;
import e3.Q;
import e3.T;
import e3.x;
import e3.y;
import f3.c;
import i3.j;
import j3.g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class b implements y {
    @Override // e3.y
    public final O intercept(x chain) {
        Throwable th;
        boolean equals;
        boolean equals2;
        boolean equals3;
        CharSequence trim;
        boolean equals4;
        boolean equals5;
        CharSequence trim2;
        boolean equals6;
        boolean equals7;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        System.currentTimeMillis();
        I request = gVar.f6952e;
        Intrinsics.checkNotNullParameter(request, "request");
        Throwable th2 = null;
        i iVar = new i(17, request, th2);
        if (request != null && request.a().f6339j) {
            iVar = new i(17, th2, th2);
        }
        j call = gVar.f6948a;
        I i = (I) iVar.f490b;
        O cachedResponse = (O) iVar.f491c;
        if (i == null && cachedResponse == null) {
            ArrayList arrayList = new ArrayList(20);
            Intrinsics.checkNotNullParameter(request, "request");
            G protocol = G.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
            Q q4 = c.f6471c;
            long currentTimeMillis = System.currentTimeMillis();
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            O response = new O(request, protocol, "Unsatisfiable Request (only-if-cached)", 504, null, new C0334u((String[]) arrayList.toArray(new String[0])), q4, null, null, null, -1L, currentTimeMillis, null);
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        }
        if (i == null) {
            Intrinsics.checkNotNull(cachedResponse);
            N s4 = cachedResponse.s();
            O a2 = a.a(cachedResponse);
            N.b(a2, "cacheResponse");
            s4.i = a2;
            O response2 = s4.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response2, "response");
            return response2;
        }
        if (cachedResponse != null) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        }
        O b4 = gVar.b(i);
        if (cachedResponse != null) {
            if (b4.f6294d == 304) {
                N s5 = cachedResponse.s();
                C0334u c0334u = b4.f6296f;
                ArrayList arrayList2 = new ArrayList(20);
                C0334u c0334u2 = cachedResponse.f6296f;
                int size = c0334u2.size();
                int i4 = 0;
                while (true) {
                    th = th2;
                    if (i4 >= size) {
                        break;
                    }
                    String name = c0334u2.b(i4);
                    int i5 = size;
                    String value = c0334u2.f(i4);
                    C0334u c0334u3 = c0334u2;
                    equals4 = StringsKt__StringsJVMKt.equals("Warning", name, true);
                    if (equals4) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(value, "1", false, 2, null);
                        if (startsWith$default) {
                            i4++;
                            th2 = th;
                            size = i5;
                            c0334u2 = c0334u3;
                        }
                    }
                    equals5 = StringsKt__StringsJVMKt.equals("Content-Length", name, true);
                    if (!equals5) {
                        equals6 = StringsKt__StringsJVMKt.equals("Content-Encoding", name, true);
                        if (!equals6) {
                            equals7 = StringsKt__StringsJVMKt.equals("Content-Type", name, true);
                            if (!equals7 && a.b(name) && c0334u.a(name) != null) {
                                i4++;
                                th2 = th;
                                size = i5;
                                c0334u2 = c0334u3;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(value, "value");
                    arrayList2.add(name);
                    trim2 = StringsKt__StringsKt.trim((CharSequence) value);
                    arrayList2.add(trim2.toString());
                    i4++;
                    th2 = th;
                    size = i5;
                    c0334u2 = c0334u3;
                }
                int size2 = c0334u.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String name2 = c0334u.b(i6);
                    equals = StringsKt__StringsJVMKt.equals("Content-Length", name2, true);
                    if (!equals) {
                        equals2 = StringsKt__StringsJVMKt.equals("Content-Encoding", name2, true);
                        if (!equals2) {
                            equals3 = StringsKt__StringsJVMKt.equals("Content-Type", name2, true);
                            if (!equals3 && a.b(name2)) {
                                String value2 = c0334u.f(i6);
                                Intrinsics.checkNotNullParameter(name2, "name");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                arrayList2.add(name2);
                                trim = StringsKt__StringsKt.trim((CharSequence) value2);
                                arrayList2.add(trim.toString());
                            }
                        }
                    }
                }
                s5.c(new C0334u((String[]) arrayList2.toArray(new String[0])));
                s5.f6288k = b4.f6299k;
                s5.f6289l = b4.f6300l;
                O a4 = a.a(cachedResponse);
                N.b(a4, "cacheResponse");
                s5.i = a4;
                O a5 = a.a(b4);
                N.b(a5, "networkResponse");
                s5.h = a5;
                s5.a();
                T t2 = b4.f6297g;
                Intrinsics.checkNotNull(t2);
                t2.close();
                Intrinsics.checkNotNull(th);
                throw th;
            }
            T t4 = cachedResponse.f6297g;
            if (t4 != null) {
                c.c(t4);
            }
        }
        Intrinsics.checkNotNull(b4);
        N s6 = b4.s();
        O a6 = a.a(cachedResponse);
        N.b(a6, "cacheResponse");
        s6.i = a6;
        O a7 = a.a(b4);
        N.b(a7, "networkResponse");
        s6.h = a7;
        return s6.a();
    }
}
