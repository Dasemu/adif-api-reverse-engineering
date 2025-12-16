package kotlinx.coroutines.test;

import C.w;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlinx.coroutines.AbstractCoroutine;
import u.AbstractC0629f;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTestBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3\n+ 2 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,609:1\n545#2,21:610\n566#2:632\n567#2:635\n1#3:631\n1855#4,2:633\n*S KotlinDebug\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3\n*L\n517#1:610,21\n517#1:632\n517#1:635\n517#1:631\n517#1:633,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<List<Throwable>> $cleanup;
    final /* synthetic */ AbstractCoroutine $coroutine;
    final /* synthetic */ long $dispatchTimeout;
    final /* synthetic */ Function1<T, Throwable> $tryGetCompletionCause;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;JLkotlin/jvm/functions/Function1<-TT;+Ljava/lang/Throwable;>;Lkotlin/jvm/functions/Function0<+Ljava/util/List<+Ljava/lang/Throwable;>;>;Lkotlin/coroutines/Continuation<-Lkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3;>;)V */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(AbstractCoroutine abstractCoroutine, long j4, Function1 function1, Function0 function0, Continuation continuation) {
        super(1, continuation);
        this.$coroutine = abstractCoroutine;
        this.$dispatchTimeout = j4;
        this.$tryGetCompletionCause = function1;
        this.$cleanup = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(this.$coroutine, this.$dispatchTimeout, this.$tryGetCompletionCause, this.$cleanup, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Throwable> emptyList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AbstractCoroutine abstractCoroutine = this.$coroutine;
        long j4 = this.$dispatchTimeout;
        Function1<T, Throwable> function1 = this.$tryGetCompletionCause;
        try {
            emptyList = this.$cleanup.invoke();
        } catch (UncompletedCoroutinesError unused) {
            emptyList = CollectionsKt.emptyList();
        }
        List list = SequencesKt.toList(SequencesKt.filter(abstractCoroutine.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable invoke = abstractCoroutine.isCancelled() ? function1.invoke(abstractCoroutine) : null;
        String str = "After waiting for " + ((Object) Duration.m1504toStringimpl(j4));
        if (invoke == null) {
            str = w.n(str, ", the test coroutine is not completing");
        }
        if (!list.isEmpty()) {
            str = str + ", there were active child jobs: " + list;
        }
        if (invoke != null && list.isEmpty()) {
            StringBuilder a2 = AbstractC0629f.a(str);
            a2.append(abstractCoroutine.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = a2.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (invoke != null) {
            ExceptionsKt.addSuppressed(uncompletedCoroutinesError, invoke);
        }
        Iterator<T> it = emptyList.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(uncompletedCoroutinesError, (Throwable) it.next());
        }
        throw uncompletedCoroutinesError;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
