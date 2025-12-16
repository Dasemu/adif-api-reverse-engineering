package K;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class f {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, i iVar) {
        configuration.setLocales(iVar.f972a.f973a);
    }
}
