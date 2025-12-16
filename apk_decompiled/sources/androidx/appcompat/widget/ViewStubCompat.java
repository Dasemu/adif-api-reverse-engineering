package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.AbstractC0336a;
import java.lang.ref.WeakReference;
import m.Y0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f2503a;

    /* renamed from: b, reason: collision with root package name */
    public int f2504b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2505c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f2506d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2503a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0336a.f6421A, 0, 0);
        this.f2504b = obtainStyledAttributes.getResourceId(2, -1);
        this.f2503a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2503a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f2506d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f2503a, viewGroup, false);
        int i = this.f2504b;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f2505c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2504b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2506d;
    }

    public int getLayoutResource() {
        return this.f2503a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2504b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2506d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2503a = i;
    }

    public void setOnInflateListener(Y0 y02) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f2505c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
