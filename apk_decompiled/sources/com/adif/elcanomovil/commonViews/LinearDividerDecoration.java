package com.adif.elcanomovil.commonViews;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.C0239r0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/commonViews/LinearDividerDecoration;", "Landroidx/recyclerview/widget/n0;", "Landroid/graphics/drawable/Drawable;", "divider", "", "dividerHeight", "dividerPaddingLeft", "dividerPaddingRight", "", "showDividerAfterList", "<init>", "(Landroid/graphics/drawable/Drawable;FFFZ)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/E0;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/E0;)V", "Landroid/graphics/drawable/Drawable;", "F", "Z", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinearDividerDecoration extends AbstractC0232n0 {
    private final Drawable divider;
    private final float dividerHeight;
    private final float dividerPaddingLeft;
    private final float dividerPaddingRight;
    private final boolean showDividerAfterList;

    public /* synthetic */ LinearDividerDecoration(Drawable drawable, float f2, float f4, float f5, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, f2, (i & 4) != 0 ? 0.0f : f4, (i & 8) != 0 ? 0.0f : f5, (i & 16) != 0 ? true : z3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0232n0
    public void onDraw(Canvas c4, RecyclerView parent, E0 state) {
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int roundToInt = MathKt.roundToInt(this.dividerPaddingLeft) + parent.getPaddingLeft();
        int width = (parent.getWidth() - parent.getPaddingRight()) - MathKt.roundToInt(this.dividerPaddingRight);
        int childCount = parent.getChildCount();
        if (!this.showDividerAfterList) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            if (childAt instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = constraintLayout.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0239r0) layoutParams)).bottomMargin;
                int roundToInt2 = MathKt.roundToInt(this.dividerHeight) + bottom;
                Drawable drawable = this.divider;
                drawable.setBounds(roundToInt, bottom, width, roundToInt2);
                drawable.draw(c4);
            }
        }
    }

    public LinearDividerDecoration(Drawable divider, float f2, float f4, float f5, boolean z3) {
        Intrinsics.checkNotNullParameter(divider, "divider");
        this.divider = divider;
        this.dividerHeight = f2;
        this.dividerPaddingLeft = f4;
        this.dividerPaddingRight = f5;
        this.showDividerAfterList = z3;
    }
}
