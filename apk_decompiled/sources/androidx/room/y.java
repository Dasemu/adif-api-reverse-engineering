package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final u f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4018b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f4019c;

    public y(u database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f4017a = database;
        this.f4018b = new AtomicBoolean(false);
        this.f4019c = LazyKt.lazy(new J0.e(this, 4));
    }

    public final InterfaceC0649e a() {
        u uVar = this.f4017a;
        uVar.assertNotMainThread();
        return this.f4018b.compareAndSet(false, true) ? (InterfaceC0649e) this.f4019c.getValue() : uVar.compileStatement(b());
    }

    public abstract String b();

    public final void c(InterfaceC0649e statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((InterfaceC0649e) this.f4019c.getValue())) {
            this.f4018b.set(false);
        }
    }
}
