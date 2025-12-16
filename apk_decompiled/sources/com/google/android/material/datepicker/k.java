package com.google.android.material.datepicker;

import O.X;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C0212d0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes3.dex */
public final class k<S> extends t {

    /* renamed from: b, reason: collision with root package name */
    public int f5658b;

    /* renamed from: c, reason: collision with root package name */
    public b f5659c;

    /* renamed from: d, reason: collision with root package name */
    public o f5660d;

    /* renamed from: e, reason: collision with root package name */
    public int f5661e;

    /* renamed from: f, reason: collision with root package name */
    public c f5662f;

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f5663g;
    public RecyclerView h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public View f5664j;

    /* renamed from: k, reason: collision with root package name */
    public View f5665k;

    /* renamed from: l, reason: collision with root package name */
    public View f5666l;

    public final void f(o oVar) {
        s sVar = (s) this.h.getAdapter();
        int d4 = sVar.f5709a.f5634a.d(oVar);
        int d5 = d4 - sVar.f5709a.f5634a.d(this.f5660d);
        boolean z3 = Math.abs(d5) > 3;
        boolean z4 = d5 > 0;
        this.f5660d = oVar;
        if (z3 && z4) {
            this.h.j0(d4 - 3);
            this.h.post(new H0.p(d4, 2, this));
        } else if (!z3) {
            this.h.post(new H0.p(d4, 2, this));
        } else {
            this.h.j0(d4 + 3);
            this.h.post(new H0.p(d4, 2, this));
        }
    }

    public final void g(int i) {
        this.f5661e = i;
        if (i == 2) {
            this.f5663g.getLayoutManager().v0(this.f5660d.f5695c - ((y) this.f5663g.getAdapter()).f5715a.f5659c.f5634a.f5695c);
            this.f5665k.setVisibility(0);
            this.f5666l.setVisibility(8);
            this.i.setVisibility(8);
            this.f5664j.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f5665k.setVisibility(8);
            this.f5666l.setVisibility(0);
            this.i.setVisibility(0);
            this.f5664j.setVisibility(0);
            f(this.f5660d);
        }
    }

    @Override // androidx.fragment.app.K
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5658b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5659c = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5660d = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.K
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i4;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f5658b);
        this.f5662f = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o oVar = this.f5659c.f5634a;
        if (m.i(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.adif.elcanomovil.R.layout.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i = com.adif.elcanomovil.R.layout.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.adif.elcanomovil.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.adif.elcanomovil.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = p.f5700d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.adif.elcanomovil.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.adif.elcanomovil.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.adif.elcanomovil.R.id.mtrl_calendar_days_of_week);
        X.j(gridView, new U.h(1));
        int i6 = this.f5659c.f5638e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new e(i6) : new e()));
        gridView.setNumColumns(oVar.f5696d);
        gridView.setEnabled(false);
        this.h = (RecyclerView) inflate.findViewById(com.adif.elcanomovil.R.id.mtrl_calendar_months);
        getContext();
        this.h.setLayoutManager(new g(this, i4, i4));
        this.h.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f5659c, new A.a(this, 24));
        this.h.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.adif.elcanomovil.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.adif.elcanomovil.R.id.mtrl_calendar_year_selector_frame);
        this.f5663g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5663g.setLayoutManager(new GridLayoutManager(integer));
            this.f5663g.setAdapter(new y(this));
            this.f5663g.i(new h(this));
        }
        if (inflate.findViewById(com.adif.elcanomovil.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.adif.elcanomovil.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            X.j(materialButton, new F0.g(this, 2));
            View findViewById = inflate.findViewById(com.adif.elcanomovil.R.id.month_navigation_previous);
            this.i = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.adif.elcanomovil.R.id.month_navigation_next);
            this.f5664j = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f5665k = inflate.findViewById(com.adif.elcanomovil.R.id.mtrl_calendar_year_selector_frame);
            this.f5666l = inflate.findViewById(com.adif.elcanomovil.R.id.mtrl_calendar_day_selector_frame);
            g(1);
            materialButton.setText(this.f5660d.c());
            this.h.k(new i(this, sVar, materialButton));
            materialButton.setOnClickListener(new j(this, 0));
            this.f5664j.setOnClickListener(new f(this, sVar, 1));
            this.i.setOnClickListener(new f(this, sVar, 0));
        }
        if (!m.i(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0212d0().a(this.h);
        }
        this.h.j0(sVar.f5709a.f5634a.d(this.f5660d));
        X.j(this.h, new U.h(2));
        return inflate;
    }

    @Override // androidx.fragment.app.K
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5658b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5659c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5660d);
    }
}
