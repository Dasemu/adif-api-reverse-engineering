package kotlin.text;

import C.w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.HexFormat;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a@\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u001a,\u0010\u0016\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u001a,\u0010\u001b\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u001c\u0010!\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002\u001a\u0014\u0010\"\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0002\u001a*\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a0\u0010+\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\tH\u0003\u001a*\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020-2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u001c\u0010/\u001a\u00020\u0003*\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u00100\u001a\u00020\tH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", FirebaseAnalytics.Param.INDEX, "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
/* loaded from: classes3.dex */
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            iArr[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr[LOWER_CASE_HEX_DIGITS.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        while (i < UPPER_CASE_HEX_DIGITS.length()) {
            iArr[UPPER_CASE_HEX_DIGITS.charAt(i)] = i7;
            i++;
            i7++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr;
    }

    private static final long charsPerSet(long j4, int i, int i4) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j5 = i;
        return ((j5 - 1) * i4) + (j4 * j5);
    }

    private static final int checkContainsAt(String str, String str2, int i, int i4, String str3) {
        String str4;
        String str5;
        int i5;
        int length = str2.length() + i;
        if (length <= i4) {
            str4 = str;
            str5 = str2;
            i5 = i;
            if (StringsKt__StringsJVMKt.regionMatches(str4, i5, str5, 0, str2.length(), true)) {
                return length;
            }
        } else {
            str4 = str;
            str5 = str2;
            i5 = i;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str5);
        sb.append("\" at index ");
        sb.append(i5);
        sb.append(", but was ");
        int coerceAtMost = RangesKt.coerceAtMost(length, i4);
        Intrinsics.checkNotNull(str4, "null cannot be cast to non-null type java.lang.String");
        String substring = str4.substring(i5, coerceAtMost);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    private static final void checkHexLength(String str, int i, int i4, int i5, boolean z3) {
        int i6 = i4 - i;
        if (z3) {
            if (i6 == i5) {
                return;
            }
        } else if (i6 <= i5) {
            return;
        }
        String str2 = z3 ? "exactly" : "at most";
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i5 + " hexadecimal digits at index " + i + ", but was " + substring + " of length " + i6);
    }

    private static final int checkNewLineAt(String str, int i, int i4) {
        if (str.charAt(i) == '\r') {
            int i5 = i + 1;
            return (i5 >= i4 || str.charAt(i5) != '\n') ? i5 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        StringBuilder t2 = w.t(i, "Expected a new line at index ", ", but was ");
        t2.append(str.charAt(i));
        throw new NumberFormatException(t2.toString());
    }

    private static final int decimalFromHexDigitAt(String str, int i) {
        int i4;
        char charAt = str.charAt(i);
        if (charAt <= 127 && (i4 = HEX_DIGITS_TO_DECIMAL[charAt]) >= 0) {
            return i4;
        }
        StringBuilder t2 = w.t(i, "Expected a hexadecimal digit at index ", ", but was ");
        t2.append(str.charAt(i));
        throw new NumberFormatException(t2.toString());
    }

    public static final int formattedStringLength(int i, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean intRangeContains;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = i - 1;
        int i11 = i10 / i4;
        int i12 = (i4 - 1) / i5;
        int i13 = i % i4;
        if (i13 != 0) {
            i4 = i13;
        }
        int i14 = (i12 * i11) + ((i4 - 1) / i5);
        long j4 = ((i8 + 2 + i9) * i) + (((i10 - i11) - i14) * i7) + (i14 * i6) + i11;
        intRangeContains = RangesKt___RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), j4);
        if (intRangeContains) {
            return (int) j4;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m336toStringimpl(ULong.m290constructorimpl(j4))));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long hexToLongImpl(String str, int i, int i4, HexFormat hexFormat, int i5) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i4, str.length());
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        if (suffix.length() + prefix.length() < i4 - i) {
            int checkContainsAt = checkContainsAt(str, prefix, i, i4, "prefix");
            int length = i4 - suffix.length();
            checkContainsAt(str, suffix, length, i4, DynamicLink.Builder.KEY_SUFFIX);
            checkHexLength(str, checkContainsAt, length, i5, false);
            long j4 = 0;
            while (checkContainsAt < length) {
                j4 = (j4 << 4) | decimalFromHexDigitAt(str, checkContainsAt);
                checkContainsAt++;
            }
            return j4;
        }
        StringBuilder sb = new StringBuilder("Expected a hexadecimal number with prefix \"");
        sb.append(prefix);
        sb.append("\" and suffix \"");
        sb.append(suffix);
        sb.append("\", but was ");
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    public static /* synthetic */ long hexToLongImpl$default(String str, int i, int i4, HexFormat hexFormat, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = str.length();
        }
        return hexToLongImpl(str, i, i4, hexFormat, i5);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    public static final int parsedByteArrayMaxSize(int i, int i4, int i5, int i6, int i7, int i8, int i9) {
        long charsPerSet;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j4 = i8 + 2 + i9;
        long charsPerSet2 = charsPerSet(j4, i5, i7);
        if (i4 <= i5) {
            charsPerSet = charsPerSet(j4, i4, i7);
        } else {
            charsPerSet = charsPerSet(charsPerSet2, i4 / i5, i6);
            int i10 = i4 % i5;
            if (i10 != 0) {
                charsPerSet = charsPerSet + i6 + charsPerSet(j4, i10, i7);
            }
        }
        long j5 = i;
        long wholeElementsPerSet = wholeElementsPerSet(j5, charsPerSet, 1);
        long j6 = j5 - ((charsPerSet + 1) * wholeElementsPerSet);
        long wholeElementsPerSet2 = wholeElementsPerSet(j6, charsPerSet2, i6);
        long j7 = j6 - ((charsPerSet2 + i6) * wholeElementsPerSet2);
        long wholeElementsPerSet3 = wholeElementsPerSet(j7, j4, i7);
        return (int) ((wholeElementsPerSet2 * i5) + (wholeElementsPerSet * i4) + wholeElementsPerSet3 + (j7 - ((j4 + ((long) i7)) * wholeElementsPerSet3) > 0 ? 1 : 0));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringImpl(long j4, HexFormat hexFormat, int i) {
        if ((i & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        String prefix = hexFormat.getNumber().getPrefix();
        String suffix = hexFormat.getNumber().getSuffix();
        int length = suffix.length() + prefix.length() + (i >> 2);
        boolean removeLeadingZeros = hexFormat.getNumber().getRemoveLeadingZeros();
        StringBuilder sb = new StringBuilder(length);
        sb.append(prefix);
        while (i > 0) {
            i -= 4;
            int i4 = (int) ((j4 >> i) & 15);
            removeLeadingZeros = removeLeadingZeros && i4 == 0 && i > 0;
            if (!removeLeadingZeros) {
                sb.append(str.charAt(i4));
            }
        }
        sb.append(suffix);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final long wholeElementsPerSet(long j4, long j5, int i) {
        if (j4 <= 0 || j5 <= 0) {
            return 0L;
        }
        long j6 = i;
        return (j4 + j6) / (j5 + j6);
    }

    @ExperimentalStdlibApi
    private static final byte hexToByte(String str, int i, int i4, HexFormat hexFormat) {
        return (byte) hexToLongImpl(str, i, i4, hexFormat, 2);
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i, i4, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArray(String str, int i, int i4, HexFormat hexFormat) {
        int i5 = i;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i5, i4, str.length());
        int i6 = 0;
        if (i5 == i4) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        String bytePrefix = bytes.getBytePrefix();
        String byteSuffix = bytes.getByteSuffix();
        String byteSeparator = bytes.getByteSeparator();
        String groupSeparator = bytes.getGroupSeparator();
        int parsedByteArrayMaxSize = parsedByteArrayMaxSize(i4 - i5, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[parsedByteArrayMaxSize];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i5 < i4) {
            if (i8 == bytesPerLine) {
                i5 = checkNewLineAt(str, i5, i4);
                i8 = i6;
                i9 = i8;
            } else if (i9 == bytesPerGroup) {
                i5 = checkContainsAt(str, groupSeparator, i5, i4, "group separator");
                i9 = i6;
            } else if (i9 != 0) {
                i5 = checkContainsAt(str, byteSeparator, i5, i4, "byte separator");
            }
            i8++;
            i9++;
            int checkContainsAt = checkContainsAt(str, bytePrefix, i5, i4, "byte prefix");
            checkHexLength(str, checkContainsAt, RangesKt.coerceAtMost(checkContainsAt + 2, i4), 2, true);
            bArr[i7] = (byte) ((decimalFromHexDigitAt(str, checkContainsAt) << 4) | decimalFromHexDigitAt(str, checkContainsAt + 1));
            i5 = checkContainsAt(str, byteSuffix, checkContainsAt + 2, i4, "byte suffix");
            groupSeparator = groupSeparator;
            i7++;
            i6 = 0;
        }
        if (i7 == parsedByteArrayMaxSize) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i, i4, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final int hexToInt(String str, int i, int i4, HexFormat hexFormat) {
        return (int) hexToLongImpl(str, i, i4, hexFormat, 8);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i, i4, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long hexToLong(String str, int i, int i4, HexFormat hexFormat) {
        return hexToLongImpl(str, i, i4, hexFormat, 16);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i, i4, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final short hexToShort(String str, int i, int i4, HexFormat hexFormat) {
        return (short) hexToLongImpl(str, i, i4, hexFormat, 4);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i, i4, hexFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.ExperimentalStdlibApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toHexString(byte[] r16, int r17, int r18, kotlin.text.HexFormat r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "format"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.INSTANCE
            int r5 = r0.length
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r4.getUpperCase()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.HexFormat$BytesHexFormat r4 = r4.getBytes()
            int r6 = r4.getBytesPerLine()
            int r7 = r4.getBytesPerGroup()
            java.lang.String r12 = r4.getBytePrefix()
            java.lang.String r13 = r4.getByteSuffix()
            java.lang.String r14 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r14.length()
            int r10 = r12.length()
            int r11 = r13.length()
            int r5 = formattedStringLength(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            r10 = 0
            r11 = 0
        L61:
            if (r1 >= r2) goto L9b
            r15 = r0[r1]
            r9 = r15 & 255(0xff, float:3.57E-43)
            if (r10 != r6) goto L71
            r10 = 10
            r8.append(r10)
            r10 = 0
        L6f:
            r11 = 0
            goto L77
        L71:
            if (r11 != r7) goto L77
            r8.append(r4)
            goto L6f
        L77:
            if (r11 == 0) goto L7c
            r8.append(r14)
        L7c:
            r8.append(r12)
            int r9 = r9 >> 4
            char r9 = r3.charAt(r9)
            r8.append(r9)
            r9 = r15 & 15
            char r9 = r3.charAt(r9)
            r8.append(r9)
            r8.append(r13)
            int r11 = r11 + 1
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L61
        L9b:
            int r0 = r8.length()
            if (r5 != r0) goto Lab
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        Lab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.toHexString(byte[], int, int, kotlin.text.HexFormat):java.lang.String");
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i4, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = bArr.length;
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i, i4, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte b4, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b4, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s4, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s4, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j4, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j4, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte b4, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(b4, format, 8);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(short s4, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(s4, format, 16);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(int i, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(i, format, 32);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(long j4, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl(j4, format, 64);
    }
}
