package B2;

import a.AbstractC0106b;
import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class b extends F.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0106b f213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f214f;

    public b(d dVar, AbstractC0106b abstractC0106b) {
        this.f214f = dVar;
        this.f213e = abstractC0106b;
    }

    @Override // F.b
    public final void g(int i) {
        this.f214f.f229m = true;
        this.f213e.y(i);
    }

    @Override // F.b
    public final void h(Typeface typeface) {
        d dVar = this.f214f;
        dVar.f230n = Typeface.create(typeface, dVar.f221c);
        dVar.f229m = true;
        this.f213e.z(dVar.f230n, false);
    }
}
