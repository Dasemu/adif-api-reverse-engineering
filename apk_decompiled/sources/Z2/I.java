package Z2;

import kotlin.KotlinVersion;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class I extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2221a;

    public /* synthetic */ I(int i) {
        this.f2221a = i;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        switch (this.f2221a) {
            case 0:
                return rVar.e0();
            case 1:
                return Boolean.valueOf(rVar.Z());
            case 2:
                return Byte.valueOf((byte) L.g(rVar, "a byte", -128, KotlinVersion.MAX_COMPONENT_VALUE));
            case 3:
                String e02 = rVar.e0();
                if (e02.length() <= 1) {
                    return Character.valueOf(e02.charAt(0));
                }
                throw new RuntimeException("Expected a char but was " + ("\"" + e02 + Typography.quote) + " at path " + rVar.O());
            case 4:
                return Double.valueOf(rVar.a0());
            case 5:
                float a02 = (float) rVar.a0();
                if (rVar.f2284e || !Float.isInfinite(a02)) {
                    return Float.valueOf(a02);
                }
                throw new RuntimeException("JSON forbids NaN and infinities: " + a02 + " at path " + rVar.O());
            case 6:
                return Integer.valueOf(rVar.b0());
            case 7:
                return Long.valueOf(rVar.c0());
            default:
                return Short.valueOf((short) L.g(rVar, "a short", -32768, 32767));
        }
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        switch (this.f2221a) {
            case 0:
                xVar.h0((String) obj);
                return;
            case 1:
                xVar.i0(((Boolean) obj).booleanValue());
                return;
            case 2:
                xVar.f0(((Byte) obj).intValue() & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            case 3:
                xVar.h0(((Character) obj).toString());
                return;
            case 4:
                xVar.e0(((Double) obj).doubleValue());
                return;
            case 5:
                Float f2 = (Float) obj;
                f2.getClass();
                xVar.g0(f2);
                return;
            case 6:
                xVar.f0(((Integer) obj).intValue());
                return;
            case 7:
                xVar.f0(((Long) obj).longValue());
                return;
            default:
                xVar.f0(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f2221a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
