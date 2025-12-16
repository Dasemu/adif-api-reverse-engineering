package l3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7424g;
    public final /* synthetic */ EnumC0439b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, q qVar, int i, EnumC0439b enumC0439b, int i4) {
        super(str, true);
        this.f7422e = i4;
        this.f7423f = qVar;
        this.f7424g = i;
        this.h = enumC0439b;
    }

    @Override // h3.a
    public final long a() {
        switch (this.f7422e) {
            case 0:
                B b4 = this.f7423f.f7437k;
                EnumC0439b errorCode = this.h;
                b4.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f7423f) {
                    this.f7423f.f7450y.remove(Integer.valueOf(this.f7424g));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            default:
                q qVar = this.f7423f;
                try {
                    int i = this.f7424g;
                    EnumC0439b statusCode = this.h;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    qVar.f7448w.Z(i, statusCode);
                } catch (IOException e4) {
                    qVar.e(e4);
                }
                return -1L;
        }
    }
}
