package o0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class M extends T {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7948m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(boolean z3, int i) {
        super(z3);
        this.f7948m = i;
    }

    @Override // o0.T
    public final Object a(Bundle bundle, String key) {
        switch (this.f7948m) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                if (obj != null) {
                    return (Float) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj3 = bundle.get(key);
                if (obj3 != null) {
                    return (Long) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            case 8:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj4 = bundle.get(key);
                if (obj4 != null) {
                    return (Integer) obj4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String[]) bundle.get(key);
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // o0.T
    public final String b() {
        switch (this.f7948m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // o0.T
    public final Object c(String value) {
        boolean z3;
        boolean startsWith$default;
        int parseInt;
        boolean endsWith$default;
        String str;
        boolean startsWith$default2;
        long parseLong;
        boolean startsWith$default3;
        int parseInt2;
        switch (this.f7948m) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, "true")) {
                    z3 = true;
                } else {
                    if (!Intrinsics.areEqual(value, "false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 2:
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 4:
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 5:
                Intrinsics.checkNotNullParameter(value, "value");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
                if (startsWith$default) {
                    String substring = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            case 6:
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 7:
                Intrinsics.checkNotNullParameter(value, "value");
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(value, "L", false, 2, null);
                if (endsWith$default) {
                    str = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = value;
                }
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
                if (startsWith$default2) {
                    String substring2 = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    parseLong = Long.parseLong(substring2, CharsKt.checkRadix(16));
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 8:
                Intrinsics.checkNotNullParameter(value, "value");
                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null);
                if (startsWith$default3) {
                    String substring3 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                    parseInt2 = Integer.parseInt(substring3, CharsKt.checkRadix(16));
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
            case 9:
                Intrinsics.checkNotNullParameter(value, "value");
                throw new UnsupportedOperationException("Arrays don't support default values.");
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
        }
    }

    @Override // o0.T
    public final void d(Bundle bundle, String key, Object obj) {
        switch (this.f7948m) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBoolean(key, booleanValue);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                return;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloat(key, floatValue);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                return;
            case 5:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putInt(key, intValue);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                return;
            case 7:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLong(key, longValue);
                return;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putInt(key, intValue2);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                return;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putString(key, (String) obj);
                return;
        }
    }
}
