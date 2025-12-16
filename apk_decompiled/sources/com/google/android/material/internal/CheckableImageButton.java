package com.google.android.material.internal;

import F0.g;
import O.X;
import W.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import m.C0493w;
import x2.C0658a;

/* loaded from: classes3.dex */
public class CheckableImageButton extends C0493w implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f5717g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f5718d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5719e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5720f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.adif.elcanomovil.R.attr.imageButtonStyle);
        this.f5719e = true;
        this.f5720f = true;
        X.j(this, new g(this, 5));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5718d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f5718d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f5717g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0658a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0658a c0658a = (C0658a) parcelable;
        super.onRestoreInstanceState(c0658a.f1880a);
        setChecked(c0658a.f8888c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, W.b, x2.a] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f8888c = this.f5718d;
        return bVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f5719e != z3) {
            this.f5719e = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f5719e || this.f5718d == z3) {
            return;
        }
        this.f5718d = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f5720f = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f5720f) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5718d);
    }
}
