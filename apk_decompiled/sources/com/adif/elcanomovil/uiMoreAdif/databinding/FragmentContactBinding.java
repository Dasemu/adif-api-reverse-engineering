package com.adif.elcanomovil.uiMoreAdif.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.uiMoreAdif.R;

/* loaded from: classes2.dex */
public final class FragmentContactBinding {
    public final TextView headerTextviewContact;
    public final HeaderView headerViewContact;
    public final TextView hours;
    public final ImageView imageView;
    public final ImageView ivFacebook;
    public final ImageView ivInstagram;
    public final ImageView ivTwitter;
    private final View rootView;
    public final TextView tvFollowUs;
    public final TextView tvWeb;

    private FragmentContactBinding(View view, TextView textView, HeaderView headerView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView3, TextView textView4) {
        this.rootView = view;
        this.headerTextviewContact = textView;
        this.headerViewContact = headerView;
        this.hours = textView2;
        this.imageView = imageView;
        this.ivFacebook = imageView2;
        this.ivInstagram = imageView3;
        this.ivTwitter = imageView4;
        this.tvFollowUs = textView3;
        this.tvWeb = textView4;
    }

    public static FragmentContactBinding bind(View view) {
        int i = R.id.header_textview_contact;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.header_view_contact;
            HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
            if (headerView != null) {
                i = R.id.hours;
                TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                if (textView2 != null) {
                    i = R.id.imageView;
                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                    if (imageView != null) {
                        i = R.id.iv_facebook;
                        ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                        if (imageView2 != null) {
                            i = R.id.iv_instagram;
                            ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                            if (imageView3 != null) {
                                i = R.id.iv_twitter;
                                ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                                if (imageView4 != null) {
                                    i = R.id.tv_follow_us;
                                    TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tv_web;
                                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView4 != null) {
                                            return new FragmentContactBinding(view, textView, headerView, textView2, imageView, imageView2, imageView3, imageView4, textView3, textView4);
                                        }
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

    public static FragmentContactBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public View getRoot() {
        return this.rootView;
    }

    public static FragmentContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contact, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
