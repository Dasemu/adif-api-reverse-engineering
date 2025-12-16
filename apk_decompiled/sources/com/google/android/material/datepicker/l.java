package com.google.android.material.datepicker;

import O.D0;
import O.InterfaceC0080v;
import android.view.View;

/* loaded from: classes3.dex */
public final class l implements InterfaceC0080v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5667a;

    /* renamed from: b, reason: collision with root package name */
    public int f5668b;

    /* renamed from: c, reason: collision with root package name */
    public int f5669c;

    public l(View view) {
        this.f5667a = view;
    }

    @Override // O.InterfaceC0080v
    public D0 g(View view, D0 d02) {
        int i = d02.f1207a.f(7).f559b;
        View view2 = (View) this.f5667a;
        int i4 = this.f5668b;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f5669c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return d02;
    }

    public l() {
        this.f5667a = new l[256];
        this.f5668b = 0;
        this.f5669c = 0;
    }

    public l(int i, int i4) {
        this.f5667a = null;
        this.f5668b = i;
        int i5 = i4 & 7;
        this.f5669c = i5 == 0 ? 8 : i5;
    }

    public l(View view, int i, int i4) {
        this.f5668b = i;
        this.f5667a = view;
        this.f5669c = i4;
    }
}
