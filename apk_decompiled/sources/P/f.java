package P;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f1330e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1331f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f1332g;
    public static final f h;
    public static final f i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f1333j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f1334k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f1335l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1337b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f1338c;

    /* renamed from: d, reason: collision with root package name */
    public final t f1339d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        f1330e = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(m.class, 256);
        new f(m.class, ConstantsKt.MINIMUM_BLOCK_SIZE);
        new f(n.class, 1024);
        new f(n.class, 2048);
        f1331f = new f(ConstantsKt.DEFAULT_BLOCK_SIZE);
        f1332g = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(r.class, 131072);
        h = new f(262144);
        i = new f(524288);
        f1333j = new f(1048576);
        new f(s.class, 2097152);
        int i4 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        f1334k = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f1335l = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i4 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction = accessibilityAction8;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
        if (i4 >= 32) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction2 = accessibilityAction7;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.CTRL, null, null, null);
        if (i4 >= 32) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction3 = accessibilityAction6;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.FUNCTION, null, null, null);
        if (i4 >= 33) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction4 = accessibilityAction5;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.KEYCODE_0, null, null, null);
        new f(i4 >= 34 ? i.a() : null, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public f(int i4) {
        this(null, i4, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1336a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f1336a;
        Object obj3 = this.f1336a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1336a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d4 = k.d(this.f1337b);
        if (d4.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1336a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d4 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d4);
        return sb.toString();
    }

    public f(Class cls, int i4) {
        this(null, i4, null, null, cls);
    }

    public f(Object obj, int i4, String str, t tVar, Class cls) {
        this.f1337b = i4;
        this.f1339d = tVar;
        if (obj == null) {
            this.f1336a = new AccessibilityNodeInfo.AccessibilityAction(i4, str);
        } else {
            this.f1336a = obj;
        }
        this.f1338c = cls;
    }
}
