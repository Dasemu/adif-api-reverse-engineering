package kotlin.reflect.jvm.internal.impl.resolve.constants;

import C.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes3.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c4) {
        super(Character.valueOf(c4));
    }

    private final String getPrintablePart(char c4) {
        return c4 == '\b' ? "\\b" : c4 == '\t' ? "\\t" : c4 == '\n' ? "\\n" : c4 == '\f' ? "\\f" : c4 == '\r' ? "\\r" : isPrintableUnicode(c4) ? String.valueOf(c4) : "?";
    }

    private final boolean isPrintableUnicode(char c4) {
        byte type = (byte) Character.getType(c4);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return w.s(new Object[]{Integer.valueOf(getValue().charValue()), getPrintablePart(getValue().charValue())}, 2, "\\u%04X ('%s')", "format(...)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(charType, "getCharType(...)");
        return charType;
    }
}
