package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class n<S> extends t {

    /* renamed from: b, reason: collision with root package name */
    public int f5691b;

    /* renamed from: c, reason: collision with root package name */
    public b f5692c;

    @Override // androidx.fragment.app.K
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5691b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5692c = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.K
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f5691b));
        throw null;
    }

    @Override // androidx.fragment.app.K
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5691b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5692c);
    }
}
