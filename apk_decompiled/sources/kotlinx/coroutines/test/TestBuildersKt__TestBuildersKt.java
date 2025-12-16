package kotlinx.coroutines.test;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractCoroutine;
import u.AbstractC0629f;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001af\u0010\u0006\u001a\u00060\u0007j\u0002`\b\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u0002H\t2\u0006\u0010\r\u001a\u00020\u00042\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u0002H\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u0013H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aL\u0010\u0017\u001a\u00060\u000bj\u0002`\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010!\u001aQ\u0010\u0017\u001a\u00060\u000bj\u0002`\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u00042'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b#\u0010!\u001a=\u0010$\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020 2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010(\u001a\u0002H\tH\u0002¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0000\u001aF\u0010\u0017\u001a\u00060\u000bj\u0002`\u0018*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00012'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010.\u001aK\u0010\u0017\u001a\u00060\u000bj\u0002`\u0018*\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00042'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b#\u0010.\u001a\u008f\u0001\u0010/\u001a\u00020\u000b\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00020\u000b0\n*\u0002002\u0006\u0010\f\u001a\u0002H\t2\u0006\u0010\r\u001a\u00020\u00042\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u0002H\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u00112'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u0013H\u0081@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aZ\u00103\u001a\u00060\u000bj\u0002`\u0018*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00012'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001d¢\u0006\u0002\b\u00112\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b7\u00108\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"DEFAULT_DISPATCH_TIMEOUT_MS", "", "DEFAULT_TIMEOUT", "Lkotlin/Result;", "Lkotlin/time/Duration;", "Ljava/lang/Object;", "handleTimeout", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "", "coroutine", "dispatchTimeout", "tryGetCompletionCause", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "cleanup", "Lkotlin/Function0;", "", "handleTimeout-dWUq8MI$TestBuildersKt__TestBuildersKt", "(Lkotlinx/coroutines/AbstractCoroutine;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/AssertionError;", "runTest", "Lkotlinx/coroutines/test/TestResult;", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchTimeoutMs", "testBody", "Lkotlin/Function2;", "Lkotlinx/coroutines/test/TestScope;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "timeout", "runTest-8Mi8wO0", "systemProperty", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "parse", "default", "systemProperty$TestBuildersKt__TestBuildersKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "throwAll", "head", "other", "(Lkotlinx/coroutines/test/TestScope;JLkotlin/jvm/functions/Function2;)V", "runTestCoroutineLegacy", "Lkotlinx/coroutines/CoroutineScope;", "runTestCoroutineLegacy-SYHnMyU", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/AbstractCoroutine;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runTestLegacy", "marker", "", "unused2", "runTest$default", "(Lkotlinx/coroutines/test/TestScope;JLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V", "kotlinx-coroutines-test"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/test/TestBuildersKt")
@SourceDebugExtension({"SMAP\nTestBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,609:1\n55#2,8:610\n1#3:618\n1855#4,2:619\n1855#4,2:621\n1855#4,2:623\n*S KotlinDebug\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n*L\n508#1:610,8\n566#1:619,2\n572#1:621,2\n577#1:623,2\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class TestBuildersKt__TestBuildersKt {
    private static final Object DEFAULT_TIMEOUT;

    static {
        Object m116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m116constructorimpl = Result.m116constructorimpl(Duration.m1453boximpl(((Duration) systemProperty$TestBuildersKt__TestBuildersKt("kotlinx.coroutines.test.default_timeout", new TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1(Duration.INSTANCE), Duration.m1453boximpl(DurationKt.toDuration(60, DurationUnit.SECONDS)))).getRawValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m116constructorimpl = Result.m116constructorimpl(ResultKt.createFailure(th));
        }
        DEFAULT_TIMEOUT = m116constructorimpl;
    }

    /* renamed from: handleTimeout-dWUq8MI$TestBuildersKt__TestBuildersKt, reason: not valid java name */
    private static final <T extends AbstractCoroutine<? super Unit>> AssertionError m1704handleTimeoutdWUq8MI$TestBuildersKt__TestBuildersKt(T t2, long j4, Function1<? super T, ? extends Throwable> function1, Function0<? extends List<? extends Throwable>> function0) {
        List<? extends Throwable> emptyList;
        try {
            emptyList = function0.invoke();
        } catch (UncompletedCoroutinesError unused) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = SequencesKt.toList(SequencesKt.filter(t2.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable invoke = t2.isCancelled() ? function1.invoke(t2) : null;
        String str = "After waiting for " + ((Object) Duration.m1504toStringimpl(j4));
        if (invoke == null) {
            str = w.n(str, ", the test coroutine is not completing");
        }
        if (!list.isEmpty()) {
            str = str + ", there were active child jobs: " + list;
        }
        if (invoke != null && list.isEmpty()) {
            StringBuilder a2 = AbstractC0629f.a(str);
            a2.append(t2.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = a2.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (invoke != null) {
            ExceptionsKt.addSuppressed(uncompletedCoroutinesError, invoke);
        }
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(uncompletedCoroutinesError, (Throwable) it.next());
        }
        return uncompletedCoroutinesError;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @ReplaceWith(expression = "runTest(context, timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void runTest(CoroutineContext coroutineContext, long j4, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) == null) {
            TestBuildersKt.runTest(TestScopeKt.TestScope(coroutineContext.plus(runningInRunTest)), j4, function2);
            return;
        }
        throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
    }

    public static /* synthetic */ void runTest$default(CoroutineContext coroutineContext, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        TestBuildersKt.runTest(coroutineContext, j4, (Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m1705runTest8Mi8wO0(CoroutineContext coroutineContext, long j4, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (coroutineContext.get(runningInRunTest) == null) {
            TestBuildersKt.m1700runTest8Mi8wO0(TestScopeKt.TestScope(coroutineContext.plus(runningInRunTest)), j4, function2);
            return;
        }
        throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m1707runTest8Mi8wO0$default(CoroutineContext coroutineContext, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            ResultKt.throwOnFailure(obj2);
            j4 = ((Duration) obj2).getRawValue();
        }
        TestBuildersKt.m1699runTest8Mi8wO0(coroutineContext, j4, (Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Type inference failed for: r14v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0171 -> B:17:0x017c). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(message = "Used for support of legacy behavior")
    /* renamed from: runTestCoroutineLegacy-SYHnMyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends kotlinx.coroutines.AbstractCoroutine<? super kotlin.Unit>> java.lang.Object m1709runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope r22, T r23, long r24, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Throwable> r26, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r27, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Throwable>> r28, kotlin.coroutines.Continuation<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.m1709runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.AbstractCoroutine, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> T systemProperty$TestBuildersKt__TestBuildersKt(String str, Function1<? super String, ? extends T> function1, T t2) {
        String systemPropertyImpl = TestBuildersJvmKt.systemPropertyImpl(str);
        return systemPropertyImpl == null ? t2 : function1.invoke(systemPropertyImpl);
    }

    public static final void throwAll(Throwable th, List<? extends Throwable> list) {
        if (th != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExceptionsKt.addSuppressed(th, (Throwable) it.next());
            }
            throw th;
        }
        Throwable th2 = (Throwable) CollectionsKt.firstOrNull((List) list);
        if (th2 != null) {
            Iterator it2 = CollectionsKt.drop(list, 1).iterator();
            while (it2.hasNext()) {
                ExceptionsKt.addSuppressed(th2, (Throwable) it2.next());
            }
            throw th2;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This is for binary compatibility with the `runTest` overload that existed at some point")
    @JvmName(name = "runTest$default")
    public static final /* synthetic */ void runTest$default(TestScope testScope, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) == 0) {
            j4 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTest(testScope, j4, (Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @ReplaceWith(expression = "this.runTest(timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void runTest(TestScope testScope, long j4, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$3$1(asSpecificImplementation, j4, function2, testScope, null));
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m1706runTest8Mi8wO0(TestScope testScope, long j4, Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$2$1(asSpecificImplementation, j4, testScope, function2, null));
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m1708runTest8Mi8wO0$default(TestScope testScope, long j4, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            ResultKt.throwOnFailure(obj2);
            j4 = ((Duration) obj2).getRawValue();
        }
        TestBuildersKt.m1700runTest8Mi8wO0(testScope, j4, (Function2<? super TestScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }
}
