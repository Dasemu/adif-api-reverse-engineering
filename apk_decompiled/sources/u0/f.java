package u0;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f8614a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f8615b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8616c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f8617d;

    public f(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f8614a = name;
        this.f8615b = columns;
        this.f8616c = foreignKeys;
        this.f8617d = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f4, code lost:
    
        r0 = kotlin.collections.SetsKt.build(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f8, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r3, null);
        r9 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u0.f a(x0.c r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.f.a(x0.c, java.lang.String):u0.f");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(this.f8614a, fVar.f8614a) || !Intrinsics.areEqual(this.f8615b, fVar.f8615b) || !Intrinsics.areEqual(this.f8616c, fVar.f8616c)) {
            return false;
        }
        Set set2 = this.f8617d;
        if (set2 == null || (set = fVar.f8617d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        return this.f8616c.hashCode() + ((this.f8615b.hashCode() + (this.f8614a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f8614a + "', columns=" + this.f8615b + ", foreignKeys=" + this.f8616c + ", indices=" + this.f8617d + '}';
    }
}
