package H0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class n extends RecyclerView {

    /* renamed from: K0, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f654K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f654K0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f654K0.f4094t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f654K0;
        accessibilityEvent.setFromIndex(viewPager2.f4081d);
        accessibilityEvent.setToIndex(viewPager2.f4081d);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f4094t.f30d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f654K0.f4092r && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f654K0.f4092r && super.onTouchEvent(motionEvent);
    }
}
