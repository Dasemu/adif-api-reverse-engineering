package kotlin;

import com.google.firebase.messaging.Constants;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes3.dex */
public final class ULong implements Comparable<ULong> {
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j4) {
        this.data = j4;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ */
    private static final long m283andVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 & j5);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m284boximpl(long j4) {
        return new ULong(j4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m285compareTo7apg3OU(long j4, byte b4) {
        return Long.compareUnsigned(j4, m290constructorimpl(b4 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private int m286compareToVKZWuLQ(long j4) {
        return UnsignedKt.ulongCompare(getData(), j4);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m288compareToWZ4Q5Ns(long j4, int i) {
        return Long.compareUnsigned(j4, m290constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m289compareToxj2QHRw(long j4, short s4) {
        return Long.compareUnsigned(j4, m290constructorimpl(s4 & 65535));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static long m290constructorimpl(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU */
    private static final long m291decsVKNKU(long j4) {
        return m290constructorimpl(j4 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final long m292div7apg3OU(long j4, byte b4) {
        return Long.divideUnsigned(j4, m290constructorimpl(b4 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m293divVKZWuLQ(long j4, long j5) {
        return UnsignedKt.m469ulongDivideeb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final long m294divWZ4Q5Ns(long j4, int i) {
        return Long.divideUnsigned(j4, m290constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final long m295divxj2QHRw(long j4, short s4) {
        return Long.divideUnsigned(j4, m290constructorimpl(s4 & 65535));
    }

    /* renamed from: equals-impl */
    public static boolean m296equalsimpl(long j4, Object obj) {
        return (obj instanceof ULong) && j4 == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m297equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final long m298floorDiv7apg3OU(long j4, byte b4) {
        return Long.divideUnsigned(j4, m290constructorimpl(b4 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m299floorDivVKZWuLQ(long j4, long j5) {
        return Long.divideUnsigned(j4, j5);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final long m300floorDivWZ4Q5Ns(long j4, int i) {
        return Long.divideUnsigned(j4, m290constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final long m301floorDivxj2QHRw(long j4, short s4) {
        return Long.divideUnsigned(j4, m290constructorimpl(s4 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m302hashCodeimpl(long j4) {
        return Long.hashCode(j4);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU */
    private static final long m303incsVKNKU(long j4) {
        return m290constructorimpl(j4 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU */
    private static final long m304invsVKNKU(long j4) {
        return m290constructorimpl(~j4);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final long m305minus7apg3OU(long j4, byte b4) {
        return m290constructorimpl(j4 - m290constructorimpl(b4 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m306minusVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 - j5);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final long m307minusWZ4Q5Ns(long j4, int i) {
        return m290constructorimpl(j4 - m290constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final long m308minusxj2QHRw(long j4, short s4) {
        return m290constructorimpl(j4 - m290constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m309mod7apg3OU(long j4, byte b4) {
        return UByte.m134constructorimpl((byte) Long.remainderUnsigned(j4, m290constructorimpl(b4 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m310modVKZWuLQ(long j4, long j5) {
        return Long.remainderUnsigned(j4, j5);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m311modWZ4Q5Ns(long j4, int i) {
        return UInt.m211constructorimpl((int) Long.remainderUnsigned(j4, m290constructorimpl(i & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m312modxj2QHRw(long j4, short s4) {
        return UShort.m397constructorimpl((short) Long.remainderUnsigned(j4, m290constructorimpl(s4 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ */
    private static final long m313orVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 | j5);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final long m314plus7apg3OU(long j4, byte b4) {
        return m290constructorimpl(m290constructorimpl(b4 & 255) + j4);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m315plusVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 + j5);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final long m316plusWZ4Q5Ns(long j4, int i) {
        return m290constructorimpl(m290constructorimpl(i & 4294967295L) + j4);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final long m317plusxj2QHRw(long j4, short s4) {
        return m290constructorimpl(m290constructorimpl(s4 & 65535) + j4);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m318rangeToVKZWuLQ(long j4, long j5) {
        return new ULongRange(j4, j5, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ */
    private static final ULongRange m319rangeUntilVKZWuLQ(long j4, long j5) {
        return URangesKt.m1385untileb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final long m320rem7apg3OU(long j4, byte b4) {
        return Long.remainderUnsigned(j4, m290constructorimpl(b4 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m321remVKZWuLQ(long j4, long j5) {
        return UnsignedKt.m470ulongRemaindereb3DHEI(j4, j5);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final long m322remWZ4Q5Ns(long j4, int i) {
        return Long.remainderUnsigned(j4, m290constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final long m323remxj2QHRw(long j4, short s4) {
        return Long.remainderUnsigned(j4, m290constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU */
    private static final long m324shlsVKNKU(long j4, int i) {
        return m290constructorimpl(j4 << i);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU */
    private static final long m325shrsVKNKU(long j4, int i) {
        return m290constructorimpl(j4 >>> i);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final long m326times7apg3OU(long j4, byte b4) {
        return m290constructorimpl(m290constructorimpl(b4 & 255) * j4);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m327timesVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 * j5);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final long m328timesWZ4Q5Ns(long j4, int i) {
        return m290constructorimpl(m290constructorimpl(i & 4294967295L) * j4);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final long m329timesxj2QHRw(long j4, short s4) {
        return m290constructorimpl(m290constructorimpl(s4 & 65535) * j4);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m330toByteimpl(long j4) {
        return (byte) j4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m331toDoubleimpl(long j4) {
        return UnsignedKt.ulongToDouble(j4);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m332toFloatimpl(long j4) {
        return (float) UnsignedKt.ulongToDouble(j4);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m333toIntimpl(long j4) {
        return (int) j4;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m334toLongimpl(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m335toShortimpl(long j4) {
        return (short) j4;
    }

    /* renamed from: toString-impl */
    public static String m336toStringimpl(long j4) {
        return UnsignedKt.ulongToString(j4);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m337toUBytew2LRezQ(long j4) {
        return UByte.m134constructorimpl((byte) j4);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m338toUIntpVg5ArA(long j4) {
        return UInt.m211constructorimpl((int) j4);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m339toULongsVKNKU(long j4) {
        return j4;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m340toUShortMh2AYeg(long j4) {
        return UShort.m397constructorimpl((short) j4);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ */
    private static final long m341xorVKZWuLQ(long j4, long j5) {
        return m290constructorimpl(j4 ^ j5);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object obj) {
        return m296equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m302hashCodeimpl(this.data);
    }

    public String toString() {
        return m336toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static int m287compareToVKZWuLQ(long j4, long j5) {
        return UnsignedKt.ulongCompare(j4, j5);
    }
}
