package kotlinx.coroutines.test;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1", f = "TestBuilders.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {337, 363, 368}, m = "invokeSuspend", n = {"timeoutError", "cancellationException", "workRunner", "timeoutError", "cancellationException", "workRunner", "timeoutError"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTest$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TestScopeImpl $scope;
    final /* synthetic */ Function2<TestScope, Continuation<? super Unit>, Object> $testBody;
    final /* synthetic */ TestScope $this_runTest;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/test/TestScopeImpl;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1", f = "TestBuilders.kt", i = {0}, l = {318, 319}, m = "invokeSuspend", n = {"$this$start"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TestScopeImpl, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<TestScope, Continuation<? super Unit>, Object> $testBody;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$testBody = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$testBody, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (kotlinx.coroutines.YieldKt.yield(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                java.lang.Object r1 = r4.L$0
                kotlinx.coroutines.test.TestScopeImpl r1 = (kotlinx.coroutines.test.TestScopeImpl) r1
                kotlin.ResultKt.throwOnFailure(r5)
                goto L35
            L22:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                r1 = r5
                kotlinx.coroutines.test.TestScopeImpl r1 = (kotlinx.coroutines.test.TestScopeImpl) r1
                r4.L$0 = r1
                r4.label = r3
                java.lang.Object r5 = kotlinx.coroutines.YieldKt.yield(r4)
                if (r5 != r0) goto L35
                goto L42
            L35:
                kotlin.jvm.functions.Function2<kotlinx.coroutines.test.TestScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.$testBody
                r3 = 0
                r4.L$0 = r3
                r4.label = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TestScopeImpl testScopeImpl, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(testScopeImpl, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2", f = "TestBuilders.kt", i = {}, l = {359, 360}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<CancellationException> $cancellationException;
        final /* synthetic */ TestScopeImpl $scope;
        final /* synthetic */ long $timeout;
        final /* synthetic */ Ref.ObjectRef<Throwable> $timeoutError;
        final /* synthetic */ Job $workRunner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TestScopeImpl testScopeImpl, Job job, long j4, Ref.ObjectRef<Throwable> objectRef, Ref.ObjectRef<CancellationException> objectRef2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$scope = testScopeImpl;
            this.$workRunner = job;
            this.$timeout = j4;
            this.$timeoutError = objectRef;
            this.$cancellationException = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$workRunner, this.$timeout, this.$timeoutError, this.$cancellationException, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            if (kotlinx.coroutines.JobKt.cancelAndJoin(r12, r11) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r12.join(r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r12)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L4d
            L1e:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                kotlin.coroutines.CoroutineContext r12 = r12.getCoroutineContext()
                kotlinx.coroutines.Job r4 = kotlinx.coroutines.JobKt.getJob(r12)
                kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2$1 r5 = new kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2$1
                kotlinx.coroutines.test.TestScopeImpl r6 = r11.$scope
                long r7 = r11.$timeout
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r9 = r11.$timeoutError
                kotlin.jvm.internal.Ref$ObjectRef<java.util.concurrent.CancellationException> r10 = r11.$cancellationException
                r5.<init>()
                r8 = 2
                r9 = 0
                r7 = r5
                r5 = 1
                r6 = 0
                kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r4, r5, r6, r7, r8, r9)
                kotlinx.coroutines.test.TestScopeImpl r12 = r11.$scope
                r11.label = r3
                java.lang.Object r12 = r12.join(r11)
                if (r12 != r0) goto L4d
                goto L57
            L4d:
                kotlinx.coroutines.Job r12 = r11.$workRunner
                r11.label = r2
                java.lang.Object r11 = kotlinx.coroutines.JobKt.cancelAndJoin(r12, r11)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersKt$runTest$2$1(TestScopeImpl testScopeImpl, long j4, TestScope testScope, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super TestBuildersKt__TestBuildersKt$runTest$2$1> continuation) {
        super(2, continuation);
        this.$scope = testScopeImpl;
        this.$timeout = j4;
        this.$this_runTest = testScope;
        this.$testBody = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TestBuildersKt__TestBuildersKt$runTest$2$1 testBuildersKt__TestBuildersKt$runTest$2$1 = new TestBuildersKt__TestBuildersKt$runTest$2$1(this.$scope, this.$timeout, this.$this_runTest, this.$testBody, continuation);
        testBuildersKt__TestBuildersKt$runTest$2$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0133, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d2, code lost:
    
        kotlinx.coroutines.test.TestBuildersKt.throwAll(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0138, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        r2 = r19.$scope.getCompletionExceptionOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0112, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r13, r19) != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersKt$runTest$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
