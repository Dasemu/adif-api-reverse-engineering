package C;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: C.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0049m {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
