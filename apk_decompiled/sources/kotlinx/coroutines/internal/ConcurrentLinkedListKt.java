package kotlinx.coroutines.internal;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a!\u0010\r\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u0002H\u000eH\u0000¢\u0006\u0002\u0010\u0010\u001as\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u001328\b\b\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0080\b\u001ag\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u00132\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u001f\u001a\u0002H\u0013H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "POINTERS_SHIFT", "", "addConditionally", "", "Lkotlinx/atomicfu/AtomicInt;", "delta", "condition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "cur", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "findSegmentAndMoveForward", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicRef;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "startFrom", "createNewSegment", "Lkotlin/Function2;", "prev", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "to", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* loaded from: classes3.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    public static final /* synthetic */ Symbol access$getCLOSED$p() {
        return CLOSED;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, Function1<? super Integer, Boolean> function1) {
        int i4;
        do {
            i4 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(Integer.valueOf(i4)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i4, i4 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i, int i4, Function1<? super Integer, Boolean> function1) {
        int i5;
        do {
            i5 = atomicIntegerArray.get(i);
            if (!function1.invoke(Integer.valueOf(i5)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i5, i5 + i4));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n4) {
        while (true) {
            Object nextOrClosed = n4.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n4;
            }
            ?? r02 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r02 != 0) {
                n4 = r02;
            } else if (n4.markAsClosed()) {
                return n4;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j4, S s4, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object findSegmentInternal = findSegmentInternal(s4, j4, function2);
            if (SegmentOrClosed.m1693isClosedimpl(findSegmentInternal)) {
                return findSegmentInternal;
            }
            Segment m1691getSegmentimpl = SegmentOrClosed.m1691getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.id >= m1691getSegmentimpl.id) {
                    return findSegmentInternal;
                }
                if (!m1691getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, m1691getSegmentimpl)) {
                    if (atomicReferenceFieldUpdater.get(obj) != segment) {
                        if (m1691getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            m1691getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return findSegmentInternal;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, long j4, S s4, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            Object findSegmentInternal = findSegmentInternal(s4, j4, function2);
            if (SegmentOrClosed.m1693isClosedimpl(findSegmentInternal)) {
                return findSegmentInternal;
            }
            Segment m1691getSegmentimpl = SegmentOrClosed.m1691getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i);
                if (segment.id >= m1691getSegmentimpl.id) {
                    return findSegmentInternal;
                }
                if (!m1691getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceArray.compareAndSet(i, segment, m1691getSegmentimpl)) {
                    if (atomicReferenceArray.get(i) != segment) {
                        if (m1691getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            m1691getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return findSegmentInternal;
            }
        }
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s4, long j4, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s4.id >= j4 && !s4.isRemoved()) {
                return SegmentOrClosed.m1688constructorimpl(s4);
            }
            Object nextOrClosed = s4.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m1688constructorimpl(CLOSED);
            }
            S s5 = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (s5 == null) {
                s5 = function2.invoke(Long.valueOf(s4.id + 1), s4);
                if (s4.trySetNext(s5)) {
                    if (s4.isRemoved()) {
                        s4.remove();
                    }
                }
            }
            s4 = s5;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s4) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s4.id) {
                return true;
            }
            if (!s4.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, s4)) {
                if (atomicReferenceFieldUpdater.get(obj) != segment) {
                    if (s4.decPointers$kotlinx_coroutines_core()) {
                        s4.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, S s4) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i);
            if (segment.id >= s4.id) {
                return true;
            }
            if (!s4.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceArray.compareAndSet(i, segment, s4)) {
                if (atomicReferenceArray.get(i) != segment) {
                    if (s4.decPointers$kotlinx_coroutines_core()) {
                        s4.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }
}
