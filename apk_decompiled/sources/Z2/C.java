package Z2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class C extends AbstractMap implements Serializable {
    public static final A.i i = new A.i(4);

    /* renamed from: g, reason: collision with root package name */
    public A f2205g;
    public A h;

    /* renamed from: d, reason: collision with root package name */
    public int f2202d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2203e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f2199a = i;

    /* renamed from: c, reason: collision with root package name */
    public final B f2201c = new B();

    /* renamed from: b, reason: collision with root package name */
    public B[] f2200b = new B[16];

    /* renamed from: f, reason: collision with root package name */
    public int f2204f = 12;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, Z2.y] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, Z2.y] */
    public final B a(Object obj, boolean z3) {
        int i4;
        B b4;
        boolean z4;
        B b5;
        B b6;
        B b7;
        B b8;
        B b9;
        B[] bArr = this.f2200b;
        int hashCode = obj.hashCode();
        int i5 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i6 = ((i5 >>> 7) ^ i5) ^ (i5 >>> 4);
        boolean z5 = true;
        int length = i6 & (bArr.length - 1);
        B b10 = bArr[length];
        A.i iVar = i;
        B b11 = null;
        Comparator comparator = this.f2199a;
        if (b10 != null) {
            Comparable comparable = comparator == iVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = b10.f2197f;
                i4 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i4 == 0) {
                    return b10;
                }
                B b12 = i4 < 0 ? b10.f2193b : b10.f2194c;
                if (b12 == null) {
                    break;
                }
                b10 = b12;
            }
        } else {
            i4 = 0;
        }
        if (!z3) {
            return null;
        }
        B b13 = this.f2201c;
        if (b10 != null) {
            B b14 = b10;
            b4 = new B(b14, obj, i6, b13, b13.f2196e);
            if (i4 < 0) {
                b14.f2193b = b4;
            } else {
                b14.f2194c = b4;
            }
            b(b14, true);
        } else {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            b4 = new B(b10, obj, i6, b13, b13.f2196e);
            bArr[length] = b4;
        }
        int i7 = this.f2202d;
        this.f2202d = i7 + 1;
        if (i7 > this.f2204f) {
            B[] bArr2 = this.f2200b;
            int length2 = bArr2.length;
            int i8 = length2 * 2;
            B[] bArr3 = new B[i8];
            ?? obj3 = new Object();
            ?? obj4 = new Object();
            int i9 = 0;
            while (i9 < length2) {
                B b15 = bArr2[i9];
                if (b15 == null) {
                    z4 = z5;
                    b6 = b11;
                } else {
                    B b16 = b11;
                    for (B b17 = b15; b17 != null; b17 = b17.f2193b) {
                        b17.f2192a = b16;
                        b16 = b17;
                    }
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (b16 != null) {
                            z4 = z5;
                            B b18 = b16.f2192a;
                            b16.f2192a = b11;
                            B b19 = b16.f2194c;
                            while (true) {
                                B b20 = b19;
                                b5 = b18;
                                b18 = b20;
                                if (b18 == null) {
                                    break;
                                }
                                b18.f2192a = b5;
                                b19 = b18.f2193b;
                            }
                        } else {
                            B b21 = b16;
                            b16 = b11;
                            b5 = b21;
                            z4 = z5;
                        }
                        if (b16 == null) {
                            break;
                        }
                        if ((b16.f2198g & length2) == 0) {
                            i10++;
                        } else {
                            i11++;
                        }
                        b16 = b5;
                        z5 = z4;
                        b11 = null;
                    }
                    obj3.f2311a = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
                    obj3.f2313c = 0;
                    obj3.f2312b = 0;
                    b6 = null;
                    obj3.f2314d = null;
                    obj4.f2311a = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
                    obj4.f2313c = 0;
                    obj4.f2312b = 0;
                    obj4.f2314d = null;
                    B b22 = null;
                    while (b15 != null) {
                        b15.f2192a = b22;
                        B b23 = b15;
                        b15 = b15.f2193b;
                        b22 = b23;
                    }
                    while (true) {
                        if (b22 != null) {
                            B b24 = b22.f2192a;
                            b22.f2192a = null;
                            B b25 = b22.f2194c;
                            while (true) {
                                B b26 = b25;
                                b7 = b24;
                                b24 = b26;
                                if (b24 == null) {
                                    break;
                                }
                                b24.f2192a = b7;
                                b25 = b24.f2193b;
                            }
                        } else {
                            b7 = b22;
                            b22 = null;
                        }
                        if (b22 == null) {
                            break;
                        }
                        if ((b22.f2198g & length2) == 0) {
                            obj3.a(b22);
                        } else {
                            obj4.a(b22);
                        }
                        b22 = b7;
                    }
                    if (i10 > 0) {
                        b8 = (B) obj3.f2314d;
                        if (b8.f2192a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        b8 = null;
                    }
                    bArr3[i9] = b8;
                    int i12 = i9 + length2;
                    if (i11 > 0) {
                        b9 = (B) obj4.f2314d;
                        if (b9.f2192a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        b9 = null;
                    }
                    bArr3[i12] = b9;
                }
                i9++;
                b11 = b6;
                z5 = z4;
            }
            this.f2200b = bArr3;
            this.f2204f = (i8 / 4) + (i8 / 2);
        }
        this.f2203e++;
        return b4;
    }

    public final void b(B b4, boolean z3) {
        while (b4 != null) {
            B b5 = b4.f2193b;
            B b6 = b4.f2194c;
            int i4 = b5 != null ? b5.i : 0;
            int i5 = b6 != null ? b6.i : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                B b7 = b6.f2193b;
                B b8 = b6.f2194c;
                int i7 = (b7 != null ? b7.i : 0) - (b8 != null ? b8.i : 0);
                if (i7 != -1 && (i7 != 0 || z3)) {
                    f(b6);
                }
                e(b4);
                if (z3) {
                    return;
                }
            } else if (i6 == 2) {
                B b9 = b5.f2193b;
                B b10 = b5.f2194c;
                int i8 = (b9 != null ? b9.i : 0) - (b10 != null ? b10.i : 0);
                if (i8 != 1 && (i8 != 0 || z3)) {
                    e(b5);
                }
                f(b4);
                if (z3) {
                    return;
                }
            } else if (i6 == 0) {
                b4.i = i4 + 1;
                if (z3) {
                    return;
                }
            } else {
                b4.i = Math.max(i4, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            b4 = b4.f2192a;
        }
    }

    public final void c(B b4, boolean z3) {
        B b5;
        B b6;
        int i4;
        if (z3) {
            B b7 = b4.f2196e;
            b7.f2195d = b4.f2195d;
            b4.f2195d.f2196e = b7;
            b4.f2196e = null;
            b4.f2195d = null;
        }
        B b8 = b4.f2193b;
        B b9 = b4.f2194c;
        B b10 = b4.f2192a;
        int i5 = 0;
        if (b8 == null || b9 == null) {
            if (b8 != null) {
                d(b4, b8);
                b4.f2193b = null;
            } else if (b9 != null) {
                d(b4, b9);
                b4.f2194c = null;
            } else {
                d(b4, null);
            }
            b(b10, false);
            this.f2202d--;
            this.f2203e++;
            return;
        }
        if (b8.i > b9.i) {
            B b11 = b8.f2194c;
            while (true) {
                B b12 = b11;
                b6 = b8;
                b8 = b12;
                if (b8 == null) {
                    break;
                } else {
                    b11 = b8.f2194c;
                }
            }
        } else {
            B b13 = b9.f2193b;
            while (true) {
                b5 = b9;
                b9 = b13;
                if (b9 == null) {
                    break;
                } else {
                    b13 = b9.f2193b;
                }
            }
            b6 = b5;
        }
        c(b6, false);
        B b14 = b4.f2193b;
        if (b14 != null) {
            i4 = b14.i;
            b6.f2193b = b14;
            b14.f2192a = b6;
            b4.f2193b = null;
        } else {
            i4 = 0;
        }
        B b15 = b4.f2194c;
        if (b15 != null) {
            i5 = b15.i;
            b6.f2194c = b15;
            b15.f2192a = b6;
            b4.f2194c = null;
        }
        b6.i = Math.max(i4, i5) + 1;
        d(b4, b6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f2200b, (Object) null);
        this.f2202d = 0;
        this.f2203e++;
        B b4 = this.f2201c;
        B b5 = b4.f2195d;
        while (b5 != b4) {
            B b6 = b5.f2195d;
            b5.f2196e = null;
            b5.f2195d = null;
            b5 = b6;
        }
        b4.f2196e = b4;
        b4.f2195d = b4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        B b4 = null;
        if (obj != null) {
            try {
                b4 = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return b4 != null;
    }

    public final void d(B b4, B b5) {
        B b6 = b4.f2192a;
        b4.f2192a = null;
        if (b5 != null) {
            b5.f2192a = b6;
        }
        if (b6 == null) {
            this.f2200b[b4.f2198g & (r2.length - 1)] = b5;
        } else if (b6.f2193b == b4) {
            b6.f2193b = b5;
        } else {
            b6.f2194c = b5;
        }
    }

    public final void e(B b4) {
        B b5 = b4.f2193b;
        B b6 = b4.f2194c;
        B b7 = b6.f2193b;
        B b8 = b6.f2194c;
        b4.f2194c = b7;
        if (b7 != null) {
            b7.f2192a = b4;
        }
        d(b4, b6);
        b6.f2193b = b4;
        b4.f2192a = b6;
        int max = Math.max(b5 != null ? b5.i : 0, b7 != null ? b7.i : 0) + 1;
        b4.i = max;
        b6.i = Math.max(max, b8 != null ? b8.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        A a2 = this.f2205g;
        if (a2 != null) {
            return a2;
        }
        A a4 = new A(this, 0);
        this.f2205g = a4;
        return a4;
    }

    public final void f(B b4) {
        B b5 = b4.f2193b;
        B b6 = b4.f2194c;
        B b7 = b5.f2193b;
        B b8 = b5.f2194c;
        b4.f2193b = b8;
        if (b8 != null) {
            b8.f2192a = b4;
        }
        d(b4, b5);
        b5.f2194c = b4;
        b4.f2192a = b5;
        int max = Math.max(b6 != null ? b6.i : 0, b8 != null ? b8.i : 0) + 1;
        b4.i = max;
        b5.i = Math.max(max, b7 != null ? b7.i : 0) + 1;
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
            Z2.B r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
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
        throw new UnsupportedOperationException("Method not decompiled: Z2.C.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        A a2 = this.h;
        if (a2 != null) {
            return a2;
        }
        A a4 = new A(this, 1);
        this.h = a4;
        return a4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        B a2 = a(obj, true);
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
            Z2.B r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
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
        throw new UnsupportedOperationException("Method not decompiled: Z2.C.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2202d;
    }
}
