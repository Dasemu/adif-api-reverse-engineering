package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import com.adif.elcanomovil.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class K {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new J(0);
    private static final Interpolator sDragViewScrollCapInterpolator = new J(1);
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i, int i4) {
        int i5;
        int i6 = i & ABS_HORIZONTAL_DIR_FLAGS;
        if (i6 == 0) {
            return i;
        }
        int i7 = i & (~i6);
        if (i4 == 0) {
            i5 = i6 << 2;
        } else {
            int i8 = i6 << 1;
            i7 |= (-789517) & i8;
            i5 = (i8 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i7 | i5;
    }

    public static O getDefaultUIUtil() {
        return P.f3615a;
    }

    public static int makeFlag(int i, int i4) {
        return i4 << (i * 8);
    }

    public static int makeMovementFlags(int i, int i4) {
        return makeFlag(2, i) | makeFlag(1, i4) | makeFlag(0, i4 | i);
    }

    public boolean canDropOver(RecyclerView recyclerView, I0 i02, I0 i03) {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public I0 chooseDropTarget(I0 i02, List<I0> list, int i, int i4) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int width = i02.itemView.getWidth() + i;
        int height = i02.itemView.getHeight() + i4;
        int left2 = i - i02.itemView.getLeft();
        int top2 = i4 - i02.itemView.getTop();
        int size = list.size();
        I0 i03 = null;
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            I0 i04 = list.get(i6);
            if (left2 > 0 && (right = i04.itemView.getRight() - width) < 0 && i04.itemView.getRight() > i02.itemView.getRight() && (abs4 = Math.abs(right)) > i5) {
                i03 = i04;
                i5 = abs4;
            }
            if (left2 < 0 && (left = i04.itemView.getLeft() - i) > 0 && i04.itemView.getLeft() < i02.itemView.getLeft() && (abs3 = Math.abs(left)) > i5) {
                i03 = i04;
                i5 = abs3;
            }
            if (top2 < 0 && (top = i04.itemView.getTop() - i4) > 0 && i04.itemView.getTop() < i02.itemView.getTop() && (abs2 = Math.abs(top)) > i5) {
                i03 = i04;
                i5 = abs2;
            }
            if (top2 > 0 && (bottom = i04.itemView.getBottom() - height) < 0 && i04.itemView.getBottom() > i02.itemView.getBottom() && (abs = Math.abs(bottom)) > i5) {
                i03 = i04;
                i5 = abs;
            }
        }
        return i03;
    }

    public void clearView(RecyclerView recyclerView, I0 i02) {
        View view = i02.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = O.X.f1226a;
            O.L.s(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    public int convertToAbsoluteDirection(int i, int i4) {
        int i5;
        int i6 = i & RELATIVE_DIR_FLAGS;
        if (i6 == 0) {
            return i;
        }
        int i7 = i & (~i6);
        if (i4 == 0) {
            i5 = i6 >> 2;
        } else {
            int i8 = i6 >> 1;
            i7 |= (-3158065) & i8;
            i5 = (RELATIVE_DIR_FLAGS & i8) >> 2;
        }
        return i5 | i7;
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, I0 i02) {
        int movementFlags = getMovementFlags(recyclerView, i02);
        WeakHashMap weakHashMap = O.X.f1226a;
        return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
    }

    public long getAnimationDuration(RecyclerView recyclerView, int i, float f2, float f4) {
        AbstractC0230m0 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.f3849e : itemAnimator.f3848d;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(I0 i02) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, I0 i02);

    public float getSwipeEscapeVelocity(float f2) {
        return f2;
    }

    public float getSwipeThreshold(I0 i02) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f2) {
        return f2;
    }

    public boolean hasDragFlag(RecyclerView recyclerView, I0 i02) {
        return (getAbsoluteMovementFlags(recyclerView, i02) & 16711680) != 0;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, I0 i02) {
        return (getAbsoluteMovementFlags(recyclerView, i02) & 65280) != 0;
    }

    public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i4, int i5, long j4) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j4 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? ((float) j4) / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i4) * 1.0f) / i)) * ((int) Math.signum(i4)) * this.mCachedMaxScrollSpeed)));
        return interpolation == 0 ? i4 > 0 ? 1 : -1 : interpolation;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return true;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, I0 i02, float f2, float f4, int i, boolean z3) {
        View view = i02.itemView;
        if (z3 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = O.X.f1226a;
            Float valueOf = Float.valueOf(O.L.i(view));
            int childCount = recyclerView.getChildCount();
            float f5 = BitmapDescriptorFactory.HUE_RED;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = O.X.f1226a;
                    float i5 = O.L.i(childAt);
                    if (i5 > f5) {
                        f5 = i5;
                    }
                }
            }
            O.L.s(view, f5 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f4);
    }

    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) I0 i02, float f2, float f4, int i, boolean z3) {
        View view = i02.itemView;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, I0 i02, List<H> list, int i, float f2, float f4) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            H h = list.get(i4);
            float f5 = h.f3531a;
            float f6 = h.f3533c;
            I0 i03 = h.f3535e;
            if (f5 == f6) {
                h.i = i03.itemView.getTranslationX();
            } else {
                h.i = com.google.android.gms.measurement.internal.a.a(f6, f5, h.f3541m, f5);
            }
            float f7 = h.f3532b;
            float f8 = h.f3534d;
            if (f7 == f8) {
                h.f3538j = i03.itemView.getTranslationY();
            } else {
                h.f3538j = com.google.android.gms.measurement.internal.a.a(f8, f7, h.f3541m, f7);
            }
            int save = canvas.save();
            onChildDraw(canvas, recyclerView, h.f3535e, h.i, h.f3538j, h.f3536f, false);
            canvas.restoreToCount(save);
        }
        if (i02 != null) {
            int save2 = canvas.save();
            onChildDraw(canvas, recyclerView, i02, f2, f4, i, true);
            canvas.restoreToCount(save2);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, I0 i02, List<H> list, int i, float f2, float f4) {
        int size = list.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            H h = list.get(i4);
            int save = canvas.save();
            onChildDrawOver(canvas, recyclerView, h.f3535e, h.i, h.f3538j, h.f3536f, false);
            canvas.restoreToCount(save);
        }
        if (i02 != null) {
            int save2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, i02, f2, f4, i, true);
            canvas.restoreToCount(save2);
        }
        for (int i5 = size - 1; i5 >= 0; i5--) {
            H h4 = list.get(i5);
            boolean z4 = h4.f3540l;
            if (z4 && !h4.h) {
                list.remove(i5);
            } else if (!z4) {
                z3 = true;
            }
        }
        if (z3) {
            recyclerView.invalidate();
        }
    }

    public void onMoved(RecyclerView recyclerView, I0 i02, int i, I0 i03, int i4, int i5, int i6) {
        AbstractC0238q0 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager.d()) {
                if (AbstractC0238q0.A(i03.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.j0(i4);
                }
                if (AbstractC0238q0.D(i03.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.j0(i4);
                }
            }
            if (layoutManager.e()) {
                if (AbstractC0238q0.E(i03.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.j0(i4);
                }
                if (AbstractC0238q0.y(i03.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.j0(i4);
                    return;
                }
                return;
            }
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        View view = i02.itemView;
        View view2 = i03.itemView;
        linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
        linearLayoutManager.O0();
        linearLayoutManager.g1();
        int L3 = AbstractC0238q0.L(view);
        int L4 = AbstractC0238q0.L(view2);
        char c4 = L3 < L4 ? (char) 1 : (char) 65535;
        if (linearLayoutManager.f3572u) {
            if (c4 == 1) {
                linearLayoutManager.i1(L4, linearLayoutManager.f3569r.g() - (linearLayoutManager.f3569r.c(view) + linearLayoutManager.f3569r.e(view2)));
                return;
            } else {
                linearLayoutManager.i1(L4, linearLayoutManager.f3569r.g() - linearLayoutManager.f3569r.b(view2));
                return;
            }
        }
        if (c4 == 65535) {
            linearLayoutManager.i1(L4, linearLayoutManager.f3569r.e(view2));
        } else {
            linearLayoutManager.i1(L4, linearLayoutManager.f3569r.b(view2) - linearLayoutManager.f3569r.c(view));
        }
    }

    public void onSelectedChanged(I0 i02, int i) {
    }

    public abstract void onSwiped(I0 i02, int i);
}
