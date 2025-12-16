package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.C0239r0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.R;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class s extends AbstractC0220h0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a f5710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5711c;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, A.a aVar) {
        o oVar = bVar.f5634a;
        o oVar2 = bVar.f5637d;
        if (oVar.f5693a.compareTo(oVar2.f5693a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (oVar2.f5693a.compareTo(bVar.f5635b.f5693a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5711c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f5700d) + (m.i(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f5709a = bVar;
        this.f5710b = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final int getItemCount() {
        return this.f5709a.f5640g;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final long getItemId(int i) {
        Calendar a2 = w.a(this.f5709a.f5634a.f5693a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a4 = w.a(a2);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        return a4.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void onBindViewHolder(I0 i02, int i) {
        r rVar = (r) i02;
        b bVar = this.f5709a;
        Calendar a2 = w.a(bVar.f5634a.f5693a);
        a2.add(2, i);
        o oVar = new o(a2);
        rVar.f5707a.setText(oVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f5708b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f5702a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final I0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.i(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0239r0(-1, this.f5711c));
        return new r(linearLayout, true);
    }
}
