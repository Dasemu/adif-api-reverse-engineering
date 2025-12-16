package v0;

import android.os.Bundle;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C0518d;
import o.C0520f;
import o0.C0539p;

/* renamed from: v0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640e {

    /* renamed from: a, reason: collision with root package name */
    public final f f8635a;

    /* renamed from: b, reason: collision with root package name */
    public final C0639d f8636b = new C0639d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8637c;

    public C0640e(f fVar) {
        this.f8635a = fVar;
    }

    public final void a() {
        f fVar = this.f8635a;
        C lifecycle = fVar.getLifecycle();
        if (lifecycle.b() != B.f3281b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0636a(fVar));
        C0639d c0639d = this.f8636b;
        c0639d.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (c0639d.f8630b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0539p(c0639d, 2));
        c0639d.f8630b = true;
        this.f8637c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f8637c) {
            a();
        }
        C lifecycle = this.f8635a.getLifecycle();
        if (lifecycle.b().a(B.f3283d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        C0639d c0639d = this.f8636b;
        if (!c0639d.f8630b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0639d.f8632d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0639d.f8631c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0639d.f8632d = true;
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        C0639d c0639d = this.f8636b;
        c0639d.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0639d.f8631c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0520f c0520f = c0639d.f8629a;
        c0520f.getClass();
        C0518d c0518d = new C0518d(c0520f);
        c0520f.f7896c.put(c0518d, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(c0518d, "this.components.iteratorWithAdditions()");
        while (c0518d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0518d.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC0638c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
