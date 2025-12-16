package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class LoadingEmptyOrErrorCommonViewBinding {
    public final ImageView iconNoResults;
    public final ProgressBar loading;
    public final LinearLayout loadingOrError;
    public final TextView message;
    private final LinearLayout rootView;
    public final TextView title;

    private LoadingEmptyOrErrorCommonViewBinding(LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.iconNoResults = imageView;
        this.loading = progressBar;
        this.loadingOrError = linearLayout2;
        this.message = textView;
        this.title = textView2;
    }

    public static LoadingEmptyOrErrorCommonViewBinding bind(View view) {
        int i = R.id.icon_no_results;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.loading;
            ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
            if (progressBar != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.message;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        return new LoadingEmptyOrErrorCommonViewBinding(linearLayout, imageView, progressBar, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LoadingEmptyOrErrorCommonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LoadingEmptyOrErrorCommonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.loading_empty_or_error_common_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
