package T2;

import a.AbstractC0106b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class m extends k {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f1693e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f1694b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1695c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1696d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        hashMap.put(Double.TYPE, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f1693e = hashMap;
    }

    public m(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f1696d = new HashMap();
        AbstractC0106b abstractC0106b = V2.c.f1878a;
        Constructor k4 = abstractC0106b.k(cls);
        this.f1694b = k4;
        V2.c.e(k4);
        String[] o4 = abstractC0106b.o(cls);
        for (int i = 0; i < o4.length; i++) {
            this.f1696d.put(o4[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f1694b.getParameterTypes();
        this.f1695c = new Object[parameterTypes.length];
        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
            this.f1695c[i4] = f1693e.get(parameterTypes[i4]);
        }
    }

    @Override // T2.k
    public final Object c() {
        return (Object[]) this.f1695c.clone();
    }

    @Override // T2.k
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f1694b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e4) {
            AbstractC0106b abstractC0106b = V2.c.f1878a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        } catch (IllegalArgumentException | InstantiationException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + V2.c.b(constructor) + "' with args " + Arrays.toString(objArr), e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + V2.c.b(constructor) + "' with args " + Arrays.toString(objArr), e6.getCause());
        }
    }

    @Override // T2.k
    public final void e(Object obj, Y2.a aVar, j jVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f1696d;
        String str = jVar.f1683c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + V2.c.b(this.f1694b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object a2 = jVar.h.a(aVar);
        if (a2 != null || !jVar.f1689k) {
            objArr[intValue] = a2;
        } else {
            StringBuilder p = com.google.android.gms.measurement.internal.a.p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            p.append(aVar.a0(false));
            throw new RuntimeException(p.toString());
        }
    }
}
