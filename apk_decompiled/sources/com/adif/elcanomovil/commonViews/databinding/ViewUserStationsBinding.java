package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;
import com.adif.elcanomovil.commonViews.StationOptionView;

/* loaded from: classes.dex */
public final class ViewUserStationsBinding {
    public final ConstraintLayout layoutHeader;
    private final ConstraintLayout rootView;
    public final StationOptionView userStationHome;
    public final StationOptionView userStationWork;
    public final ImageButton userStationsActionMore;
    public final TextView userStationsTitle;

    private ViewUserStationsBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, StationOptionView stationOptionView, StationOptionView stationOptionView2, ImageButton imageButton, TextView textView) {
        this.rootView = constraintLayout;
        this.layoutHeader = constraintLayout2;
        this.userStationHome = stationOptionView;
        this.userStationWork = stationOptionView2;
        this.userStationsActionMore = imageButton;
        this.userStationsTitle = textView;
    }

    public static ViewUserStationsBinding bind(View view) {
        int i = R.id.layoutHeader;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
        if (constraintLayout != null) {
            i = R.id.userStationHome;
            StationOptionView stationOptionView = (StationOptionView) AbstractC0105a.t(view, i);
            if (stationOptionView != null) {
                i = R.id.userStationWork;
                StationOptionView stationOptionView2 = (StationOptionView) AbstractC0105a.t(view, i);
                if (stationOptionView2 != null) {
                    i = R.id.userStationsActionMore;
                    ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
                    if (imageButton != null) {
                        i = R.id.userStationsTitle;
                        TextView textView = (TextView) AbstractC0105a.t(view, i);
                        if (textView != null) {
                            return new ViewUserStationsBinding((ConstraintLayout) view, constraintLayout, stationOptionView, stationOptionView2, imageButton, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewUserStationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewUserStationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_user_stations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
