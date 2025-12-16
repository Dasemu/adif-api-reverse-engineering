package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h extends AbstractC0232n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5652a;

    public h(k kVar) {
        this.f5652a = kVar;
        w.c(null);
        w.c(null);
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f5652a.getClass();
            throw null;
        }
    }
}
