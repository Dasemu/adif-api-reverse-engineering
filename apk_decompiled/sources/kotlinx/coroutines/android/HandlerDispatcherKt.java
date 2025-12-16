package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\b\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", Constants.MessagePayloadKeys.FROM, "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n314#2,11:217\n314#2,9:228\n323#2,2:238\n17#3:237\n1#4:240\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n188#1:217,11\n196#1:228,9\n196#1:238,2\n200#1:237\n*E\n"})
/* loaded from: classes3.dex */
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;

    @JvmField
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object m116constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            m116constructorimpl = Result.m116constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m116constructorimpl = Result.m116constructorimpl(ResultKt.createFailure(th));
        }
        Main = (HandlerDispatcher) (Result.m122isFailureimpl(m116constructorimpl) ? null : m116constructorimpl);
    }

    public static final Handler asHandler(Looper looper, boolean z3) {
        if (!z3) {
            return new Handler(looper);
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }

    public static final Object awaitFrame(Continuation<? super Long> continuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object awaitFrameSlowPath(Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
        } else {
            Dispatchers.getMain().mo1685dispatch(cancellableContinuationImpl.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(CancellableContinuation.this);
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmOverloads
    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    public static final HandlerDispatcher from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }

    public static final void postFrameCallback(Choreographer choreographer2, CancellableContinuation<? super Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new b(cancellableContinuation, 0));
    }

    public static final void postFrameCallback$lambda$6(CancellableContinuation cancellableContinuation, long j4) {
        cancellableContinuation.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(j4));
    }

    public static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    @JvmOverloads
    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    public static final HandlerDispatcher from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }
}
