package com.adif.elcanomovil.uiStations.main;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationsPageServicesFragment f5282b;

    public /* synthetic */ i(StationsPageServicesFragment stationsPageServicesFragment, int i) {
        this.f5281a = i;
        this.f5282b = stationsPageServicesFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5281a;
        StationsPageServicesFragment stationsPageServicesFragment = this.f5282b;
        switch (i) {
            case 0:
                StationsPageServicesFragment.j(stationsPageServicesFragment, view);
                return;
            case 1:
                StationsPageServicesFragment.i(stationsPageServicesFragment, view);
                return;
            default:
                StationsPageServicesFragment.h(stationsPageServicesFragment, view);
                return;
        }
    }
}
