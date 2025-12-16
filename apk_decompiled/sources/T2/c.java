package T2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class c implements Q2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final F.i f1668b;

    public /* synthetic */ c(int i, F.i iVar) {
        this.f1667a = i;
        this.f1668b = iVar;
    }

    public static Q2.l b(F.i iVar, Q2.d dVar, X2.a aVar, R2.a aVar2) {
        Q2.l a2;
        Object j4 = iVar.r(X2.a.get(aVar2.value())).j();
        boolean nullSafe = aVar2.nullSafe();
        if (j4 instanceof Q2.l) {
            a2 = (Q2.l) j4;
        } else {
            if (!(j4 instanceof Q2.m)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + j4.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a2 = ((Q2.m) j4).a(dVar, aVar);
        }
        return (a2 == null || !nullSafe) ? a2 : new Q2.b(a2, 2);
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        F.i iVar = this.f1668b;
        switch (this.f1667a) {
            case 0:
                Type type = aVar.getType();
                Class<Object> rawType = aVar.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                S2.d.b(Collection.class.isAssignableFrom(rawType));
                Type h = S2.d.h(type, rawType, S2.d.f(type, rawType, Collection.class), new HashMap());
                cls = h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments()[0] : Object.class;
                return new b(dVar, cls, dVar.d(X2.a.get(cls)), iVar.r(aVar));
            case 1:
                R2.a aVar2 = (R2.a) aVar.getRawType().getAnnotation(R2.a.class);
                if (aVar2 == null) {
                    return null;
                }
                return b(iVar, dVar, aVar, aVar2);
            default:
                Type type2 = aVar.getType();
                Class<Object> rawType2 = aVar.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    S2.d.b(Map.class.isAssignableFrom(rawType2));
                    Type h4 = S2.d.h(type2, rawType2, S2.d.f(type2, rawType2, Map.class), new HashMap());
                    actualTypeArguments = h4 instanceof ParameterizedType ? ((ParameterizedType) h4).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Q2.l d4 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? r.f1712c : dVar.d(X2.a.get(type3));
                Q2.l d5 = dVar.d(X2.a.get(actualTypeArguments[1]));
                S2.p r4 = iVar.r(aVar);
                Type[] typeArr = actualTypeArguments;
                return new f(this, dVar, typeArr[0], d4, typeArr[1], d5, r4);
        }
    }
}
