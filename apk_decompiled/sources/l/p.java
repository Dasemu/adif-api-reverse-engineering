package l;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public h3.d f7291a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f7292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f7293c;

    public p(t tVar, ActionProvider actionProvider) {
        this.f7293c = tVar;
        this.f7292b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        h3.d dVar = this.f7291a;
        if (dVar != null) {
            m mVar = ((o) dVar.f6791b).f7279n;
            mVar.h = true;
            mVar.p(true);
        }
    }
}
