package O;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.adif.elcanomovil.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0056b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1231c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final C0054a f1233b;

    public C0056b() {
        this(f1231c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1232a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A.a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1232a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A.a(accessibilityNodeProvider, 11);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1232a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, P.k kVar) {
        this.f1232a.onInitializeAccessibilityNodeInfo(view, kVar.f1341a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1232a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1232a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            P.f fVar = (P.f) list.get(i4);
            if (fVar.a() == i) {
                P.t tVar = fVar.f1339d;
                if (tVar != null) {
                    Class cls = fVar.f1338c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e4) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e4);
                        }
                    }
                    z3 = tVar.d(view);
                }
            } else {
                i4++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f1232a.performAccessibilityAction(view, i, bundle);
        }
        if (z3 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i6++;
            }
        }
        return z4;
    }

    public void h(View view, int i) {
        this.f1232a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1232a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0056b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1232a = accessibilityDelegate;
        this.f1233b = new C0054a(this);
    }
}
