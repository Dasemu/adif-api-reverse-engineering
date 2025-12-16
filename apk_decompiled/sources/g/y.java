package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC0405b;

/* loaded from: classes.dex */
public final class y implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f6671a;

    /* renamed from: b, reason: collision with root package name */
    public M f6672b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6673c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6674d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0351E f6676f;

    public y(LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E, Window.Callback callback) {
        this.f6676f = layoutInflaterFactory2C0351E;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6671a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f6673c = true;
            callback.onContentChanged();
        } finally {
            this.f6673c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f6671a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f6671a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        k.m.a(this.f6671a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6671a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f6674d;
        Window.Callback callback = this.f6671a;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f6676f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f6671a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6676f;
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            if (abstractC0354a == null || !abstractC0354a.i(keyCode, keyEvent)) {
                C0350D c0350d = layoutInflaterFactory2C0351E.f6506M;
                if (c0350d == null || !layoutInflaterFactory2C0351E.G(c0350d, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0351E.f6506M == null) {
                        C0350D A3 = layoutInflaterFactory2C0351E.A(0);
                        layoutInflaterFactory2C0351E.H(A3, keyEvent);
                        boolean G3 = layoutInflaterFactory2C0351E.G(A3, keyEvent.getKeyCode(), keyEvent);
                        A3.f6487k = false;
                        if (G3) {
                        }
                    }
                    return false;
                }
                C0350D c0350d2 = layoutInflaterFactory2C0351E.f6506M;
                if (c0350d2 != null) {
                    c0350d2.f6488l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6671a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6671a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6671a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6671a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6671a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6671a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6673c) {
            this.f6671a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof l.m)) {
            return this.f6671a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        M m4 = this.f6672b;
        if (m4 != null) {
            View view = i == 0 ? new View(m4.f6555a.f6556a.f7624a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f6671a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6671a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6671a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6676f;
        if (i == 108) {
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            if (abstractC0354a != null) {
                abstractC0354a.c(true);
            }
        } else {
            layoutInflaterFactory2C0351E.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f6675e) {
            this.f6671a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6676f;
        if (i == 108) {
            layoutInflaterFactory2C0351E.B();
            AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
            if (abstractC0354a != null) {
                abstractC0354a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C0351E.getClass();
            return;
        }
        C0350D A3 = layoutInflaterFactory2C0351E.A(i);
        if (A3.f6489m) {
            layoutInflaterFactory2C0351E.t(A3, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        k.n.a(this.f6671a, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        l.m mVar = menu instanceof l.m ? (l.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f7261x = true;
        }
        M m4 = this.f6672b;
        if (m4 != null && i == 0) {
            N n4 = m4.f6555a;
            if (!n4.f6559d) {
                n4.f6556a.f7633l = true;
                n4.f6559d = true;
            }
        }
        boolean onPreparePanel = this.f6671a.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f7261x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        l.m mVar = this.f6676f.A(0).h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.l.a(this.f6671a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6671a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f6671a.onWindowFocusChanged(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, A.j, k.a] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = this.f6676f;
        layoutInflaterFactory2C0351E.getClass();
        if (i != 0) {
            return k.l.b(this.f6671a, callback, i);
        }
        Context context = layoutInflaterFactory2C0351E.f6527k;
        ?? obj = new Object();
        obj.f30d = context;
        obj.f27a = callback;
        obj.f29c = new ArrayList();
        obj.f28b = new s.j(0);
        AbstractC0405b n4 = layoutInflaterFactory2C0351E.n(obj);
        if (n4 != null) {
            return obj.g(n4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6671a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
