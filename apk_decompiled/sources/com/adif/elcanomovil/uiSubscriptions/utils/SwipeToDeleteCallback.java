package com.adif.elcanomovil.uiSubscriptions.utils;

import D.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.I0;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/utils/SwipeToDeleteCallback;", "Landroidx/recyclerview/widget/M;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "c", "", "left", "top", "right", "bottom", "", "clearCanvas", "(Landroid/graphics/Canvas;FFFF)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/I0;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/I0;)I", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/I0;Landroidx/recyclerview/widget/I0;)Z", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/I0;FFIZ)V", "Landroid/graphics/drawable/Drawable;", "deleteIcon", "Landroid/graphics/drawable/Drawable;", "intrinsicWidth", "Ljava/lang/Integer;", "intrinsicHeight", "Landroid/graphics/drawable/ColorDrawable;", "background", "Landroid/graphics/drawable/ColorDrawable;", "backgroundColor", "I", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Paint;", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDeleteCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDeleteCallback.kt\ncom/adif/elcanomovil/uiSubscriptions/utils/SwipeToDeleteCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes3.dex */
public abstract class SwipeToDeleteCallback extends M {
    private final ColorDrawable background;
    private final int backgroundColor;
    private final Paint clearPaint;
    private final Drawable deleteIcon;
    private final Integer intrinsicHeight;
    private final Integer intrinsicWidth;

    public SwipeToDeleteCallback(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = h.getDrawable(context, R.drawable.ic_delete);
        this.deleteIcon = drawable;
        this.intrinsicWidth = drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null;
        this.intrinsicHeight = drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null;
        this.background = new ColorDrawable();
        this.backgroundColor = Color.parseColor("#f44336");
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
    }

    private final void clearCanvas(Canvas c4, float left, float top, float right, float bottom) {
        if (c4 != null) {
            c4.drawRect(left, top, right, bottom, this.clearPaint);
        }
    }

    @Override // androidx.recyclerview.widget.K
    public int getMovementFlags(RecyclerView recyclerView, I0 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder.getAdapterPosition() == 10) {
            return 0;
        }
        return K.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
    }

    @Override // androidx.recyclerview.widget.K
    public void onChildDraw(Canvas c4, RecyclerView recyclerView, I0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        Intrinsics.checkNotNullParameter(c4, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int bottom = itemView.getBottom() - itemView.getTop();
        if (dX == BitmapDescriptorFactory.HUE_RED && !isCurrentlyActive) {
            clearCanvas(c4, itemView.getRight() + dX, itemView.getTop(), itemView.getRight(), itemView.getBottom());
            super.onChildDraw(c4, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            return;
        }
        this.background.setColor(this.backgroundColor);
        this.background.setBounds(itemView.getRight() + ((int) dX), itemView.getTop(), itemView.getRight(), itemView.getBottom());
        this.background.draw(c4);
        int top = itemView.getTop();
        Integer num = this.intrinsicHeight;
        Intrinsics.checkNotNull(num);
        int intValue = ((bottom - num.intValue()) / 2) + top;
        int intValue2 = (bottom - this.intrinsicHeight.intValue()) / 2;
        int right = itemView.getRight() - intValue2;
        Integer num2 = this.intrinsicWidth;
        Intrinsics.checkNotNull(num2);
        int intValue3 = right - num2.intValue();
        int right2 = itemView.getRight() - intValue2;
        int intValue4 = this.intrinsicHeight.intValue() + intValue;
        Drawable drawable = this.deleteIcon;
        if (drawable != null) {
            drawable.setBounds(intValue3, intValue, right2, intValue4);
        }
        Drawable drawable2 = this.deleteIcon;
        if (drawable2 != null) {
            drawable2.draw(c4);
        }
        super.onChildDraw(c4, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        super.onChildDraw(c4, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    public boolean onMove(RecyclerView recyclerView, I0 viewHolder, I0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }
}
