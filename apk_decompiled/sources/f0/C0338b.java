package f0;

import O.D0;
import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.B;
import e3.G;
import g.InterfaceC0355b;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import l.m;
import l.x;
import o0.C0537n;
import o0.C0545w;
import o0.E;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q2.AbstractC0562d;
import r.C0564a;
import r3.AbstractC0569a;
import r3.C0579k;
import r3.z;
import s0.InterfaceC0584c;
import x2.o;
import x2.p;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0338b implements InterfaceC0355b, x, o, InterfaceC0584c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6448a;

    public /* synthetic */ C0338b(int i) {
        this.f6448a = i;
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f8101e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > i7 && bArr[i9] != 10) {
                i9 += i7;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i4 = i10 + i11;
                if (bArr[i4] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i4 - i10;
            int i13 = i;
            boolean z4 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z4) {
                    i5 = 46;
                    z3 = false;
                } else {
                    byte b4 = bArr2[i13][i14];
                    byte[] bArr4 = f3.c.f6469a;
                    int i16 = b4 & UByte.MAX_VALUE;
                    z3 = z4;
                    i5 = i16;
                }
                byte b5 = bArr[i10 + i15];
                byte[] bArr5 = f3.c.f6469a;
                i6 = i5 - (b5 & UByte.MAX_VALUE);
                if (i6 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z4 = z3;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    z4 = true;
                    i14 = -1;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i10, i12, UTF_8);
                        }
                    }
                }
                i8 = i4 + 1;
                i7 = -1;
            }
            length = i9;
            i7 = -1;
        }
        return null;
    }

    public static final boolean e(z zVar) {
        boolean endsWith;
        z zVar2 = s3.h.f8485e;
        zVar.getClass();
        C0579k c0579k = s3.c.f8474a;
        C0579k c0579k2 = zVar.f8322a;
        int k4 = C0579k.k(c0579k2, c0579k);
        if (k4 == -1) {
            k4 = C0579k.k(c0579k2, s3.c.f8475b);
        }
        if (k4 != -1) {
            c0579k2 = C0579k.o(c0579k2, k4 + 1, 0, 2);
        } else if (zVar.g() != null && c0579k2.d() == 2) {
            c0579k2 = C0579k.f8285d;
        }
        endsWith = StringsKt__StringsJVMKt.endsWith(c0579k2.q(), ".class", true);
        return !endsWith;
    }

    public static ArrayList g(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((G) obj) != G.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.g(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G) it.next()).f6261a);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r3.h] */
    public static byte[] j(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ?? obj = new Object();
        Iterator it = g(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.j0(str.length());
            obj.o0(str);
        }
        return obj.b0(obj.f8284b);
    }

    public static C0537n k(Context context, E destination, Bundle bundle, B hostLifecycleState, C0545w c0545w) {
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id, "id");
        return new C0537n(context, destination, bundle, hostLifecycleState, c0545w, id, null);
    }

    public static C0579k l(String str) {
        char c4;
        int i;
        char charAt;
        char c5 = 'A';
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = AbstractC0569a.f8269a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (true) {
            c4 = '\t';
            if (length <= 0 || !((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                break;
            }
            length--;
        }
        int i4 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i5 < length) {
                char charAt2 = str.charAt(i5);
                char c6 = c5;
                if (c5 <= charAt2 && charAt2 < '[') {
                    i = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != c4) {
                        break;
                    }
                    i5++;
                    c5 = c6;
                    c4 = '\t';
                }
                int i9 = i | (i7 << 6);
                i6++;
                if (i6 % 4 == 0) {
                    bArr2[i8] = (byte) (i9 >> 16);
                    int i10 = i8 + 2;
                    bArr2[i8 + 1] = (byte) (i9 >> 8);
                    i8 += 3;
                    bArr2[i10] = (byte) i9;
                }
                i7 = i9;
                i5++;
                c5 = c6;
                c4 = '\t';
            } else {
                int i11 = i6 % 4;
                if (i11 != 1) {
                    if (i11 == 2) {
                        bArr2[i8] = (byte) ((i7 << 12) >> 16);
                        i8 = 1 + i8;
                    } else if (i11 == 3) {
                        int i12 = i7 << 6;
                        int i13 = 1 + i8;
                        bArr2[i8] = (byte) (i12 >> 16);
                        i8 += 2;
                        bArr2[i13] = (byte) (i12 >> 8);
                    }
                    if (i8 != i4) {
                        bArr2 = Arrays.copyOf(bArr2, i8);
                        Intrinsics.checkNotNullExpressionValue(bArr2, "copyOf(this, newSize)");
                    }
                }
            }
        }
        bArr2 = null;
        if (bArr2 != null) {
            return new C0579k(bArr2);
        }
        return null;
    }

    public static C0579k m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) (s3.b.a(str.charAt(i4 + 1)) + (s3.b.a(str.charAt(i4)) << 4));
        }
        return new C0579k(bArr);
    }

    public static C0579k n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        C0579k c0579k = new C0579k(bytes);
        c0579k.f8288c = str;
        return c0579k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r3.h] */
    public static z o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C0579k c0579k = s3.c.f8474a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ?? obj = new Object();
        obj.o0(str);
        return s3.c.d(obj, false);
    }

    public static z p(File file) {
        String str = z.f8321b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        return o(file2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(f0.C0339c r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0338b.r(f0.c, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean s() {
        return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
    }

    public static C0579k t(byte[] bArr) {
        C0579k c0579k = C0579k.f8285d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        m3.d.j(bArr.length, 0, length);
        return new C0579k(ArraysKt.copyOfRange(bArr, 0, length));
    }

    private final void u() {
    }

    private final void v(int i, Serializable serializable) {
    }

    @Override // s0.InterfaceC0584c
    public void a(int i, Serializable serializable) {
        String str;
        switch (this.f6448a) {
            case 14:
                return;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    return;
                } else {
                    Log.d("ProfileInstaller", str);
                    return;
                }
        }
    }

    @Override // l.x
    public void b(m mVar, boolean z3) {
    }

    @Override // x2.o
    public D0 c(View view, D0 d02, p pVar) {
        pVar.f8972d = d02.a() + pVar.f8972d;
        WeakHashMap weakHashMap = X.f1226a;
        boolean z3 = view.getLayoutDirection() == 1;
        int b4 = d02.b();
        int c4 = d02.c();
        int i = pVar.f8969a + (z3 ? c4 : b4);
        pVar.f8969a = i;
        int i4 = pVar.f8971c;
        if (!z3) {
            b4 = c4;
        }
        int i5 = i4 + b4;
        pVar.f8971c = i5;
        view.setPaddingRelative(i, pVar.f8970b, i5, pVar.f8972d);
        return d02;
    }

    @Override // l.x
    public boolean f(m mVar) {
        return false;
    }

    @Override // s0.InterfaceC0584c
    public void h() {
        switch (this.f6448a) {
            case 14:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    public float i(float f2, float f4) {
        return 1.0f;
    }

    public long q() {
        switch (this.f6448a) {
            case 2:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public void w(F.i iVar, float f2) {
        C0564a c0564a = (C0564a) ((Drawable) iVar.f490b);
        CardView cardView = (CardView) iVar.f491c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != c0564a.f8197e || c0564a.f8198f != useCompatPadding || c0564a.f8199g != preventCornerOverlap) {
            c0564a.f8197e = f2;
            c0564a.f8198f = useCompatPadding;
            c0564a.f8199g = preventCornerOverlap;
            c0564a.b(null);
            c0564a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            iVar.G(0, 0, 0, 0);
            return;
        }
        C0564a c0564a2 = (C0564a) ((Drawable) iVar.f490b);
        float f4 = c0564a2.f8197e;
        float f5 = c0564a2.f8193a;
        int ceil = (int) Math.ceil(r.b.a(f4, f5, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(r.b.b(f4, f5, cardView.getPreventCornerOverlap()));
        iVar.G(ceil, ceil2, ceil, ceil2);
    }

    public C0338b(Context context, String str, AbstractC0562d callback) {
        this.f6448a = 19;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
