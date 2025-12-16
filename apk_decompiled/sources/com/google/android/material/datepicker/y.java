package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class y extends AbstractC0220h0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f5715a;

    public y(k kVar) {
        this.f5715a = kVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final int getItemCount() {
        return this.f5715a.f5659c.f5639f;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final void onBindViewHolder(I0 i02, int i) {
        x xVar = (x) i02;
        k kVar = this.f5715a;
        int i4 = kVar.f5659c.f5634a.f5695c + i;
        xVar.f5714a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i4)));
        TextView textView = xVar.f5714a;
        Context context = textView.getContext();
        textView.setContentDescription(w.b().get(1) == i4 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i4)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i4)));
        c cVar = kVar.f5662f;
        if (w.b().get(1) == i4) {
            E2.e eVar = cVar.f5642b;
        } else {
            E2.e eVar2 = cVar.f5641a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public final I0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
