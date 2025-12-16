package com.google.android.material.timepicker;

import O.X;
import a.AbstractC0105a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.k;
import androidx.constraintlayout.widget.l;
import androidx.constraintlayout.widget.p;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.AbstractC0379a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class ClockFaceView extends e implements d {

    /* renamed from: d, reason: collision with root package name */
    public final ClockHandView f5884d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f5885e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f5886f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f5887g;
    public final SparseArray h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f5888j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f5889k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5890l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5891m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5892n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5893o;
    public final String[] p;

    /* renamed from: q, reason: collision with root package name */
    public float f5894q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f5895r;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5885e = new Rect();
        this.f5886f = new RectF();
        this.f5887g = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.f5889k = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0379a.f6760f, R.attr.materialClockStyle, 2132018378);
        Resources resources = getResources();
        ColorStateList w3 = AbstractC0105a.w(context, obtainStyledAttributes, 1);
        this.f5895r = w3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f5884d = clockHandView;
        this.f5890l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = w3.getColorForState(new int[]{android.R.attr.state_selected}, w3.getDefaultColor());
        this.f5888j = new int[]{colorForState, colorForState, w3.getDefaultColor()};
        clockHandView.f5898c.add(this);
        int defaultColor = D.h.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList w4 = AbstractC0105a.w(context, obtainStyledAttributes, 0);
        setBackgroundColor(w4 != null ? w4.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.i = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i = 0; i < Math.max(this.p.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.p.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.p[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i4 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                z3 = i4 > 1 ? true : z3;
                X.j(textView, this.i);
                textView.setTextColor(this.f5895r);
            }
        }
        ClockHandView clockHandView2 = this.f5884d;
        if (clockHandView2.f5897b && !z3) {
            clockHandView2.f5906m = 1;
        }
        clockHandView2.f5897b = z3;
        clockHandView2.invalidate();
        this.f5891m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f5892n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f5893o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void i() {
        p pVar = new p();
        pVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f5913b * 0.66f) : this.f5913b;
            Iterator it = list.iterator();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = pVar.f2747c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new k());
                }
                l lVar = ((k) hashMap2.get(Integer.valueOf(id))).f2652d;
                lVar.f2717z = R.id.circle_center;
                lVar.f2656A = round;
                lVar.f2657B = f2;
                f2 += 360.0f / list.size();
            }
        }
        pVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i5 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i5)).setVisibility(0);
            i5++;
        }
    }

    public final void j() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f5884d.f5902g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.h;
            int size = sparseArray.size();
            rectF = this.f5886f;
            rect = this.f5885e;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f5887g);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f5888j, this.f5889k, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) A.a.s(1, this.p.length, 1).f7b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f5893o / Math.max(Math.max(this.f5891m / displayMetrics.heightPixels, this.f5892n / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
