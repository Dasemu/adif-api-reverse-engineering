package com.google.android.material.switchmaterial;

import K2.a;
import O.L;
import O.X;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import java.util.WeakHashMap;
import m.J0;
import m3.d;
import w2.C0651a;
import x2.m;

/* loaded from: classes3.dex */
public class SwitchMaterial extends J0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final int[][] f5758a0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: T, reason: collision with root package name */
    public final C0651a f5759T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f5760U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f5761V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5762W;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.adif.elcanomovil.R.attr.switchStyle, 2132018312), attributeSet);
        Context context2 = getContext();
        this.f5759T = new C0651a(context2);
        int[] iArr = AbstractC0379a.f6749C;
        m.a(context2, attributeSet, com.adif.elcanomovil.R.attr.switchStyle, 2132018312);
        m.b(context2, attributeSet, iArr, com.adif.elcanomovil.R.attr.switchStyle, 2132018312, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.adif.elcanomovil.R.attr.switchStyle, 2132018312);
        this.f5762W = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f5760U == null) {
            int t2 = d.t(this, com.adif.elcanomovil.R.attr.colorSurface);
            int t4 = d.t(this, com.adif.elcanomovil.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.adif.elcanomovil.R.dimen.mtrl_switch_thumb_elevation);
            C0651a c0651a = this.f5759T;
            if (c0651a.f8806a) {
                float f2 = BitmapDescriptorFactory.HUE_RED;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = X.f1226a;
                    f2 += L.i((View) parent);
                }
                dimension += f2;
            }
            int a2 = c0651a.a(t2, dimension);
            this.f5760U = new ColorStateList(f5758a0, new int[]{d.y(1.0f, t2, t4), a2, d.y(0.38f, t2, t4), a2});
        }
        return this.f5760U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f5761V == null) {
            int t2 = d.t(this, com.adif.elcanomovil.R.attr.colorSurface);
            int t4 = d.t(this, com.adif.elcanomovil.R.attr.colorControlActivated);
            int t5 = d.t(this, com.adif.elcanomovil.R.attr.colorOnSurface);
            this.f5761V = new ColorStateList(f5758a0, new int[]{d.y(0.54f, t2, t4), d.y(0.32f, t2, t5), d.y(0.12f, t2, t4), d.y(0.12f, t2, t5)});
        }
        return this.f5761V;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5762W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f5762W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f5762W = z3;
        if (z3) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
