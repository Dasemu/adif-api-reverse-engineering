package T2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
public final class a implements Q2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1662a;

    public /* synthetic */ a(int i) {
        this.f1662a = i;
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        switch (this.f1662a) {
            case 0:
                Type type = aVar.getType();
                boolean z3 = type instanceof GenericArrayType;
                if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(dVar, dVar.d(X2.a.get(genericComponentType)), S2.d.g(genericComponentType));
            case 1:
                if (aVar.getRawType() == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                if (aVar.getRawType() == Object.class) {
                    return new i(dVar);
                }
                return null;
            case 3:
                Class<? super Object> rawType = aVar.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new o(rawType);
            case 4:
                if (aVar.getRawType() == java.sql.Date.class) {
                    return new W2.a(0);
                }
                return null;
            case 5:
                if (aVar.getRawType() == Time.class) {
                    return new W2.a(1);
                }
                return null;
            default:
                if (aVar.getRawType() != Timestamp.class) {
                    return null;
                }
                dVar.getClass();
                return new W2.a(dVar.d(X2.a.get(Date.class)));
        }
    }
}
