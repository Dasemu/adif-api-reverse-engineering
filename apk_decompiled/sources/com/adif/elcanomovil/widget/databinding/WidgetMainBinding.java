package com.adif.elcanomovil.widget.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.adif.elcanomovil.widget.R;

/* loaded from: classes3.dex */
public final class WidgetMainBinding {
    public final ItemWidgetEmptyBinding appwidgetEmptyView;
    public final ItemWidgetCirculationHeaderBinding appwidgetInfoHeader;
    public final ListView appwidgetListview;
    public final WidgetMainHeaderBinding circulationStationView;
    private final LinearLayout rootView;

    private WidgetMainBinding(LinearLayout linearLayout, ItemWidgetEmptyBinding itemWidgetEmptyBinding, ItemWidgetCirculationHeaderBinding itemWidgetCirculationHeaderBinding, ListView listView, WidgetMainHeaderBinding widgetMainHeaderBinding) {
        this.rootView = linearLayout;
        this.appwidgetEmptyView = itemWidgetEmptyBinding;
        this.appwidgetInfoHeader = itemWidgetCirculationHeaderBinding;
        this.appwidgetListview = listView;
        this.circulationStationView = widgetMainHeaderBinding;
    }

    public static WidgetMainBinding bind(View view) {
        View t2;
        int i = R.id.appwidget_empty_view;
        View t4 = AbstractC0105a.t(view, i);
        if (t4 != null) {
            ItemWidgetEmptyBinding bind = ItemWidgetEmptyBinding.bind(t4);
            i = R.id.appwidget_info_header;
            View t5 = AbstractC0105a.t(view, i);
            if (t5 != null) {
                ItemWidgetCirculationHeaderBinding bind2 = ItemWidgetCirculationHeaderBinding.bind(t5);
                i = R.id.appwidget_listview;
                ListView listView = (ListView) AbstractC0105a.t(view, i);
                if (listView != null && (t2 = AbstractC0105a.t(view, (i = R.id.circulation_station_view))) != null) {
                    return new WidgetMainBinding((LinearLayout) view, bind, bind2, listView, WidgetMainHeaderBinding.bind(t2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static WidgetMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.widget_main, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
