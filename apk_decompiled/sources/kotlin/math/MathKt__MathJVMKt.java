package kotlin.math;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0007\u001a\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007\u001a\u0011\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u0010:\u001a\u00020\u0001*\u00020\u00012\u0006\u0010;\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0006*\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0087\b\u001a\r\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010<\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0087\b\u001a\r\u0010?\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010?\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010A\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006D"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "cbrt", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes3.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d4, double d5) {
        return Math.IEEEremainder(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d4) {
        return Math.abs(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d4) {
        return Math.acos(d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d4) {
        if (d4 < 1.0d) {
            return Double.NaN;
        }
        if (d4 > Constants.upper_taylor_2_bound) {
            return Math.log(d4) + Constants.LN2;
        }
        double d5 = 1;
        double d6 = d4 - d5;
        if (d6 >= Constants.taylor_n_bound) {
            return Math.log(Math.sqrt((d4 * d4) - d5) + d4);
        }
        double sqrt = Math.sqrt(d6);
        if (sqrt >= Constants.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d4) {
        return Math.asin(d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d4) {
        double d5 = Constants.taylor_n_bound;
        if (d4 < d5) {
            if (d4 <= (-d5)) {
                return -asinh(-d4);
            }
            return Math.abs(d4) >= Constants.taylor_2_bound ? d4 - (((d4 * d4) * d4) / 6) : d4;
        }
        if (d4 <= Constants.upper_taylor_n_bound) {
            return Math.log(Math.sqrt((d4 * d4) + 1) + d4);
        }
        if (d4 > Constants.upper_taylor_2_bound) {
            return Math.log(d4) + Constants.LN2;
        }
        double d6 = d4 * 2;
        return Math.log((1 / d6) + d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d4) {
        return Math.atan(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d4, double d5) {
        return Math.atan2(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d4) {
        if (Math.abs(d4) < Constants.taylor_n_bound) {
            return Math.abs(d4) > Constants.taylor_2_bound ? (((d4 * d4) * d4) / 3) + d4 : d4;
        }
        double d5 = 1;
        return Math.log((d5 + d4) / (d5 - d4)) / 2;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double cbrt(double d4) {
        return Math.cbrt(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d4) {
        return Math.ceil(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d4) {
        return Math.cos(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d4) {
        return Math.cosh(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d4) {
        return Math.exp(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d4) {
        return Math.expm1(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d4) {
        return Math.floor(d4);
    }

    private static final double getAbsoluteValue(double d4) {
        return Math.abs(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d4) {
    }

    public static int getSign(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d4) {
    }

    private static final double getUlp(double d4) {
        return Math.ulp(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d4) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d4, double d5) {
        return Math.hypot(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d4) {
        return Math.log(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d4) {
        return Math.log1p(d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d4, double d5) {
        if (d5 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d5 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d4) / Math.log(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d4) {
        return Math.log10(d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d4) {
        return Math.log(d4) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d4, double d5) {
        return Math.max(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d4, double d5) {
        return Math.min(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d4) {
        return Math.nextAfter(d4, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d4, double d5) {
        return Math.nextAfter(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d4) {
        return Math.nextUp(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d4, double d5) {
        return Math.pow(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d4) {
        return Math.rint(d4);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d4 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d4 < -2.147483648E9d ? IntCompanionObject.MIN_VALUE : (int) Math.round(d4);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d4) {
        return Math.signum(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d4) {
        return Math.sin(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d4) {
        return Math.sinh(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d4) {
        return Math.sqrt(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d4) {
        return Math.tan(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d4) {
        return Math.tanh(d4);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            return d4;
        }
        if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return Math.floor(d4);
        }
        return Math.ceil(d4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d4, double d5) {
        return Math.copySign(d4, d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f2, float f4) {
        return (float) Math.IEEEremainder(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f2) {
        return Math.abs(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f2) {
        return (float) Math.acos(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f2) {
        return (float) Math.asin(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f2) {
        return (float) Math.atan(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f2, float f4) {
        return (float) Math.atan2(f2, f4);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float cbrt(float f2) {
        return (float) Math.cbrt(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f2) {
        return (float) Math.ceil(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f2) {
        return (float) Math.cos(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f2) {
        return (float) Math.cosh(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f2) {
        return (float) Math.exp(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f2) {
        return (float) Math.expm1(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f2) {
        return (float) Math.floor(f2);
    }

    private static final float getAbsoluteValue(float f2) {
        return Math.abs(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f2) {
    }

    public static int getSign(long j4) {
        if (j4 < 0) {
            return -1;
        }
        return j4 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f2) {
    }

    private static final float getUlp(float f2) {
        return Math.ulp(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f2, float f4) {
        return (float) Math.hypot(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f2) {
        return (float) Math.log(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f2) {
        return (float) Math.log1p(f2);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f2, float f4) {
        if (f4 <= BitmapDescriptorFactory.HUE_RED || f4 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f2) / Math.log(f4));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f2) {
        return (float) Math.log10(f2);
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f2) {
        return (float) (Math.log(f2) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f2, float f4) {
        return Math.max(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f2, float f4) {
        return Math.min(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f2) {
        return Math.nextAfter(f2, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f2, float f4) {
        return Math.nextAfter(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f2) {
        return Math.nextUp(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d4, int i) {
        return Math.pow(d4, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f2) {
        return (float) Math.rint(f2);
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f2) {
        return roundToLong(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f2) {
        return Math.signum(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f2) {
        return (float) Math.sin(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f2) {
        return (float) Math.sinh(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f2) {
        return (float) Math.sqrt(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f2) {
        return (float) Math.tan(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f2) {
        return (float) Math.tanh(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d4, int i) {
        return Math.copySign(d4, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i) {
        return Math.abs(i);
    }

    private static final int getAbsoluteValue(int i) {
        return Math.abs(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i) {
    }

    private static final double getSign(double d4) {
        return Math.signum(d4);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i, int i4) {
        return Math.max(i, i4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i, int i4) {
        return Math.min(i, i4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f2, float f4) {
        return (float) Math.pow(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f2, float f4) {
        return Math.copySign(f2, f4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j4) {
        return Math.abs(j4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f2) {
        return (float) atanh(f2);
    }

    private static final long getAbsoluteValue(long j4) {
        return Math.abs(j4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j4) {
    }

    private static final float getSign(float f2) {
        return Math.signum(f2);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j4) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f2, int i) {
        return (float) Math.pow(f2, i);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f2) {
        double ceil;
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            ceil = Math.floor(f2);
        } else {
            ceil = Math.ceil(f2);
        }
        return (float) ceil;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f2, int i) {
        return Math.copySign(f2, i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f2) {
        return (float) acosh(f2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f2) {
        return (float) asinh(f2);
    }
}
