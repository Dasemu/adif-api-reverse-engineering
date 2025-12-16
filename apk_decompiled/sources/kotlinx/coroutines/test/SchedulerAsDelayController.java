package kotlinx.coroutines.test;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017J\b\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u0010H\u0017R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/test/SchedulerAsDelayController;", "Lkotlinx/coroutines/test/DelayController;", "currentTime", "", "getCurrentTime$annotations", "()V", "getCurrentTime", "()J", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "advanceTimeBy", "delayTimeMillis", "advanceUntilIdle", "cleanupTestCoroutines", "", "runCurrent", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SchedulerAsDelayController extends DelayController {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.apply { advanceTimeBy(delayTimeMillis); runCurrent() }", imports = {}))
        public static long advanceTimeBy(SchedulerAsDelayController schedulerAsDelayController, long j4) {
            long currentTime = schedulerAsDelayController.getScheduler().getCurrentTime();
            schedulerAsDelayController.getScheduler().advanceTimeBy(j4);
            schedulerAsDelayController.getScheduler().runCurrent();
            return schedulerAsDelayController.getScheduler().getCurrentTime() - currentTime;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.advanceUntilIdle()", imports = {}))
        public static long advanceUntilIdle(SchedulerAsDelayController schedulerAsDelayController) {
            long currentTime = schedulerAsDelayController.getScheduler().getCurrentTime();
            schedulerAsDelayController.getScheduler().advanceUntilIdle();
            return schedulerAsDelayController.getScheduler().getCurrentTime() - currentTime;
        }

        @ExperimentalCoroutinesApi
        public static void cleanupTestCoroutines(SchedulerAsDelayController schedulerAsDelayController) {
            schedulerAsDelayController.getScheduler().runCurrent();
            if (!schedulerAsDelayController.getScheduler().isIdle$kotlinx_coroutines_test(false)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines during tear-down. Ensure all coroutines are completed or cancelled by your test.");
            }
        }

        public static long getCurrentTime(SchedulerAsDelayController schedulerAsDelayController) {
            return schedulerAsDelayController.getScheduler().getCurrentTime();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "This property delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.currentTime", imports = {}))
        public static /* synthetic */ void getCurrentTime$annotations() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.runCurrent()", imports = {}))
        public static void runCurrent(SchedulerAsDelayController schedulerAsDelayController) {
            schedulerAsDelayController.getScheduler().runCurrent();
        }
    }

    @Override // kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.apply { advanceTimeBy(delayTimeMillis); runCurrent() }", imports = {}))
    long advanceTimeBy(long delayTimeMillis);

    @Override // kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.advanceUntilIdle()", imports = {}))
    long advanceUntilIdle();

    @Override // kotlinx.coroutines.test.DelayController
    @ExperimentalCoroutinesApi
    void cleanupTestCoroutines();

    @Override // kotlinx.coroutines.test.DelayController
    long getCurrentTime();

    TestCoroutineScheduler getScheduler();

    @Override // kotlinx.coroutines.test.DelayController
    @Deprecated(level = DeprecationLevel.ERROR, message = "This function delegates to the test scheduler, which may cause confusing behavior unless made explicit.", replaceWith = @ReplaceWith(expression = "this.scheduler.runCurrent()", imports = {}))
    void runCurrent();
}
