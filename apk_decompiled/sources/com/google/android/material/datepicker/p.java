package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.adif.elcanomovil.R;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class p extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5700d = w.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f5701e = (w.c(null).getMaximum(7) + w.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final o f5702a;

    /* renamed from: b, reason: collision with root package name */
    public c f5703b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5704c;

    public p(o oVar, b bVar) {
        this.f5702a = oVar;
        this.f5704c = bVar;
        throw null;
    }

    public final int a() {
        int i = this.f5704c.f5638e;
        o oVar = this.f5702a;
        Calendar calendar = oVar.f5693a;
        int i4 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i5 = i4 - i;
        return i5 < 0 ? i5 + oVar.f5696d : i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a2 = (i - a()) + 1;
        Calendar a4 = w.a(this.f5702a.f5693a);
        a4.set(5, a2);
        return Long.valueOf(a4.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f5702a.f5697e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f5701e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f5702a.f5696d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f5703b == null) {
            this.f5703b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            o oVar = this.f5702a;
            if (a2 < oVar.f5697e) {
                textView.setTag(oVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a2 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                w.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            w.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
