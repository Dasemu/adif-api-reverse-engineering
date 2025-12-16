package S2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class o extends AbstractMap implements Serializable {
    public static final A.i i = new A.i(3);

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f1617a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1618b;

    /* renamed from: c, reason: collision with root package name */
    public n f1619c;

    /* renamed from: d, reason: collision with root package name */
    public int f1620d;

    /* renamed from: e, reason: collision with root package name */
    public int f1621e;

    /* renamed from: f, reason: collision with root package name */
    public final n f1622f;

    /* renamed from: g, reason: collision with root package name */
    public l f1623g;
    public l h;

    public o(boolean z3) {
        A.i iVar = i;
        this.f1620d = 0;
        this.f1621e = 0;
        this.f1617a = iVar;
        this.f1618b = z3;
        this.f1622f = new n(z3);
    }

    public final n a(Object obj, boolean z3) {
        int i4;
        n nVar;
        n nVar2 = this.f1619c;
        A.i iVar = i;
        Comparator comparator = this.f1617a;
        if (nVar2 != null) {
            Comparable comparable = comparator == iVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f1615f;
                i4 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i4 == 0) {
                    return nVar2;
                }
                n nVar3 = i4 < 0 ? nVar2.f1611b : nVar2.f1612c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i4 = 0;
        }
        n nVar4 = nVar2;
        if (!z3) {
            return null;
        }
        n nVar5 = this.f1622f;
        if (nVar4 != null) {
            nVar = new n(this.f1618b, nVar4, obj, nVar5, nVar5.f1614e);
            if (i4 < 0) {
                nVar4.f1611b = nVar;
            } else {
                nVar4.f1612c = nVar;
            }
            b(nVar4, true);
        } else {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.f1618b, nVar4, obj, nVar5, nVar5.f1614e);
            this.f1619c = nVar;
        }
        this.f1620d++;
        this.f1621e++;
        return nVar;
    }

    public final void b(n nVar, boolean z3) {
        while (nVar != null) {
            n nVar2 = nVar.f1611b;
            n nVar3 = nVar.f1612c;
            int i4 = nVar2 != null ? nVar2.i : 0;
            int i5 = nVar3 != null ? nVar3.i : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                n nVar4 = nVar3.f1611b;
                n nVar5 = nVar3.f1612c;
                int i7 = (nVar4 != null ? nVar4.i : 0) - (nVar5 != null ? nVar5.i : 0);
                if (i7 == -1 || (i7 == 0 && !z3)) {
                    e(nVar);
                } else {
                    f(nVar3);
                    e(nVar);
                }
                if (z3) {
                    return;
                }
            } else if (i6 == 2) {
                n nVar6 = nVar2.f1611b;
                n nVar7 = nVar2.f1612c;
                int i8 = (nVar6 != null ? nVar6.i : 0) - (nVar7 != null ? nVar7.i : 0);
                if (i8 == 1 || (i8 == 0 && !z3)) {
                    f(nVar);
                } else {
                    e(nVar2);
                    f(nVar);
                }
                if (z3) {
                    return;
                }
            } else if (i6 == 0) {
                nVar.i = i4 + 1;
                if (z3) {
                    return;
                }
            } else {
                nVar.i = Math.max(i4, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            nVar = nVar.f1610a;
        }
    }

    public final void c(n nVar, boolean z3) {
        n nVar2;
        n nVar3;
        int i4;
        if (z3) {
            n nVar4 = nVar.f1614e;
            nVar4.f1613d = nVar.f1613d;
            nVar.f1613d.f1614e = nVar4;
        }
        n nVar5 = nVar.f1611b;
        n nVar6 = nVar.f1612c;
        n nVar7 = nVar.f1610a;
        int i5 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                d(nVar, nVar5);
                nVar.f1611b = null;
            } else if (nVar6 != null) {
                d(nVar, nVar6);
                nVar.f1612c = null;
            } else {
                d(nVar, null);
            }
            b(nVar7, false);
            this.f1620d--;
            this.f1621e++;
            return;
        }
        if (nVar5.i > nVar6.i) {
            n nVar8 = nVar5.f1612c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                } else {
                    nVar8 = nVar5.f1612c;
                }
            }
        } else {
            n nVar10 = nVar6.f1611b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                } else {
                    nVar10 = nVar6.f1611b;
                }
            }
            nVar3 = nVar2;
        }
        c(nVar3, false);
        n nVar11 = nVar.f1611b;
        if (nVar11 != null) {
            i4 = nVar11.i;
            nVar3.f1611b = nVar11;
            nVar11.f1610a = nVar3;
            nVar.f1611b = null;
        } else {
            i4 = 0;
        }
        n nVar12 = nVar.f1612c;
        if (nVar12 != null) {
            i5 = nVar12.i;
            nVar3.f1612c = nVar12;
            nVar12.f1610a = nVar3;
            nVar.f1612c = null;
        }
        nVar3.i = Math.max(i4, i5) + 1;
        d(nVar, nVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1619c = null;
        this.f1620d = 0;
        this.f1621e++;
        n nVar = this.f1622f;
        nVar.f1614e = nVar;
        nVar.f1613d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVar != null;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f1610a;
        nVar.f1610a = null;
        if (nVar2 != null) {
            nVar2.f1610a = nVar3;
        }
        if (nVar3 == null) {
            this.f1619c = nVar2;
        } else if (nVar3.f1611b == nVar) {
            nVar3.f1611b = nVar2;
        } else {
            nVar3.f1612c = nVar2;
        }
    }

    public final void e(n nVar) {
        n nVar2 = nVar.f1611b;
        n nVar3 = nVar.f1612c;
        n nVar4 = nVar3.f1611b;
        n nVar5 = nVar3.f1612c;
        nVar.f1612c = nVar4;
        if (nVar4 != null) {
            nVar4.f1610a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f1611b = nVar;
        nVar.f1610a = nVar3;
        int max = Math.max(nVar2 != null ? nVar2.i : 0, nVar4 != null ? nVar4.i : 0) + 1;
        nVar.i = max;
        nVar3.i = Math.max(max, nVar5 != null ? nVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f1623g;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f1623g = lVar2;
        return lVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f1611b;
        n nVar3 = nVar.f1612c;
        n nVar4 = nVar2.f1611b;
        n nVar5 = nVar2.f1612c;
        nVar.f1611b = nVar5;
        if (nVar5 != null) {
            nVar5.f1610a = nVar;
        }
        d(nVar, nVar2);
        nVar2.f1612c = nVar;
        nVar.f1610a = nVar2;
        int max = Math.max(nVar3 != null ? nVar3.i : 0, nVar5 != null ? nVar5.i : 0) + 1;
        nVar.i = max;
        nVar2.i = Math.max(max, nVar4 != null ? nVar4.i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            S2.n r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.h
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.h;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.h = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f1618b) {
            throw new NullPointerException("value == null");
        }
        n a2 = a(obj, true);
        Object obj3 = a2.h;
        a2.h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            S2.n r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.h
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1620d;
    }
}
