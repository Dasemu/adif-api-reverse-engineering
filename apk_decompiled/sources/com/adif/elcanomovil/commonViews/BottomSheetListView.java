package com.adif.elcanomovil.commonViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/commonViews/BottomSheetListView;", "Landroid/widget/ListView;", "context", "Landroid/content/Context;", "p_attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "canScrollVertically", "", "view", "Landroid/widget/AbsListView;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetListView extends ListView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetListView(Context context, AttributeSet p_attrs) {
        super(context, p_attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(p_attrs, "p_attrs");
    }

    private final boolean canScrollVertically(AbsListView view) {
        if (view != null && view.getChildCount() > 0) {
            boolean z3 = (view.getFirstVisiblePosition() == 0 && view.getChildAt(0).getTop() == 0) ? false : true;
            boolean z4 = z3 && view.getLastVisiblePosition() == view.getChildCount();
            if (z3 || z4) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return true;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (canScrollVertically(this)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(ev);
    }
}
