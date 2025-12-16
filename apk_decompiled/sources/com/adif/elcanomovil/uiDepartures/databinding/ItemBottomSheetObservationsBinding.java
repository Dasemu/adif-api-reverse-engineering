package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ItemBottomSheetObservationsBinding {
    public final TextView observationsBottomsheetItemStation;
    public final TextView observationsBottomsheetItemText;
    public final ImageView observationsIconType;
    private final ConstraintLayout rootView;

    private ItemBottomSheetObservationsBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.observationsBottomsheetItemStation = textView;
        this.observationsBottomsheetItemText = textView2;
        this.observationsIconType = imageView;
    }

    public static ItemBottomSheetObservationsBinding bind(View view) {
        int i = R.id.observations_bottomsheet_item_station;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.observations_bottomsheet_item_text;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.observations_icon_type;
                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                if (imageView != null) {
                    return new ItemBottomSheetObservationsBinding((ConstraintLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemBottomSheetObservationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBottomSheetObservationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_bottom_sheet_observations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
