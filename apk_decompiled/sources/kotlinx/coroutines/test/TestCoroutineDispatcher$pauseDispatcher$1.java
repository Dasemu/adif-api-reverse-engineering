package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.test.TestCoroutineDispatcher", f = "TestCoroutineDispatcher.kt", i = {0, 0}, l = {72}, m = "pauseDispatcher", n = {"this", "previous"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
public final class TestCoroutineDispatcher$pauseDispatcher$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TestCoroutineDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestCoroutineDispatcher$pauseDispatcher$1(TestCoroutineDispatcher testCoroutineDispatcher, Continuation<? super TestCoroutineDispatcher$pauseDispatcher$1> continuation) {
        super(continuation);
        this.this$0 = testCoroutineDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= IntCompanionObject.MIN_VALUE;
        return this.this$0.pauseDispatcher(null, this);
    }
}
