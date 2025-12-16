package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import com.adif.elcanomovil.commonViews.EmptyCirculationsView;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class FragmentStationsPageServicesBinding {
    public final ServiceBinding accessibility;
    public final ImageView addFavourite;
    public final ImageView avisa;
    public final ConstraintLayout banner;
    public final TextView bannerDescription;
    public final ImageView bannerImage;
    public final TextView bannerTitle;
    public final ImageView centerCameraMap;
    public final ServiceBinding ecomiles;
    public final ServiceBinding intermodality;
    public final LinearLayout linearLayout;
    public final EmptyCirculationsView loadingEmptyOrErrorCommonView;
    public final TextView location;
    public final LinearLayout locationLayout;
    public final FragmentContainerView map;
    public final NestedScrollView nestedScroll;
    public final TextView openingHours;
    public final LinearLayout openingHoursLayout;
    private final ConstraintLayout rootView;
    public final ServiceBinding stationServices;
    public final TextView title;
    public final LinearLayout viewNotEmptyStation;

    private FragmentStationsPageServicesBinding(ConstraintLayout constraintLayout, ServiceBinding serviceBinding, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView3, TextView textView2, ImageView imageView4, ServiceBinding serviceBinding2, ServiceBinding serviceBinding3, LinearLayout linearLayout, EmptyCirculationsView emptyCirculationsView, TextView textView3, LinearLayout linearLayout2, FragmentContainerView fragmentContainerView, NestedScrollView nestedScrollView, TextView textView4, LinearLayout linearLayout3, ServiceBinding serviceBinding4, TextView textView5, LinearLayout linearLayout4) {
        this.rootView = constraintLayout;
        this.accessibility = serviceBinding;
        this.addFavourite = imageView;
        this.avisa = imageView2;
        this.banner = constraintLayout2;
        this.bannerDescription = textView;
        this.bannerImage = imageView3;
        this.bannerTitle = textView2;
        this.centerCameraMap = imageView4;
        this.ecomiles = serviceBinding2;
        this.intermodality = serviceBinding3;
        this.linearLayout = linearLayout;
        this.loadingEmptyOrErrorCommonView = emptyCirculationsView;
        this.location = textView3;
        this.locationLayout = linearLayout2;
        this.map = fragmentContainerView;
        this.nestedScroll = nestedScrollView;
        this.openingHours = textView4;
        this.openingHoursLayout = linearLayout3;
        this.stationServices = serviceBinding4;
        this.title = textView5;
        this.viewNotEmptyStation = linearLayout4;
    }

    public static FragmentStationsPageServicesBinding bind(View view) {
        View t2;
        View t4;
        int i = R.id.accessibility;
        View t5 = AbstractC0105a.t(view, i);
        if (t5 != null) {
            ServiceBinding bind = ServiceBinding.bind(t5);
            i = R.id.add_favourite;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null) {
                i = R.id.avisa;
                ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                if (imageView2 != null) {
                    i = R.id.banner;
                    ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                    if (constraintLayout != null) {
                        i = R.id.banner_description;
                        TextView textView = (TextView) AbstractC0105a.t(view, i);
                        if (textView != null) {
                            i = R.id.banner_image;
                            ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView3 != null) {
                                i = R.id.banner_title;
                                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                if (textView2 != null) {
                                    i = R.id.center_camera_map;
                                    ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView4 != null && (t2 = AbstractC0105a.t(view, (i = R.id.ecomiles))) != null) {
                                        ServiceBinding bind2 = ServiceBinding.bind(t2);
                                        i = R.id.intermodality;
                                        View t6 = AbstractC0105a.t(view, i);
                                        if (t6 != null) {
                                            ServiceBinding bind3 = ServiceBinding.bind(t6);
                                            i = R.id.linearLayout;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.loading_empty_or_error_common_view;
                                                EmptyCirculationsView emptyCirculationsView = (EmptyCirculationsView) AbstractC0105a.t(view, i);
                                                if (emptyCirculationsView != null) {
                                                    i = R.id.location;
                                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.location_layout;
                                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.map;
                                                            FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC0105a.t(view, i);
                                                            if (fragmentContainerView != null) {
                                                                i = R.id.nested_scroll;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC0105a.t(view, i);
                                                                if (nestedScrollView != null) {
                                                                    i = R.id.opening_hours;
                                                                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                                                    if (textView4 != null) {
                                                                        i = R.id.opening_hours_layout;
                                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC0105a.t(view, i);
                                                                        if (linearLayout3 != null && (t4 = AbstractC0105a.t(view, (i = R.id.station_services))) != null) {
                                                                            ServiceBinding bind4 = ServiceBinding.bind(t4);
                                                                            i = R.id.title;
                                                                            TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                                            if (textView5 != null) {
                                                                                i = R.id.view_not_empty_station;
                                                                                LinearLayout linearLayout4 = (LinearLayout) AbstractC0105a.t(view, i);
                                                                                if (linearLayout4 != null) {
                                                                                    return new FragmentStationsPageServicesBinding((ConstraintLayout) view, bind, imageView, imageView2, constraintLayout, textView, imageView3, textView2, imageView4, bind2, bind3, linearLayout, emptyCirculationsView, textView3, linearLayout2, fragmentContainerView, nestedScrollView, textView4, linearLayout3, bind4, textView5, linearLayout4);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static FragmentStationsPageServicesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStationsPageServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stations_page_services, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
