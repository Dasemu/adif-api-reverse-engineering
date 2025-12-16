package kotlin.io.encoding;

import C.w;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", FirebaseAnalytics.Param.DESTINATION, "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Base64 {
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;

    /* renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};
    private static final Base64 UrlSafe = new Base64(true, false);
    private static final Base64 Mime = new Base64(false, true);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Base64 getMime() {
            return Base64.Mime;
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Companion() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.Companion.<init>():void");
        }
    }

    public /* synthetic */ Base64(boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z4);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException(w.k("destination offset: ", destinationOffset, destinationSize, ", destination size: "));
        }
        int i = destinationOffset + capacityNeeded;
        if (i < 0 || i > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = bArr.length;
        }
        return base64.decode(bArr, i, i4);
    }

    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i;
        int i4;
        int[] access$getBase64UrlDecodeMap$p = this.isUrlSafe ? Base64Kt.access$getBase64UrlDecodeMap$p() : Base64Kt.access$getBase64DecodeMap$p();
        int i5 = -8;
        int i6 = destinationOffset;
        int i7 = -8;
        int i8 = 0;
        int i9 = startIndex;
        while (true) {
            if (i9 >= endIndex) {
                i = 8;
                break;
            }
            if (i7 != i5 || i9 + 3 >= endIndex) {
                i = 8;
                i4 = 1;
            } else {
                i = 8;
                int i10 = i9 + 4;
                i4 = 1;
                int i11 = (access$getBase64UrlDecodeMap$p[source[i9] & UByte.MAX_VALUE] << 18) | (access$getBase64UrlDecodeMap$p[source[i9 + 1] & UByte.MAX_VALUE] << 12) | (access$getBase64UrlDecodeMap$p[source[i9 + 2] & UByte.MAX_VALUE] << 6) | access$getBase64UrlDecodeMap$p[source[i9 + 3] & UByte.MAX_VALUE];
                if (i11 >= 0) {
                    destination[i6] = (byte) (i11 >> 16);
                    int i12 = i6 + 2;
                    destination[i6 + 1] = (byte) (i11 >> 8);
                    i6 += 3;
                    destination[i12] = (byte) i11;
                    i9 = i10;
                    i5 = -8;
                }
            }
            int i13 = source[i9] & UByte.MAX_VALUE;
            int i14 = access$getBase64UrlDecodeMap$p[i13];
            if (i14 >= 0) {
                i9++;
                i8 = (i8 << 6) | i14;
                int i15 = i7 + 6;
                if (i15 >= 0) {
                    destination[i6] = (byte) (i8 >>> i15);
                    i8 &= (i4 << i15) - 1;
                    i7 -= 2;
                    i6++;
                } else {
                    i7 = i15;
                }
            } else {
                if (i14 == -2) {
                    i9 = handlePaddingSymbol(source, i9, endIndex, i7);
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i13);
                    sb.append("'(");
                    String num = Integer.toString(i13, CharsKt.checkRadix(i));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb.append(num);
                    sb.append(") at index ");
                    sb.append(i9);
                    throw new IllegalArgumentException(sb.toString());
                }
                i9++;
            }
            i5 = -8;
        }
        if (i7 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, i9, endIndex);
        if (skipIllegalSymbolsIfMime >= endIndex) {
            return i6 - destinationOffset;
        }
        int i16 = source[skipIllegalSymbolsIfMime] & UByte.MAX_VALUE;
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append((char) i16);
        sb2.append("'(");
        String num2 = Integer.toString(i16, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
        sb2.append(num2);
        sb2.append(") at index ");
        throw new IllegalArgumentException(a.m(sb2, skipIllegalSymbolsIfMime - 1, " is prohibited after the pad character"));
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i6 & 4) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        if ((i6 & 16) != 0) {
            i5 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i, i4, i5);
    }

    private final int decodeSize(byte[] source, int startIndex, int endIndex) {
        int i = endIndex - startIndex;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            throw new IllegalArgumentException(w.k("Input should have at list 2 symbols for Base64 decoding, startIndex: ", startIndex, endIndex, ", endIndex: "));
        }
        if (this.isMimeScheme) {
            while (true) {
                if (startIndex >= endIndex) {
                    break;
                }
                int i4 = Base64Kt.access$getBase64DecodeMap$p()[source[startIndex] & UByte.MAX_VALUE];
                if (i4 < 0) {
                    if (i4 == -2) {
                        i -= endIndex - startIndex;
                        break;
                    }
                    i--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i = source[endIndex + (-2)] == 61 ? i - 2 : i - 1;
        }
        return (int) ((i * 6) / 8);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = bArr.length;
        }
        return base64.encode(bArr, i, i4);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i6 & 4) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        if ((i6 & 16) != 0) {
            i5 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i, i4, i5);
    }

    private final int encodeSize(int sourceSize) {
        int i = (sourceSize + 2) / 3;
        int i4 = ((this.isMimeScheme ? (i - 1) / 19 : 0) * 2) + (i * 4);
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i5 & 4) != 0) {
            i = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i, i4);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i, i4);
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException(a.l(padIndex, "Redundant pad character at index "));
        }
        if (byteStart == -6) {
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
        if (skipIllegalSymbolsIfMime == endIndex || source[skipIllegalSymbolsIfMime] != 61) {
            throw new IllegalArgumentException(a.l(skipIllegalSymbolsIfMime, "Missing one pad character at index "));
        }
        return skipIllegalSymbolsIfMime + 1;
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (Base64Kt.access$getBase64DecodeMap$p()[source[startIndex] & UByte.MAX_VALUE] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b4 : source) {
            sb.append((char) b4);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i] = (byte) charAt;
                i++;
            } else {
                bArr[i] = 63;
                i++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize = decodeSize(source, startIndex, endIndex);
        byte[] bArr = new byte[decodeSize];
        if (decodeImpl(source, bArr, 0, startIndex, endIndex) == decodeSize) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final String encode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize(endIndex - startIndex));
        byte[] access$getBase64UrlEncodeMap$p = this.isUrlSafe ? Base64Kt.access$getBase64UrlEncodeMap$p() : Base64Kt.access$getBase64EncodeMap$p();
        int i = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i4 = destinationOffset;
        while (startIndex + 2 < endIndex) {
            int min = Math.min((endIndex - startIndex) / 3, i);
            for (int i5 = 0; i5 < min; i5++) {
                int i6 = source[startIndex] & UByte.MAX_VALUE;
                int i7 = startIndex + 2;
                int i8 = source[startIndex + 1] & UByte.MAX_VALUE;
                startIndex += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (source[i7] & UByte.MAX_VALUE);
                destination[i4] = access$getBase64UrlEncodeMap$p[i9 >>> 18];
                destination[i4 + 1] = access$getBase64UrlEncodeMap$p[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                destination[i4 + 2] = access$getBase64UrlEncodeMap$p[(i9 >>> 6) & 63];
                i4 += 4;
                destination[i10] = access$getBase64UrlEncodeMap$p[i9 & 63];
            }
            if (min == i && startIndex != endIndex) {
                int i11 = i4 + 1;
                byte[] bArr = mimeLineSeparatorSymbols;
                destination[i4] = bArr[0];
                i4 += 2;
                destination[i11] = bArr[1];
            }
        }
        int i12 = endIndex - startIndex;
        if (i12 == 1) {
            int i13 = (source[startIndex] & UByte.MAX_VALUE) << 4;
            destination[i4] = access$getBase64UrlEncodeMap$p[i13 >>> 6];
            destination[i4 + 1] = access$getBase64UrlEncodeMap$p[i13 & 63];
            int i14 = i4 + 3;
            destination[i4 + 2] = padSymbol;
            i4 += 4;
            destination[i14] = padSymbol;
            startIndex++;
        } else if (i12 == 2) {
            int i15 = startIndex + 1;
            int i16 = source[startIndex] & UByte.MAX_VALUE;
            startIndex += 2;
            int i17 = ((source[i15] & UByte.MAX_VALUE) << 2) | (i16 << 10);
            destination[i4] = access$getBase64UrlEncodeMap$p[i17 >>> 12];
            destination[i4 + 1] = access$getBase64UrlEncodeMap$p[(i17 >>> 6) & 63];
            int i18 = i4 + 3;
            destination[i4 + 2] = access$getBase64UrlEncodeMap$p[i17 & 63];
            i4 += 4;
            destination[i18] = padSymbol;
        }
        if (startIndex == endIndex) {
            return i4 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] source, A destination, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1));
        return destination;
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    /* renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    private Base64(boolean z3, boolean z4) {
        this.isUrlSafe = z3;
        this.isMimeScheme = z4;
        if (z3 && z4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = charSequence.length();
        }
        return base64.decode(charSequence, i, i4);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i6 & 4) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i, i4, i5);
    }

    public final int decodeIntoByteArray(CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, charsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    public final byte[] decode(CharSequence source, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(((String) source).length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, charsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
