package G;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import s.i;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.e f565a = new E2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final i f566b = new i(16);

    public static Typeface a(Context context, L.i[] iVarArr, int i) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        f565a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = iVarArr.length;
            FontFamily.Builder builder = null;
            while (i4 < length) {
                L.i iVar = iVarArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(iVar.f1038a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f1040c).setSlant(iVar.f1041d ? 1 : 0).setTtcIndex(iVar.f1039b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i4 = openFileDescriptor == null ? i4 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(E2.e.h(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.equals(r3) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, F.e r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, F.b r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G.g.b(android.content.Context, F.e, android.content.res.Resources, int, java.lang.String, int, int, F.b, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i4, int i5) {
        Typeface typeface;
        f565a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            f566b.put(d(resources, i, str, i4, i5), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i4, int i5) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i4 + '-' + i + '-' + i5;
    }
}
