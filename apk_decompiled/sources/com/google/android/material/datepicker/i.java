package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5655c;

    public i(k kVar, s sVar, MaterialButton materialButton) {
        this.f5655c = kVar;
        this.f5653a = sVar;
        this.f5654b = materialButton;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f5654b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        k kVar = this.f5655c;
        int S02 = i < 0 ? ((LinearLayoutManager) kVar.h.getLayoutManager()).S0() : ((LinearLayoutManager) kVar.h.getLayoutManager()).T0();
        b bVar = this.f5653a.f5709a;
        Calendar a2 = w.a(bVar.f5634a.f5693a);
        a2.add(2, S02);
        kVar.f5660d = new o(a2);
        Calendar a4 = w.a(bVar.f5634a.f5693a);
        a4.add(2, S02);
        a4.set(5, 1);
        Calendar a5 = w.a(a4);
        a5.get(2);
        a5.get(1);
        a5.getMaximum(7);
        a5.getActualMaximum(5);
        a5.getTimeInMillis();
        long timeInMillis = a5.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = w.f5713a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f5654b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
