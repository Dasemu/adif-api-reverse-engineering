package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adif.elcanomovil.commonViews.BottomSheetListView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class BottomSheetListBinding {
    public final BottomSheetListView listViewBtmSheet;
    private final LinearLayout rootView;

    private BottomSheetListBinding(LinearLayout linearLayout, BottomSheetListView bottomSheetListView) {
        this.rootView = linearLayout;
        this.listViewBtmSheet = bottomSheetListView;
    }

    public static BottomSheetListBinding bind(View view) {
        int i = R.id.listViewBtmSheet;
        BottomSheetListView bottomSheetListView = (BottomSheetListView) AbstractC0105a.t(view, i);
        if (bottomSheetListView != null) {
            return new BottomSheetListBinding((LinearLayout) view, bottomSheetListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
