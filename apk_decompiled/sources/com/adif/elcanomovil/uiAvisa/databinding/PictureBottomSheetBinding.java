package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class PictureBottomSheetBinding {
    public final AppCompatButton bottomSheetCamera;
    public final AppCompatButton bottomSheetGallery;
    private final LinearLayout rootView;

    private PictureBottomSheetBinding(LinearLayout linearLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2) {
        this.rootView = linearLayout;
        this.bottomSheetCamera = appCompatButton;
        this.bottomSheetGallery = appCompatButton2;
    }

    public static PictureBottomSheetBinding bind(View view) {
        int i = R.id.bottom_sheet_camera;
        AppCompatButton appCompatButton = (AppCompatButton) AbstractC0105a.t(view, i);
        if (appCompatButton != null) {
            i = R.id.bottom_sheet_gallery;
            AppCompatButton appCompatButton2 = (AppCompatButton) AbstractC0105a.t(view, i);
            if (appCompatButton2 != null) {
                return new PictureBottomSheetBinding((LinearLayout) view, appCompatButton, appCompatButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PictureBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PictureBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.picture_bottom_sheet, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
