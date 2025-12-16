package Z2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public final class J extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2222a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final p f2223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2224c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2225d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2226e;

    public J(Class cls) {
        int i = 0;
        this.f2224c = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f2226e = enumArr;
            this.f2225d = new String[enumArr.length];
            while (true) {
                Enum[] enumArr2 = (Enum[]) this.f2226e;
                if (i < enumArr2.length) {
                    String name = enumArr2[i].name();
                    String[] strArr = (String[]) this.f2225d;
                    Field field = cls.getField(name);
                    Set set = b3.f.f4193a;
                    InterfaceC0101i interfaceC0101i = (InterfaceC0101i) field.getAnnotation(InterfaceC0101i.class);
                    if (interfaceC0101i != null) {
                        String name2 = interfaceC0101i.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i] = name;
                    i++;
                } else {
                    this.f2223b = p.a((String[]) this.f2225d);
                    return;
                }
            }
        } catch (NoSuchFieldException e4) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e4);
        }
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r reader) {
        switch (this.f2222a) {
            case 0:
                int k02 = reader.k0(this.f2223b);
                if (k02 != -1) {
                    return ((Enum[]) this.f2226e)[k02];
                }
                String O2 = reader.O();
                throw new RuntimeException("Expected one of " + Arrays.asList((String[]) this.f2225d) + " but was " + reader.e0() + " at path " + O2);
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                KFunction kFunction = (KFunction) this.f2224c;
                int size = kFunction.getParameters().size();
                ArrayList arrayList = (ArrayList) this.f2225d;
                int size2 = arrayList.size();
                Object[] objArr = new Object[size2];
                int i = 0;
                while (true) {
                    Object obj = c3.c.f4296a;
                    if (i >= size2) {
                        reader.e();
                        while (reader.Y()) {
                            int j02 = reader.j0(this.f2223b);
                            if (j02 == -1) {
                                reader.l0();
                                reader.m0();
                            } else {
                                c3.a aVar = (c3.a) ((List) this.f2226e).get(j02);
                                int i4 = aVar.f4293e;
                                Object obj2 = objArr[i4];
                                KProperty1 kProperty1 = aVar.f4291c;
                                if (obj2 != obj) {
                                    throw new RuntimeException("Multiple values for '" + kProperty1.getName() + "' at " + reader.O());
                                }
                                Object fromJson = aVar.f4290b.fromJson(reader);
                                objArr[i4] = fromJson;
                                if (fromJson == null && !kProperty1.getReturnType().isMarkedNullable()) {
                                    Q2.j l4 = b3.f.l(kProperty1.getName(), aVar.f4289a, reader);
                                    Intrinsics.checkNotNullExpressionValue(l4, "unexpectedNull(\n        …         reader\n        )");
                                    throw l4;
                                }
                            }
                        }
                        reader.x();
                        boolean z3 = arrayList.size() == size;
                        for (int i5 = 0; i5 < size; i5++) {
                            if (objArr[i5] == obj) {
                                if (kFunction.getParameters().get(i5).isOptional()) {
                                    z3 = false;
                                } else {
                                    if (!kFunction.getParameters().get(i5).getType().isMarkedNullable()) {
                                        String name = kFunction.getParameters().get(i5).getName();
                                        c3.a aVar2 = (c3.a) arrayList.get(i5);
                                        Q2.j g4 = b3.f.g(name, aVar2 != null ? aVar2.f4289a : null, reader);
                                        Intrinsics.checkNotNullExpressionValue(g4, "missingProperty(\n       …       reader\n          )");
                                        throw g4;
                                    }
                                    objArr[i5] = null;
                                }
                            }
                        }
                        Object call = z3 ? kFunction.call(Arrays.copyOf(objArr, size2)) : kFunction.callBy(new c3.b(kFunction.getParameters(), objArr));
                        int size3 = arrayList.size();
                        while (size < size3) {
                            Object obj3 = arrayList.get(size);
                            Intrinsics.checkNotNull(obj3);
                            c3.a aVar3 = (c3.a) obj3;
                            Object obj4 = objArr[size];
                            if (obj4 != obj) {
                                KProperty1 kProperty12 = aVar3.f4291c;
                                Intrinsics.checkNotNull(kProperty12, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                                ((KMutableProperty1) kProperty12).set(call, obj4);
                            } else {
                                aVar3.getClass();
                            }
                            size++;
                        }
                        return call;
                    }
                    objArr[i] = obj;
                    i++;
                }
                break;
        }
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x writer, Object obj) {
        switch (this.f2222a) {
            case 0:
                writer.h0(((String[]) this.f2225d)[((Enum) obj).ordinal()]);
                return;
            default:
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj == null) {
                    throw new NullPointerException("value == null");
                }
                writer.e();
                Iterator it = ((ArrayList) this.f2225d).iterator();
                while (it.hasNext()) {
                    c3.a aVar = (c3.a) it.next();
                    if (aVar != null) {
                        writer.Z(aVar.f4289a);
                        aVar.f4290b.toJson(writer, aVar.f4291c.get(obj));
                    }
                }
                writer.O();
                return;
        }
    }

    public final String toString() {
        switch (this.f2222a) {
            case 0:
                return "JsonAdapter(" + ((Class) this.f2224c).getName() + ")";
            default:
                return "KotlinJsonAdapter(" + ((KFunction) this.f2224c).getReturnType() + ')';
        }
    }

    public J(KFunction constructor, ArrayList allBindings, List nonIgnoredBindings, p options) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(allBindings, "allBindings");
        Intrinsics.checkNotNullParameter(nonIgnoredBindings, "nonIgnoredBindings");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f2224c = constructor;
        this.f2225d = allBindings;
        this.f2226e = nonIgnoredBindings;
        this.f2223b = options;
    }
}
