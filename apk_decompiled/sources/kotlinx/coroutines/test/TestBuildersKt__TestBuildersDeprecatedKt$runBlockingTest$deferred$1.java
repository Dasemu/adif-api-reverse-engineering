package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1", f = "TestBuildersDeprecated.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TestCoroutineScope $scope;
    final /* synthetic */ Function2<TestCoroutineScope, Continuation<? super Unit>, Object> $testBody;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, TestCoroutineScope testCoroutineScope, Continuation<? super TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1> continuation) {
        super(2, continuation);
        this.$testBody = function2;
        this.$scope = testCoroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(this.$testBody, this.$scope, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<TestCoroutineScope, Continuation<? super Unit>, Object> function2 = this.$testBody;
            TestCoroutineScope testCoroutineScope = this.$scope;
            this.label = 1;
            if (function2.invoke(testCoroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
