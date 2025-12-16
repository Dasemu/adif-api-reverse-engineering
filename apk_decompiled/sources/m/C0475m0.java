package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.adif.elcanomovil.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0475m0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f7699a;

    /* renamed from: b, reason: collision with root package name */
    public int f7700b;

    /* renamed from: c, reason: collision with root package name */
    public int f7701c;

    /* renamed from: d, reason: collision with root package name */
    public int f7702d;

    /* renamed from: e, reason: collision with root package name */
    public int f7703e;

    /* renamed from: f, reason: collision with root package name */
    public int f7704f;

    /* renamed from: g, reason: collision with root package name */
    public C0471k0 f7705g;
    public boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7706j;

    /* renamed from: k, reason: collision with root package name */
    public U.g f7707k;

    /* renamed from: l, reason: collision with root package name */
    public F0.c f7708l;

    public C0475m0(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f7699a = new Rect();
        this.f7700b = 0;
        this.f7701c = 0;
        this.f7702d = 0;
        this.f7703e = 0;
        this.i = z3;
        setCacheColorHint(0);
    }

    public final int a(int i, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0475m0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f7699a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f7708l != null) {
            return;
        }
        super.drawableStateChanged();
        C0471k0 c0471k0 = this.f7705g;
        if (c0471k0 != null) {
            c0471k0.f7675b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f7706j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f7708l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7708l == null) {
            F0.c cVar = new F0.c(this, 9);
            this.f7708l = cVar;
            post(cVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC0467i0.f7671d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0467i0.f7668a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0467i0.f7669b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC0467i0.f7670c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f7706j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7704f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F0.c cVar = this.f7708l;
        if (cVar != null) {
            C0475m0 c0475m0 = (C0475m0) cVar.f517b;
            c0475m0.f7708l = null;
            c0475m0.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.h = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m.k0, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0471k0 c0471k0 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f7674a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f7674a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f7675b = true;
            c0471k0 = drawable2;
        }
        this.f7705g = c0471k0;
        super.setSelector(c0471k0);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f7700b = rect.left;
        this.f7701c = rect.top;
        this.f7702d = rect.right;
        this.f7703e = rect.bottom;
    }
}
