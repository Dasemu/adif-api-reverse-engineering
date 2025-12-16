package com.adif.elcanomovil.uiStations.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.uiStations.R;

/* loaded from: classes2.dex */
public final class ItemStationsPageServicesBinding {
    public final Button button;
    public final ImageButton icon;
    public final ConstraintLayout itemLayout;
    public final TextView name;
    private final ConstraintLayout rootView;

    private ItemStationsPageServicesBinding(ConstraintLayout constraintLayout, Button button, ImageButton imageButton, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.button = button;
        this.icon = imageButton;
        this.itemLayout = constraintLayout2;
        this.name = textView;
    }

    public static ItemStationsPageServicesBinding bind(View view) {
        int i = R.id.button;
        Button button = (Button) AbstractC0105a.t(view, i);
        if (button != null) {
            i = R.id.icon;
            ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
            if (imageButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.name;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    return new ItemStationsPageServicesBinding(constraintLayout, button, imageButton, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemStationsPageServicesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemStationsPageServicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.item_stations_page_services, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
