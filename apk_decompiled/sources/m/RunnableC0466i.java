package m;

import android.view.View;
import l.InterfaceC0433k;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0466i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0462g f7666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0472l f7667b;

    public RunnableC0466i(C0472l c0472l, C0462g c0462g) {
        this.f7667b = c0472l;
        this.f7666a = c0462g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0433k interfaceC0433k;
        C0472l c0472l = this.f7667b;
        l.m mVar = c0472l.f7678c;
        if (mVar != null && (interfaceC0433k = mVar.f7245e) != null) {
            interfaceC0433k.i(mVar);
        }
        View view = (View) c0472l.h;
        if (view != null && view.getWindowToken() != null) {
            C0462g c0462g = this.f7666a;
            if (!c0462g.b()) {
                if (c0462g.f7307e != null) {
                    c0462g.d(0, 0, false, false);
                }
            }
            c0472l.f7692t = c0462g;
        }
        c0472l.f7694v = null;
    }
}
