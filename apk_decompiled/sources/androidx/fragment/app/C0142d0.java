package androidx.fragment.app;

/* renamed from: androidx.fragment.app.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s.j f3109b = new s.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0158l0 f3110a;

    public C0142d0(AbstractC0158l0 abstractC0158l0) {
        this.f3110a = abstractC0158l0;
    }

    public static Class b(ClassLoader classLoader, String str) {
        s.j jVar = f3109b;
        s.j jVar2 = (s.j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new s.j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(C.w.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e5);
        }
    }

    public final K a(String str) {
        return K.instantiate(this.f3110a.f3177w.f3075b, str, null);
    }
}
