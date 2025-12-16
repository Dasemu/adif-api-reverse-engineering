package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TestScopeImpl$enter$exceptions$1$2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    public TestScopeImpl$enter$exceptions$1$2(Object obj) {
        super(1, obj, TestScopeImpl.class, "reportException", "reportException(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((TestScopeImpl) this.receiver).reportException(th);
    }
}
