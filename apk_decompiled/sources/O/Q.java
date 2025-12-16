package O;

import android.view.View;
import com.adif.elcanomovil.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, W w3) {
        s.j jVar = (s.j) view.getTag(R.id.tag_unhandled_key_listeners);
        s.j jVar2 = jVar;
        if (jVar == null) {
            s.j jVar3 = new s.j(0);
            view.setTag(R.id.tag_unhandled_key_listeners, jVar3);
            jVar2 = jVar3;
        }
        Objects.requireNonNull(w3);
        ?? obj = new Object();
        jVar2.put(w3, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, W w3) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        s.j jVar = (s.j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) jVar.get(w3)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, R.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
