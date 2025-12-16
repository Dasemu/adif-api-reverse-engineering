package com.adif.elcanomovil.uiDepartures.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.adif.elcanomovil.commonViews.databinding.CorporateCirculationInfoBinding;
import com.adif.elcanomovil.uiDepartures.R;

/* loaded from: classes2.dex */
public final class ItemCirculationCercaniasBinding {
    public final ImageView accessibility;
    public final ConstraintLayout clMainInfo;
    public final CorporateCirculationInfoBinding corporateInfo;
    public final Guideline guideline20;
    public final Guideline guideline75;
    public final Guideline guideline90;
    public final TextView line;
    public final CardView lineColor;
    public final ImageView logo;
    public final TextView notes;
    public final TextView platform;
    private final ConstraintLayout rootView;
    public final TextView station;
    public final LinearLayout stationInfo;
    public final TextView time;
    public final TextView warning;

    private ItemCirculationCercaniasBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, CorporateCirculationInfoBinding corporateCirculationInfoBinding, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView, CardView cardView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.accessibility = imageView;
        this.clMainInfo = constraintLayout2;
        this.corporateInfo = corporateCirculationInfoBinding;
        this.guideline20 = guideline;
        this.guideline75 = guideline2;
        this.guideline90 = guideline3;
        this.line = textView;
        this.lineColor = cardView;
        this.logo = imageView2;
        this.notes = textView2;
        this.platform = textView3;
        this.station = textView4;
        this.stationInfo = linearLayout;
        this.time = textView5;
        this.warning = textView6;
    }

    public static ItemCirculationCercaniasBinding bind(View view) {
        View t2;
        int i = R.id.accessibility;
        ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
        if (imageView != null) {
            i = R.id.cl_main_info;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0105a.t(view, i);
            if (constraintLayout != null && (t2 = AbstractC0105a.t(view, (i = R.id.corporate_info))) != null) {
                CorporateCirculationInfoBinding bind = CorporateCirculationInfoBinding.bind(t2);
                i = R.id.guideline20;
                Guideline guideline = (Guideline) AbstractC0105a.t(view, i);
                if (guideline != null) {
                    i = R.id.guideline75;
                    Guideline guideline2 = (Guideline) AbstractC0105a.t(view, i);
                    if (guideline2 != null) {
                        i = R.id.guideline90;
                        Guideline guideline3 = (Guideline) AbstractC0105a.t(view, i);
                        if (guideline3 != null) {
                            i = R.id.line;
                            TextView textView = (TextView) AbstractC0105a.t(view, i);
                            if (textView != null) {
                                i = R.id.lineColor;
                                CardView cardView = (CardView) AbstractC0105a.t(view, i);
                                if (cardView != null) {
                                    i = R.id.logo;
                                    ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.notes;
                                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView2 != null) {
                                            i = R.id.platform;
                                            TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView3 != null) {
                                                i = R.id.station;
                                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.station_info;
                                                    LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                                                    if (linearLayout != null) {
                                                        i = R.id.time;
                                                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView5 != null) {
                                                            i = R.id.warning;
                                                            TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                            if (textView6 != null) {
                                                                return new ItemCirculationCercaniasBinding((ConstraintLayout) view, imageView, constraintLayout, bind, guideline, guideline2, guideline3, textView, cardView, imageView2, textView2, textView3, textView4, linearLayout, textView5, textView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemCirculationCercaniasBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCirculationCercaniasBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_circulation_cercanias, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
