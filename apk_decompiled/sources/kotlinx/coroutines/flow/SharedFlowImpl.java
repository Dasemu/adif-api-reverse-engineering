package kotlinx.coroutines.flow;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001c\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0016\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", FirebaseAnalytics.Param.INDEX, "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,745:1\n28#2,4:746\n28#2,4:752\n28#2,4:774\n28#2,4:781\n28#2,4:793\n28#2,4:807\n28#2,4:821\n20#3:750\n20#3:756\n20#3:778\n20#3:785\n20#3:797\n20#3:811\n20#3:825\n329#4:751\n1#5:757\n94#6,2:758\n96#6,2:761\n98#6:764\n94#6,2:786\n96#6,2:789\n98#6:792\n94#6,2:814\n96#6,2:817\n98#6:820\n13309#7:760\n13310#7:763\n13309#7:788\n13310#7:791\n13309#7:816\n13310#7:819\n314#8,9:765\n323#8,2:779\n314#8,9:798\n323#8,2:812\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n365#1:746,4\n405#1:752,4\n499#1:774,4\n520#1:781,4\n640#1:793,4\n675#1:807,4\n703#1:821,4\n365#1:750\n405#1:756\n499#1:778\n520#1:785\n640#1:797\n675#1:811\n703#1:825\n387#1:751\n467#1:758,2\n467#1:761,2\n467#1:764\n543#1:786,2\n543#1:789,2\n543#1:792\n690#1:814,2\n690#1:817,2\n690#1:820\n467#1:760\n467#1:763\n543#1:788\n543#1:791\n690#1:816\n690#1:819\n497#1:765,9\n497#1:779,2\n674#1:798,9\n674#1:812,2\n*E\n"})
/* loaded from: classes3.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", FirebaseAnalytics.Param.INDEX, "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Emitter implements DisposableHandle {

        @JvmField
        public final Continuation<Unit> cont;

        @JvmField
        public final SharedFlowImpl<?> flow;

        @JvmField
        public long index;

        @JvmField
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j4, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j4;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedFlowImpl(int i, int i4, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i4;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (SharedFlowKt.access$getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.access$setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlowKt.access$getBufferAt(objArr, (getHead() + getTotalSize()) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.access$setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(3:(7:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(2:16|(3:28|29|(2:31|32)(2:33|27))(4:18|(1:20)|21|(1:23)(2:26|27)))|24)(4:44|45|46|47)|37|38)(5:53|54|55|(1:57)|60)|48|49|15|(3:16|(0)(0)|27)|24))|63|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<?> r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        AbstractSharedFlowSlot[] access$getSlots;
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j4 = sharedFlowSlot.index;
                    if (j4 >= 0 && j4 < newHead) {
                        sharedFlowSlot.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.access$setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    public static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t2, Continuation<? super Unit> continuation) {
        Object emitSuspend;
        return (!sharedFlowImpl.tryEmit(t2) && (emitSuspend = sharedFlowImpl.emitSuspend(t2, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t2, Continuation<? super Unit> continuation) {
        SharedFlowImpl<T> sharedFlowImpl;
        Throwable th;
        Continuation<Unit>[] findSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t2)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuationImpl.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
                        findSlotsToResumeLocked = findSlotsToResumeLocked(continuationArr);
                        emitter = null;
                        sharedFlowImpl = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sharedFlowImpl = this;
                        throw th;
                    }
                } else {
                    sharedFlowImpl = this;
                    try {
                        emitter = new Emitter(sharedFlowImpl, getHead() + getTotalSize(), t2, cancellableContinuationImpl);
                        sharedFlowImpl.enqueueLocked(emitter);
                        sharedFlowImpl.queueSize++;
                        if (sharedFlowImpl.bufferCapacity == 0) {
                            continuationArr = sharedFlowImpl.findSlotsToResumeLocked(continuationArr);
                        }
                        findSlotsToResumeLocked = continuationArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (Continuation<Unit> continuation2 : findSlotsToResumeLocked) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                sharedFlowImpl = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object item) {
        int totalSize = getTotalSize();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(null, 0, 2);
        } else if (totalSize >= objArr.length) {
            objArr = growBuffer(objArr, totalSize, objArr.length * 2);
        }
        SharedFlowKt.access$setBufferAt(objArr, getHead() + totalSize, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] resumesIn) {
        AbstractSharedFlowSlot[] access$getSlots;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            int length2 = access$getSlots.length;
            int i = 0;
            resumesIn = resumesIn;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = access$getSlots[i];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        resumesIn = copyOf;
                    }
                    resumesIn[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    private final Object getPeekedValueLockedAt(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object access$getBufferAt = SharedFlowKt.access$getBufferAt(objArr, index);
        return access$getBufferAt instanceof Emitter ? ((Emitter) access$getBufferAt).value : access$getBufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long head = getHead();
            for (int i = 0; i < curSize; i++) {
                long j4 = i + head;
                SharedFlowKt.access$setBufferAt(objArr, j4, SharedFlowKt.access$getBufferAt(curBuffer, j4));
            }
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T value) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        enqueueLocked(value);
        int i4 = this.bufferSize + 1;
        this.bufferSize = i4;
        if (i4 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T value) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot slot) {
        long j4 = slot.index;
        if (j4 >= getBufferEndIndex() && (this.bufferCapacity > 0 || j4 > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j4;
    }

    private final Object tryTakeValue(SharedFlowSlot slot) {
        Object obj;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long tryPeekLocked = tryPeekLocked(slot);
                if (tryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j4 = slot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(tryPeekLocked);
                    slot.index = tryPeekLocked + 1;
                    continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j4);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long min = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long head = getHead(); head < min; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.access$setBufferAt(objArr, head, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - min);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        return emit$suspendImpl(this, t2, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) SharedFlowKt.access$getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(SharedFlowKt.access$getBufferAt(objArr, this.replayIndex + i));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        SharedFlowImpl<T> sharedFlowImpl;
        synchronized (this) {
            try {
                sharedFlowImpl = this;
                try {
                    sharedFlowImpl.updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                sharedFlowImpl = this;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z3;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(value)) {
                continuationArr = findSlotsToResumeLocked(continuationArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m116constructorimpl(Unit.INSTANCE));
            }
        }
        return z3;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        long j4;
        long j5;
        long j6;
        AbstractSharedFlowSlot[] access$getSlots;
        if (oldIndex > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j7 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j7++;
        }
        if (AbstractSharedFlow.access$getNCollectors(this) != 0 && (access$getSlots = AbstractSharedFlow.access$getSlots(this)) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    long j8 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j8 >= 0 && j8 < j7) {
                        j7 = j8;
                    }
                }
            }
        }
        if (j7 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int min = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j7))) : this.queueSize;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j9 = this.queueSize + bufferEndIndex;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j6 = 1;
            long j10 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j9) {
                    j4 = head;
                    j5 = j7;
                    bufferEndIndex = j10;
                    break;
                }
                Object access$getBufferAt = SharedFlowKt.access$getBufferAt(objArr, bufferEndIndex);
                j4 = head;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (access$getBufferAt != symbol) {
                    Intrinsics.checkNotNull(access$getBufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) access$getBufferAt;
                    int i4 = i + 1;
                    j5 = j7;
                    continuationArr[i] = emitter.cont;
                    SharedFlowKt.access$setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlowKt.access$setBufferAt(objArr, j10, emitter.value);
                    long j11 = j10 + 1;
                    if (i4 >= min) {
                        bufferEndIndex = j11;
                        break;
                    }
                    i = i4;
                    j10 = j11;
                } else {
                    j5 = j7;
                }
                bufferEndIndex++;
                head = j4;
                j7 = j5;
            }
        } else {
            j4 = head;
            j5 = j7;
            j6 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i5 = (int) (bufferEndIndex - j4);
        long j12 = getNCollectors() == 0 ? bufferEndIndex : j5;
        long max = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i5));
        if (this.bufferCapacity == 0 && max < j9) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(SharedFlowKt.access$getBufferAt(objArr2, max), SharedFlowKt.NO_VALUE)) {
                bufferEndIndex += j6;
                max += j6;
            }
        }
        updateBufferLocked(max, j12, bufferEndIndex, j9);
        cleanupTailLocked();
        return !(continuationArr2.length == 0) ? findSlotsToResumeLocked(continuationArr2) : continuationArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j4 = this.replayIndex;
        if (j4 < this.minCollectorIndex) {
            this.minCollectorIndex = j4;
        }
        return j4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int size) {
        return new SharedFlowSlot[size];
    }
}
