package x0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import w0.InterfaceC0648d;

/* loaded from: classes.dex */
public final class b extends Lambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0648d f8854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0648d interfaceC0648d) {
        super(4);
        this.f8854a = interfaceC0648d;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        Intrinsics.checkNotNull(sQLiteQuery);
        this.f8854a.s(new j(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
