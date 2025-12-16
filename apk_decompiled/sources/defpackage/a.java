package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.C0239r0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends AbstractC0232n0 {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2316a;

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public final void onDrawOver(Canvas c4, RecyclerView parent, E0 state) {
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0239r0) layoutParams)).bottomMargin;
            Drawable drawable = this.f2316a;
            int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                drawable.draw(c4);
            }
        }
    }
}
