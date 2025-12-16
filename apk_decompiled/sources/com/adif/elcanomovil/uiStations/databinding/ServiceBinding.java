package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ServiceBinding {
    public final LinearLayout layout;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextView title;

    private ServiceBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.layout = linearLayout2;
        this.rv = recyclerView;
        this.title = textView;
    }

    public static ServiceBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
        if (recyclerView != null) {
            i = R.id.title;
            TextView textView = (TextView) AbstractC0105a.t(view, i);
            if (textView != null) {
                return new ServiceBinding(linearLayout, linearLayout, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.service, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
