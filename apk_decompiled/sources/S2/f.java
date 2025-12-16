package S2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public final class f implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f1590b;

    public /* synthetic */ f(int i, Type type) {
        this.f1589a = i;
        this.f1590b = type;
    }

    @Override // S2.p
    public final Object j() {
        switch (this.f1589a) {
            case 0:
                Type type = this.f1590b;
                if (!(type instanceof ParameterizedType)) {
                    throw new RuntimeException("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new RuntimeException("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f1590b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new RuntimeException("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new RuntimeException("Invalid EnumMap type: " + type3.toString());
        }
    }
}
