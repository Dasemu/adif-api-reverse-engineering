package d2;

import B0.C0031i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import e2.InterfaceC0313b;
import e2.InterfaceC0314c;
import f0.C0338b;
import g2.AbstractC0377a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class h implements d, InterfaceC0314c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final T1.c f6184f = new T1.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final j f6185a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338b f6186b;

    /* renamed from: c, reason: collision with root package name */
    public final C0338b f6187c;

    /* renamed from: d, reason: collision with root package name */
    public final C0310a f6188d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f6189e;

    public h(C0338b c0338b, C0338b c0338b2, C0310a c0310a, j jVar, Provider provider) {
        this.f6185a = jVar;
        this.f6186b = c0338b;
        this.f6187c = c0338b2;
        this.f6188d = c0310a;
        this.f6189e = provider;
    }

    public static String Z(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f6177a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object a0(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, W1.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f1933a, String.valueOf(AbstractC0377a.a(jVar.f1935c))));
        byte[] bArr = jVar.f1934b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final void O(long j4, Z1.c cVar, String str) {
        s(new c2.j(str, j4, cVar));
    }

    public final Object Y(InterfaceC0313b interfaceC0313b) {
        SQLiteDatabase d4 = d();
        C0338b c0338b = this.f6187c;
        long q4 = c0338b.q();
        while (true) {
            try {
                d4.beginTransaction();
                try {
                    Object execute = interfaceC0313b.execute();
                    d4.setTransactionSuccessful();
                    return execute;
                } finally {
                    d4.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (c0338b.q() >= this.f6188d.f6174c + q4) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6185a.close();
    }

    public final SQLiteDatabase d() {
        j jVar = this.f6185a;
        Objects.requireNonNull(jVar);
        C0338b c0338b = this.f6187c;
        long q4 = c0338b.q();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (c0338b.q() >= this.f6188d.f6174c + q4) {
                    throw new RuntimeException("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object s(f fVar) {
        SQLiteDatabase d4 = d();
        d4.beginTransaction();
        try {
            Object apply = fVar.apply(d4);
            d4.setTransactionSuccessful();
            return apply;
        } finally {
            d4.endTransaction();
        }
    }

    public final ArrayList x(SQLiteDatabase sQLiteDatabase, W1.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long e4 = e(sQLiteDatabase, jVar);
        if (e4 == null) {
            return arrayList;
        }
        a0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{e4.toString()}, null, null, null, String.valueOf(i)), new C0031i(this, arrayList, jVar, 4));
        return arrayList;
    }
}
