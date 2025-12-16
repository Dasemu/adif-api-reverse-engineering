package c3;

import C.w;
import Z2.AbstractC0104l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4289a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0104l f4290b;

    /* renamed from: c, reason: collision with root package name */
    public final KProperty1 f4291c;

    /* renamed from: d, reason: collision with root package name */
    public final KParameter f4292d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4293e;

    public a(String jsonName, AbstractC0104l adapter, KProperty1 property, KParameter kParameter, int i) {
        Intrinsics.checkNotNullParameter(jsonName, "jsonName");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(property, "property");
        this.f4289a = jsonName;
        this.f4290b = adapter;
        this.f4291c = property;
        this.f4292d = kParameter;
        this.f4293e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f4289a, aVar.f4289a) && Intrinsics.areEqual(this.f4290b, aVar.f4290b) && Intrinsics.areEqual(this.f4291c, aVar.f4291c) && Intrinsics.areEqual(this.f4292d, aVar.f4292d) && this.f4293e == aVar.f4293e;
    }

    public final int hashCode() {
        int hashCode = (this.f4291c.hashCode() + ((this.f4290b.hashCode() + (this.f4289a.hashCode() * 31)) * 31)) * 31;
        KParameter kParameter = this.f4292d;
        return Integer.hashCode(this.f4293e) + ((hashCode + (kParameter == null ? 0 : kParameter.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Binding(jsonName=");
        sb.append(this.f4289a);
        sb.append(", adapter=");
        sb.append(this.f4290b);
        sb.append(", property=");
        sb.append(this.f4291c);
        sb.append(", parameter=");
        sb.append(this.f4292d);
        sb.append(", propertyIndex=");
        return w.p(sb, this.f4293e, ')');
    }
}
