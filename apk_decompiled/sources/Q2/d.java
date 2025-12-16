package Q2;

import T2.n;
import T2.p;
import T2.r;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f1379a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1380b;

    /* renamed from: c, reason: collision with root package name */
    public final F.i f1381c;

    /* renamed from: d, reason: collision with root package name */
    public final T2.c f1382d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1383e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f1384f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1385g;
    public final List h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f1386j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d() {
        /*
            r7 = this;
            S2.h r1 = S2.h.f1597c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            r4 = r3
            r5 = r3
            r6 = r3
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.d.<init>():void");
    }

    public static void a(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        Object c4 = c(str, X2.a.get(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(c4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, X2.a r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            Y2.a r5 = new Y2.a
            r5.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.10.1): "
            r2 = 1
            r5.f2139b = r2
            r3 = 0
            r5.o0()     // Catch: java.lang.Throwable -> L22 java.lang.AssertionError -> L24 java.io.IOException -> L26 java.lang.IllegalStateException -> L28 java.io.EOFException -> L4f
            Q2.l r4 = r4.d(r6)     // Catch: java.lang.Throwable -> L22 java.lang.AssertionError -> L24 java.io.IOException -> L26 java.lang.IllegalStateException -> L28 java.io.EOFException -> L2a
            java.lang.Object r0 = r4.a(r5)     // Catch: java.lang.Throwable -> L22 java.lang.AssertionError -> L24 java.io.IOException -> L26 java.lang.IllegalStateException -> L28 java.io.EOFException -> L2a
        L1f:
            r5.f2139b = r3
            goto L53
        L22:
            r4 = move-exception
            goto L7b
        L24:
            r4 = move-exception
            goto L2d
        L26:
            r4 = move-exception
            goto L43
        L28:
            r4 = move-exception
            goto L49
        L2a:
            r4 = move-exception
            r2 = r3
            goto L50
        L2d:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L22
            r0.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L22
            r6.<init>(r0, r4)     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L43:
            Q2.g r6 = new Q2.g     // Catch: java.lang.Throwable -> L22
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L49:
            Q2.g r6 = new Q2.g     // Catch: java.lang.Throwable -> L22
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L4f:
            r4 = move-exception
        L50:
            if (r2 == 0) goto L75
            goto L1f
        L53:
            if (r0 == 0) goto L74
            int r4 = r5.o0()     // Catch: java.io.IOException -> L66 Y2.c -> L6d
            r5 = 10
            if (r4 != r5) goto L5e
            goto L74
        L5e:
            Q2.g r4 = new Q2.g     // Catch: java.io.IOException -> L66 Y2.c -> L6d
            java.lang.String r5 = "JSON document was not fully consumed."
            r4.<init>(r5)     // Catch: java.io.IOException -> L66 Y2.c -> L6d
            throw r4     // Catch: java.io.IOException -> L66 Y2.c -> L6d
        L66:
            r4 = move-exception
            Q2.g r5 = new Q2.g
            r5.<init>(r4)
            throw r5
        L6d:
            r4 = move-exception
            Q2.g r5 = new Q2.g
            r5.<init>(r4)
            throw r5
        L74:
            return r0
        L75:
            Q2.g r6 = new Q2.g     // Catch: java.lang.Throwable -> L22
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L7b:
            r5.f2139b = r3
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.d.c(java.lang.String, X2.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Q2.c, java.lang.Object] */
    public final l d(X2.a aVar) {
        boolean z3;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f1380b;
        l lVar = (l) concurrentHashMap.get(aVar);
        if (lVar != null) {
            return lVar;
        }
        ThreadLocal threadLocal = this.f1379a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            l lVar2 = (l) map.get(aVar);
            if (lVar2 != null) {
                return lVar2;
            }
            z3 = false;
        }
        try {
            ?? obj = new Object();
            l lVar3 = null;
            obj.f1378a = null;
            map.put(aVar, obj);
            Iterator it = this.f1383e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                lVar3 = ((m) it.next()).a(this, aVar);
                if (lVar3 != null) {
                    if (obj.f1378a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    obj.f1378a = lVar3;
                    map.put(aVar, lVar3);
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (lVar3 != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return lVar3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final Y2.b e(Writer writer) {
        Y2.b bVar = new Y2.b(writer);
        bVar.f2158f = this.f1385g;
        bVar.f2157e = false;
        bVar.h = false;
        return bVar;
    }

    public final String f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(obj, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final void g(Y2.b bVar) {
        h hVar = h.f1388a;
        boolean z3 = bVar.f2157e;
        bVar.f2157e = true;
        boolean z4 = bVar.f2158f;
        bVar.f2158f = this.f1385g;
        boolean z5 = bVar.h;
        bVar.h = false;
        try {
            try {
                p pVar = r.f1710a;
                T2.h.d(bVar, hVar);
                bVar.f2157e = z3;
                bVar.f2158f = z4;
                bVar.h = z5;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e5.getMessage(), e5);
            }
        } catch (Throwable th) {
            bVar.f2157e = z3;
            bVar.f2158f = z4;
            bVar.h = z5;
            throw th;
        }
    }

    public final void h(Object obj, Class cls, Y2.b bVar) {
        l d4 = d(X2.a.get((Type) cls));
        boolean z3 = bVar.f2157e;
        bVar.f2157e = true;
        boolean z4 = bVar.f2158f;
        bVar.f2158f = this.f1385g;
        boolean z5 = bVar.h;
        bVar.h = false;
        try {
            try {
                try {
                    d4.b(bVar, obj);
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e5.getMessage(), e5);
            }
        } finally {
            bVar.f2157e = z3;
            bVar.f2158f = z4;
            bVar.h = z5;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f1383e + ",instanceCreators:" + this.f1381c + "}";
    }

    public d(S2.h hVar, Map map, List list, List list2, List list3, List list4) {
        this.f1379a = new ThreadLocal();
        this.f1380b = new ConcurrentHashMap();
        this.f1384f = map;
        F.i iVar = new F.i(6, map, list4);
        this.f1381c = iVar;
        this.f1385g = true;
        this.h = list;
        this.i = list2;
        this.f1386j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r.f1732z);
        arrayList.add(T2.i.f1679b);
        arrayList.add(hVar);
        arrayList.addAll(list3);
        arrayList.add(r.p);
        arrayList.add(r.f1716g);
        arrayList.add(r.f1713d);
        arrayList.add(r.f1714e);
        arrayList.add(r.f1715f);
        T2.h hVar2 = r.f1718k;
        arrayList.add(new n(Long.TYPE, Long.class, hVar2));
        arrayList.add(new n(Double.TYPE, Double.class, new a(0)));
        arrayList.add(new n(Float.TYPE, Float.class, new a(1)));
        arrayList.add(T2.h.f1677b);
        arrayList.add(r.h);
        arrayList.add(r.i);
        arrayList.add(new p(AtomicLong.class, new b(new b(hVar2, 0), 2), 0));
        arrayList.add(new p(AtomicLongArray.class, new b(new b(hVar2, 1), 2), 0));
        arrayList.add(r.f1717j);
        arrayList.add(r.f1719l);
        arrayList.add(r.f1723q);
        arrayList.add(r.f1724r);
        arrayList.add(new p(BigDecimal.class, r.f1720m, 0));
        arrayList.add(new p(BigInteger.class, r.f1721n, 0));
        arrayList.add(new p(S2.j.class, r.f1722o, 0));
        arrayList.add(r.f1725s);
        arrayList.add(r.f1726t);
        arrayList.add(r.f1728v);
        arrayList.add(r.f1729w);
        arrayList.add(r.f1731y);
        arrayList.add(r.f1727u);
        arrayList.add(r.f1711b);
        arrayList.add(T2.d.f1669b);
        arrayList.add(r.f1730x);
        if (W2.b.f1971a) {
            arrayList.add(W2.b.f1973c);
            arrayList.add(W2.b.f1972b);
            arrayList.add(W2.b.f1974d);
        }
        arrayList.add(T2.b.f1663d);
        arrayList.add(r.f1710a);
        arrayList.add(new T2.c(0, iVar));
        arrayList.add(new T2.c(2, iVar));
        T2.c cVar = new T2.c(1, iVar);
        this.f1382d = cVar;
        arrayList.add(cVar);
        arrayList.add(r.f1709A);
        arrayList.add(new n(iVar, hVar, cVar, list4));
        this.f1383e = Collections.unmodifiableList(arrayList);
    }
}
