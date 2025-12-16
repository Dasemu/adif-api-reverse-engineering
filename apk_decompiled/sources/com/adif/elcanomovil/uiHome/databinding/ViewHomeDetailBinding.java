package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.UserStationsView;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.views.StationNearView;
import com.adif.elcanomovil.uiHome.views.UserFavoritesView;

/* loaded from: classes2.dex */
public final class ViewHomeDetailBinding {
    public final ConstraintLayout layoutHomeDetail;
    public final StationNearView layoutNearStation;
    public final ViewHomeOffersBinding layoutStationOffers;
    public final UserFavoritesView layoutUserFavorites;
    public final UserStationsView layoutUserStations;
    private final ConstraintLayout rootView;
    public final ImageView sliderImageController;

    private ViewHomeDetailBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, StationNearView stationNearView, ViewHomeOffersBinding viewHomeOffersBinding, UserFavoritesView userFavoritesView, UserStationsView userStationsView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.layoutHomeDetail = constraintLayout2;
        this.layoutNearStation = stationNearView;
        this.layoutStationOffers = viewHomeOffersBinding;
        this.layoutUserFavorites = userFavoritesView;
        this.layoutUserStations = userStationsView;
        this.sliderImageController = imageView;
    }

    public static ViewHomeDetailBinding bind(View view) {
        View t2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.layoutNearStation;
        StationNearView stationNearView = (StationNearView) AbstractC0105a.t(view, i);
        if (stationNearView != null && (t2 = AbstractC0105a.t(view, (i = R.id.layoutStationOffers))) != null) {
            ViewHomeOffersBinding bind = ViewHomeOffersBinding.bind(t2);
            i = R.id.layoutUserFavorites;
            UserFavoritesView userFavoritesView = (UserFavoritesView) AbstractC0105a.t(view, i);
            if (userFavoritesView != null) {
                i = R.id.layoutUserStations;
                UserStationsView userStationsView = (UserStationsView) AbstractC0105a.t(view, i);
                if (userStationsView != null) {
                    i = R.id.sliderImageController;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        return new ViewHomeDetailBinding(constraintLayout, constraintLayout, stationNearView, bind, userFavoritesView, userStationsView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewHomeDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHomeDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_home_detail, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
