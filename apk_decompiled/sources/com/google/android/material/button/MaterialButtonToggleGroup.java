package com.google.android.material.button;

import E2.j;
import E2.k;
import F0.g;
import K2.a;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.timepicker.f;
import h2.AbstractC0379a;
import h3.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p2.e;
import x2.m;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f5602k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5603a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5604b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5605c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.d f5606d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f5607e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5608f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5609g;
    public boolean h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f5610j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018318), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f5603a = new ArrayList();
        this.f5604b = new d(this, 8);
        this.f5605c = new LinkedHashSet();
        this.f5606d = new p2.d(this);
        this.f5608f = false;
        this.f5610j = new HashSet();
        TypedArray h = m.h(getContext(), attributeSet, AbstractC0379a.f6765m, R.attr.materialButtonToggleGroupStyle, 2132018318, new int[0]);
        setSingleSelection(h.getBoolean(3, false));
        this.i = h.getResourceId(1, -1);
        this.h = h.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(h.getBoolean(0, true));
        h.recycle();
        WeakHashMap weakHashMap = X.f1226a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && c(i4)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = X.f1226a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5604b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f5600o);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5603a.add(new e(shapeAppearanceModel.f432e, shapeAppearanceModel.h, shapeAppearanceModel.f433f, shapeAppearanceModel.f434g));
        materialButton.setEnabled(isEnabled());
        X.j(materialButton, new g(this, 4));
    }

    public final void b(int i, boolean z3) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f5610j);
        if (z3 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f5609g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f5610j;
        this.f5610j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f5608f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f5608f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f5605c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5606d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f5607e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e4 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f5603a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z3 = getOrientation() == 0;
                    E2.a aVar = e.f8140e;
                    if (i == firstVisibleChildIndex) {
                        eVar = z3 ? m.g(this) ? new e(aVar, aVar, eVar2.f8142b, eVar2.f8143c) : new e(eVar2.f8141a, eVar2.f8144d, aVar, aVar) : new e(eVar2.f8141a, aVar, eVar2.f8142b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        eVar = z3 ? m.g(this) ? new e(eVar2.f8141a, eVar2.f8144d, aVar, aVar) : new e(aVar, aVar, eVar2.f8142b, eVar2.f8143c) : new e(aVar, eVar2.f8144d, aVar, eVar2.f8143c);
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e4.f422e = new E2.a(BitmapDescriptorFactory.HUE_RED);
                    e4.f423f = new E2.a(BitmapDescriptorFactory.HUE_RED);
                    e4.f424g = new E2.a(BitmapDescriptorFactory.HUE_RED);
                    e4.h = new E2.a(BitmapDescriptorFactory.HUE_RED);
                } else {
                    e4.f422e = eVar2.f8141a;
                    e4.h = eVar2.f8144d;
                    e4.f423f = eVar2.f8142b;
                    e4.f424g = eVar2.f8143c;
                }
                materialButton.setShapeAppearanceModel(e4.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5609g || this.f5610j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5610j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f5610j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        Integer[] numArr = this.f5607e;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i4;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) A.a.s(1, getVisibleButtonCount(), this.f5609g ? 1 : 2).f7b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        e();
        a();
        super.onMeasure(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f5603a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.h = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f5609g != z3) {
            this.f5609g = z3;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f5609g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
