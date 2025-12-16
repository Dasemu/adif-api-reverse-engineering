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
public final class FragmentAboutBinding {
    public final TextView conditionsButton;
    public final Guideline guideline;
    public final TextView headerTextviewAbout;
    public final HeaderView headerViewAbout;
    public final ImageView imageView;
    public final TextView messageTextview;
    private final View rootView;
    public final TextView termsButton;
    public final TextView versionTextview;

    private FragmentAboutBinding(View view, TextView textView, Guideline guideline, TextView textView2, HeaderView headerView, ImageView imageView, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = view;
        this.conditionsButton = textView;
        this.guideline = guideline;
        this.headerTextviewAbout = textView2;
        this.headerViewAbout = headerView;
        this.imageView = imageView;
        this.messageTextview = textView3;
        this.termsButton = textView4;
        this.versionTextview = textView5;
    }

    public static FragmentAboutBinding bind(View view) {
        int i = R.id.conditions_button;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.guideline;
            Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
            if (guideline != null) {
                i = R.id.header_textview_about;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.header_view_about;
                    HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                    if (headerView != null) {
                        i = R.id.imageView;
                        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView != null) {
                            i = R.id.message_textview;
                            TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                            if (textView3 != null) {
                                i = R.id.terms_button;
                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                if (textView4 != null) {
                                    i = R.id.version_textview;
                                    TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView5 != null) {
                                        return new FragmentAboutBinding(view, textView, guideline, textView2, headerView, imageView, textView3, textView4, textView5);
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

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public View getRoot() {
        return this.rootView;
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_about, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
