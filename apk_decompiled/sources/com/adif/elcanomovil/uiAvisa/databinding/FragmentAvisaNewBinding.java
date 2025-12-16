package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes.dex */
public final class FragmentAvisaNewBinding {
    public final TextView categoryButton;
    public final MaterialButton createIssueButton;
    public final AppCompatButton createIssueCategory;
    public final AppCompatEditText createIssueDescription;
    public final PictureGridView createIssueGrid;
    public final AppCompatButton createIssueStation;
    public final SwitchMaterial createIssueSwitch;
    public final HeaderView headerAvisaIssue;
    public final ProgressBar loadingView;
    public final ConstraintLayout loadingViewContainer;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView2;
    public final TextView title;

    private FragmentAvisaNewBinding(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, AppCompatButton appCompatButton, AppCompatEditText appCompatEditText, PictureGridView pictureGridView, AppCompatButton appCompatButton2, SwitchMaterial switchMaterial, HeaderView headerView, ProgressBar progressBar, ConstraintLayout constraintLayout2, ScrollView scrollView, TextView textView2) {
        this.rootView = constraintLayout;
        this.categoryButton = textView;
        this.createIssueButton = materialButton;
        this.createIssueCategory = appCompatButton;
        this.createIssueDescription = appCompatEditText;
        this.createIssueGrid = pictureGridView;
        this.createIssueStation = appCompatButton2;
        this.createIssueSwitch = switchMaterial;
        this.headerAvisaIssue = headerView;
        this.loadingView = progressBar;
        this.loadingViewContainer = constraintLayout2;
        this.scrollView2 = scrollView;
        this.title = textView2;
    }

    public static FragmentAvisaNewBinding bind(View view) {
        int i = R.id.category_button;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.create_issue_button;
            MaterialButton materialButton = (MaterialButton) AbstractC0105a.t(view, i);
            if (materialButton != null) {
                i = R.id.create_issue_category;
                AppCompatButton appCompatButton = (AppCompatButton) AbstractC0105a.t(view, i);
                if (appCompatButton != null) {
                    i = R.id.create_issue_description;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) AbstractC0105a.t(view, i);
                    if (appCompatEditText != null) {
                        i = R.id.create_issue_grid;
                        PictureGridView pictureGridView = (PictureGridView) AbstractC0105a.t(view, i);
                        if (pictureGridView != null) {
                            i = R.id.create_issue_station;
                            AppCompatButton appCompatButton2 = (AppCompatButton) AbstractC0105a.t(view, i);
                            if (appCompatButton2 != null) {
                                i = R.id.create_issue_switch;
                                SwitchMaterial switchMaterial = (SwitchMaterial) AbstractC0105a.t(view, i);
                                if (switchMaterial != null) {
                                    i = R.id.headerAvisaIssue;
                                    HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
                                    if (headerView != null) {
                                        i = R.id.loading_view;
                                        ProgressBar progressBar = (ProgressBar) AbstractC0105a.t(view, i);
                                        if (progressBar != null) {
                                            i = R.id.loading_view_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
                                            if (constraintLayout != null) {
                                                i = R.id.scrollView2;
                                                ScrollView scrollView = (ScrollView) AbstractC0105a.t(view, i);
                                                if (scrollView != null) {
                                                    i = R.id.title;
                                                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                                    if (textView2 != null) {
                                                        return new FragmentAvisaNewBinding((ConstraintLayout) view, textView, materialButton, appCompatButton, appCompatEditText, pictureGridView, appCompatButton2, switchMaterial, headerView, progressBar, constraintLayout, scrollView, textView2);
                                                    }
                                                }
                                            }
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

    public static FragmentAvisaNewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAvisaNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_avisa_new, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
