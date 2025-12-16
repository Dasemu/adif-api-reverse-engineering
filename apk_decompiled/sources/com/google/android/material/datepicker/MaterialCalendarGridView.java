package com.google.android.material.datepicker;

import O.X;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5631a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.c(null);
        if (m.i(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.adif.elcanomovil.R.id.cancel_button);
            setNextFocusRightId(com.adif.elcanomovil.R.id.confirm_button);
        }
        this.f5631a = m.i(getContext(), com.adif.elcanomovil.R.attr.nestedScrollable);
        X.j(this, new U.h(3));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        pVar.getClass();
        int max = Math.max(pVar.a(), getFirstVisiblePosition());
        int min = Math.min(pVar.c(), getLastVisiblePosition());
        pVar.getItem(max);
        pVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((p) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((p) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((p) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((p) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i4) {
        if (!this.f5631a) {
            super.onMeasure(i, i4);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, IntCompanionObject.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((p) super.getAdapter()).a()) {
            super.setSelection(((p) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof p) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
    }
}
