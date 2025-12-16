package com.adif.elcanomovil.uiHome.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiHome.R;

/* loaded from: classes2.dex */
public final class ViewUserFavoritesBinding {
    public final RecyclerView recycleViewFavouriteStations;
    private final ConstraintLayout rootView;
    public final ImageButton userFavoritesActionMore;
    public final TextView userFavoritesTitle;
    public final TextView viewFavouriteStationsEmpty;

    private ViewUserFavoritesBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageButton imageButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.recycleViewFavouriteStations = recyclerView;
        this.userFavoritesActionMore = imageButton;
        this.userFavoritesTitle = textView;
        this.viewFavouriteStationsEmpty = textView2;
    }

    public static ViewUserFavoritesBinding bind(View view) {
        int i = R.id.recycleViewFavouriteStations;
        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
        if (recyclerView != null) {
            i = R.id.userFavoritesActionMore;
            ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
            if (imageButton != null) {
                i = R.id.userFavoritesTitle;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.viewFavouriteStationsEmpty;
                    TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                    if (textView2 != null) {
                        return new ViewUserFavoritesBinding((ConstraintLayout) view, recyclerView, imageButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewUserFavoritesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewUserFavoritesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.view_user_favorites, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
