package com.adif.elcanomovil.uiDialog;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5049a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationsDialogFragment f5050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5051c;

    public /* synthetic */ f(StationsDialogFragment stationsDialogFragment, String str) {
        this.f5050b = stationsDialogFragment;
        this.f5051c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5049a) {
            case 0:
                StationsDialogFragment.k(this.f5050b, this.f5051c, view);
                return;
            default:
                StationsDialogFragment.h(this.f5050b, this.f5051c, view);
                return;
        }
    }

    public /* synthetic */ f(String str, StationsDialogFragment stationsDialogFragment) {
        this.f5051c = str;
        this.f5050b = stationsDialogFragment;
    }
}
