package O;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.adif.elcanomovil.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1226a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1227b = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: c, reason: collision with root package name */
    public static final F f1228c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final H f1229d = new H();

    public static h0 a(View view) {
        if (f1226a == null) {
            f1226a = new WeakHashMap();
        }
        h0 h0Var = (h0) f1226a.get(view);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(view);
        f1226a.put(view, h0Var2);
        return h0Var2;
    }

    public static D0 b(View view, D0 d02) {
        WindowInsets e4 = d02.e();
        if (e4 != null) {
            WindowInsets a2 = J.a(view, e4);
            if (!a2.equals(e4)) {
                return D0.f(view, a2);
            }
        }
        return d02;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? U.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = Q.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z3) {
                    obtain.getText().add(Q.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(Q.b(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static D0 f(View view, D0 d02) {
        WindowInsets e4 = d02.e();
        if (e4 != null) {
            WindowInsets b4 = J.b(view, e4);
            if (!b4.equals(e4)) {
                return D0.f(view, b4);
            }
        }
        return d02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0064f g(View view, C0064f c0064f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0064f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return U.b(view, c0064f);
        }
        InterfaceC0081w interfaceC0081w = (InterfaceC0081w) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0082x interfaceC0082x = f1228c;
        if (interfaceC0081w == null) {
            if (view instanceof InterfaceC0082x) {
                interfaceC0082x = (InterfaceC0082x) view;
            }
            return interfaceC0082x.a(c0064f);
        }
        C0064f a2 = ((U.w) interfaceC0081w).a(view, c0064f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0082x) {
            interfaceC0082x = (InterfaceC0082x) view;
        }
        return interfaceC0082x.a(a2);
    }

    public static void h(View view, int i) {
        ArrayList c4 = c(view);
        for (int i4 = 0; i4 < c4.size(); i4++) {
            if (((P.f) c4.get(i4)).a() == i) {
                c4.remove(i4);
                return;
            }
        }
    }

    public static void i(View view, P.f fVar, P.t tVar) {
        P.f fVar2 = new P.f(null, fVar.f1337b, null, tVar, fVar.f1338c);
        View.AccessibilityDelegate a2 = S.a(view);
        C0056b c0056b = a2 == null ? null : a2 instanceof C0054a ? ((C0054a) a2).f1230a : new C0056b(a2);
        if (c0056b == null) {
            c0056b = new C0056b();
        }
        j(view, c0056b);
        h(view, fVar2.a());
        c(view).add(fVar2);
        e(view, 0);
    }

    public static void j(View view, C0056b c0056b) {
        if (c0056b == null && (S.a(view) instanceof C0054a)) {
            c0056b = new C0056b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0056b == null ? null : c0056b.f1233b);
    }

    public static void k(View view, CharSequence charSequence) {
        new G(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).d(view, charSequence);
        H h = f1229d;
        if (charSequence == null) {
            h.f1217a.remove(view);
            view.removeOnAttachStateChangeListener(h);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h);
        } else {
            h.f1217a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h);
            }
        }
    }
}
