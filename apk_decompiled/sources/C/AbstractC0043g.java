package C;

import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.P;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043g extends D.h {
    public static boolean a(P p, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? AbstractC0041e.a(p, str) : i == 31 ? AbstractC0040d.b(p, str) : AbstractC0038b.c(p, str);
        }
        return false;
    }
}
