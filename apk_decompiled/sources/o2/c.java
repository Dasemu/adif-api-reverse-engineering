package o2;

import android.view.View;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f8087a;

    public c(e eVar) {
        this.f8087a = eVar;
    }

    @Override // o2.a
    public final void onSlide(View view, float f2) {
    }

    @Override // o2.a
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            this.f8087a.cancel();
        }
    }
}
