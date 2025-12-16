package kotlin.reflect.jvm.internal.impl.name;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class CallableId {
    public static final Companion Companion = new Companion(null);
    private static final Name LOCAL_NAME;
    private static final FqName PACKAGE_FQ_NAME_FOR_LOCAL;
    private final Name callableName;
    private final FqName className;
    private final FqName packageName;
    private final FqName pathToLocal;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Name name = SpecialNames.LOCAL;
        LOCAL_NAME = name;
        FqName fqName = FqName.topLevel(name);
        Intrinsics.checkNotNullExpressionValue(fqName, "topLevel(...)");
        PACKAGE_FQ_NAME_FOR_LOCAL = fqName;
    }

    public CallableId(FqName packageName, FqName fqName, Name callableName, FqName fqName2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.packageName = packageName;
        this.className = fqName;
        this.callableName = callableName;
        this.pathToLocal = fqName2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.packageName, callableId.packageName) && Intrinsics.areEqual(this.className, callableId.className) && Intrinsics.areEqual(this.callableName, callableId.callableName) && Intrinsics.areEqual(this.pathToLocal, callableId.pathToLocal);
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        FqName fqName = this.className;
        int hashCode2 = (this.callableName.hashCode() + ((hashCode + (fqName == null ? 0 : fqName.hashCode())) * 31)) * 31;
        FqName fqName2 = this.pathToLocal;
        return hashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    public String toString() {
        String replace$default;
        StringBuilder sb = new StringBuilder();
        String asString = this.packageName.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        replace$default = StringsKt__StringsJVMKt.replace$default(asString, '.', '/', false, 4, (Object) null);
        sb.append(replace$default);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        FqName fqName = this.className;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.callableName);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i & 8) != 0 ? null : fqName3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(FqName packageName, Name callableName) {
        this(packageName, null, callableName, null, 8, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}
