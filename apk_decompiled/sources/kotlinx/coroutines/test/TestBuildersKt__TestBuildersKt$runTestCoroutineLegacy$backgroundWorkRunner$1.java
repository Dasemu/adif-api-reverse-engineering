package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.YieldKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1", f = "TestBuilders.kt", i = {0, 1}, l = {499, 503}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TestCoroutineScheduler $scheduler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1(TestCoroutineScheduler testCoroutineScheduler, Continuation<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1> continuation) {
        super(2, continuation);
        this.$scheduler = testCoroutineScheduler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 = new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1(this.$scheduler, continuation);
        testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            if (this.$scheduler.tryRunNextTaskUnless$kotlinx_coroutines_test(new Function0<Boolean>() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1$executedSomething$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(!CoroutineScopeKt.isActive(CoroutineScope.this));
                }
            })) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    break;
                }
            } else {
                TestCoroutineScheduler testCoroutineScheduler = this.$scheduler;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (testCoroutineScheduler.receiveDispatchEvent$kotlinx_coroutines_test(this) == coroutine_suspended) {
                    break;
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
