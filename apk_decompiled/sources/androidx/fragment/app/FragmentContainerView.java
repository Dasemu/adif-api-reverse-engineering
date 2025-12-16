package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h0.AbstractC0378a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/K;", "F", "getFragment", "()Landroidx/fragment/app/K;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n55#2,6:346\n55#2,6:352\n1855#3,2:358\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n112#1:346,6\n134#1:352,6\n218#1:358,2\n*E\n"})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3003a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3004b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3005c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3003a = new ArrayList();
        this.f3004b = new ArrayList();
        this.f3006d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = AbstractC0378a.f6746b;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + Typography.quote);
        }
    }

    public final void a(View view) {
        if (this.f3004b.contains(view)) {
            this.f3003a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof K ? (K) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        O.D0 f2;
        Intrinsics.checkNotNullParameter(insets, "insets");
        O.D0 f4 = O.D0.f(null, insets);
        Intrinsics.checkNotNullExpressionValue(f4, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3005c;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            f2 = O.D0.f(null, onApplyWindowInsets);
        } else {
            f2 = O.X.f(this, f4);
        }
        Intrinsics.checkNotNullExpressionValue(f2, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!f2.f1207a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                O.X.b(getChildAt(i), f2);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f3006d) {
            Iterator it = this.f3003a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f3006d) {
            ArrayList arrayList = this.f3003a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f3004b.remove(view);
        if (this.f3003a.remove(view)) {
            this.f3006d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends K> F getFragment() {
        P p;
        K k4;
        AbstractC0158l0 supportFragmentManager;
        View view = this;
        while (true) {
            p = null;
            if (view == null) {
                k4 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            k4 = tag instanceof K ? (K) tag : null;
            if (k4 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (k4 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof P) {
                    p = (P) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (p == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = p.getSupportFragmentManager();
        } else {
            if (!k4.isAdded()) {
                throw new IllegalStateException("The Fragment " + k4 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = k4.getChildFragmentManager();
        }
        return (F) supportFragmentManager.E(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View view = getChildAt(i6);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View view = getChildAt(i6);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i4);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f3006d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f3005c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f3004b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3003a = new ArrayList();
        this.f3004b = new ArrayList();
        this.f3006d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, AbstractC0158l0 fm) {
        super(context, attrs);
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f3003a = new ArrayList();
        this.f3004b = new ArrayList();
        this.f3006d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = AbstractC0378a.f6746b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        K E3 = fm.E(id);
        if (classAttribute != null && E3 == null) {
            if (id == -1) {
                throw new IllegalStateException(C.w.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0142d0 J = fm.J();
            context.getClassLoader();
            K a2 = J.a(classAttribute);
            Intrinsics.checkNotNullExpressionValue(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.mFragmentId = id;
            a2.mContainerId = id;
            a2.mTag = string;
            a2.mFragmentManager = fm;
            a2.mHost = fm.f3177w;
            a2.onInflate(context, attrs, (Bundle) null);
            C0135a c0135a = new C0135a(fm);
            c0135a.p = true;
            a2.mContainer = this;
            c0135a.c(getId(), a2, string, 1);
            if (!c0135a.f3263g) {
                c0135a.h = false;
                c0135a.f3084q.B(c0135a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f3160c.d().iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            K k4 = t0Var.f3240c;
            if (k4.mContainerId == getId() && (view = k4.mView) != null && view.getParent() == null) {
                k4.mContainer = this;
                t0Var.b();
            }
        }
    }
}
