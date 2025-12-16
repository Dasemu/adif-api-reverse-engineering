package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes3.dex */
public abstract class ConstantValue<T> {
    private final T value;

    public ConstantValue(T t2) {
        this.value = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.areEqual(value, constantValue != null ? constantValue.getValue() : null);
    }

    public abstract KotlinType getType(ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
