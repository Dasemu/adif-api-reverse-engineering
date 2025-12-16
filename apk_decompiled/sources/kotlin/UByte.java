package kotlin;

import com.google.firebase.messaging.Constants;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u000fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b4\u0010\u0012J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u0010\u000bJ\u0018\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b9\u0010\u0012J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b:\u0010\u001fJ\u0018\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u000fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bK\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bL\u0010\u0012J\u0018\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bQ\u0010\u0012J\u0018\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0013\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0013\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UByte;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes3.dex */
public final class UByte implements Comparable<UByte> {
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b4) {
        this.data = b4;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU */
    private static final byte m127and7apg3OU(byte b4, byte b5) {
        return m134constructorimpl((byte) (b4 & b5));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m128boximpl(byte b4) {
        return new UByte(b4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private int m129compareTo7apg3OU(byte b4) {
        return Intrinsics.compare(getData() & MAX_VALUE, b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m131compareToVKZWuLQ(byte b4, long j4) {
        return Long.compareUnsigned(ULong.m290constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m132compareToWZ4Q5Ns(byte b4, int i) {
        return Integer.compareUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m133compareToxj2QHRw(byte b4, short s4) {
        return Intrinsics.compare(b4 & MAX_VALUE, s4 & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static byte m134constructorimpl(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ */
    private static final byte m135decw2LRezQ(byte b4) {
        return m134constructorimpl((byte) (b4 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m136div7apg3OU(byte b4, byte b5) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m137divVKZWuLQ(byte b4, long j4) {
        return Long.divideUnsigned(ULong.m290constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m138divWZ4Q5Ns(byte b4, int i) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m139divxj2QHRw(byte b4, short s4) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(s4 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl */
    public static boolean m140equalsimpl(byte b4, Object obj) {
        return (obj instanceof UByte) && b4 == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m141equalsimpl0(byte b4, byte b5) {
        return b4 == b5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m142floorDiv7apg3OU(byte b4, byte b5) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m143floorDivVKZWuLQ(byte b4, long j4) {
        return Long.divideUnsigned(ULong.m290constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m144floorDivWZ4Q5Ns(byte b4, int i) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m145floorDivxj2QHRw(byte b4, short s4) {
        return Integer.divideUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m146hashCodeimpl(byte b4) {
        return Byte.hashCode(b4);
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ */
    private static final byte m147incw2LRezQ(byte b4) {
        return m134constructorimpl((byte) (b4 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ */
    private static final byte m148invw2LRezQ(byte b4) {
        return m134constructorimpl((byte) (~b4));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m149minus7apg3OU(byte b4, byte b5) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b4 & MAX_VALUE) - UInt.m211constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m150minusVKZWuLQ(byte b4, long j4) {
        return ULong.m290constructorimpl(ULong.m290constructorimpl(b4 & 255) - j4);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m151minusWZ4Q5Ns(byte b4, int i) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b4 & MAX_VALUE) - i);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m152minusxj2QHRw(byte b4, short s4) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b4 & MAX_VALUE) - UInt.m211constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m153mod7apg3OU(byte b4, byte b5) {
        return m134constructorimpl((byte) Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m154modVKZWuLQ(byte b4, long j4) {
        return Long.remainderUnsigned(ULong.m290constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m155modWZ4Q5Ns(byte b4, int i) {
        return Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m156modxj2QHRw(byte b4, short s4) {
        return UShort.m397constructorimpl((short) Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(s4 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU */
    private static final byte m157or7apg3OU(byte b4, byte b5) {
        return m134constructorimpl((byte) (b4 | b5));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m158plus7apg3OU(byte b4, byte b5) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b5 & MAX_VALUE) + UInt.m211constructorimpl(b4 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m159plusVKZWuLQ(byte b4, long j4) {
        return ULong.m290constructorimpl(ULong.m290constructorimpl(b4 & 255) + j4);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m160plusWZ4Q5Ns(byte b4, int i) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b4 & MAX_VALUE) + i);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m161plusxj2QHRw(byte b4, short s4) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(s4 & UShort.MAX_VALUE) + UInt.m211constructorimpl(b4 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU */
    private static final UIntRange m162rangeTo7apg3OU(byte b4, byte b5) {
        return new UIntRange(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU */
    private static final UIntRange m163rangeUntil7apg3OU(byte b4, byte b5) {
        return URangesKt.m1383untilJ1ME1BU(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m164rem7apg3OU(byte b4, byte b5) {
        return Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(b5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m165remVKZWuLQ(byte b4, long j4) {
        return Long.remainderUnsigned(ULong.m290constructorimpl(b4 & 255), j4);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final int m166remWZ4Q5Ns(byte b4, int i) {
        return Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m167remxj2QHRw(byte b4, short s4) {
        return Integer.remainderUnsigned(UInt.m211constructorimpl(b4 & MAX_VALUE), UInt.m211constructorimpl(s4 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m168times7apg3OU(byte b4, byte b5) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b5 & MAX_VALUE) * UInt.m211constructorimpl(b4 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m169timesVKZWuLQ(byte b4, long j4) {
        return ULong.m290constructorimpl(ULong.m290constructorimpl(b4 & 255) * j4);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m170timesWZ4Q5Ns(byte b4, int i) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(b4 & MAX_VALUE) * i);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m171timesxj2QHRw(byte b4, short s4) {
        return UInt.m211constructorimpl(UInt.m211constructorimpl(s4 & UShort.MAX_VALUE) * UInt.m211constructorimpl(b4 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m172toByteimpl(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m173toDoubleimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m174toFloatimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m175toIntimpl(byte b4) {
        return b4 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m176toLongimpl(byte b4) {
        return b4 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m177toShortimpl(byte b4) {
        return (short) (b4 & 255);
    }

    /* renamed from: toString-impl */
    public static String m178toStringimpl(byte b4) {
        return String.valueOf(b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m179toUBytew2LRezQ(byte b4) {
        return b4;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m180toUIntpVg5ArA(byte b4) {
        return UInt.m211constructorimpl(b4 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m181toULongsVKNKU(byte b4) {
        return ULong.m290constructorimpl(b4 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m182toUShortMh2AYeg(byte b4) {
        return UShort.m397constructorimpl((short) (b4 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU */
    private static final byte m183xor7apg3OU(byte b4, byte b5) {
        return m134constructorimpl((byte) (b4 ^ b5));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m140equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m146hashCodeimpl(this.data);
    }

    public String toString() {
        return m178toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static int m130compareTo7apg3OU(byte b4, byte b5) {
        return Intrinsics.compare(b4 & MAX_VALUE, b5 & MAX_VALUE);
    }
}
