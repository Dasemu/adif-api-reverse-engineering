package kotlinx.coroutines.test;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.SchedulerAsDelayController;

@Deprecated(level = DeprecationLevel.WARNING, message = "The execution order of `TestCoroutineDispatcher` can be confusing, and the mechanism of pausing is typically misunderstood. Please use `StandardTestDispatcher` or `UnconfinedTestDispatcher` instead.")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0017J,\u0010\u0016\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0097@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "Lkotlinx/coroutines/test/TestDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/test/SchedulerAsDelayController;", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;)V", "value", "", "dispatchImmediately", "setDispatchImmediately", "(Z)V", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "pauseDispatcher", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "Lkotlinx/coroutines/DisposableHandle;", "resumeDispatcher", "toString", "", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestCoroutineDispatcher extends TestDispatcher implements Delay, SchedulerAsDelayController {
    private boolean dispatchImmediately;
    private final TestCoroutineScheduler scheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public TestCoroutineDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final DisposableHandle post(Runnable block, CoroutineContext context) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, block, context, new Function1<Runnable, Boolean>() { // from class: kotlinx.coroutines.test.TestCoroutineDispatcher$post$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Runnable runnable) {
                return Boolean.FALSE;
            }
        });
    }

    private final void setDispatchImmediately(boolean z3) {
        this.dispatchImmediately = z3;
        if (z3) {
            getScheduler().advanceUntilIdle();
        }
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.apply { advanceTimeBy(delayTimeMillis); runCurrent() }", imports = {}))
    public long advanceTimeBy(long j4) {
        return SchedulerAsDelayController.DefaultImpls.advanceTimeBy(this, j4);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.advanceUntilIdle()", imports = {}))
    public long advanceUntilIdle() {
        return SchedulerAsDelayController.DefaultImpls.advanceUntilIdle(this);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    @ExperimentalCoroutinesApi
    public void cleanupTestCoroutines() {
        SchedulerAsDelayController.DefaultImpls.cleanupTestCoroutines(this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1685dispatch(CoroutineContext context, Runnable block) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), context);
        if (!this.dispatchImmediately) {
            post(block, context);
        } else {
            getScheduler().sendDispatchEvent$kotlinx_coroutines_test(context);
            block.run();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext context, Runnable block) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), context);
        post(block, context);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    public long getCurrentTime() {
        return SchedulerAsDelayController.DefaultImpls.getCurrentTime(this);
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.test.DelayController
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use a dispatcher that is paused by default, like `StandardTestDispatcher`.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object pauseDispatcher(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1 r0 = (kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1 r0 = new kotlinx.coroutines.test.TestCoroutineDispatcher$pauseDispatcher$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.test.TestCoroutineDispatcher r6 = (kotlinx.coroutines.test.TestCoroutineDispatcher) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            r7 = r5
            r5 = r6
            goto L55
        L31:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L5c
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r5.dispatchImmediately
            r2 = 0
            r5.setDispatchImmediately(r2)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5b
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L5b
            r0.label = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L55
            return r1
        L55:
            r5.setDispatchImmediately(r7)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5b:
            r6 = move-exception
        L5c:
            r5.setDispatchImmediately(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestCoroutineDispatcher.pauseDispatcher(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use a dispatcher that is paused by default, like `StandardTestDispatcher`.")
    public void resumeDispatcher() {
        setDispatchImmediately(true);
    }

    @Override // kotlinx.coroutines.test.SchedulerAsDelayController, kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.runCurrent()", imports = {}))
    public void runCurrent() {
        SchedulerAsDelayController.DefaultImpls.runCurrent(this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "TestCoroutineDispatcher[scheduler=" + getScheduler() + ']';
    }

    public /* synthetic */ TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler);
    }

    public TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler) {
        this.scheduler = testCoroutineScheduler;
        this.dispatchImmediately = true;
    }

    @Override // kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use a dispatcher that is paused by default, like `StandardTestDispatcher`.")
    public void pauseDispatcher() {
        setDispatchImmediately(false);
    }
}
