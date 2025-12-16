package O0;

import S0.o;
import W0.f;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // O0.b
    public final String a(Object obj, o oVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = oVar.f1502a.getResources().getConfiguration();
        Bitmap.Config[] configArr = f.f1887a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
