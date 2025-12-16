package l3;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends h3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7419e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7421g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, List list) {
        super(str, true);
        this.f7420f = qVar;
        this.f7421g = i;
        this.h = list;
    }

    @Override // h3.a
    public final long a() {
        switch (this.f7419e) {
            case 0:
                B b4 = this.f7420f.f7437k;
                List responseHeaders = this.h;
                b4.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    this.f7420f.f7448w.Z(this.f7421g, EnumC0439b.CANCEL);
                    synchronized (this.f7420f) {
                        this.f7420f.f7450y.remove(Integer.valueOf(this.f7421g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                B b5 = this.f7420f.f7437k;
                List requestHeaders = this.h;
                b5.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f7420f.f7448w.Z(this.f7421g, EnumC0439b.CANCEL);
                    synchronized (this.f7420f) {
                        this.f7420f.f7450y.remove(Integer.valueOf(this.f7421g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i, List list, boolean z3) {
        super(str, true);
        this.f7420f = qVar;
        this.f7421g = i;
        this.h = list;
    }
}
