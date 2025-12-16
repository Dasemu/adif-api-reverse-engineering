package com.adif.elcanomovil.main;

import c.InterfaceC0274b;
import com.adif.elcanomovil.widget.Hilt_DeparturesWidgetConfigureActivity;
import g.AbstractActivityC0364k;

/* loaded from: classes.dex */
public final class q implements InterfaceC0274b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0364k f4563b;

    public /* synthetic */ q(AbstractActivityC0364k abstractActivityC0364k, int i) {
        this.f4562a = i;
        this.f4563b = abstractActivityC0364k;
    }

    @Override // c.InterfaceC0274b
    public final void a(b.o oVar) {
        switch (this.f4562a) {
            case 0:
                ((Hilt_MainActivity) this.f4563b).inject();
                return;
            case 1:
                ((Hilt_DeparturesWidgetConfigureActivity) this.f4563b).inject();
                return;
            default:
                AbstractActivityC0364k abstractActivityC0364k = this.f4563b;
                g.r delegate = abstractActivityC0364k.getDelegate();
                delegate.a();
                abstractActivityC0364k.getSavedStateRegistry().a("androidx:appcompat");
                delegate.e();
                return;
        }
    }
}
