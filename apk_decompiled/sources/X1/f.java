package X1;

import F.i;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f2021a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2022b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2023c;

    public f(Context context, d dVar) {
        i iVar = new i(context);
        this.f2023c = new HashMap();
        this.f2021a = iVar;
        this.f2022b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f2023c.containsKey(str)) {
            return (h) this.f2023c.get(str);
        }
        CctBackendFactory t2 = this.f2021a.t(str);
        if (t2 == null) {
            return null;
        }
        d dVar = this.f2022b;
        h create = t2.create(new b(dVar.f2016a, dVar.f2017b, dVar.f2018c, str));
        this.f2023c.put(str, create);
        return create;
    }
}
