package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes3.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f5705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5706b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f5706b = sVar;
        this.f5705a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f5705a;
        p a2 = materialCalendarGridView.a();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f5706b.f5710b.f7b).f5659c.f5636c.f5643a) {
            throw null;
        }
    }
}
