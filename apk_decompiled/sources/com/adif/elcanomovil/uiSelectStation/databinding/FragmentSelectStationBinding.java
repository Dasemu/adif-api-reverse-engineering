package com.adif.elcanomovil.uiSelectStation.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.StationOptionView;
import com.adif.elcanomovil.commonViews.UserStationsView;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.uiSelectStation.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class FragmentSelectStationBinding {
    public final ImageButton btnBack;
    public final TextInputLayout inputLayout;
    public final ConstraintLayout layoutNearStation;
    public final TextView layoutNearStationTitle;
    public final StationOptionView layoutNearStationView;
    public final RecyclerView layoutRecentSearchesView;
    public final ConstraintLayout layoutSearchResults;
    public final TextView layoutSearchResultsTitle;
    public final RecyclerView layoutSearchResultsView;
    public final LoadingEmptyOrErrorCommonViewBinding layoutSearchsEmpty;
    public final ConstraintLayout layoutSuggestedStation;
    public final UserStationsView layoutUserStationsView;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollSearchResults;
    public final TextInputEditText searchBox;

    private FragmentSelectStationBinding(ConstraintLayout constraintLayout, ImageButton imageButton, TextInputLayout textInputLayout, ConstraintLayout constraintLayout2, TextView textView, StationOptionView stationOptionView, RecyclerView recyclerView, ConstraintLayout constraintLayout3, TextView textView2, RecyclerView recyclerView2, LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding, ConstraintLayout constraintLayout4, UserStationsView userStationsView, NestedScrollView nestedScrollView, TextInputEditText textInputEditText) {
        this.rootView = constraintLayout;
        this.btnBack = imageButton;
        this.inputLayout = textInputLayout;
        this.layoutNearStation = constraintLayout2;
        this.layoutNearStationTitle = textView;
        this.layoutNearStationView = stationOptionView;
        this.layoutRecentSearchesView = recyclerView;
        this.layoutSearchResults = constraintLayout3;
        this.layoutSearchResultsTitle = textView2;
        this.layoutSearchResultsView = recyclerView2;
        this.layoutSearchsEmpty = loadingEmptyOrErrorCommonViewBinding;
        this.layoutSuggestedStation = constraintLayout4;
        this.layoutUserStationsView = userStationsView;
        this.scrollSearchResults = nestedScrollView;
        this.searchBox = textInputEditText;
    }

    public static FragmentSelectStationBinding bind(View view) {
        View t2;
        int i = R.id.btnBack;
        ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
        if (imageButton != null) {
            i = R.id.inputLayout;
            TextInputLayout textInputLayout = (TextInputLayout) AbstractC0105a.t(view, i);
            if (textInputLayout != null) {
                i = R.id.layoutNearStation;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                if (constraintLayout != null) {
                    i = R.id.layoutNearStationTitle;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.layoutNearStationView;
                        StationOptionView stationOptionView = (StationOptionView) AbstractC0105a.t(view, i);
                        if (stationOptionView != null) {
                            i = R.id.layoutRecentSearchesView;
                            RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                            if (recyclerView != null) {
                                i = R.id.layoutSearchResults;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC0105a.t(view, i);
                                if (constraintLayout2 != null) {
                                    i = R.id.layoutSearchResultsTitle;
                                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView2 != null) {
                                        i = R.id.layoutSearchResultsView;
                                        RecyclerView recyclerView2 = (RecyclerView) AbstractC0105a.t(view, i);
                                        if (recyclerView2 != null && (t2 = AbstractC0105a.t(view, (i = R.id.layoutSearchsEmpty))) != null) {
                                            LoadingEmptyOrErrorCommonViewBinding bind = LoadingEmptyOrErrorCommonViewBinding.bind(t2);
                                            i = R.id.layoutSuggestedStation;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC0105a.t(view, i);
                                            if (constraintLayout3 != null) {
                                                i = R.id.layoutUserStationsView;
                                                UserStationsView userStationsView = (UserStationsView) AbstractC0105a.t(view, i);
                                                if (userStationsView != null) {
                                                    i = R.id.scrollSearchResults;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) AbstractC0105a.t(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.searchBox;
                                                        TextInputEditText textInputEditText = (TextInputEditText) AbstractC0105a.t(view, i);
                                                        if (textInputEditText != null) {
                                                            return new FragmentSelectStationBinding((ConstraintLayout) view, imageButton, textInputLayout, constraintLayout, textView, stationOptionView, recyclerView, constraintLayout2, textView2, recyclerView2, bind, constraintLayout3, userStationsView, nestedScrollView, textInputEditText);
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

    public static FragmentSelectStationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSelectStationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_station, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
