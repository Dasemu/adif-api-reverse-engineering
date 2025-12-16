package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NullabilityQualifierWithMigrationStatus {
    private final boolean isForWarningOnly;
    private final NullabilityQualifier qualifier;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z3) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.qualifier = qualifier;
        this.isForWarningOnly = z3;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.qualifier;
        }
        if ((i & 2) != 0) {
            z3 = nullabilityQualifierWithMigrationStatus.isForWarningOnly;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z3);
    }

    public final NullabilityQualifierWithMigrationStatus copy(NullabilityQualifier qualifier, boolean z3) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.qualifier == nullabilityQualifierWithMigrationStatus.qualifier && this.isForWarningOnly == nullabilityQualifierWithMigrationStatus.isForWarningOnly;
    }

    public final NullabilityQualifier getQualifier() {
        return this.qualifier;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isForWarningOnly) + (this.qualifier.hashCode() * 31);
    }

    public final boolean isForWarningOnly() {
        return this.isForWarningOnly;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.qualifier + ", isForWarningOnly=" + this.isForWarningOnly + ')';
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z3);
    }
}
