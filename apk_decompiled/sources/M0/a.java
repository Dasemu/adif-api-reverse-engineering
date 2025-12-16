package M0;

import S0.o;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    public /* synthetic */ a(int i) {
        this.f1081a = i;
    }

    @Override // M0.f
    public final g a(Object obj, o oVar) {
        switch (this.f1081a) {
            case 0:
                Uri uri = (Uri) obj;
                if (W0.f.d(uri)) {
                    return new b(uri, oVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, oVar, 0);
            case 2:
                return new c((ByteBuffer) obj, oVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.areEqual(uri2.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    return new b(uri2, oVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, oVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (Intrinsics.areEqual(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, oVar, 2);
                }
                return null;
        }
    }
}
