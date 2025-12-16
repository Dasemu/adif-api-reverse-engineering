package kotlinx.coroutines.test;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00022\u00020\u0003B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00162\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlinx/coroutines/test/TestDispatchEvent;", "T", "", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "dispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "count", "", "time", "marker", "isForeground", "", "isCancelled", "Lkotlin/Function0;", "(Lkotlinx/coroutines/test/TestDispatcher;JJLjava/lang/Object;ZLkotlin/jvm/functions/Function0;)V", "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "Ljava/lang/Object;", "compareTo", "other", "toString", "", "kotlinx-coroutines-test"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestDispatchEvent<T> implements Comparable<TestDispatchEvent<?>>, ThreadSafeHeapNode {
    private final long count;

    @JvmField
    public final TestDispatcher dispatcher;
    private ThreadSafeHeap<?> heap;
    private int index;

    @JvmField
    public final Function0<Boolean> isCancelled;

    @JvmField
    public final boolean isForeground;

    @JvmField
    public final T marker;

    @JvmField
    public final long time;

    public TestDispatchEvent(TestDispatcher testDispatcher, long j4, long j5, T t2, boolean z3, Function0<Boolean> function0) {
        this.dispatcher = testDispatcher;
        this.count = j4;
        this.time = j5;
        this.marker = t2;
        this.isForeground = z3;
        this.isCancelled = function0;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public ThreadSafeHeap<?> getHeap() {
        return this.heap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public int getIndex() {
        return this.index;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
        this.heap = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setIndex(int i) {
        this.index = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TestDispatchEvent(time=");
        sb.append(this.time);
        sb.append(", dispatcher=");
        sb.append(this.dispatcher);
        return com.google.android.gms.measurement.internal.a.n(sb, this.isForeground ? "" : ", background", ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(TestDispatchEvent<?> other) {
        return ComparisonsKt.compareValuesBy((TestDispatchEvent<?>) this, other, (Function1<? super TestDispatchEvent<?>, ? extends Comparable<?>>[]) new Function1[]{new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((TestDispatchEvent) obj).time);
            }
        }, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                long j4;
                j4 = ((TestDispatchEvent) obj).count;
                return Long.valueOf(j4);
            }
        }});
    }
}
