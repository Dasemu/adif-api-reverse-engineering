package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5649c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f5647a = i;
        this.f5649c = kVar;
        this.f5648b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5647a) {
            case 0:
                k kVar = this.f5649c;
                int T02 = ((LinearLayoutManager) kVar.h.getLayoutManager()).T0() - 1;
                if (T02 >= 0) {
                    Calendar a2 = w.a(this.f5648b.f5709a.f5634a.f5693a);
                    a2.add(2, T02);
                    kVar.f(new o(a2));
                    return;
                }
                return;
            default:
                k kVar2 = this.f5649c;
                int S02 = ((LinearLayoutManager) kVar2.h.getLayoutManager()).S0() + 1;
                if (S02 < kVar2.h.getAdapter().getItemCount()) {
                    Calendar a4 = w.a(this.f5648b.f5709a.f5634a.f5693a);
                    a4.add(2, S02);
                    kVar2.f(new o(a4));
                    return;
                }
                return;
        }
    }
}
