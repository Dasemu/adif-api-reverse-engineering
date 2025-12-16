package S0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1518b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.g f1519c;

    /* renamed from: d, reason: collision with root package name */
    public final Q0.b f1520d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1521e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1522f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1523g;

    public r(Drawable drawable, j jVar, J0.g gVar, Q0.b bVar, String str, boolean z3, boolean z4) {
        this.f1517a = drawable;
        this.f1518b = jVar;
        this.f1519c = gVar;
        this.f1520d = bVar;
        this.f1521e = str;
        this.f1522f = z3;
        this.f1523g = z4;
    }

    @Override // S0.k
    public final Drawable a() {
        return this.f1517a;
    }

    @Override // S0.k
    public final j b() {
        return this.f1518b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.f1517a, rVar.f1517a)) {
            return Intrinsics.areEqual(this.f1518b, rVar.f1518b) && this.f1519c == rVar.f1519c && Intrinsics.areEqual(this.f1520d, rVar.f1520d) && Intrinsics.areEqual(this.f1521e, rVar.f1521e) && this.f1522f == rVar.f1522f && this.f1523g == rVar.f1523g;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1519c.hashCode() + ((this.f1518b.hashCode() + (this.f1517a.hashCode() * 31)) * 31)) * 31;
        Q0.b bVar = this.f1520d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f1521e;
        return Boolean.hashCode(this.f1523g) + C.w.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f1522f);
    }
}
