package x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f8834a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8835b;

    public static long a(e eVar, long j4) {
        n nVar = eVar.f8824d;
        if (nVar instanceof i) {
            return j4;
        }
        ArrayList arrayList = eVar.f8829k;
        int size = arrayList.size();
        long j5 = j4;
        for (int i = 0; i < size; i++) {
            InterfaceC0655d interfaceC0655d = (InterfaceC0655d) arrayList.get(i);
            if (interfaceC0655d instanceof e) {
                e eVar2 = (e) interfaceC0655d;
                if (eVar2.f8824d != nVar) {
                    j5 = Math.min(j5, a(eVar2, eVar2.f8826f + j4));
                }
            }
        }
        if (eVar != nVar.i) {
            return j5;
        }
        long j6 = nVar.j();
        long j7 = j4 - j6;
        return Math.min(Math.min(j5, a(nVar.h, j7)), j7 - r9.f8826f);
    }

    public static long b(e eVar, long j4) {
        n nVar = eVar.f8824d;
        if (nVar instanceof i) {
            return j4;
        }
        ArrayList arrayList = eVar.f8829k;
        int size = arrayList.size();
        long j5 = j4;
        for (int i = 0; i < size; i++) {
            InterfaceC0655d interfaceC0655d = (InterfaceC0655d) arrayList.get(i);
            if (interfaceC0655d instanceof e) {
                e eVar2 = (e) interfaceC0655d;
                if (eVar2.f8824d != nVar) {
                    j5 = Math.max(j5, b(eVar2, eVar2.f8826f + j4));
                }
            }
        }
        if (eVar != nVar.h) {
            return j5;
        }
        long j6 = nVar.j();
        long j7 = j4 + j6;
        return Math.max(Math.max(j5, b(nVar.i, j7)), j7 - r9.f8826f);
    }
}
