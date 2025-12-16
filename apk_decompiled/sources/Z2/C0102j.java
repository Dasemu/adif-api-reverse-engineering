package Z2;

/* renamed from: Z2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0102j extends AbstractC0104l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0104l f2268b;

    public /* synthetic */ C0102j(AbstractC0104l abstractC0104l, int i) {
        this.f2267a = i;
        this.f2268b = abstractC0104l;
    }

    @Override // Z2.AbstractC0104l
    public final Object fromJson(r rVar) {
        switch (this.f2267a) {
            case 0:
                return this.f2268b.fromJson(rVar);
            case 1:
                boolean z3 = rVar.f2284e;
                rVar.f2284e = true;
                try {
                    return this.f2268b.fromJson(rVar);
                } finally {
                    rVar.f2284e = z3;
                }
            default:
                boolean z4 = rVar.f2285f;
                rVar.f2285f = true;
                try {
                    return this.f2268b.fromJson(rVar);
                } finally {
                    rVar.f2285f = z4;
                }
        }
    }

    @Override // Z2.AbstractC0104l
    public final boolean isLenient() {
        switch (this.f2267a) {
            case 0:
                return this.f2268b.isLenient();
            case 1:
                return true;
            default:
                return this.f2268b.isLenient();
        }
    }

    @Override // Z2.AbstractC0104l
    public final void toJson(x xVar, Object obj) {
        switch (this.f2267a) {
            case 0:
                boolean z3 = xVar.f2310g;
                xVar.f2310g = true;
                try {
                    this.f2268b.toJson(xVar, obj);
                    return;
                } finally {
                    xVar.f2310g = z3;
                }
            case 1:
                boolean z4 = xVar.f2309f;
                xVar.f2309f = true;
                try {
                    this.f2268b.toJson(xVar, obj);
                    return;
                } finally {
                    xVar.f2309f = z4;
                }
            default:
                this.f2268b.toJson(xVar, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f2267a) {
            case 0:
                return this.f2268b + ".serializeNulls()";
            case 1:
                return this.f2268b + ".lenient()";
            default:
                return this.f2268b + ".failOnUnknown()";
        }
    }
}
