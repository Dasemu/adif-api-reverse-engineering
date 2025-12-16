package X1;

import android.content.Context;
import d2.j;
import f0.C0338b;

/* loaded from: classes3.dex */
public final class e implements Y1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2019a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2020b;

    public /* synthetic */ e(Object obj, int i) {
        this.f2019a = i;
        this.f2020b = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f2019a) {
            case 0:
                return new d((Context) ((e) this.f2020b).f2020b, new C0338b(3), new C0338b(2));
            case 1:
                String packageName = ((Context) ((e) this.f2020b).f2020b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new j((Context) ((e) this.f2020b).f2020b, Integer.valueOf(j.f6192d).intValue(), "com.google.android.datatransport.events");
            default:
                return this.f2020b;
        }
    }
}
