package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
public class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b4, byte b5) {
        int i = b4 / b5;
        return ((b4 ^ b5) >= 0 || b5 * i == b4) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b4, byte b5) {
        int i = b4 % b5;
        return (byte) (i + (b5 & (((i ^ b5) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b4, short s4) {
        int i = b4 / s4;
        return ((b4 ^ s4) >= 0 || s4 * i == b4) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b4, short s4) {
        int i = b4 % s4;
        return (short) (i + (s4 & (((i ^ s4) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b4, int i) {
        int i4 = b4 / i;
        return ((b4 ^ i) >= 0 || i * i4 == b4) ? i4 : i4 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b4, int i) {
        int i4 = b4 % i;
        return i4 + (i & (((i4 ^ i) & ((-i4) | i4)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b4, long j4) {
        long j5 = b4;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b4, long j4) {
        long j5 = b4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, byte b4) {
        int i = s4 / b4;
        return ((s4 ^ b4) >= 0 || b4 * i == s4) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s4, byte b4) {
        int i = s4 % b4;
        return (byte) (i + (b4 & (((i ^ b4) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, short s5) {
        int i = s4 / s5;
        return ((s4 ^ s5) >= 0 || s5 * i == s4) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s4, short s5) {
        int i = s4 % s5;
        return (short) (i + (s5 & (((i ^ s5) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, int i) {
        int i4 = s4 / i;
        return ((s4 ^ i) >= 0 || i * i4 == s4) ? i4 : i4 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s4, int i) {
        int i4 = s4 % i;
        return i4 + (i & (((i4 ^ i) & ((-i4) | i4)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s4, long j4) {
        long j5 = s4;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s4, long j4) {
        long j5 = s4 % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i, byte b4) {
        int i4 = i / b4;
        return ((i ^ b4) >= 0 || b4 * i4 == i) ? i4 : i4 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i, byte b4) {
        int i4 = i % b4;
        return (byte) (i4 + (b4 & (((i4 ^ b4) & ((-i4) | i4)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i, short s4) {
        int i4 = i / s4;
        return ((i ^ s4) >= 0 || s4 * i4 == i) ? i4 : i4 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i, short s4) {
        int i4 = i % s4;
        return (short) (i4 + (s4 & (((i4 ^ s4) & ((-i4) | i4)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i, int i4) {
        int i5 = i / i4;
        return ((i ^ i4) >= 0 || i4 * i5 == i) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i, int i4) {
        int i5 = i % i4;
        return i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i, long j4) {
        long j5 = i;
        long j6 = j5 / j4;
        return ((j5 ^ j4) >= 0 || j4 * j6 == j5) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i, long j4) {
        long j5 = i % j4;
        return j5 + (j4 & (((j5 ^ j4) & ((-j5) | j5)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j4, byte b4) {
        long j5 = b4;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j4, byte b4) {
        long j5 = j4 % b4;
        return (byte) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j4, short s4) {
        long j5 = s4;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j4, short s4) {
        long j5 = j4 % s4;
        return (short) (j5 + (r0 & (((j5 ^ r0) & ((-j5) | j5)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j4, int i) {
        long j5 = i;
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j4, int i) {
        long j5 = i;
        long j6 = j4 % j5;
        return (int) (j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j4, long j5) {
        long j6 = j4 / j5;
        return ((j4 ^ j5) >= 0 || j5 * j6 == j4) ? j6 : j6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f2, float f4) {
        float f5 = f2 % f4;
        return (f5 == BitmapDescriptorFactory.HUE_RED || Math.signum(f5) == Math.signum(f4)) ? f5 : f5 + f4;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f2, double d4) {
        double d5 = f2 % d4;
        return (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.signum(d5) == Math.signum(d4)) ? d5 : d5 + d4;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d4, float f2) {
        double d5 = f2;
        double d6 = d4 % d5;
        return (d6 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.signum(d6) == Math.signum(d5)) ? d6 : d6 + d5;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d4, double d5) {
        double d6 = d4 % d5;
        return (d6 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.signum(d6) == Math.signum(d5)) ? d6 : d6 + d5;
    }
}
