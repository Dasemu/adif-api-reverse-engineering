package kotlinx.coroutines.internal;

import A.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", RemoteConfigConstants.ResponseFieldKey.STATE, "", "allocateOrGetNextCopy", "close", "fillPlaceholder", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* loaded from: classes3.dex */
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");

    @JvmField
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j4) {
            return (j4 & LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j4, int i) {
            return wo(j4, LockFreeTaskQueueCore.HEAD_MASK) | i;
        }

        public final long updateTail(long j4, int i) {
            return wo(j4, LockFreeTaskQueueCore.TAIL_MASK) | (i << 30);
        }

        public final <T> T withState(long j4, Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (LockFreeTaskQueueCore.HEAD_MASK & j4)), Integer.valueOf((int) ((j4 & LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }

        public final long wo(long j4, long j5) {
            return j4 & (~j5);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", FirebaseAnalytics.Param.INDEX, "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Placeholder {

        @JvmField
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z3) {
        this.capacity = i;
        this.singleConsumer = z3;
        int i4 = i - 1;
        this.mask = i4;
        this.array = new AtomicReferenceArray(i);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long state) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i = (int) (HEAD_MASK & state);
        int i4 = (int) ((TAIL_MASK & state) >> 30);
        while (true) {
            int i5 = this.mask;
            if ((i & i5) == (i5 & i4)) {
                _state$volatile$FU.set(lockFreeTaskQueueCore, INSTANCE.wo(state, FROZEN_MASK));
                return lockFreeTaskQueueCore;
            }
            Object obj = getArray().get(this.mask & i);
            if (obj == null) {
                obj = new Placeholder(i);
            }
            lockFreeTaskQueueCore.getArray().set(lockFreeTaskQueueCore.mask & i, obj);
            i++;
        }
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$volatile$FU;
            LockFreeTaskQueueCore<E> allocateNextCopy = allocateNextCopy(state);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, allocateNextCopy) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int index, E element) {
        Object obj = getArray().get(this.mask & index);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != index) {
            return null;
        }
        getArray().set(index & this.mask, element);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.array;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long markFrozen() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & FROZEN_MASK) != 0) {
                return j4;
            }
            long j5 = FROZEN_MASK | j4;
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j4, j5)) {
                return j5;
            }
            this = lockFreeTaskQueueCore;
        }
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            int i = (int) (HEAD_MASK & j4);
            if ((FROZEN_MASK & j4) != 0) {
                return this.next();
            }
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
            if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore, j4, INSTANCE.updateHead(j4, newHead))) {
                lockFreeTaskQueueCore.getArray().set(lockFreeTaskQueueCore.mask & i, null);
                return null;
            }
            this = lockFreeTaskQueueCore;
        }
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(long j4) {
        this._state$volatile = j4;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        while (true) {
            long j4 = atomicLongFieldUpdater.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j4, function1.invoke(Long.valueOf(j4)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final /* synthetic */ long updateAndGet$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1) {
        while (true) {
            long j4 = atomicLongFieldUpdater.get(obj);
            Long invoke = function1.invoke(Long.valueOf(j4));
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j4, invoke.longValue())) {
                return invoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final int addLast(E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return INSTANCE.addFailReason(j4);
            }
            int i = (int) (HEAD_MASK & j4);
            int i4 = (int) ((TAIL_MASK & j4) >> 30);
            int i5 = this.mask;
            if (((i4 + 2) & i5) == (i & i5)) {
                return 1;
            }
            if (this.singleConsumer || this.getArray().get(i4 & i5) == null) {
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
                if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore, j4, INSTANCE.updateTail(j4, (i4 + 1) & MAX_CAPACITY_MASK))) {
                    lockFreeTaskQueueCore.getArray().set(i4 & i5, element);
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCore2 = lockFreeTaskQueueCore;
                    while ((_state$volatile$FU.get(lockFreeTaskQueueCore2) & FROZEN_MASK) != 0 && (lockFreeTaskQueueCore2 = lockFreeTaskQueueCore2.next().fillPlaceholder(i4, element)) != null) {
                    }
                    return 0;
                }
                this = lockFreeTaskQueueCore;
            } else {
                int i6 = this.capacity;
                if (i6 < 1024 || ((i4 - i) & MAX_CAPACITY_MASK) > (i6 >> 1)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final boolean close() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j4) != 0) {
                return false;
            }
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j4, CLOSED_MASK | j4)) {
                return true;
            }
            this = lockFreeTaskQueueCore;
        }
    }

    public final int getSize() {
        long j4 = _state$volatile$FU.get(this);
        return 1073741823 & (((int) ((j4 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j4)));
    }

    public final boolean isClosed() {
        return (_state$volatile$FU.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j4 = _state$volatile$FU.get(this);
        return ((int) (HEAD_MASK & j4)) == ((int) ((j4 & TAIL_MASK) >> 30));
    }

    public final <R> List<R> map(Function1<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j4 = _state$volatile$FU.get(this);
        int i = (int) (HEAD_MASK & j4);
        int i4 = (int) ((j4 & TAIL_MASK) >> 30);
        while (true) {
            int i5 = this.mask;
            if ((i & i5) == (i5 & i4)) {
                return arrayList;
            }
            i iVar = (Object) getArray().get(this.mask & i);
            if (iVar != null && !(iVar instanceof Placeholder)) {
                arrayList.add(transform.invoke(iVar));
            }
            i++;
        }
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j4) != 0) {
                return REMOVE_FROZEN;
            }
            int i = (int) (HEAD_MASK & j4);
            int i4 = (int) ((TAIL_MASK & j4) >> 30);
            int i5 = this.mask;
            if ((i4 & i5) == (i5 & i)) {
                return null;
            }
            Object obj = this.getArray().get(this.mask & i);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i6 = (i + 1) & MAX_CAPACITY_MASK;
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
                if (_state$volatile$FU.compareAndSet(lockFreeTaskQueueCore, j4, INSTANCE.updateHead(j4, i6))) {
                    lockFreeTaskQueueCore.getArray().set(lockFreeTaskQueueCore.mask & i, null);
                    return obj;
                }
                if (lockFreeTaskQueueCore.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCore2 = lockFreeTaskQueueCore;
                    do {
                        lockFreeTaskQueueCore2 = lockFreeTaskQueueCore2.removeSlowPath(i, i6);
                    } while (lockFreeTaskQueueCore2 != null);
                    return obj;
                }
                this = lockFreeTaskQueueCore;
            }
        }
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }
}
