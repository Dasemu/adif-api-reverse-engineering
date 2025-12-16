package B0;

import java.util.ArrayList;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034l extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0036n f152e;

    public C0034l(C0036n c0036n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f152e = c0036n;
        this.f148a = obj;
        this.f149b = arrayList;
        this.f150c = obj2;
        this.f151d = arrayList2;
    }

    @Override // B0.y, B0.v
    public final void a(x xVar) {
        C0036n c0036n = this.f152e;
        Object obj = this.f148a;
        if (obj != null) {
            c0036n.z(obj, this.f149b, null);
        }
        Object obj2 = this.f150c;
        if (obj2 != null) {
            c0036n.z(obj2, this.f151d, null);
        }
    }

    @Override // B0.y, B0.v
    public final void c(x xVar) {
        xVar.A(this);
    }
}
