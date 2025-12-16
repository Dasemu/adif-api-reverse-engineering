package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.utils.ui.BottomSheetListView;

/* loaded from: classes.dex */
public final class BottomSheetCategoriesBinding {
    public final BottomSheetListView listViewBtmSheet;
    private final LinearLayout rootView;

    private BottomSheetCategoriesBinding(LinearLayout linearLayout, BottomSheetListView bottomSheetListView) {
        this.rootView = linearLayout;
        this.listViewBtmSheet = bottomSheetListView;
    }

    public static BottomSheetCategoriesBinding bind(View view) {
        int i = R.id.listViewBtmSheet;
        BottomSheetListView bottomSheetListView = (BottomSheetListView) AbstractC0105a.t(view, i);
        if (bottomSheetListView != null) {
            return new BottomSheetCategoriesBinding((LinearLayout) view, bottomSheetListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetCategoriesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetCategoriesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_categories, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
