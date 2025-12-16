package d0;

import a.AbstractC0105a;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306d extends m3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f6118a;

    public C0306d(e eVar) {
        this.f6118a = eVar;
    }

    @Override // m3.l
    public final void L(Throwable th) {
        this.f6118a.f6119a.d(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, R0.h] */
    @Override // m3.l
    public final void M(A.j jVar) {
        e eVar = this.f6118a;
        eVar.f6121c = jVar;
        A.j jVar2 = eVar.f6121c;
        h hVar = eVar.f6119a;
        E2.e eVar2 = hVar.f6130g;
        C0305c c0305c = hVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? l.a() : AbstractC0105a.A();
        ?? obj = new Object();
        obj.f1413a = eVar2;
        obj.f1414b = jVar2;
        obj.f1415c = c0305c;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                obj.m(str, 0, str.length(), 1, true, new S2.e(str, 2));
            }
        }
        eVar.f6120b = obj;
        h hVar2 = eVar.f6119a;
        hVar2.getClass();
        ArrayList arrayList = new ArrayList();
        hVar2.f6124a.writeLock().lock();
        try {
            hVar2.f6126c = 1;
            arrayList.addAll(hVar2.f6125b);
            hVar2.f6125b.clear();
            hVar2.f6124a.writeLock().unlock();
            hVar2.f6127d.post(new H0.p(arrayList, hVar2.f6126c, (Throwable) null));
        } catch (Throwable th) {
            hVar2.f6124a.writeLock().unlock();
            throw th;
        }
    }
}
