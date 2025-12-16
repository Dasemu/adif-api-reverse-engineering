package l3;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class p extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i, long j4) {
        super(str, true);
        this.f7425e = qVar;
        this.f7426f = i;
        this.f7427g = j4;
    }

    @Override // h3.a
    public final long a() {
        q qVar = this.f7425e;
        try {
            qVar.f7448w.a0(this.f7426f, this.f7427g);
            return -1L;
        } catch (IOException e4) {
            qVar.e(e4);
            return -1L;
        }
    }
}
