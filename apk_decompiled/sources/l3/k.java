package l3;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class k extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, q qVar, int i, int i4) {
        super(str, true);
        this.f7411e = qVar;
        this.f7412f = i;
        this.f7413g = i4;
    }

    @Override // h3.a
    public final long a() {
        int i = this.f7412f;
        int i4 = this.f7413g;
        q qVar = this.f7411e;
        qVar.getClass();
        try {
            qVar.f7448w.Y(i, i4, true);
            return -1L;
        } catch (IOException e4) {
            qVar.e(e4);
            return -1L;
        }
    }
}
