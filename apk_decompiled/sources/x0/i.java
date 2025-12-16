package x0;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import q2.AbstractC0562d;
import w0.InterfaceC0645a;
import w0.InterfaceC0646b;

/* loaded from: classes.dex */
public final class i implements InterfaceC0646b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8876b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0562d f8877c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f8878d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8879e;

    public i(Context context, String str, AbstractC0562d callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8875a = context;
        this.f8876b = str;
        this.f8877c = callback;
        this.f8878d = LazyKt.lazy(new J0.e(this, 13));
    }

    @Override // w0.InterfaceC0646b
    public final InterfaceC0645a S() {
        return ((h) this.f8878d.getValue()).d(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.f8878d;
        if (lazy.isInitialized()) {
            ((h) lazy.getValue()).close();
        }
    }

    @Override // w0.InterfaceC0646b
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        Lazy lazy = this.f8878d;
        if (lazy.isInitialized()) {
            h sQLiteOpenHelper = (h) lazy.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z3);
        }
        this.f8879e = z3;
    }
}
