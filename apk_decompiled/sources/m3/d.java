package m3;

import C.w;
import O.L;
import O.X;
import a.AbstractC0106b;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.fragment.app.K;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.ServiceStarter;
import d1.C0309c;
import e3.V;
import f0.C0338b;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.DurationKt;
import o0.T;
import o0.U;
import o0.W;
import org.xmlpull.v1.XmlPullParserException;
import r3.C0579k;
import w2.C0651a;

/* loaded from: classes3.dex */
public abstract class d {
    public static Typeface A(Configuration configuration, Typeface typeface) {
        int i;
        int i4;
        int i5;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i5 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, AbstractC0106b.d(i5 + weight, 1, 1000), typeface.isItalic());
    }

    public static int B(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static String C(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + K(certificate).a();
    }

    public static final void D(View view, v0.f fVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static void G(TextView textView, int i) {
        g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void H(View view, E2.g gVar) {
        C0651a c0651a = gVar.f400a.f387b;
        if (c0651a == null || !c0651a.f8806a) {
            return;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = X.f1226a;
            f2 += L.i((View) parent);
        }
        E2.f fVar = gVar.f400a;
        if (fVar.f395l != f2) {
            fVar.f395l = f2;
            gVar.m();
        }
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence, int i, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static void J(Drawable drawable, int i) {
        H.a.g(drawable, i);
    }

    public static C0579k K(X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        C0579k c0579k = C0579k.f8285d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        return C0338b.t(encoded).c("SHA-256");
    }

    public static final StackTraceElement a(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final void b(h3.a aVar, h3.c cVar, String str) {
        h3.e.h.getClass();
        Logger logger = h3.e.f6792j;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f6785b);
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f6778a);
        logger.fine(sb.toString());
    }

    public static final boolean c(byte[] a2, byte[] b4, int i, int i4, int i5) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (a2[i6 + i] != b4[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = z(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = e(r8, r9, r10)
            boolean r1 = e(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = z(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.d(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void f(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static T h(TypedValue value, T t2, T expectedNavType, String str, String foundType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
        Intrinsics.checkNotNullParameter(foundType, "foundType");
        if (t2 == null || t2 == expectedNavType) {
            return t2 == null ? expectedNavType : t2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void j(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static final double k(int i, int i4, int i5, int i6, T0.g gVar) {
        double d4 = i5 / i;
        double d5 = i6 / i4;
        int i7 = J0.i.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i7 == 1) {
            return Math.max(d4, d5);
        }
        if (i7 == 2) {
            return Math.min(d4, d5);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [d0.p, androidx.recyclerview.widget.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d0.p l(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            i(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r2 = r4
            goto L6d
        L3a:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
        L4c:
            if (r2 >= r6) goto L5a
            r7 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            I0.b r2 = new I0.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L6d
        L66:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6d:
            if (r2 != 0) goto L70
            goto L7a
        L70:
            d0.p r4 = new d0.p
            d0.o r0 = new d0.o
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.l(android.content.Context):d0.p");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.b, java.lang.Object] */
    public static AbstractC0106b m(int i) {
        if (i != 0 && i == 1) {
            return new Object();
        }
        return new Object();
    }

    public static final I0.b n(K k4, KClass viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(k4, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new I0.b(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static SimpleDateFormat o() {
        return (SimpleDateFormat) C0309c.f6168a.getValue();
    }

    public static V p(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return V.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return V.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return V.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return V.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return V.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static final String q(long j4) {
        String q4 = j4 <= -999500000 ? w.q(new StringBuilder(), (j4 - 500000000) / 1000000000, " s ") : j4 <= -999500 ? w.q(new StringBuilder(), (j4 - 500000) / DurationKt.NANOS_IN_MILLIS, " ms") : j4 <= 0 ? w.q(new StringBuilder(), (j4 - ServiceStarter.ERROR_UNKNOWN) / 1000, " µs") : j4 < 999500 ? w.q(new StringBuilder(), (j4 + ServiceStarter.ERROR_UNKNOWN) / 1000, " µs") : j4 < 999500000 ? w.q(new StringBuilder(), (j4 + 500000) / DurationKt.NANOS_IN_MILLIS, " ms") : w.q(new StringBuilder(), (j4 + 500000000) / 1000000000, " s ");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return w.s(new Object[]{q4}, 1, "%6s", "format(format, *args)");
    }

    public static final int r(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static int s(Context context, int i, int i4) {
        Integer num;
        TypedValue T3 = l.T(context, i);
        if (T3 != null) {
            int i5 = T3.resourceId;
            num = Integer.valueOf(i5 != 0 ? D.h.getColor(context, i5) : T3.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i4;
    }

    public static int t(View view, int i) {
        Context context = view.getContext();
        TypedValue V3 = l.V(view.getContext(), i, view.getClass().getCanonicalName());
        int i4 = V3.resourceId;
        return i4 != 0 ? D.h.getColor(context, i4) : V3.data;
    }

    public static String u(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = W.f7966b;
        String str = (String) linkedHashMap.get(navigatorClass);
        if (str == null) {
            U u3 = (U) navigatorClass.getAnnotation(U.class);
            str = u3 != null ? u3.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, str);
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static boolean w(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    public static boolean x(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = G.a.f556a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = red / 255.0d;
        double pow = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = green / 255.0d;
        double pow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = blue / 255.0d;
        double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d7 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d7;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d7 / 100.0d > 0.5d;
    }

    public static int y(float f2, int i, int i4) {
        return G.a.b(G.a.d(i4, Math.round(Color.alpha(i4) * f2)), i);
    }

    public static int z(int i, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return Math.max(0, i4 - i5);
    }

    public abstract void E(boolean z3);

    public abstract void F(boolean z3);

    public abstract boolean v();
}
