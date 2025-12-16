package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class FragmentAccessibilityBinding {
    public final TextView acercaButton;
    public final TextView communicationsButton;
    public final TextView declarationButton;
    public final Guideline guideline;
    public final TextView headerTextviewAbout;
    public final HeaderView headerViewAbout;
    public final ImageView imageView;
    public final TextView messageTextview;
    private final View rootView;

    private FragmentAccessibilityBinding(View view, TextView textView, TextView textView2, TextView textView3, Guideline guideline, TextView textView4, HeaderView headerView, ImageView imageView, TextView textView5) {
        this.rootView = view;
        this.acercaButton = textView;
        this.communicationsButton = textView2;
        this.declarationButton = textView3;
        this.guideline = guideline;
        this.headerTextviewAbout = textView4;
        this.headerViewAbout = headerView;
        this.imageView = imageView;
        this.messageTextview = textView5;
    }

    public static FragmentAccessibilityBinding bind(View view) {
        int i = R.id.acerca_button;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.communications_button;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.declaration_button;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.guideline;
                    Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline != null) {
                        i = R.id.header_textview_about;
                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                        if (textView4 != null) {
                            i = R.id.header_view_about;
                            HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                            if (headerView != null) {
                                i = R.id.imageView;
                                ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                if (imageView != null) {
                                    i = R.id.message_textview;
                                    TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView5 != null) {
                                        return new FragmentAccessibilityBinding(view, textView, textView2, textView3, guideline, textView4, headerView, imageView, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentAccessibilityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public View getRoot() {
        return this.rootView;
    }

    public static FragmentAccessibilityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_accessibility, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
