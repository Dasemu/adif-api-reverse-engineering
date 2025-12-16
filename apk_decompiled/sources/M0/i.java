package M0;

import S0.o;
import android.net.Uri;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f1093b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1094c;

    public i(Lazy lazy, Lazy lazy2, boolean z3) {
        this.f1092a = lazy;
        this.f1093b = lazy2;
        this.f1094c = z3;
    }

    @Override // M0.f
    public final g a(Object obj, o oVar) {
        Uri uri = (Uri) obj;
        if (Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https")) {
            return new l(uri.toString(), oVar, this.f1092a, this.f1093b, this.f1094c);
        }
        return null;
    }
}
