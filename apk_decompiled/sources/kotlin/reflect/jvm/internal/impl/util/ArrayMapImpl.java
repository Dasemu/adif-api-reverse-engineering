package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11245#2,11:146\n13374#2,2:157\n13376#2:160\n11256#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
/* loaded from: classes3.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public static final Companion Companion = new Companion(null);
    private Object[] data;
    private int size;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i) {
        super(null);
        this.data = objArr;
        this.size = i;
    }

    private final void ensureCapacity(int i) {
        Object[] objArr = this.data;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        Object[] copyOf = Arrays.copyOf(this.data, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.data = copyOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        return (T) ArraysKt.getOrNull(this.data, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1
            private int index = -1;
            final /* synthetic */ ArrayMapImpl<T> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                Object[] objArr2;
                Object[] objArr3;
                Object[] objArr4;
                do {
                    int i = this.index + 1;
                    this.index = i;
                    objArr = ((ArrayMapImpl) this.this$0).data;
                    if (i >= objArr.length) {
                        break;
                    } else {
                        objArr4 = ((ArrayMapImpl) this.this$0).data;
                    }
                } while (objArr4[this.index] == null);
                int i4 = this.index;
                objArr2 = ((ArrayMapImpl) this.this$0).data;
                if (i4 >= objArr2.length) {
                    done();
                    return;
                }
                objArr3 = ((ArrayMapImpl) this.this$0).data;
                Object obj = objArr3[this.index];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ensureCapacity(i);
        if (this.data[i] == null) {
            this.size = getSize() + 1;
        }
        this.data[i] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
