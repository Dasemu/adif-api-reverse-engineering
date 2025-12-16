package B2;

import a.AbstractC0106b;
import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class a extends AbstractC0106b {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f210a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.d f211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f212c;

    public a(h3.d dVar, Typeface typeface) {
        this.f210a = typeface;
        this.f211b = dVar;
    }

    @Override // a.AbstractC0106b
    public final void y(int i) {
        if (this.f212c) {
            return;
        }
        x2.b bVar = (x2.b) this.f211b.f6791b;
        if (bVar.j(this.f210a)) {
            bVar.h(false);
        }
    }

    @Override // a.AbstractC0106b
    public final void z(Typeface typeface, boolean z3) {
        if (this.f212c) {
            return;
        }
        x2.b bVar = (x2.b) this.f211b.f6791b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
