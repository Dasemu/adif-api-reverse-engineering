package K0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f980a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f983d;

    public b(g gVar, c cVar) {
        this.f983d = gVar;
        this.f980a = cVar;
        gVar.getClass();
        this.f982c = new boolean[2];
    }

    public final void a(boolean z3) {
        g gVar = this.f983d;
        synchronized (gVar) {
            try {
                if (this.f981b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.areEqual(this.f980a.f990g, this)) {
                    g.d(gVar, this, z3);
                }
                this.f981b = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z b(int i) {
        z zVar;
        g gVar = this.f983d;
        synchronized (gVar) {
            if (this.f981b) {
                throw new IllegalStateException("editor is closed");
            }
            this.f982c[i] = true;
            Object obj = this.f980a.f987d.get(i);
            e eVar = gVar.p;
            z file = (z) obj;
            if (!eVar.c(file)) {
                Intrinsics.checkNotNullParameter(file, "file");
                W0.f.a(eVar.g(file));
            }
            zVar = (z) obj;
        }
        return zVar;
    }
}
