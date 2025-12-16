package x0;

import a.AbstractC0105a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import q2.AbstractC0562d;
import w0.InterfaceC0645a;

/* loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8868g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8869a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8870b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0562d f8871c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8872d;

    /* renamed from: e, reason: collision with root package name */
    public final y0.a f8873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final d dbRef, final AbstractC0562d callback) {
        super(context, str, null, callback.f8189a, new DatabaseErrorHandler() { // from class: x0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                AbstractC0562d callback2 = AbstractC0562d.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                d dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i = h.f8868g;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                c db = AbstractC0105a.D(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                SQLiteDatabase sQLiteDatabase = db.f8856a;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        AbstractC0562d.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                                AbstractC0562d.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                AbstractC0562d.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        return;
                    }
                }
            }
        });
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8869a = context;
        this.f8870b = dbRef;
        this.f8871c = callback;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.f8873e = new y0.a(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        y0.a aVar = this.f8873e;
        try {
            aVar.a(aVar.f8975a);
            super.close();
            this.f8870b.f8857a = null;
            this.f8874f = false;
        } finally {
            aVar.b();
        }
    }

    public final InterfaceC0645a d(boolean z3) {
        y0.a aVar = this.f8873e;
        try {
            aVar.a((this.f8874f || getDatabaseName() == null) ? false : true);
            this.f8872d = false;
            SQLiteDatabase x3 = x(z3);
            if (!this.f8872d) {
                c e4 = e(x3);
                aVar.b();
                return e4;
            }
            close();
            InterfaceC0645a d4 = d(z3);
            aVar.b();
            return d4;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final c e(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC0105a.D(this.f8870b, sqLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean z3 = this.f8872d;
        AbstractC0562d abstractC0562d = this.f8871c;
        if (!z3 && abstractC0562d.f8189a != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            abstractC0562d.g(e(db));
        } catch (Throwable th) {
            throw new f(g.f8862a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f8871c.h(e(sqLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f8863b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i4) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.f8872d = true;
        try {
            this.f8871c.i(e(db), i, i4);
        } catch (Throwable th) {
            throw new f(g.f8865d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (!this.f8872d) {
            try {
                this.f8871c.j(e(db));
            } catch (Throwable th) {
                throw new f(g.f8866e, th);
            }
        }
        this.f8874f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i4) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f8872d = true;
        try {
            this.f8871c.k(e(sqLiteDatabase), i, i4);
        } catch (Throwable th) {
            throw new f(g.f8864c, th);
        }
    }

    public final SQLiteDatabase s(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase x(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z4 = this.f8874f;
        Context context = this.f8869a;
        if (databaseName != null && !z4 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return s(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return this.s(z3);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int ordinal = fVar.f8860a.ordinal();
                Throwable th2 = fVar.f8861b;
                if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return this.s(z3);
                } catch (f e4) {
                    throw e4.f8861b;
                }
            }
        }
    }
}
