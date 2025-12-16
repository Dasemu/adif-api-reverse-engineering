package z0;

import a.AbstractC0105a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.adif.elcanomovil.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0665a f8999d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9000e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f9003c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9002b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9001a = new HashMap();

    public C0665a(Context context) {
        this.f9003c = context.getApplicationContext();
    }

    public static C0665a c(Context context) {
        if (f8999d == null) {
            synchronized (f9000e) {
                try {
                    if (f8999d == null) {
                        f8999d = new C0665a(context);
                    }
                } finally {
                }
            }
        }
        return f8999d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f9003c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f9002b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0666b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0105a.F()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f9001a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0666b interfaceC0666b = (InterfaceC0666b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> dependencies = interfaceC0666b.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0666b.a(this.f9003c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return obj;
    }
}
