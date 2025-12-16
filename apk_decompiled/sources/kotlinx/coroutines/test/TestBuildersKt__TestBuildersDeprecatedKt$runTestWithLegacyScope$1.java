package kotlinx.coroutines.test;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1", f = "TestBuildersDeprecated.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ Function2<TestCoroutineScope, Continuation<? super Unit>, Object> $testBody;
    final /* synthetic */ TestBodyCoroutine $testScope;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<TestBodyCoroutine, Throwable> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, TestBodyCoroutine.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(TestBodyCoroutine testBodyCoroutine) {
            return testBodyCoroutine.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(TestBodyCoroutine testBodyCoroutine, long j4, Function2<? super TestCoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1> continuation) {
        super(2, continuation);
        this.$testScope = testBodyCoroutine;
        this.$dispatchTimeoutMs = j4;
        this.$testBody = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 = new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(this.$testScope, this.$dispatchTimeoutMs, this.$testBody, continuation);
        testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.L$0 = obj;
        return testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestBodyCoroutine testBodyCoroutine = this.$testScope;
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            Function2<TestCoroutineScope, Continuation<? super Unit>, Object> function2 = this.$testBody;
            final TestBodyCoroutine testBodyCoroutine2 = this.$testScope;
            Function0<List<? extends Throwable>> function0 = new Function0<List<? extends Throwable>>() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Throwable> invoke() {
                    try {
                        TestBodyCoroutine.this.cleanup();
                        return CollectionsKt.emptyList();
                    } catch (UncompletedCoroutinesError e4) {
                        throw e4;
                    } catch (Throwable th) {
                        return CollectionsKt.listOf(th);
                    }
                }
            };
            this.label = 1;
            if (TestBuildersKt.m1703runTestCoroutineLegacySYHnMyU(coroutineScope, testBodyCoroutine, duration, anonymousClass1, function2, function0, this) == coroutine_suspended) {
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
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
