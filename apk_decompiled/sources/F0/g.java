package F0;

import G2.m;
import O.C0056b;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.adif.elcanomovil.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class g extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f528e;

    public /* synthetic */ g(Object obj, int i) {
        this.f527d = i;
        this.f528e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r2.getCount() > 1) goto L14;
     */
    @Override // O.C0056b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            int r0 = r1.f527d
            switch(r0) {
                case 0: goto L16;
                case 5: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            java.lang.Object r1 = r1.f528e
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.f5718d
            r3.setChecked(r1)
            return
        L16:
            super.c(r2, r3)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r3.setClassName(r2)
            java.lang.Object r1 = r1.f528e
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            F0.a r2 = r1.f4049e
            if (r2 == 0) goto L32
            int r2 = r2.getCount()
            r0 = 1
            if (r2 <= r0) goto L32
            goto L33
        L32:
            r0 = 0
        L33:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L53
            F0.a r2 = r1.f4049e
            if (r2 == 0) goto L53
            int r2 = r2.getCount()
            r3.setItemCount(r2)
            int r2 = r1.f4050f
            r3.setFromIndex(r2)
            int r1 = r1.f4050f
            r3.setToIndex(r1)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // O.C0056b
    public final void d(View view, k kVar) {
        int i = -1;
        boolean z3 = false;
        Object obj = this.f528e;
        View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
        switch (this.f527d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
                kVar.h(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                a aVar = viewPager.f4049e;
                if (aVar != null && aVar.getCount() > 1) {
                    z3 = true;
                }
                kVar.j(z3);
                if (viewPager.canScrollHorizontally(1)) {
                    kVar.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    kVar.a(8192);
                    return;
                }
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                kVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                com.google.android.material.datepicker.k kVar2 = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo2.setHintText(kVar2.f5666l.getVisibility() == 0 ? kVar2.getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar2.getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                if (!((o2.e) obj).f8094j) {
                    accessibilityNodeInfo3.setDismissable(false);
                    return;
                } else {
                    kVar.a(1048576);
                    accessibilityNodeInfo3.setDismissable(true);
                    return;
                }
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
                int i4 = MaterialButtonToggleGroup.f5602k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i5) == view) {
                                i = i6;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                    i6++;
                                }
                                i5++;
                            }
                        }
                    }
                }
                kVar.i(P.j.a(((MaterialButton) view).f5600o, 0, 1, i, 1));
                return;
            case 5:
                AccessibilityNodeInfo accessibilityNodeInfo4 = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo4.setCheckable(checkableImageButton.f5719e);
                accessibilityNodeInfo4.setChecked(checkableImageButton.f5718d);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCheckable(((NavigationMenuItemView) obj).f5730x);
                return;
        }
    }

    @Override // O.C0056b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f527d) {
            case 0:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.f528e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f4050f - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f4050f + 1);
                    return true;
                }
                return false;
            case 1:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((m) ((G2.k) this.f528e)).a(3);
                return true;
            case 2:
            default:
                return super.g(view, i, bundle);
            case 3:
                if (i == 1048576) {
                    o2.e eVar = (o2.e) this.f528e;
                    if (eVar.f8094j) {
                        eVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
        }
    }
}
