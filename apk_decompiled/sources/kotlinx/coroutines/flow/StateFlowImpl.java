package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0014J\u001d\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020(H\u0016J\u0015\u00102\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\t¨\u00067"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "sequence", "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "setValue", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13309#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* loaded from: classes3.dex */
public final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean updateState(Object expectedState, Object newState) {
        int i;
        StateFlowSlot[] slots;
        synchronized (this) {
            Object obj = _state$volatile$FU.get(this);
            if (expectedState != null && !Intrinsics.areEqual(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.areEqual(obj, newState)) {
                return true;
            }
            _state$volatile$FU.set(this, newState);
            int i4 = this.sequence;
            if ((i4 & 1) != 0) {
                this.sequence = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.sequence = i5;
            StateFlowSlot[] slots2 = getSlots();
            Unit unit = Unit.INSTANCE;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = slots2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i5) {
                        this.sequence = i5 + 1;
                        return true;
                    }
                    slots = getSlots();
                    Unit unit2 = Unit.INSTANCE;
                }
                slots2 = slots;
                i5 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12, (java.lang.Object) r7) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        if (r7 == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x00ac, B:15:0x00b6, B:17:0x00bb, B:19:0x00e0, B:21:0x00e6, B:25:0x00c1, B:28:0x00c8, B:11:0x0074, B:12:0x009d, B:49:0x0087, B:51:0x008b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x00ac, B:15:0x00b6, B:17:0x00bb, B:19:0x00e0, B:21:0x00e6, B:25:0x00c1, B:28:0x00c8, B:11:0x0074, B:12:0x009d, B:49:0x0087, B:51:0x008b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x00ac, B:15:0x00b6, B:17:0x00bb, B:19:0x00e0, B:21:0x00e6, B:25:0x00c1, B:28:0x00c8, B:11:0x0074, B:12:0x009d, B:49:0x0087, B:51:0x008b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e4 -> B:13:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f6 -> B:13:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) NullSurrogateKt.NULL;
        }
        if (update == null) {
            update = (T) NullSurrogateKt.NULL;
        }
        return updateState(expect, update);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        setValue(t2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        T t2 = (T) _state$volatile$FU.get(this);
        if (t2 == symbol) {
            return null;
        }
        return t2;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t2) {
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        updateState(null, t2);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int size) {
        return new StateFlowSlot[size];
    }
}
