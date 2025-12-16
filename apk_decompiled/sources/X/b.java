package X;

import E2.e;
import O.C0056b;
import O.X;
import P.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import s2.C0610c;
import s2.C0612e;

/* loaded from: classes.dex */
public abstract class b extends C0056b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f1976n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final e f1977o = new e(17);
    public static final e p = new e(18);
    public final AccessibilityManager h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f1982j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1978d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1979e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1980f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1981g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1983k = IntCompanionObject.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1984l = IntCompanionObject.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1985m = IntCompanionObject.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = X.f1226a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // O.C0056b
    public final A.a b(View view) {
        if (this.f1982j == null) {
            this.f1982j = new a(this);
        }
        return this.f1982j;
    }

    @Override // O.C0056b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1232a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f1341a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0610c) this).f8413q;
        C0612e c0612e = chip.f5616e;
        accessibilityNodeInfo.setCheckable(c0612e != null && c0612e.f8430O);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        kVar.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f1984l != i) {
            return false;
        }
        this.f1984l = IntCompanionObject.MIN_VALUE;
        C0610c c0610c = (C0610c) this;
        if (i == 1) {
            Chip chip = c0610c.f8413q;
            chip.f5622m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final k k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k kVar = new k(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        kVar.h("android.view.View");
        Rect rect = f1976n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1979e;
        kVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        kVar.f1342b = i;
        obtain.setSource(chip, i);
        if (this.f1983k == i) {
            obtain.setAccessibilityFocused(true);
            kVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            kVar.a(64);
        }
        boolean z3 = this.f1984l == i;
        if (z3) {
            kVar.a(2);
        } else if (obtain.isFocusable()) {
            kVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.f1981g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1978d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            kVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1980f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return kVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.b.m(int, android.graphics.Rect):boolean");
    }

    public final k n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k kVar = new k(obtain);
        WeakHashMap weakHashMap = X.f1226a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kVar.f1341a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return kVar;
    }

    public abstract void o(int i, k kVar);

    public final boolean p(int i) {
        int i4;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f1984l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1984l = i;
        C0610c c0610c = (C0610c) this;
        if (i == 1) {
            Chip chip2 = c0610c.f8413q;
            chip2.f5622m = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            k n4 = n(i);
            obtain.getText().add(n4.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n4.f1341a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
