package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import k.AbstractC0405b;
import k.InterfaceC0404a;
import s.C0581a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0369p f6658a = new ExecutorC0369p(new Object());

    /* renamed from: b, reason: collision with root package name */
    public static final int f6659b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static K.i f6660c = null;

    /* renamed from: d, reason: collision with root package name */
    public static K.i f6661d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f6662e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f6663f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final s.f f6664g = new s.f(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean d(Context context) {
        if (f6662e == null) {
            try {
                int i4 = L.f6554a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) L.class), K.a() | 128).metaData;
                if (bundle != null) {
                    f6662e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f6662e = Boolean.FALSE;
            }
        }
        return f6662e.booleanValue();
    }

    public static void g(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E) {
        synchronized (h) {
            try {
                s.f fVar = f6664g;
                fVar.getClass();
                C0581a c0581a = new C0581a(fVar);
                while (c0581a.hasNext()) {
                    r rVar = (r) ((WeakReference) c0581a.next()).get();
                    if (rVar == layoutInflaterFactory2C0351E || rVar == null) {
                        c0581a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void e();

    public abstract void f();

    public abstract boolean h(int i4);

    public abstract void j(int i4);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract AbstractC0405b n(InterfaceC0404a interfaceC0404a);
}
