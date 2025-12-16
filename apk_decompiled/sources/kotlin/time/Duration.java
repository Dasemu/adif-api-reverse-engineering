package kotlin.time;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;

@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes3.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m1455constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1512getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1514getDaysUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1518getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1520getHoursUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1524getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1526getMicrosecondsUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1530getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1532getMillisecondsUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1536getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1538getMinutesUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1542getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1544getNanosecondsUwyO8pc$annotations(double d4) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1548getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1550getSecondsUwyO8pc$annotations(double d4) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1554daysUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1556getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1557getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1558getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1560hoursUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1563microsecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1566millisecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1569minutesUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1572nanosecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1574parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException(w.o("Invalid duration string format: '", value, "'."), e4);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1575parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException(w.o("Invalid ISO duration string format: '", value, "'."), e4);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1576parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1453boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1577parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1453boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1579secondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1513getDaysUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1515getDaysUwyO8pc$annotations(int i) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1519getHoursUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1521getHoursUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1525getMicrosecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1527getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1531getMillisecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1533getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1537getMinutesUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1539getMinutesUwyO8pc$annotations(int i) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1543getNanosecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1545getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1549getSecondsUwyO8pc(long j4) {
            return DurationKt.toDuration(j4, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1551getSecondsUwyO8pc$annotations(int i) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1555daysUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1561hoursUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1564microsecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1567millisecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1570minutesUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1573nanosecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1580secondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1511getDaysUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1516getDaysUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1517getHoursUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1522getHoursUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1523getMicrosecondsUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1528getMicrosecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1529getMillisecondsUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1534getMillisecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1535getMinutesUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1540getMinutesUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1541getNanosecondsUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1546getNanosecondsUwyO8pc$annotations(long j4) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1547getSecondsUwyO8pc(double d4) {
            return DurationKt.toDuration(d4, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1552getSecondsUwyO8pc$annotations(long j4) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1553daysUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1559hoursUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1562microsecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1565millisecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1568minutesUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1571nanosecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1578secondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j4) {
        this.rawValue = j4;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1451addValuesMixedRangesUwyO8pc(long j4, long j5, long j6) {
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j6);
        long j7 = j5 + access$nanosToMillis;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(j7)) {
            return DurationKt.access$durationOfMillis(RangesKt.coerceIn(j7, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j7) + (j6 - DurationKt.access$millisToNanos(access$nanosToMillis)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1452appendFractionalimpl(long j4, StringBuilder sb, int i, int i4, int i5, String str, boolean z3) {
        String padStart;
        sb.append(i);
        if (i4 != 0) {
            sb.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i4), i5, '0');
            int i6 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i6 = length;
                        break;
                    } else if (i7 < 0) {
                        break;
                    } else {
                        length = i7;
                    }
                }
            }
            int i8 = i6 + 1;
            if (z3 || i8 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i6 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) padStart, 0, i8);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1453boximpl(long j4) {
        return new Duration(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1455constructorimpl(long j4) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1486isInNanosimpl(j4)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m1482getValueimpl(j4))) {
                    throw new AssertionError(w.q(new StringBuilder(), m1482getValueimpl(j4), " ns is out of nanoseconds range"));
                }
            } else {
                if (!new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m1482getValueimpl(j4))) {
                    throw new AssertionError(w.q(new StringBuilder(), m1482getValueimpl(j4), " ms is out of milliseconds range"));
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m1482getValueimpl(j4))) {
                    throw new AssertionError(w.q(new StringBuilder(), m1482getValueimpl(j4), " ms is denormalized"));
                }
            }
        }
        return j4;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1456divLRDsOJo(long j4, long j5) {
        Comparable maxOf;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(m1480getStorageUnitimpl(j4), m1480getStorageUnitimpl(j5));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m1498toDoubleimpl(j4, durationUnit) / m1498toDoubleimpl(j5, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1458divUwyO8pc(long j4, int i) {
        if (i == 0) {
            if (m1489isPositiveimpl(j4)) {
                return INFINITE;
            }
            if (m1488isNegativeimpl(j4)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1486isInNanosimpl(j4)) {
            return DurationKt.access$durationOfNanos(m1482getValueimpl(j4) / i);
        }
        if (m1487isInfiniteimpl(j4)) {
            return m1493timesUwyO8pc(j4, MathKt.getSign(i));
        }
        long j5 = i;
        long m1482getValueimpl = m1482getValueimpl(j4) / j5;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(m1482getValueimpl)) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m1482getValueimpl) + (DurationKt.access$millisToNanos(m1482getValueimpl(j4) - (m1482getValueimpl * j5)) / j5));
        }
        return DurationKt.access$durationOfMillis(m1482getValueimpl);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1459equalsimpl(long j4, Object obj) {
        return (obj instanceof Duration) && j4 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1460equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1461getAbsoluteValueUwyO8pc(long j4) {
        return m1488isNegativeimpl(j4) ? m1508unaryMinusUwyO8pc(j4) : j4;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1462getHoursComponentimpl(long j4) {
        if (m1487isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1471getInWholeHoursimpl(j4) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1470getInWholeDaysimpl(long j4) {
        return m1501toLongimpl(j4, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1471getInWholeHoursimpl(long j4) {
        return m1501toLongimpl(j4, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1472getInWholeMicrosecondsimpl(long j4) {
        return m1501toLongimpl(j4, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1473getInWholeMillisecondsimpl(long j4) {
        return (m1485isInMillisimpl(j4) && m1484isFiniteimpl(j4)) ? m1482getValueimpl(j4) : m1501toLongimpl(j4, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1474getInWholeMinutesimpl(long j4) {
        return m1501toLongimpl(j4, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1475getInWholeNanosecondsimpl(long j4) {
        long m1482getValueimpl = m1482getValueimpl(j4);
        if (m1486isInNanosimpl(j4)) {
            return m1482getValueimpl;
        }
        if (m1482getValueimpl > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (m1482getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.access$millisToNanos(m1482getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1476getInWholeSecondsimpl(long j4) {
        return m1501toLongimpl(j4, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1477getMinutesComponentimpl(long j4) {
        if (m1487isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1474getInWholeMinutesimpl(j4) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1478getNanosecondsComponentimpl(long j4) {
        if (m1487isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1485isInMillisimpl(j4) ? DurationKt.access$millisToNanos(m1482getValueimpl(j4) % 1000) : m1482getValueimpl(j4) % 1000000000);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1479getSecondsComponentimpl(long j4) {
        if (m1487isInfiniteimpl(j4)) {
            return 0;
        }
        return (int) (m1476getInWholeSecondsimpl(j4) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1480getStorageUnitimpl(long j4) {
        return m1486isInNanosimpl(j4) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1481getUnitDiscriminatorimpl(long j4) {
        return ((int) j4) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m1482getValueimpl(long j4) {
        return j4 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1483hashCodeimpl(long j4) {
        return Long.hashCode(j4);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1484isFiniteimpl(long j4) {
        return !m1487isInfiniteimpl(j4);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1485isInMillisimpl(long j4) {
        return (((int) j4) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1486isInNanosimpl(long j4) {
        return (((int) j4) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1487isInfiniteimpl(long j4) {
        return j4 == INFINITE || j4 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1488isNegativeimpl(long j4) {
        return j4 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1489isPositiveimpl(long j4) {
        return j4 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1490minusLRDsOJo(long j4, long j5) {
        return m1491plusLRDsOJo(j4, m1508unaryMinusUwyO8pc(j5));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1491plusLRDsOJo(long j4, long j5) {
        if (m1487isInfiniteimpl(j4)) {
            if (m1484isFiniteimpl(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1487isInfiniteimpl(j5)) {
            return j5;
        }
        if ((((int) j4) & 1) != (((int) j5) & 1)) {
            return m1485isInMillisimpl(j4) ? m1451addValuesMixedRangesUwyO8pc(j4, m1482getValueimpl(j4), m1482getValueimpl(j5)) : m1451addValuesMixedRangesUwyO8pc(j4, m1482getValueimpl(j5), m1482getValueimpl(j4));
        }
        long m1482getValueimpl = m1482getValueimpl(j4) + m1482getValueimpl(j5);
        return m1486isInNanosimpl(j4) ? DurationKt.access$durationOfNanosNormalized(m1482getValueimpl) : DurationKt.access$durationOfMillisNormalized(m1482getValueimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1493timesUwyO8pc(long j4, int i) {
        long coerceIn;
        long coerceIn2;
        if (m1487isInfiniteimpl(j4)) {
            if (i != 0) {
                return i > 0 ? j4 : m1508unaryMinusUwyO8pc(j4);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long m1482getValueimpl = m1482getValueimpl(j4);
        long j5 = i;
        long j6 = m1482getValueimpl * j5;
        if (!m1486isInNanosimpl(j4)) {
            if (j6 / j5 != m1482getValueimpl) {
                return MathKt.getSign(i) * MathKt.getSign(m1482getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
            }
            coerceIn = RangesKt___RangesKt.coerceIn(j6, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
            return DurationKt.access$durationOfMillis(coerceIn);
        }
        if (new LongRange(-2147483647L, 2147483647L).contains(m1482getValueimpl)) {
            return DurationKt.access$durationOfNanos(j6);
        }
        if (j6 / j5 == m1482getValueimpl) {
            return DurationKt.access$durationOfNanosNormalized(j6);
        }
        long access$nanosToMillis = DurationKt.access$nanosToMillis(m1482getValueimpl);
        long j7 = access$nanosToMillis * j5;
        long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m1482getValueimpl - DurationKt.access$millisToNanos(access$nanosToMillis)) * j5) + j7;
        if (j7 / j5 != access$nanosToMillis || (access$nanosToMillis2 ^ j7) < 0) {
            return MathKt.getSign(i) * MathKt.getSign(m1482getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        coerceIn2 = RangesKt___RangesKt.coerceIn(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
        return DurationKt.access$durationOfMillis(coerceIn2);
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1497toComponentsimpl(long j4, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1470getInWholeDaysimpl(j4)), Integer.valueOf(m1462getHoursComponentimpl(j4)), Integer.valueOf(m1477getMinutesComponentimpl(j4)), Integer.valueOf(m1479getSecondsComponentimpl(j4)), Integer.valueOf(m1478getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1498toDoubleimpl(long j4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j4 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1482getValueimpl(j4), m1480getStorageUnitimpl(j4), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1499toIntimpl(long j4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1501toLongimpl(j4, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1500toIsoStringimpl(long j4) {
        StringBuilder sb = new StringBuilder();
        if (m1488isNegativeimpl(j4)) {
            sb.append('-');
        }
        sb.append("PT");
        long m1461getAbsoluteValueUwyO8pc = m1461getAbsoluteValueUwyO8pc(j4);
        long m1471getInWholeHoursimpl = m1471getInWholeHoursimpl(m1461getAbsoluteValueUwyO8pc);
        int m1477getMinutesComponentimpl = m1477getMinutesComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int m1479getSecondsComponentimpl = m1479getSecondsComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int m1478getNanosecondsComponentimpl = m1478getNanosecondsComponentimpl(m1461getAbsoluteValueUwyO8pc);
        long j5 = m1487isInfiniteimpl(j4) ? 9999999999999L : m1471getInWholeHoursimpl;
        boolean z3 = false;
        boolean z4 = j5 != 0;
        boolean z5 = (m1479getSecondsComponentimpl == 0 && m1478getNanosecondsComponentimpl == 0) ? false : true;
        if (m1477getMinutesComponentimpl != 0 || (z5 && z4)) {
            z3 = true;
        }
        if (z4) {
            sb.append(j5);
            sb.append('H');
        }
        if (z3) {
            sb.append(m1477getMinutesComponentimpl);
            sb.append('M');
        }
        if (z5 || (!z4 && !z3)) {
            m1452appendFractionalimpl(j4, sb, m1479getSecondsComponentimpl, m1478getNanosecondsComponentimpl, 9, "S", true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1501toLongimpl(long j4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 == INFINITE) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j4 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1482getValueimpl(j4), m1480getStorageUnitimpl(j4), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1504toStringimpl(long j4) {
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == INFINITE) {
            return "Infinity";
        }
        if (j4 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1488isNegativeimpl = m1488isNegativeimpl(j4);
        StringBuilder sb = new StringBuilder();
        if (m1488isNegativeimpl) {
            sb.append('-');
        }
        long m1461getAbsoluteValueUwyO8pc = m1461getAbsoluteValueUwyO8pc(j4);
        long m1470getInWholeDaysimpl = m1470getInWholeDaysimpl(m1461getAbsoluteValueUwyO8pc);
        int m1462getHoursComponentimpl = m1462getHoursComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int m1477getMinutesComponentimpl = m1477getMinutesComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int m1479getSecondsComponentimpl = m1479getSecondsComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int m1478getNanosecondsComponentimpl = m1478getNanosecondsComponentimpl(m1461getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z3 = m1470getInWholeDaysimpl != 0;
        boolean z4 = m1462getHoursComponentimpl != 0;
        boolean z5 = m1477getMinutesComponentimpl != 0;
        boolean z6 = (m1479getSecondsComponentimpl == 0 && m1478getNanosecondsComponentimpl == 0) ? false : true;
        if (z3) {
            sb.append(m1470getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m1462getHoursComponentimpl);
            sb.append('h');
            i = i4;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m1477getMinutesComponentimpl);
            sb.append('m');
            i = i5;
        }
        if (z6) {
            int i6 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m1479getSecondsComponentimpl != 0 || z3 || z4 || z5) {
                m1452appendFractionalimpl(j4, sb, m1479getSecondsComponentimpl, m1478getNanosecondsComponentimpl, 9, "s", false);
            } else if (m1478getNanosecondsComponentimpl >= 1000000) {
                m1452appendFractionalimpl(j4, sb, m1478getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m1478getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m1478getNanosecondsComponentimpl >= 1000) {
                m1452appendFractionalimpl(j4, sb, m1478getNanosecondsComponentimpl / 1000, m1478getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m1478getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i6;
        }
        if (m1488isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1506toStringimpl$default(long j4, DurationUnit durationUnit, int i, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        return m1505toStringimpl(j4, durationUnit, i);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1507truncateToUwyO8pc$kotlin_stdlib(long j4, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m1480getStorageUnitimpl = m1480getStorageUnitimpl(j4);
        if (unit.compareTo(m1480getStorageUnitimpl) <= 0 || m1487isInfiniteimpl(j4)) {
            return j4;
        }
        return DurationKt.toDuration(m1482getValueimpl(j4) - (m1482getValueimpl(j4) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, m1480getStorageUnitimpl)), m1480getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1508unaryMinusUwyO8pc(long j4) {
        return DurationKt.access$durationOf(-m1482getValueimpl(j4), ((int) j4) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1509compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1509compareToLRDsOJo(long j4) {
        return m1454compareToLRDsOJo(this.rawValue, j4);
    }

    public boolean equals(Object obj) {
        return m1459equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1483hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1504toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1454compareToLRDsOJo(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return Intrinsics.compare(j4, j5);
        }
        int i = (((int) j4) & 1) - (((int) j5) & 1);
        return m1488isNegativeimpl(j4) ? -i : i;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1496toComponentsimpl(long j4, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1471getInWholeHoursimpl(j4)), Integer.valueOf(m1477getMinutesComponentimpl(j4)), Integer.valueOf(m1479getSecondsComponentimpl(j4)), Integer.valueOf(m1478getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1495toComponentsimpl(long j4, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1474getInWholeMinutesimpl(j4)), Integer.valueOf(m1479getSecondsComponentimpl(j4)), Integer.valueOf(m1478getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1494toComponentsimpl(long j4, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1476getInWholeSecondsimpl(j4)), Integer.valueOf(m1478getNanosecondsComponentimpl(j4)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1457divUwyO8pc(long j4, double d4) {
        int roundToInt = MathKt.roundToInt(d4);
        if (roundToInt == d4 && roundToInt != 0) {
            return m1458divUwyO8pc(j4, roundToInt);
        }
        DurationUnit m1480getStorageUnitimpl = m1480getStorageUnitimpl(j4);
        return DurationKt.toDuration(m1498toDoubleimpl(j4, m1480getStorageUnitimpl) / d4, m1480getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1492timesUwyO8pc(long j4, double d4) {
        int roundToInt = MathKt.roundToInt(d4);
        if (roundToInt == d4) {
            return m1493timesUwyO8pc(j4, roundToInt);
        }
        DurationUnit m1480getStorageUnitimpl = m1480getStorageUnitimpl(j4);
        return DurationKt.toDuration(m1498toDoubleimpl(j4, m1480getStorageUnitimpl) * d4, m1480getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m1505toStringimpl(long j4, DurationUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i >= 0) {
            double m1498toDoubleimpl = m1498toDoubleimpl(j4, unit);
            if (Double.isInfinite(m1498toDoubleimpl)) {
                return String.valueOf(m1498toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m1498toDoubleimpl, RangesKt.coerceAtMost(i, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(a.l(i, "decimals must be not negative, but was ").toString());
    }
}
