package x0;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0647c;

/* loaded from: classes.dex */
public class j implements InterfaceC0647c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f8880a;

    public j(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8880a = delegate;
    }

    @Override // w0.InterfaceC0647c
    public final void I(int i, long j4) {
        this.f8880a.bindLong(i, j4);
    }

    @Override // w0.InterfaceC0647c
    public final void N(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8880a.bindBlob(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8880a.close();
    }

    @Override // w0.InterfaceC0647c
    public final void k(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8880a.bindString(i, value);
    }

    @Override // w0.InterfaceC0647c
    public final void t(int i) {
        this.f8880a.bindNull(i);
    }

    @Override // w0.InterfaceC0647c
    public final void v(int i, double d4) {
        this.f8880a.bindDouble(i, d4);
    }
}
