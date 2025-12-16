package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class FragmentWizardFirstBinding {
    public final ImageView imgWizard;
    private final LinearLayout rootView;
    public final LinearLayout wizardBackground;

    private FragmentWizardFirstBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.imgWizard = imageView;
        this.wizardBackground = linearLayout2;
    }

    public static FragmentWizardFirstBinding bind(View view) {
        int i = R.id.imgWizard;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new FragmentWizardFirstBinding(linearLayout, imageView, linearLayout);
    }

    public static FragmentWizardFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWizardFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wizard_first, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
