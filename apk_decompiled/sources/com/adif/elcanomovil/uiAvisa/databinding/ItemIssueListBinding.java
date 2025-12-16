package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adif.elcanomovil.uiAvisa.R;

/* loaded from: classes.dex */
public final class ItemIssueListBinding {
    public final TextView itemDescription;
    public final TextView itemDescriptionDate;
    public final TextView itemFixingTitle;
    public final TextView itemId;
    public final TextView itemStation;
    public final TextView itemStatus;
    private final LinearLayout rootView;

    private ItemIssueListBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.itemDescription = textView;
        this.itemDescriptionDate = textView2;
        this.itemFixingTitle = textView3;
        this.itemId = textView4;
        this.itemStation = textView5;
        this.itemStatus = textView6;
    }

    public static ItemIssueListBinding bind(View view) {
        int i = R.id.item_description;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.item_description_date;
            TextView textView2 = (TextView) AbstractC0105a.t(view, i);
            if (textView2 != null) {
                i = R.id.item_fixing_title;
                TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                if (textView3 != null) {
                    i = R.id.item_id;
                    TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                    if (textView4 != null) {
                        i = R.id.item_station;
                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                        if (textView5 != null) {
                            i = R.id.item_status;
                            TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                            if (textView6 != null) {
                                return new ItemIssueListBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemIssueListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemIssueListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_issue_list, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
