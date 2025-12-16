package W0;

import e3.InterfaceC0319e;
import e3.InterfaceC0320f;
import e3.O;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class g implements InterfaceC0320f, Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final i3.j f1890a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f1891b;

    public g(i3.j jVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f1890a = jVar;
        this.f1891b = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        try {
            this.f1890a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // e3.InterfaceC0320f
    public final void onFailure(InterfaceC0319e interfaceC0319e, IOException iOException) {
        if (((i3.j) interfaceC0319e).f6871n) {
            return;
        }
        CancellableContinuationImpl cancellableContinuationImpl = this.f1891b;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(Result.m116constructorimpl(ResultKt.createFailure(iOException)));
    }

    @Override // e3.InterfaceC0320f
    public final void onResponse(InterfaceC0319e interfaceC0319e, O o4) {
        this.f1891b.resumeWith(Result.m116constructorimpl(o4));
    }
}
