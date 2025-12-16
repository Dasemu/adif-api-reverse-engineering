package com.adif.elcanomovil.uiSelectTrain.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import com.adif.elcanomovil.uiSelectTrain.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class FragmentSelectTrainBinding {
    public final ImageButton btnBack;
    public final TextInputLayout inputLayout;
    public final ConstraintLayout layoutSearchResults;
    public final TextView layoutSearchResultsTitle;
    public final RecyclerView layoutSearchResultsView;
    public final LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorView;
    private final ConstraintLayout rootView;
    public final TextInputEditText searchBox;

    private FragmentSelectTrainBinding(ConstraintLayout constraintLayout, ImageButton imageButton, TextInputLayout textInputLayout, ConstraintLayout constraintLayout2, TextView textView, RecyclerView recyclerView, LoadingEmptyOrErrorCommonViewBinding loadingEmptyOrErrorCommonViewBinding, TextInputEditText textInputEditText) {
        this.rootView = constraintLayout;
        this.btnBack = imageButton;
        this.inputLayout = textInputLayout;
        this.layoutSearchResults = constraintLayout2;
        this.layoutSearchResultsTitle = textView;
        this.layoutSearchResultsView = recyclerView;
        this.loadingEmptyOrErrorView = loadingEmptyOrErrorCommonViewBinding;
        this.searchBox = textInputEditText;
    }

    public static FragmentSelectTrainBinding bind(View view) {
        View t2;
        int i = R.id.btnBack;
        ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
        if (imageButton != null) {
            i = R.id.inputLayout;
            TextInputLayout textInputLayout = (TextInputLayout) AbstractC0105a.t(view, i);
            if (textInputLayout != null) {
                i = R.id.layoutSearchResults;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                if (constraintLayout != null) {
                    i = R.id.layoutSearchResultsTitle;
                    TextView textView = (TextView) AbstractC0105a.t(view, i);
                    if (textView != null) {
                        i = R.id.layoutSearchResultsView;
                        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                        if (recyclerView != null && (t2 = AbstractC0105a.t(view, (i = R.id.loading_empty_or_error_view))) != null) {
                            LoadingEmptyOrErrorCommonViewBinding bind = LoadingEmptyOrErrorCommonViewBinding.bind(t2);
                            i = R.id.searchBox;
                            TextInputEditText textInputEditText = (TextInputEditText) AbstractC0105a.t(view, i);
                            if (textInputEditText != null) {
                                return new FragmentSelectTrainBinding((ConstraintLayout) view, imageButton, textInputLayout, constraintLayout, textView, recyclerView, bind, textInputEditText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentSelectTrainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSelectTrainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_train, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
