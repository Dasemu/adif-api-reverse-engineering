package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiHome.R;

/* loaded from: classes2.dex */
public final class FakeTabViewBinding {
    public final Button buttonSheet;
    public final ConstraintLayout containerButtonSheet;
    private final ConstraintLayout rootView;
    public final ImageView sliderImageController;
    public final TextView userStationsTitle;

    private FakeTabViewBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.buttonSheet = button;
        this.containerButtonSheet = constraintLayout2;
        this.sliderImageController = imageView;
        this.userStationsTitle = textView;
    }

    public static FakeTabViewBinding bind(View view) {
        int i = R.id.buttonSheet;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.sliderImageController;
            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
            if (imageView != null) {
                i = R.id.userStationsTitle;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    return new FakeTabViewBinding(constraintLayout, button, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FakeTabViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FakeTabViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fake_tab_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
