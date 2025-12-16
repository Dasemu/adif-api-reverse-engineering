package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5645b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5646c;

    public e() {
        Calendar c4 = w.c(null);
        this.f5644a = c4;
        this.f5645b = c4.getMaximum(7);
        this.f5646c = c4.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5645b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i4 = this.f5645b;
        if (i >= i4) {
            return null;
        }
        int i5 = i + this.f5646c;
        if (i5 > i4) {
            i5 -= i4;
        }
        return Integer.valueOf(i5);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i4 = i + this.f5646c;
        int i5 = this.f5645b;
        if (i4 > i5) {
            i4 -= i5;
        }
        Calendar calendar = this.f5644a;
        calendar.set(7, i4);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar c4 = w.c(null);
        this.f5644a = c4;
        this.f5645b = c4.getMaximum(7);
        this.f5646c = i;
    }
}
