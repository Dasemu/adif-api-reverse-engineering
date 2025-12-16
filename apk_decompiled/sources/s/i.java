package s;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t.C0614b;

/* loaded from: classes.dex */
public class i {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C0614b lock;
    private final t.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARN: Type inference failed for: r1v3, types: [t.b, java.lang.Object] */
    public i(int i) {
        this.maxSize = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new t.c();
        this.lock = new Object();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z3, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            t.c cVar = this.map;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = cVar.f8508a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object value2 = create(key);
            if (value2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    t.c cVar2 = this.map;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value = cVar2.f8508a.put(key, value2);
                    if (value != null) {
                        t.c cVar3 = this.map;
                        cVar3.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(value, "value");
                        cVar3.f8508a.put(key, value);
                    } else {
                        this.size += a(key, value2);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (value != null) {
                entryRemoved(false, key, value2, value);
                return value;
            }
            trimToSize(this.maxSize);
            return value2;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object key, Object value) {
        Object put;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(key, value);
                t.c cVar = this.map;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                put = cVar.f8508a.put(key, value);
                if (put != null) {
                    this.size -= a(key, put);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object key) {
        Object remove;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                t.c cVar = this.map;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                remove = cVar.f8508a.remove(key);
                if (remove != null) {
                    this.size -= a(key, remove);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                Set<Map.Entry> entrySet = this.map.f8508a.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
                for (Map.Entry entry : entrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i4 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i4 != 0 ? (i * 100) / i4 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            t.b r0 = r5.lock
            monitor-enter(r0)
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L6c
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f8508a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L6c
            goto L18
        L16:
            r5 = move-exception
            goto L74
        L18:
            int r1 = r5.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L6a
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f8508a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L6a
        L27:
            t.c r1 = r5.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f8508a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            t.c r3 = r5.map     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.f8508a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.size     // Catch: java.lang.Throwable -> L16
            int r4 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L16
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L16
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r5.entryRemoved(r4, r2, r1, r0)
            goto L0
        L6a:
            monitor-exit(r0)
            return
        L6c:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L16
            throw r6     // Catch: java.lang.Throwable -> L16
        L74:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.i.trimToSize(int):void");
    }
}
