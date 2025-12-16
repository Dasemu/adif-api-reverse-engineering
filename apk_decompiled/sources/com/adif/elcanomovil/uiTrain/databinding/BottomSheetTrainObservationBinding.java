package com.adif.elcanomovil.uiTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiTrain.R;

/* loaded from: classes3.dex */
public final class BottomSheetTrainObservationBinding {
    public final TextView observationBottomsheetText;
    public final ConstraintLayout observationsBottomsheet;
    public final TextView observationsBottomsheetItemStation;
    public final TextView observationsBottomsheetTitle;
    public final ImageView observationsIconType;
    private final LinearLayoutCompat rootView;
    public final ImageView sliderImageController;

    private BottomSheetTrainObservationBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayoutCompat;
        this.observationBottomsheetText = textView;
        this.observationsBottomsheet = constraintLayout;
        this.observationsBottomsheetItemStation = textView2;
        this.observationsBottomsheetTitle = textView3;
        this.observationsIconType = imageView;
        this.sliderImageController = imageView2;
    }

    public static BottomSheetTrainObservationBinding bind(View view) {
        int i = R.id.observation_bottomsheet_text;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.observations_bottomsheet;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null) {
                i = R.id.observations_bottomsheet_item_station;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.observations_bottomsheet_title;
                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                    if (textView3 != null) {
                        i = R.id.observations_icon_type;
                        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView != null) {
                            i = R.id.sliderImageController;
                            ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView2 != null) {
                                return new BottomSheetTrainObservationBinding((LinearLayoutCompat) view, textView, constraintLayout, textView2, textView3, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetTrainObservationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetTrainObservationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_train_observation, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
