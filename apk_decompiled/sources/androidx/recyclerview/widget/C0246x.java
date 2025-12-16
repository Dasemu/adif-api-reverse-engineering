package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246x extends AbstractC0232n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3927d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3929b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3930c = new Rect();

    public C0246x(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3927d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f3928a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.f3929b = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, E0 e02) {
        Drawable drawable = this.f3928a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3929b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, E0 e02) {
        int height;
        int i;
        int width;
        int i4;
        if (recyclerView.getLayoutManager() == null || this.f3928a == null) {
            return;
        }
        int i5 = this.f3929b;
        Rect rect = this.f3930c;
        int i6 = 0;
        if (i5 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i4 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i4, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i4 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i6 < childCount) {
                View childAt = recyclerView.getChildAt(i6);
                RecyclerView.O(rect, childAt);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f3928a.setBounds(i4, round - this.f3928a.getIntrinsicHeight(), width, round);
                this.f3928a.draw(canvas);
                i6++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i6 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i6);
            recyclerView.getLayoutManager().z(rect, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f3928a.setBounds(round2 - this.f3928a.getIntrinsicWidth(), i, round2, height);
            this.f3928a.draw(canvas);
            i6++;
        }
        canvas.restore();
    }
}
