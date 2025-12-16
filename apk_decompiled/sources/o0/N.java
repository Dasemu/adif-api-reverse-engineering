package o0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: n, reason: collision with root package name */
    public final Class f7949n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Class type) {
        super(type, 0);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.f7949n = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // o0.S, o0.T
    public final String b() {
        String name = this.f7949n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // o0.S
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Enum c(String value) {
        Object obj;
        boolean equals;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.f7949n;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), value, true);
            if (equals) {
                break;
            }
            i++;
        }
        Enum r32 = (Enum) obj;
        if (r32 != null) {
            return r32;
        }
        StringBuilder p = com.google.android.gms.measurement.internal.a.p("Enum value ", value, " not found for type ");
        p.append(cls.getName());
        p.append('.');
        throw new IllegalArgumentException(p.toString());
    }
}
