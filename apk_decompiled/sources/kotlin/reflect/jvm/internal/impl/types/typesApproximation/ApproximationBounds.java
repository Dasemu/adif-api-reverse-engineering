package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ApproximationBounds<T> {
    private final T lower;
    private final T upper;

    public ApproximationBounds(T t2, T t4) {
        this.lower = t2;
        this.upper = t4;
    }

    public final T component1() {
        return this.lower;
    }

    public final T component2() {
        return this.upper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.areEqual(this.lower, approximationBounds.lower) && Intrinsics.areEqual(this.upper, approximationBounds.upper);
    }

    public final T getLower() {
        return this.lower;
    }

    public final T getUpper() {
        return this.upper;
    }

    public int hashCode() {
        T t2 = this.lower;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        T t4 = this.upper;
        return hashCode + (t4 != null ? t4.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.lower + ", upper=" + this.upper + ')';
    }
}
