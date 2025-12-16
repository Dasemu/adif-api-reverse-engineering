package x0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0645a;
import w0.InterfaceC0648d;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class c implements InterfaceC0645a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f8855b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f8856a;

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8856a = delegate;
    }

    @Override // w0.InterfaceC0645a
    public final boolean B() {
        return this.f8856a.inTransaction();
    }

    @Override // w0.InterfaceC0645a
    public final boolean G() {
        SQLiteDatabase sQLiteDatabase = this.f8856a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // w0.InterfaceC0645a
    public final void J() {
        this.f8856a.setTransactionSuccessful();
    }

    @Override // w0.InterfaceC0645a
    public final void K() {
        this.f8856a.beginTransactionNonExclusive();
    }

    @Override // w0.InterfaceC0645a
    public final Cursor V(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return p(new F.i(query));
    }

    @Override // w0.InterfaceC0645a
    public final void b() {
        this.f8856a.endTransaction();
    }

    @Override // w0.InterfaceC0645a
    public final void c() {
        this.f8856a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8856a.close();
    }

    @Override // w0.InterfaceC0645a
    public final void i(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f8856a.execSQL(sql);
    }

    @Override // w0.InterfaceC0645a
    public final boolean isOpen() {
        return this.f8856a.isOpen();
    }

    @Override // w0.InterfaceC0645a
    public final Cursor j(InterfaceC0648d query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        String sql = query.x();
        String[] selectionArgs = f8855b;
        Intrinsics.checkNotNull(cancellationSignal);
        C0656a cursorFactory = new C0656a(query, 0);
        SQLiteDatabase sQLiteDatabase = this.f8856a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // w0.InterfaceC0645a
    public final Cursor p(InterfaceC0648d query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Cursor rawQueryWithFactory = this.f8856a.rawQueryWithFactory(new C0656a(new b(query), 1), query.x(), f8855b, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // w0.InterfaceC0645a
    public final InterfaceC0649e q(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f8856a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new k(compileStatement);
    }
}
