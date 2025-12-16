package a0;

import androidx.datastore.preferences.protobuf.AbstractC0128t;
import androidx.datastore.preferences.protobuf.AbstractC0130v;
import androidx.datastore.preferences.protobuf.C0109a0;
import androidx.datastore.preferences.protobuf.W;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import u.AbstractC0629f;

/* loaded from: classes.dex */
public final class j extends AbstractC0130v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile W PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        AbstractC0130v.h(j.class, jVar);
    }

    public static void i(j jVar, long j4) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j4);
    }

    public static void j(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void k(j jVar, g gVar) {
        jVar.getClass();
        jVar.value_ = gVar.a();
        jVar.valueCase_ = 6;
    }

    public static void l(j jVar, double d4) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d4);
    }

    public static void m(j jVar, boolean z3) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z3);
    }

    public static void n(j jVar, float f2) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f2);
    }

    public static void o(j jVar, int i) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i);
    }

    public static j q() {
        return DEFAULT_INSTANCE;
    }

    public static i y() {
        return (i) ((AbstractC0128t) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, androidx.datastore.preferences.protobuf.W] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0130v
    public final Object d(int i) {
        W w3;
        switch (AbstractC0629f.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0109a0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", h.class});
            case 3:
                return new j();
            case 4:
                return new AbstractC0128t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w4 = PARSER;
                if (w4 != null) {
                    return w4;
                }
                synchronized (j.class) {
                    try {
                        W w5 = PARSER;
                        w3 = w5;
                        if (w5 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            w3 = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final float s() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h w() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
