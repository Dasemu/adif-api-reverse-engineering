package Z2;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class A extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f2191b;

    public /* synthetic */ A(C c4, int i) {
        this.f2190a = i;
        this.f2191b = c4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2190a) {
            case 0:
                this.f2191b.clear();
                return;
            default:
                this.f2191b.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f2190a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            Z2.C r3 = r3.f2191b
            boolean r3 = r3.containsKey(r4)
            return r3
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L38
            Z2.C r3 = r3.f2191b
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            r2 = 0
            if (r0 == 0) goto L21
            Z2.B r3 = r3.a(r0, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r3 = r2
        L22:
            if (r3 == 0) goto L35
            java.lang.Object r0 = r3.h
            java.lang.Object r4 = r4.getValue()
            if (r0 == r4) goto L34
            if (r0 == 0) goto L35
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L38
            r1 = 1
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.A.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2190a) {
            case 0:
                return new z(this.f2191b, 0);
            default:
                return new z(this.f2191b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f2190a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            Z2.C r4 = r4.f2191b
            r0 = 0
            r1 = 0
            if (r5 == 0) goto Lf
            Z2.B r1 = r4.a(r5, r0)     // Catch: java.lang.ClassCastException -> Lf
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
            goto L4a
        L1f:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            Z2.C r4 = r4.f2191b
            java.lang.Object r0 = r5.getKey()
            r2 = 0
            if (r0 == 0) goto L2f
            Z2.B r0 = r4.a(r0, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L43
            java.lang.Object r3 = r0.h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L42
            if (r3 == 0) goto L43
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L43
        L42:
            r2 = r0
        L43:
            if (r2 != 0) goto L46
            goto L4a
        L46:
            r1 = 1
            r4.c(r2, r1)
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.A.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2190a) {
            case 0:
                return this.f2191b.f2202d;
            default:
                return this.f2191b.f2202d;
        }
    }
}
