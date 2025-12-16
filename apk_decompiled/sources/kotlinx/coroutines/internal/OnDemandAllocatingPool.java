package kotlinx.coroutines.internal;

import C.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u0082\bJ\r\u0010\u0015\u001a\u00020\r*\u00020\u0004H\u0082\bR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "maxCapacity", "", "create", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "allocate", "", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "tryForbidNewElements", "isClosed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n32#1,10:110\n41#1:130\n1549#2:120\n1620#2,2:121\n1622#2:125\n1549#2:126\n1620#2,3:127\n101#3,2:123\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,10\n92#1:130\n77#1:120\n77#1:121,2\n77#1:125\n91#1:126\n91#1:127,3\n79#1:123,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final Function1<Integer, T> create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i, Function1<? super Integer, ? extends T> function1) {
        this.maxCapacity = i;
        this.create = function1;
        this.elements = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i) {
        return (Integer.MIN_VALUE & i) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, i + 1));
        getElements().set(i, this.create.invoke(Integer.valueOf(i)));
        return true;
    }

    public final List<T> close() {
        int i;
        int collectionSizeOrDefault;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        IntRange until = RangesKt.until(0, i);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            do {
                andSet = getElements().getAndSet(nextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int collectionSizeOrDefault;
        int i = controlState$volatile$FU.get(this);
        IntRange until = RangesKt.until(0, Integer.MAX_VALUE & i);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((IntIterator) it).nextInt()));
        }
        return w.n(arrayList.toString(), (i & IntCompanionObject.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
