package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class FragmentStationsPageComercialBinding {
    public final ExpandableItemStationsPageCommercialBinding groceryStore;
    public final ExpandableItemStationsPageCommercialBinding leisure;
    public final EmptyCirculationsView loadingEmptyOrErrorCommonView;
    public final ExpandableItemStationsPageCommercialBinding others;
    public final ExpandableItemStationsPageCommercialBinding rentACar;
    public final ExpandableItemStationsPageCommercialBinding restaurant;
    private final NestedScrollView rootView;
    public final RecyclerView rvOffers;
    public final ExpandableItemStationsPageCommercialBinding shop;
    public final ExpandableItemStationsPageCommercialBinding souvenir;
    public final LinearLayoutCompat viewNotEmptyStation;

    private FragmentStationsPageComercialBinding(NestedScrollView nestedScrollView, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding2, EmptyCirculationsView emptyCirculationsView, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding3, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding4, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding5, RecyclerView recyclerView, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding6, ExpandableItemStationsPageCommercialBinding expandableItemStationsPageCommercialBinding7, LinearLayoutCompat linearLayoutCompat) {
        this.rootView = nestedScrollView;
        this.groceryStore = expandableItemStationsPageCommercialBinding;
        this.leisure = expandableItemStationsPageCommercialBinding2;
        this.loadingEmptyOrErrorCommonView = emptyCirculationsView;
        this.others = expandableItemStationsPageCommercialBinding3;
        this.rentACar = expandableItemStationsPageCommercialBinding4;
        this.restaurant = expandableItemStationsPageCommercialBinding5;
        this.rvOffers = recyclerView;
        this.shop = expandableItemStationsPageCommercialBinding6;
        this.souvenir = expandableItemStationsPageCommercialBinding7;
        this.viewNotEmptyStation = linearLayoutCompat;
    }

    public static FragmentStationsPageComercialBinding bind(View view) {
        View t2;
        View t4;
        int i = R.id.grocery_store;
        View t5 = AbstractC0105a.t(view, i);
        if (t5 != null) {
            ExpandableItemStationsPageCommercialBinding bind = ExpandableItemStationsPageCommercialBinding.bind(t5);
            i = R.id.leisure;
            View t6 = AbstractC0105a.t(view, i);
            if (t6 != null) {
                ExpandableItemStationsPageCommercialBinding bind2 = ExpandableItemStationsPageCommercialBinding.bind(t6);
                i = R.id.loading_empty_or_error_common_view;
                EmptyCirculationsView emptyCirculationsView = (EmptyCirculationsView) AbstractC0105a.t(view, i);
                if (emptyCirculationsView != null && (t2 = AbstractC0105a.t(view, (i = R.id.others))) != null) {
                    ExpandableItemStationsPageCommercialBinding bind3 = ExpandableItemStationsPageCommercialBinding.bind(t2);
                    i = R.id.rent_a_car;
                    View t7 = AbstractC0105a.t(view, i);
                    if (t7 != null) {
                        ExpandableItemStationsPageCommercialBinding bind4 = ExpandableItemStationsPageCommercialBinding.bind(t7);
                        i = R.id.restaurant;
                        View t8 = AbstractC0105a.t(view, i);
                        if (t8 != null) {
                            ExpandableItemStationsPageCommercialBinding bind5 = ExpandableItemStationsPageCommercialBinding.bind(t8);
                            i = R.id.rv_offers;
                            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                            if (recyclerView != null && (t4 = AbstractC0105a.t(view, (i = R.id.shop))) != null) {
                                ExpandableItemStationsPageCommercialBinding bind6 = ExpandableItemStationsPageCommercialBinding.bind(t4);
                                i = R.id.souvenir;
                                View t9 = AbstractC0105a.t(view, i);
                                if (t9 != null) {
                                    ExpandableItemStationsPageCommercialBinding bind7 = ExpandableItemStationsPageCommercialBinding.bind(t9);
                                    i = R.id.view_not_empty_station;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AbstractC0105a.t(view, i);
                                    if (linearLayoutCompat != null) {
                                        return new FragmentStationsPageComercialBinding((NestedScrollView) view, bind, bind2, emptyCirculationsView, bind3, bind4, bind5, recyclerView, bind6, bind7, linearLayoutCompat);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentStationsPageComercialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationsPageComercialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stations_page_comercial, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
