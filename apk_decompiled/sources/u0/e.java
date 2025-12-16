package u0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8610a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8611b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8612c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8613d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public e(String name, boolean z3, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f8610a = name;
        this.f8611b = z3;
        this.f8612c = columns;
        this.f8613d = orders;
        List list = orders;
        if (list.isEmpty()) {
            int size = columns.size();
            list = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list.add("ASC");
            }
        }
        this.f8613d = (List) list;
    }

    public final boolean equals(Object obj) {
        boolean startsWith$default;
        boolean startsWith$default2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f8611b != eVar.f8611b || !Intrinsics.areEqual(this.f8612c, eVar.f8612c) || !Intrinsics.areEqual(this.f8613d, eVar.f8613d)) {
            return false;
        }
        String str = this.f8610a;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, null);
        String str2 = eVar.f8610a;
        if (!startsWith$default) {
            return Intrinsics.areEqual(str, str2);
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str2, "index_", false, 2, null);
        return startsWith$default2;
    }

    public final int hashCode() {
        boolean startsWith$default;
        String str = this.f8610a;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, null);
        return this.f8613d.hashCode() + ((this.f8612c.hashCode() + ((((startsWith$default ? -1184239155 : str.hashCode()) * 31) + (this.f8611b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f8610a + "', unique=" + this.f8611b + ", columns=" + this.f8612c + ", orders=" + this.f8613d + "'}";
    }
}
