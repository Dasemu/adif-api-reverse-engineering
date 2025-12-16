package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.BottomSheetListView;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class BottomSheetObservationsBinding {
    public final ConstraintLayout observationsBottomsheet;
    public final BottomSheetListView observationsBottomsheetListItem;
    public final TextView observationsBottomsheetTitle;
    private final LinearLayoutCompat rootView;
    public final ImageView sliderImageController;

    private BottomSheetObservationsBinding(LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout, BottomSheetListView bottomSheetListView, TextView textView, ImageView imageView) {
        this.rootView = linearLayoutCompat;
        this.observationsBottomsheet = constraintLayout;
        this.observationsBottomsheetListItem = bottomSheetListView;
        this.observationsBottomsheetTitle = textView;
        this.sliderImageController = imageView;
    }

    public static BottomSheetObservationsBinding bind(View view) {
        int i = R.id.observations_bottomsheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
        if (constraintLayout != null) {
            i = R.id.observations_bottomsheet_list_item;
            BottomSheetListView bottomSheetListView = (BottomSheetListView) AbstractC0105a.t(view, i);
            if (bottomSheetListView != null) {
                i = R.id.observations_bottomsheet_title;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.sliderImageController;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        return new BottomSheetObservationsBinding((LinearLayoutCompat) view, constraintLayout, bottomSheetListView, textView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetObservationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetObservationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_observations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
