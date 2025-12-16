package l3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import r3.C0576h;

/* loaded from: classes3.dex */
public final class m extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0576h f7418g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i, C0576h c0576h, int i4, boolean z3) {
        super(str, true);
        this.f7416e = qVar;
        this.f7417f = i;
        this.f7418g = c0576h;
        this.h = i4;
    }

    @Override // h3.a
    public final long a() {
        try {
            B b4 = this.f7416e.f7437k;
            C0576h source = this.f7418g;
            int i = this.h;
            b4.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.l(i);
            this.f7416e.f7448w.Z(this.f7417f, EnumC0439b.CANCEL);
            synchronized (this.f7416e) {
                this.f7416e.f7450y.remove(Integer.valueOf(this.f7417f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
