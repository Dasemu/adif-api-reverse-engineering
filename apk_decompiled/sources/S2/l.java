package S2;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f1604b;

    public /* synthetic */ l(o oVar, int i) {
        this.f1603a = i;
        this.f1604b = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1603a) {
            case 0:
                this.f1604b.clear();
                return;
            default:
                this.f1604b.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f1603a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            S2.o r3 = r3.f1604b
            boolean r3 = r3.containsKey(r4)
            return r3
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L34
            S2.o r3 = r3.f1604b
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            r2 = 0
            if (r0 == 0) goto L21
            S2.n r3 = r3.a(r0, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r3 = r2
        L22:
            if (r3 == 0) goto L31
            java.lang.Object r0 = r3.h
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r0, r4)
            if (r4 == 0) goto L31
            r2 = r3
        L31:
            if (r2 == 0) goto L34
            r1 = 1
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.l.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1603a) {
            case 0:
                return new k(this.f1604b, 0);
            default:
                return new k(this.f1604b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f1603a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            S2.o r4 = r4.f1604b
            r0 = 0
            r1 = 0
            if (r5 == 0) goto Lf
            S2.n r1 = r4.a(r5, r0)     // Catch: java.lang.ClassCastException -> Lf
        Lf:
            r5 = 1
            if (r1 == 0) goto L15
            r4.c(r1, r5)
        L15:
            if (r1 == 0) goto L18
            r0 = r5
        L18:
            return r0
        L19:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1f
            goto L46
        L1f:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            S2.o r4 = r4.f1604b
            java.lang.Object r0 = r5.getKey()
            r2 = 0
            if (r0 == 0) goto L2f
            S2.n r0 = r4.a(r0, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L3f
            java.lang.Object r3 = r0.h
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L3f
            r2 = r0
        L3f:
            if (r2 != 0) goto L42
            goto L46
        L42:
            r1 = 1
            r4.c(r2, r1)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.l.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1603a) {
            case 0:
                return this.f1604b.f1620d;
            default:
                return this.f1604b.f1620d;
        }
    }
}
