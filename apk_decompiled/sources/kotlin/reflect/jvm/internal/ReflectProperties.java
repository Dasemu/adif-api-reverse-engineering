package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class ReflectProperties {

    /* loaded from: classes3.dex */
    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {
        private final Function0<T> initializer;
        private volatile SoftReference<Object> value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }

        public LazySoftVal(T t2, Function0<T> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = function0;
            if (t2 != null) {
                this.value = new SoftReference<>(escape(t2));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T invoke = this.initializer.invoke();
            this.value = new SoftReference<>(escape(invoke));
            return invoke;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Val<T> {
        private static final Object NULL_VALUE = new Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public Object escape(T t2) {
            return t2 == null ? NULL_VALUE : t2;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        public abstract T invoke();

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == NULL_VALUE) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static <T> LazySoftVal<T> lazySoft(T t2, Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(0);
        }
        return new LazySoftVal<>(t2, function0);
    }

    public static <T> LazySoftVal<T> lazySoft(Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, function0);
    }
}
