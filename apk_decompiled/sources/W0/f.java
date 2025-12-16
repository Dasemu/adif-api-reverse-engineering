package W0;

import S0.w;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.adif.elcanomovil.R;
import e3.C0334u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f1887a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f1888b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    public static final C0334u f1889c = new C0334u((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        String substringBeforeLast$default;
        String substringBeforeLast$default2;
        String substringAfterLast$default;
        String substringAfterLast;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null);
        substringBeforeLast$default2 = StringsKt__StringsKt.substringBeforeLast$default(substringBeforeLast$default, '?', (String) null, 2, (Object) null);
        substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(substringBeforeLast$default2, '/', (String) null, 2, (Object) null);
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(substringAfterLast$default, '.', "");
        return mimeTypeMap.getMimeTypeFromExtension(substringAfterLast);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static final w c(ImageView imageView) {
        w wVar;
        Object tag = imageView.getTag(R.id.coil_request_manager);
        w wVar2 = tag instanceof w ? (w) tag : null;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (imageView) {
            try {
                Object tag2 = imageView.getTag(R.id.coil_request_manager);
                w wVar3 = tag2 instanceof w ? (w) tag2 : null;
                if (wVar3 == null) {
                    ?? obj = new Object();
                    imageView.addOnAttachStateChangeListener(obj);
                    imageView.setTag(R.id.coil_request_manager, obj);
                    wVar = obj;
                }
            } finally {
            }
        }
        return wVar;
    }

    public static final boolean d(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "file") && Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) uri.getPathSegments()), "android_asset");
    }

    public static final int e(m3.l lVar, T0.g gVar) {
        if (lVar instanceof T0.a) {
            return ((T0.a) lVar).f1631a;
        }
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return IntCompanionObject.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
