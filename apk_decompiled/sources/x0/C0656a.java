package x0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0648d;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0656a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8853b;

    public /* synthetic */ C0656a(Object obj, int i) {
        this.f8852a = i;
        this.f8853b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f8852a) {
            case 0:
                InterfaceC0648d query = (InterfaceC0648d) this.f8853b;
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNull(sQLiteQuery);
                query.s(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                b tmp0 = (b) this.f8853b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
