package d0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6148a;

    /* renamed from: b, reason: collision with root package name */
    public t f6149b;

    public q(int i) {
        this.f6148a = new SparseArray(i);
    }

    public final void a(t tVar, int i, int i4) {
        int a2 = tVar.a(i);
        SparseArray sparseArray = this.f6148a;
        q qVar = sparseArray == null ? null : (q) sparseArray.get(a2);
        if (qVar == null) {
            qVar = new q(1);
            sparseArray.put(tVar.a(i), qVar);
        }
        if (i4 > i) {
            qVar.a(tVar, i + 1, i4);
        } else {
            qVar.f6149b = tVar;
        }
    }
}
