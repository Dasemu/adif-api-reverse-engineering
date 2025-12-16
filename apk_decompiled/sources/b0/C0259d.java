package b0;

import Y.F;
import Y.InterfaceC0091g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259d implements InterfaceC0091g {

    /* renamed from: a, reason: collision with root package name */
    public final F f4158a;

    public C0259d(F delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f4158a = delegate;
    }

    @Override // Y.InterfaceC0091g
    public final Object a(Function2 function2, Continuation continuation) {
        return this.f4158a.a(new C0258c(function2, null), continuation);
    }

    @Override // Y.InterfaceC0091g
    public final Flow b() {
        return this.f4158a.f2058d;
    }
}
