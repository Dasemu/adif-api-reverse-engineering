package Q2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1377b;

    public /* synthetic */ b(l lVar, int i) {
        this.f1376a = i;
        this.f1377b = lVar;
    }

    @Override // Q2.l
    public final Object a(Y2.a aVar) {
        switch (this.f1376a) {
            case 0:
                return new AtomicLong(((Number) this.f1377b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.b0()) {
                    arrayList.add(Long.valueOf(((Number) this.f1377b.a(aVar)).longValue()));
                }
                aVar.O();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.o0() != 9) {
                    return this.f1377b.a(aVar);
                }
                aVar.k0();
                return null;
        }
    }

    @Override // Q2.l
    public final void b(Y2.b bVar, Object obj) {
        switch (this.f1376a) {
            case 0:
                this.f1377b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.e();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f1377b.b(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.O();
                return;
            default:
                if (obj == null) {
                    bVar.b0();
                    return;
                } else {
                    this.f1377b.b(bVar, obj);
                    return;
                }
        }
    }
}
