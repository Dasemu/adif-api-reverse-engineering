package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.coroutines.AbstractCoroutine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt", f = "TestBuilders.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {617, 521, 521}, m = "runTestCoroutineLegacy-SYHnMyU", n = {"$this$runTestCoroutineLegacy_u2dSYHnMyU", "coroutine", "tryGetCompletionCause", "cleanup", "scheduler", "completed", "backgroundWorkRunner", "dispatchTimeout", "$this$runTestCoroutineLegacy_u2dSYHnMyU", "coroutine", "tryGetCompletionCause", "cleanup", "scheduler", "completed", "dispatchTimeout"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
/* loaded from: classes3.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1<T extends AbstractCoroutine<? super Unit>> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1(Continuation<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return TestBuildersKt.m1703runTestCoroutineLegacySYHnMyU(null, null, 0L, null, null, null, this);
    }
}
