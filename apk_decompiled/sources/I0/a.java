package I0;

import android.content.Context;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f736a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static h f737b;

    public static final h a(Context context) {
        h hVar = f737b;
        if (hVar != null) {
            return hVar;
        }
        synchronized (f736a) {
            try {
                h hVar2 = f737b;
                if (hVar2 != null) {
                    return hVar2;
                }
                Object applicationContext = context.getApplicationContext();
                i iVar = applicationContext instanceof i ? (i) applicationContext : null;
                h newImageLoader = iVar != null ? iVar.newImageLoader() : new g(context).c();
                f737b = newImageLoader;
                return newImageLoader;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
