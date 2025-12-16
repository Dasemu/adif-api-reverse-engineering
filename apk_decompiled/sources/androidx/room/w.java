package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0647c;
import w0.InterfaceC0648d;

/* loaded from: classes.dex */
public final class w implements InterfaceC0648d, InterfaceC0647c {
    public static final TreeMap i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f4010a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f4011b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4012c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f4013d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f4014e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f4015f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4016g;
    public int h;

    public w(int i4) {
        this.f4010a = i4;
        int i5 = i4 + 1;
        this.f4016g = new int[i5];
        this.f4012c = new long[i5];
        this.f4013d = new double[i5];
        this.f4014e = new String[i5];
        this.f4015f = new byte[i5];
    }

    public static final w d(int i4, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
            if (ceilingEntry == null) {
                Unit unit = Unit.INSTANCE;
                w wVar = new w(i4);
                Intrinsics.checkNotNullParameter(query, "query");
                wVar.f4011b = query;
                wVar.h = i4;
                return wVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            w sqliteQuery = (w) ceilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f4011b = query;
            sqliteQuery.h = i4;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // w0.InterfaceC0647c
    public final void I(int i4, long j4) {
        this.f4016g[i4] = 2;
        this.f4012c[i4] = j4;
    }

    @Override // w0.InterfaceC0647c
    public final void N(int i4, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4016g[i4] = 5;
        this.f4015f[i4] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // w0.InterfaceC0647c
    public final void k(int i4, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4016g[i4] = 4;
        this.f4014e[i4] = value;
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4010a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i4 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i4;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // w0.InterfaceC0648d
    public final void s(InterfaceC0647c statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i4 = this.h;
        if (1 > i4) {
            return;
        }
        int i5 = 1;
        while (true) {
            int i6 = this.f4016g[i5];
            if (i6 == 1) {
                statement.t(i5);
            } else if (i6 == 2) {
                statement.I(i5, this.f4012c[i5]);
            } else if (i6 == 3) {
                statement.v(i5, this.f4013d[i5]);
            } else if (i6 == 4) {
                String str = this.f4014e[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.k(i5, str);
            } else if (i6 == 5) {
                byte[] bArr = this.f4015f[i5];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.N(i5, bArr);
            }
            if (i5 == i4) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // w0.InterfaceC0647c
    public final void t(int i4) {
        this.f4016g[i4] = 1;
    }

    @Override // w0.InterfaceC0647c
    public final void v(int i4, double d4) {
        this.f4016g[i4] = 3;
        this.f4013d[i4] = d4;
    }

    @Override // w0.InterfaceC0648d
    public final String x() {
        String str = this.f4011b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
