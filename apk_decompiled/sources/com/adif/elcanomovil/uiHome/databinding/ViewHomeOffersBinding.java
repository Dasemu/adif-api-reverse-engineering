package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.databinding.ViewBadgeBinding;
import com.adif.elcanomovil.uiHome.R;

/* loaded from: classes2.dex */
public final class ViewHomeOffersBinding {
    public final ViewBadgeBinding offersLayoutBadge;
    public final TextView offersSubtitle;
    public final TextView offersTitle;
    private final ConstraintLayout rootView;

    private ViewHomeOffersBinding(ConstraintLayout constraintLayout, ViewBadgeBinding viewBadgeBinding, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.offersLayoutBadge = viewBadgeBinding;
        this.offersSubtitle = textView;
        this.offersTitle = textView2;
    }

    public static ViewHomeOffersBinding bind(View view) {
        int i = R.id.offersLayoutBadge;
        View t2 = AbstractC0105a.t(view, i);
        if (t2 != null) {
            ViewBadgeBinding bind = ViewBadgeBinding.bind(t2);
            int i4 = R.id.offersSubtitle;
            TextView textView = (TextView) AbstractC0105a.t(view, i4);
            if (textView != null) {
                i4 = R.id.offersTitle;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i4);
                if (textView2 != null) {
                    return new ViewHomeOffersBinding((ConstraintLayout) view, bind, textView, textView2);
                }
            }
            i = i4;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewHomeOffersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewHomeOffersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_home_offers, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
