package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class BottomSheetFiltersBinding {
    public final CheckBox filterAllInfo;
    public final CheckBox filterAllStations;
    public final ConstraintLayout observationsBottomsheet;
    private final LinearLayoutCompat rootView;
    public final ImageView sliderImageController;

    private BottomSheetFiltersBinding(LinearLayoutCompat linearLayoutCompat, CheckBox checkBox, CheckBox checkBox2, ConstraintLayout constraintLayout, ImageView imageView) {
        this.rootView = linearLayoutCompat;
        this.filterAllInfo = checkBox;
        this.filterAllStations = checkBox2;
        this.observationsBottomsheet = constraintLayout;
        this.sliderImageController = imageView;
    }

    public static BottomSheetFiltersBinding bind(View view) {
        int i = R.id.filter_all_info;
        CheckBox checkBox = (CheckBox) AbstractC0105a.t(view, i);
        if (checkBox != null) {
            i = R.id.filter_all_stations;
            CheckBox checkBox2 = (CheckBox) AbstractC0105a.t(view, i);
            if (checkBox2 != null) {
                i = R.id.observations_bottomsheet;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                if (constraintLayout != null) {
                    i = R.id.sliderImageController;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        return new BottomSheetFiltersBinding((LinearLayoutCompat) view, checkBox, checkBox2, constraintLayout, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetFiltersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetFiltersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_filters, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
