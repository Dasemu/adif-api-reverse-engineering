package U;

import O.C0056b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class h extends C0056b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1755d;

    public /* synthetic */ h(int i) {
        this.f1755d = i;
    }

    @Override // O.C0056b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1755d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // O.C0056b
    public final void d(View view, P.k kVar) {
        int scrollRange;
        switch (this.f1755d) {
            case 0:
                this.f1232a.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                kVar.h(ScrollView.class.getName());
                if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                    return;
                }
                kVar.j(true);
                if (nestedScrollView.getScrollY() > 0) {
                    kVar.b(P.f.f1332g);
                    kVar.b(P.f.f1334k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    kVar.b(P.f.f1331f);
                    kVar.b(P.f.f1335l);
                    return;
                }
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 2:
                this.f1232a.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
                kVar.j(false);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f1232a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f1341a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 != 16908346) goto L32;
     */
    @Override // O.C0056b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.f1755d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L75
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L75
            goto La0
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            goto La1
        L75:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            goto La1
        La0:
            r6 = r0
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U.h.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
