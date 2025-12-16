package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.google.android.gms.measurement.internal.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;
    private final ClassId classId;
    private final T compilerVersion;
    private final T expectedVersion;
    private final String filePath;
    private final T languageVersion;

    public IncompatibleVersionErrorData(T t2, T t4, T t5, T t6, String filePath, ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.actualVersion = t2;
        this.compilerVersion = t4;
        this.languageVersion = t5;
        this.expectedVersion = t6;
        this.filePath = filePath;
        this.classId = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.areEqual(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t2 = this.actualVersion;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        T t4 = this.compilerVersion;
        int hashCode2 = (hashCode + (t4 == null ? 0 : t4.hashCode())) * 31;
        T t5 = this.languageVersion;
        int hashCode3 = (hashCode2 + (t5 == null ? 0 : t5.hashCode())) * 31;
        T t6 = this.expectedVersion;
        return this.classId.hashCode() + a.d(this.filePath, (hashCode3 + (t6 != null ? t6.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ')';
    }
}
