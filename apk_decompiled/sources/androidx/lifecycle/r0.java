package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import v0.C0639d;
import v0.InterfaceC0638c;

/* loaded from: classes.dex */
public final class r0 implements InterfaceC0638c {

    /* renamed from: a, reason: collision with root package name */
    public final C0639d f3424a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3425b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3426c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f3427d;

    public r0(C0639d savedStateRegistry, D0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f3424a = savedStateRegistry;
        this.f3427d = LazyKt.lazy(new J0.e(viewModelStoreOwner, 3));
    }

    @Override // v0.InterfaceC0638c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3426c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().f3428a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((n0) entry.getValue()).f3408e.a();
            if (!Intrinsics.areEqual(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f3425b = false;
        return bundle;
    }

    public final s0 b() {
        return (s0) this.f3427d.getValue();
    }

    public final void c() {
        if (this.f3425b) {
            return;
        }
        Bundle a2 = this.f3424a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3426c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a2 != null) {
            bundle.putAll(a2);
        }
        this.f3426c = bundle;
        this.f3425b = true;
        b();
    }
}
