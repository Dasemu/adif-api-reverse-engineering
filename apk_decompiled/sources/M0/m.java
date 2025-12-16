package M0;

import J0.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public final p f1111a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1112b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.g f1113c;

    public m(p pVar, String str, J0.g gVar) {
        this.f1111a = pVar;
        this.f1112b = str;
        this.f1113c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f1111a, mVar.f1111a) && Intrinsics.areEqual(this.f1112b, mVar.f1112b) && this.f1113c == mVar.f1113c;
    }

    public final int hashCode() {
        int hashCode = this.f1111a.hashCode() * 31;
        String str = this.f1112b;
        return this.f1113c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
