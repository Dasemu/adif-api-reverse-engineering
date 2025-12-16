package com.adif.elcanomovil.commonViews.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.commonViews.R;

/* loaded from: classes.dex */
public final class CorporateCirculationInfoBinding {
    private final ConstraintLayout rootView;
    public final TextView tvCtc;
    public final TextView tvCtcLabel;
    public final TextView tvOper;
    public final TextView tvOperLabel;
    public final TextView tvPlan;
    public final TextView tvPlanLabel;
    public final TextView tvSitra;
    public final TextView tvSitraLabel;
    public final TextView tvTechnician;
    public final TextView tvTechnicianLabel;

    private CorporateCirculationInfoBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = constraintLayout;
        this.tvCtc = textView;
        this.tvCtcLabel = textView2;
        this.tvOper = textView3;
        this.tvOperLabel = textView4;
        this.tvPlan = textView5;
        this.tvPlanLabel = textView6;
        this.tvSitra = textView7;
        this.tvSitraLabel = textView8;
        this.tvTechnician = textView9;
        this.tvTechnicianLabel = textView10;
    }

    public static CorporateCirculationInfoBinding bind(View view) {
        int i = R.id.tv_ctc;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.tv_ctc_label;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.tv_oper;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.tv_oper_label;
                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                    if (textView4 != null) {
                        i = R.id.tv_plan;
                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                        if (textView5 != null) {
                            i = R.id.tv_plan_label;
                            TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                            if (textView6 != null) {
                                i = R.id.tv_sitra;
                                TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                if (textView7 != null) {
                                    i = R.id.tv_sitra_label;
                                    TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                    if (textView8 != null) {
                                        i = R.id.tv_technician;
                                        TextView textView9 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView9 != null) {
                                            i = R.id.tv_technician_label;
                                            TextView textView10 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView10 != null) {
                                                return new CorporateCirculationInfoBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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

    public static CorporateCirculationInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CorporateCirculationInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.corporate_circulation_info, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
