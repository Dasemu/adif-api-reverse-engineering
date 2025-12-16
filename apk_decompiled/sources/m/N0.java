package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7598b;

    public /* synthetic */ N0(Toolbar toolbar, int i) {
        this.f7597a = i;
        this.f7598b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7597a) {
            case 0:
                Q0 q02 = this.f7598b.f2472M;
                l.o oVar = q02 == null ? null : q02.f7604b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f7598b.n();
                return;
        }
    }
}
