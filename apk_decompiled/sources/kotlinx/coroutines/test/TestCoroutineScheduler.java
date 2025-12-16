package kotlinx.coroutines.test;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.AbstractLongTimeSource;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.ExperimentalTime;
import kotlin.time.TimeSource;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.selects.SelectClause1;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0007H\u0007J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010'\u001a\u00020\u000eJ\u001b\u0010(\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0000¢\u0006\u0002\b,J\u0017\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+H\u0000¢\u0006\u0002\b/J\u0010\u00100\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b1\u00102JM\u00103\u001a\u000204\"\b\b\u0000\u00105*\u00020\u00132\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u0002H52\u0006\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020+0=H\u0000¢\u0006\u0004\b>\u0010?J\u0006\u0010@\u001a\u00020\u000eJ\u0015\u0010A\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\bBJ\u001b\u0010C\u001a\u00020+2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0000¢\u0006\u0002\bDR\t\u0010\u0004\u001a\u00020\u0005X\u0082\u0004R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0013j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScheduler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "()V", "count", "Lkotlinx/atomicfu/AtomicLong;", "<set-?>", "", "currentTime", "getCurrentTime$annotations", "getCurrentTime", "()J", "dispatchEvents", "Lkotlinx/coroutines/channels/Channel;", "", "dispatchEventsForeground", "events", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/test/TestDispatchEvent;", "", "lock", "Lkotlinx/coroutines/internal/SynchronizedObject;", "onDispatchEvent", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnDispatchEvent$kotlinx_coroutines_test", "()Lkotlinx/coroutines/selects/SelectClause1;", "onDispatchEventForeground", "getOnDispatchEventForeground$kotlinx_coroutines_test", "timeSource", "Lkotlin/time/TimeSource$WithComparableMarks;", "getTimeSource$annotations", "getTimeSource", "()Lkotlin/time/TimeSource$WithComparableMarks;", "advanceTimeBy", "delayTimeMillis", "delayTime", "Lkotlin/time/Duration;", "advanceTimeBy-LRDsOJo", "(J)V", "advanceUntilIdle", "advanceUntilIdleOr", "condition", "Lkotlin/Function0;", "", "advanceUntilIdleOr$kotlinx_coroutines_test", "isIdle", "strict", "isIdle$kotlinx_coroutines_test", "receiveDispatchEvent", "receiveDispatchEvent$kotlinx_coroutines_test", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerEvent", "Lkotlinx/coroutines/DisposableHandle;", "T", "dispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "timeDeltaMillis", "marker", "context", "Lkotlin/coroutines/CoroutineContext;", "isCancelled", "Lkotlin/Function1;", "registerEvent$kotlinx_coroutines_test", "(Lkotlinx/coroutines/test/TestDispatcher;JLjava/lang/Object;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "runCurrent", "sendDispatchEvent", "sendDispatchEvent$kotlinx_coroutines_test", "tryRunNextTaskUnless", "tryRunNextTaskUnless$kotlinx_coroutines_test", "Key", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScheduler.kt\nkotlinx/coroutines/test/TestCoroutineScheduler\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,282:1\n28#2,4:283\n28#2,4:289\n28#2,4:294\n28#2,4:299\n28#2,4:304\n28#2,4:310\n28#2,4:322\n28#2,4:328\n28#2,4:340\n28#2,4:345\n20#3:287\n20#3:293\n20#3:298\n20#3:303\n20#3:308\n20#3:314\n20#3:326\n20#3:332\n20#3:344\n20#3:349\n1#4:288\n60#5:309\n61#5,7:315\n60#5:327\n61#5,7:333\n*S KotlinDebug\n*F\n+ 1 TestCoroutineScheduler.kt\nkotlinx/coroutines/test/TestCoroutineScheduler\n*L\n49#1:283,4\n75#1:289,4\n95#1:294,4\n131#1:299,4\n133#1:304,4\n134#1:310,4\n170#1:322,4\n172#1:328,4\n193#1:340,4\n83#1:345,4\n49#1:287\n75#1:293\n95#1:298\n131#1:303\n133#1:308\n134#1:314\n170#1:326\n172#1:332\n193#1:344\n83#1:349\n134#1:309\n134#1:315,7\n172#1:327\n172#1:333,7\n*E\n"})
/* loaded from: classes3.dex */
public final class TestCoroutineScheduler extends AbstractCoroutineContextElement implements CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final /* synthetic */ AtomicLongFieldUpdater count$volatile$FU = AtomicLongFieldUpdater.newUpdater(TestCoroutineScheduler.class, "count$volatile");
    private volatile /* synthetic */ long count$volatile;
    private long currentTime;
    private final Channel<Unit> dispatchEvents;
    private final Channel<Unit> dispatchEventsForeground;
    private final ThreadSafeHeap<TestDispatchEvent<Object>> events;
    private final Object lock;
    private final TimeSource.WithComparableMarks timeSource;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScheduler$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "()V", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.test.TestCoroutineScheduler$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements CoroutineContext.Key<TestCoroutineScheduler> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TestCoroutineScheduler() {
        super(INSTANCE);
        this.events = new ThreadSafeHeap<>();
        this.lock = new Object();
        this.dispatchEventsForeground = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.dispatchEvents = ChannelKt.Channel$default(-1, null, null, 6, null);
        final DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        this.timeSource = new AbstractLongTimeSource(durationUnit) { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$timeSource$1
            @Override // kotlin.time.AbstractLongTimeSource
            public long read() {
                return TestCoroutineScheduler.this.getCurrentTime();
            }
        };
    }

    private final /* synthetic */ long getCount$volatile() {
        return this.count$volatile;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations() {
    }

    @ExperimentalTime
    public static /* synthetic */ void getTimeSource$annotations() {
    }

    public static /* synthetic */ boolean isIdle$kotlinx_coroutines_test$default(TestCoroutineScheduler testCoroutineScheduler, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = true;
        }
        return testCoroutineScheduler.isIdle$kotlinx_coroutines_test(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerEvent$lambda$4$lambda$3(TestCoroutineScheduler testCoroutineScheduler, TestDispatchEvent testDispatchEvent) {
        synchronized (testCoroutineScheduler.lock) {
            testCoroutineScheduler.events.remove(testDispatchEvent);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final /* synthetic */ void setCount$volatile(long j4) {
        this.count$volatile = j4;
    }

    @ExperimentalCoroutinesApi
    public final void advanceTimeBy(long delayTimeMillis) {
        Duration.Companion companion = Duration.INSTANCE;
        m1711advanceTimeByLRDsOJo(DurationKt.toDuration(delayTimeMillis, DurationUnit.MILLISECONDS));
    }

    /* renamed from: advanceTimeBy-LRDsOJo, reason: not valid java name */
    public final void m1711advanceTimeByLRDsOJo(long delayTime) {
        long addClamping;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        if (Duration.m1488isNegativeimpl(delayTime)) {
            throw new IllegalArgumentException(("Can not advance time by a negative delay: " + ((Object) Duration.m1504toStringimpl(delayTime))).toString());
        }
        addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), Duration.m1473getInWholeMillisecondsimpl(delayTime));
        while (true) {
            synchronized (this.lock) {
                long currentTime = getCurrentTime();
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = addClamping > firstImpl.time ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    this.currentTime = addClamping;
                    return;
                }
                long j4 = testDispatchEvent2.time;
                if (currentTime > j4) {
                    TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                    throw new KotlinNothingValueException();
                }
                this.currentTime = j4;
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void advanceUntilIdle() {
        advanceUntilIdleOr$kotlinx_coroutines_test(new Function0<Boolean>() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$advanceUntilIdle$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                ThreadSafeHeap threadSafeHeap;
                boolean none;
                threadSafeHeap = TestCoroutineScheduler.this.events;
                none = TestCoroutineSchedulerKt.none(threadSafeHeap, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$advanceUntilIdle$1.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((TestDispatchEvent) obj).isForeground);
                    }
                });
                return Boolean.valueOf(none);
            }
        });
    }

    public final void advanceUntilIdleOr$kotlinx_coroutines_test(Function0<Boolean> condition) {
        do {
        } while (tryRunNextTaskUnless$kotlinx_coroutines_test(condition));
    }

    public final long getCurrentTime() {
        long j4;
        synchronized (this.lock) {
            j4 = this.currentTime;
        }
        return j4;
    }

    public final SelectClause1<Unit> getOnDispatchEvent$kotlinx_coroutines_test() {
        return this.dispatchEvents.getOnReceive();
    }

    public final SelectClause1<Unit> getOnDispatchEventForeground$kotlinx_coroutines_test() {
        return this.dispatchEventsForeground.getOnReceive();
    }

    public final TimeSource.WithComparableMarks getTimeSource() {
        return this.timeSource;
    }

    public final boolean isIdle$kotlinx_coroutines_test(boolean strict) {
        boolean isEmpty;
        synchronized (this.lock) {
            try {
                isEmpty = strict ? this.events.isEmpty() : TestCoroutineSchedulerKt.none(this.events, new Function1<TestDispatchEvent<Object>, Boolean>() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$isIdle$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(TestDispatchEvent<Object> testDispatchEvent) {
                        return Boolean.valueOf(!testDispatchEvent.isCancelled.invoke().booleanValue());
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    public final Object receiveDispatchEvent$kotlinx_coroutines_test(Continuation<? super Unit> continuation) {
        Object receive = this.dispatchEvents.receive(continuation);
        return receive == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? receive : Unit.INSTANCE;
    }

    public final <T> DisposableHandle registerEvent$kotlinx_coroutines_test(TestDispatcher dispatcher, long timeDeltaMillis, final T marker, CoroutineContext context, final Function1<? super T, Boolean> isCancelled) {
        long addClamping;
        DisposableHandle disposableHandle;
        if (timeDeltaMillis < 0) {
            throw new IllegalArgumentException(("Attempted scheduling an event earlier in time (with the time delta " + timeDeltaMillis + ')').toString());
        }
        TestCoroutineSchedulerKt.checkSchedulerInContext(this, context);
        long andIncrement = count$volatile$FU.getAndIncrement(this);
        boolean z3 = context.get(BackgroundWork.INSTANCE) == null;
        synchronized (this.lock) {
            addClamping = TestCoroutineSchedulerKt.addClamping(getCurrentTime(), timeDeltaMillis);
            Intrinsics.checkNotNull(marker, "null cannot be cast to non-null type kotlin.Any");
            final TestDispatchEvent<Object> testDispatchEvent = new TestDispatchEvent<>(dispatcher, andIncrement, addClamping, marker, z3, new Function0<Boolean>() { // from class: kotlinx.coroutines.test.TestCoroutineScheduler$registerEvent$2$event$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return isCancelled.invoke(marker);
                }
            });
            this.events.addLast(testDispatchEvent);
            sendDispatchEvent$kotlinx_coroutines_test(context);
            disposableHandle = new DisposableHandle() { // from class: kotlinx.coroutines.test.a
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    TestCoroutineScheduler.registerEvent$lambda$4$lambda$3(TestCoroutineScheduler.this, testDispatchEvent);
                }
            };
        }
        return disposableHandle;
    }

    public final void runCurrent() {
        long currentTime;
        TestDispatchEvent<Object> testDispatchEvent;
        TestDispatchEvent<Object> testDispatchEvent2;
        synchronized (this.lock) {
            currentTime = getCurrentTime();
        }
        while (true) {
            synchronized (this.lock) {
                ThreadSafeHeap<TestDispatchEvent<Object>> threadSafeHeap = this.events;
                synchronized (threadSafeHeap) {
                    TestDispatchEvent<Object> firstImpl = threadSafeHeap.firstImpl();
                    if (firstImpl != null) {
                        testDispatchEvent = firstImpl.time <= currentTime ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
                testDispatchEvent2 = testDispatchEvent;
                if (testDispatchEvent2 == null) {
                    return;
                }
            }
            testDispatchEvent2.dispatcher.processEvent$kotlinx_coroutines_test(testDispatchEvent2.marker);
        }
    }

    public final void sendDispatchEvent$kotlinx_coroutines_test(CoroutineContext context) {
        Channel<Unit> channel = this.dispatchEvents;
        Unit unit = Unit.INSTANCE;
        channel.mo1630trySendJP2dKIU(unit);
        BackgroundWork backgroundWork = BackgroundWork.INSTANCE;
        if (context.get(backgroundWork) != backgroundWork) {
            this.dispatchEventsForeground.mo1630trySendJP2dKIU(unit);
        }
    }

    public final boolean tryRunNextTaskUnless$kotlinx_coroutines_test(Function0<Boolean> condition) {
        synchronized (this.lock) {
            if (condition.invoke().booleanValue()) {
                return false;
            }
            TestDispatchEvent<Object> removeFirstOrNull = this.events.removeFirstOrNull();
            if (removeFirstOrNull == null) {
                return false;
            }
            long currentTime = getCurrentTime();
            long j4 = removeFirstOrNull.time;
            if (currentTime > j4) {
                TestCoroutineSchedulerKt.currentTimeAheadOfEvents();
                throw new KotlinNothingValueException();
            }
            this.currentTime = j4;
            removeFirstOrNull.dispatcher.processEvent$kotlinx_coroutines_test(removeFirstOrNull.marker);
            return true;
        }
    }
}
