package Z2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Z2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0100h extends AbstractC0104l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0093a f2264c = new C0093a(2);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0104l f2265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2266b;

    public C0100h(AbstractC0104l abstractC0104l, int i) {
        this.f2266b = i;
        this.f2265a = abstractC0104l;
    }

    @Override // Z2.AbstractC0104l
    public Object fromJson(r rVar) {
        Collection arrayList;
        switch (this.f2266b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        rVar.d();
        while (rVar.Y()) {
            arrayList.add(this.f2265a.fromJson(rVar));
        }
        rVar.s();
        return arrayList;
    }

    @Override // Z2.AbstractC0104l
    public void toJson(x xVar, Object obj) {
        xVar.d();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f2265a.toJson(xVar, it.next());
        }
        xVar.x();
    }

    public final String toString() {
        return this.f2265a + ".collection()";
    }
}
