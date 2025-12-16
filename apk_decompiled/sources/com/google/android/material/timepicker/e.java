package com.google.android.material.timepicker;

import E2.j;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adif.elcanomovil.R;
import h2.AbstractC0379a;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final F2.f f5912a;

    /* renamed from: b, reason: collision with root package name */
    public int f5913b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.g f5914c;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        E2.g gVar = new E2.g();
        this.f5914c = gVar;
        E2.h hVar = new E2.h(0.5f);
        j e4 = gVar.f400a.f386a.e();
        e4.f422e = hVar;
        e4.f423f = hVar;
        e4.f424g = hVar;
        e4.h = hVar;
        gVar.setShapeAppearanceModel(e4.a());
        this.f5914c.j(ColorStateList.valueOf(-1));
        E2.g gVar2 = this.f5914c;
        WeakHashMap weakHashMap = X.f1226a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6775x, R.attr.materialClockStyle, 0);
        this.f5913b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5912a = new F2.f(this, 8);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = X.f1226a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            F2.f fVar = this.f5912a;
            handler.removeCallbacks(fVar);
            handler.post(fVar);
        }
    }

    public abstract void i();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            F2.f fVar = this.f5912a;
            handler.removeCallbacks(fVar);
            handler.post(fVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f5914c.j(ColorStateList.valueOf(i));
    }
}
