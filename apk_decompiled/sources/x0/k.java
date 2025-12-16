package x0;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public final class k extends j implements InterfaceC0649e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f8881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8881b = delegate;
    }

    @Override // w0.InterfaceC0649e
    public final long T() {
        return this.f8881b.executeInsert();
    }

    @Override // w0.InterfaceC0649e
    public final int o() {
        return this.f8881b.executeUpdateDelete();
    }
}
