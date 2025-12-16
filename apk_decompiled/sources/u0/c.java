package u0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8603c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8604d;

    /* renamed from: e, reason: collision with root package name */
    public final List f8605e;

    public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f8601a = referenceTable;
        this.f8602b = onDelete;
        this.f8603c = onUpdate;
        this.f8604d = columnNames;
        this.f8605e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.f8601a, cVar.f8601a) && Intrinsics.areEqual(this.f8602b, cVar.f8602b) && Intrinsics.areEqual(this.f8603c, cVar.f8603c) && Intrinsics.areEqual(this.f8604d, cVar.f8604d)) {
            return Intrinsics.areEqual(this.f8605e, cVar.f8605e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8605e.hashCode() + ((this.f8604d.hashCode() + com.google.android.gms.measurement.internal.a.d(this.f8603c, com.google.android.gms.measurement.internal.a.d(this.f8602b, this.f8601a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.f8601a);
        sb.append("', onDelete='");
        sb.append(this.f8602b);
        sb.append(" +', onUpdate='");
        sb.append(this.f8603c);
        sb.append("', columnNames=");
        sb.append(this.f8604d);
        sb.append(", referenceColumnNames=");
        return com.google.android.gms.measurement.internal.a.o(sb, this.f8605e, '}');
    }
}
