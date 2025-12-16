package b0;

import Y.C0085a;
import Y.n;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0130v;
import androidx.datastore.preferences.protobuf.C0119j;
import androidx.datastore.preferences.protobuf.InterfaceC0132x;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC0629f;

/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0265j f4163a = new Object();

    public final C0257b a(FileInputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            a0.f l4 = a0.f.l(input);
            Intrinsics.checkNotNullExpressionValue(l4, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
            AbstractC0261f[] pairs = new AbstractC0261f[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            C0257b c0257b = new C0257b(false);
            AbstractC0261f[] pairs2 = (AbstractC0261f[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            c0257b.b();
            if (pairs2.length > 0) {
                AbstractC0261f abstractC0261f = pairs2[0];
                throw null;
            }
            Map j4 = l4.j();
            Intrinsics.checkNotNullExpressionValue(j4, "preferencesProto.preferencesMap");
            for (Map.Entry entry : j4.entrySet()) {
                String name = (String) entry.getKey();
                a0.j value = (a0.j) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int x3 = value.x();
                switch (x3 == 0 ? -1 : AbstractC0264i.$EnumSwitchMapping$0[AbstractC0629f.b(x3)]) {
                    case -1:
                        throw new C0085a("Value case is null.", 0);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key = new C0260e(name);
                        Boolean valueOf = Boolean.valueOf(value.p());
                        Intrinsics.checkNotNullParameter(key, "key");
                        c0257b.c(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key2 = new C0260e(name);
                        Float valueOf2 = Float.valueOf(value.s());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c0257b.c(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key3 = new C0260e(name);
                        Double valueOf3 = Double.valueOf(value.r());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        c0257b.c(key3, valueOf3);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key4 = new C0260e(name);
                        Integer valueOf4 = Integer.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        c0257b.c(key4, valueOf4);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key5 = new C0260e(name);
                        Long valueOf5 = Long.valueOf(value.u());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        c0257b.c(key5, valueOf5);
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key6 = new C0260e(name);
                        String v3 = value.v();
                        Intrinsics.checkNotNullExpressionValue(v3, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        c0257b.c(key6, v3);
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0260e key7 = new C0260e(name);
                        InterfaceC0132x k4 = value.w().k();
                        Intrinsics.checkNotNullExpressionValue(k4, "value.stringSet.stringsList");
                        Set set = CollectionsKt.toSet(k4);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        c0257b.c(key7, set);
                        break;
                    case 8:
                        throw new C0085a("Value not set.", 0);
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(c0257b.f4153a);
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new C0257b(MapsKt.toMutableMap(unmodifiableMap), true);
        } catch (A e4) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new IOException("Unable to parse preferences proto.", e4);
        }
    }

    public final Unit b(Object obj, n nVar) {
        AbstractC0130v a2;
        Map unmodifiableMap = Collections.unmodifiableMap(((C0257b) ((AbstractC0262g) obj)).f4153a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        a0.d k4 = a0.f.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            C0260e c0260e = (C0260e) entry.getKey();
            Object value = entry.getValue();
            String str = c0260e.f4159a;
            if (value instanceof Boolean) {
                a0.i y3 = a0.j.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y3.c();
                a0.j.m((a0.j) y3.f2971b, booleanValue);
                a2 = y3.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                a0.i y4 = a0.j.y();
                float floatValue = ((Number) value).floatValue();
                y4.c();
                a0.j.n((a0.j) y4.f2971b, floatValue);
                a2 = y4.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                a0.i y5 = a0.j.y();
                double doubleValue = ((Number) value).doubleValue();
                y5.c();
                a0.j.l((a0.j) y5.f2971b, doubleValue);
                a2 = y5.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                a0.i y6 = a0.j.y();
                int intValue = ((Number) value).intValue();
                y6.c();
                a0.j.o((a0.j) y6.f2971b, intValue);
                a2 = y6.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                a0.i y7 = a0.j.y();
                long longValue = ((Number) value).longValue();
                y7.c();
                a0.j.i((a0.j) y7.f2971b, longValue);
                a2 = y7.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                a0.i y8 = a0.j.y();
                y8.c();
                a0.j.j((a0.j) y8.f2971b, (String) value);
                a2 = y8.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setString(value).build()");
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", value.getClass().getName()));
                }
                a0.i y9 = a0.j.y();
                a0.g l4 = a0.h.l();
                l4.c();
                a0.h.i((a0.h) l4.f2971b, (Set) value);
                y9.c();
                a0.j.k((a0.j) y9.f2971b, l4);
                a2 = y9.a();
                Intrinsics.checkNotNullExpressionValue(a2, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            }
            k4.getClass();
            str.getClass();
            k4.c();
            a0.f.i((a0.f) k4.f2971b).put(str, (a0.j) a2);
        }
        a0.f fVar = (a0.f) k4.a();
        int a4 = fVar.a();
        Logger logger = C0119j.h;
        if (a4 > 4096) {
            a4 = 4096;
        }
        C0119j c0119j = new C0119j(nVar, a4);
        fVar.c(c0119j);
        if (c0119j.f2933f > 0) {
            c0119j.B();
        }
        return Unit.INSTANCE;
    }
}
