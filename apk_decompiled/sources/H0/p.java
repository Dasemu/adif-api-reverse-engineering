package H0;

import java.util.ArrayList;
import java.util.List;
import z2.AbstractC0673c;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f659b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f660c;

    public /* synthetic */ p(int i, int i4, Object obj) {
        this.f658a = i4;
        this.f660c = obj;
        this.f659b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f658a) {
            case 0:
                ((n) this.f660c).m0(this.f659b);
                return;
            case 1:
                F.b bVar = (F.b) ((A.a) this.f660c).f7b;
                if (bVar != null) {
                    bVar.g(this.f659b);
                    return;
                }
                return;
            case 2:
                ((com.google.android.material.datepicker.k) this.f660c).h.m0(this.f659b);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f660c;
                int size = arrayList.size();
                int i = 0;
                if (this.f659b != 1) {
                    while (i < size) {
                        ((d0.f) arrayList.get(i)).a();
                        i++;
                    }
                    return;
                } else {
                    while (i < size) {
                        ((d0.f) arrayList.get(i)).b();
                        i++;
                    }
                    return;
                }
            default:
                ((AbstractC0673c) this.f660c).i(this.f659b);
                return;
        }
    }

    public p(int i, n nVar) {
        this.f658a = 0;
        this.f659b = i;
        this.f660c = nVar;
    }

    public p(List list, int i, Throwable th) {
        this.f658a = 3;
        m3.d.i(list, "initCallbacks cannot be null");
        this.f660c = new ArrayList(list);
        this.f659b = i;
    }
}
