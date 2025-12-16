package com.google.android.material.datepicker;

import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.X;

/* loaded from: classes3.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f5650E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f5651F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i, int i4) {
        super(i);
        this.f5651F = kVar;
        this.f5650E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0238q0
    public final void F0(RecyclerView recyclerView, int i) {
        X x3 = new X(recyclerView.getContext());
        x3.f3768a = i;
        G0(x3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void I0(E0 e02, int[] iArr) {
        int i = this.f5650E;
        k kVar = this.f5651F;
        if (i == 0) {
            iArr[0] = kVar.h.getWidth();
            iArr[1] = kVar.h.getWidth();
        } else {
            iArr[0] = kVar.h.getHeight();
            iArr[1] = kVar.h.getHeight();
        }
    }
}
