package kotlinx.coroutines.test;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1", f = "TestBuilders.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTest$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ TestScopeImpl $it;
    final /* synthetic */ Function2<TestScope, Continuation<? super Unit>, Object> $testBody;
    final /* synthetic */ TestScope $this_runTest;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<TestScopeImpl, Throwable> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, TestScopeImpl.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(TestScopeImpl testScopeImpl) {
            return testScopeImpl.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersKt$runTest$3$1(TestScopeImpl testScopeImpl, long j4, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2, TestScope testScope, Continuation<? super TestBuildersKt__TestBuildersKt$runTest$3$1> continuation) {
        super(2, continuation);
        this.$it = testScopeImpl;
        this.$dispatchTimeoutMs = j4;
        this.$testBody = function2;
        this.$this_runTest = testScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TestBuildersKt__TestBuildersKt$runTest$3$1 testBuildersKt__TestBuildersKt$runTest$3$1 = new TestBuildersKt__TestBuildersKt$runTest$3$1(this.$it, this.$dispatchTimeoutMs, this.$testBody, this.$this_runTest, continuation);
        testBuildersKt__TestBuildersKt$runTest$3$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestScopeImpl testScopeImpl = this.$it;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            Function2<TestScope, Continuation<? super Unit>, Object> function2 = this.$testBody;
            final TestScope testScope = this.$this_runTest;
            final TestScopeImpl testScopeImpl2 = this.$it;
            Function0<List<? extends Throwable>> function0 = new Function0<List<? extends Throwable>>() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Throwable> invoke() {
                    CoroutineScopeKt.cancel$default(TestScope.this.getBackgroundScope(), null, 1, null);
                    TestScope.this.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new Function0<Boolean>() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.runTest.3.1.2.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.FALSE;
                        }
                    });
                    return testScopeImpl2.legacyLeave();
                }
            };
            this.label = 1;
            if (TestBuildersKt.m1703runTestCoroutineLegacySYHnMyU(coroutineScope, testScopeImpl, duration, anonymousClass1, function2, function0, this) == coroutine_suspended) {
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
        return ((TestBuildersKt__TestBuildersKt$runTest$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
