package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;

    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(Continuation<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
