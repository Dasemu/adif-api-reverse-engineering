package I2;

import android.view.View;

/* renamed from: I2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0050a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f801b;

    public /* synthetic */ ViewOnFocusChangeListenerC0050a(r rVar, int i) {
        this.f800a = i;
        this.f801b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f800a) {
            case 0:
                C0053d c0053d = (C0053d) this.f801b;
                c0053d.t(c0053d.u());
                return;
            default:
                l lVar = (l) this.f801b;
                lVar.f829l = z3;
                lVar.q();
                if (z3) {
                    return;
                }
                lVar.t(false);
                lVar.f830m = false;
                return;
        }
    }
}
