package b;

import androidx.lifecycle.H;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements H, InterfaceC0254c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.C f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4147b;

    /* renamed from: c, reason: collision with root package name */
    public z f4148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4149d;

    public y(B b4, androidx.lifecycle.C lifecycle, r onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f4149d = b4;
        this.f4146a = lifecycle;
        this.f4147b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // b.InterfaceC0254c
    public final void cancel() {
        this.f4146a.c(this);
        this.f4147b.removeCancellable(this);
        z zVar = this.f4148c;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f4148c = null;
    }

    @Override // androidx.lifecycle.H
    public final void onStateChanged(J source, androidx.lifecycle.A event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.A.ON_START) {
            this.f4148c = this.f4149d.b(this.f4147b);
            return;
        }
        if (event != androidx.lifecycle.A.ON_STOP) {
            if (event == androidx.lifecycle.A.ON_DESTROY) {
                cancel();
            }
        } else {
            z zVar = this.f4148c;
            if (zVar != null) {
                zVar.cancel();
            }
        }
    }
}
