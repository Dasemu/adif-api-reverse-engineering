package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $completed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(Ref.BooleanRef booleanRef, Continuation<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1> continuation) {
        super(1, continuation);
        this.$completed = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(this.$completed, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$completed.element = true;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
