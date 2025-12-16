package y2;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b.C0253b;

/* loaded from: classes3.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0663b f8990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8991b;

    public d(e eVar, InterfaceC0663b interfaceC0663b) {
        this.f8991b = eVar;
        this.f8990a = interfaceC0663b;
    }

    public final void onBackCancelled() {
        if (this.f8991b.f8989a != null) {
            this.f8990a.d();
        }
    }

    public final void onBackInvoked() {
        this.f8990a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f8991b.f8989a != null) {
            this.f8990a.c(new C0253b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f8991b.f8989a != null) {
            this.f8990a.b(new C0253b(backEvent));
        }
    }
}
