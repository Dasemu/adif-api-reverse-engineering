package com.adif.elcanomovil.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.R;

/* loaded from: classes.dex */
public final class FragmentSplashBinding {
    public final ImageView animationView;
    private final ConstraintLayout rootView;

    private FragmentSplashBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.animationView = imageView;
    }

    public static FragmentSplashBinding bind(View view) {
        ImageView imageView = (ImageView) AbstractC0105a.t(view, R.id.animation_view);
        if (imageView != null) {
            return new FragmentSplashBinding((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.animation_view)));
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_splash, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
