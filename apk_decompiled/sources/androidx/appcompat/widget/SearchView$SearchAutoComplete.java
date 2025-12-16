package androidx.appcompat.widget;

import F0.c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import m.C0480p;
import m.I0;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C0480p {

    /* renamed from: e, reason: collision with root package name */
    public int f2458e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2459f;

    /* renamed from: g, reason: collision with root package name */
    public final c f2460g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2460g = new c(this, 10);
        this.f2458e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i >= 960 && i4 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i4 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f2458e <= 0 || super.enoughToFilter();
    }

    @Override // m.C0480p, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f2459f) {
            c cVar = this.f2460g;
            removeCallbacks(cVar);
            post(cVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i, Rect rect) {
        super.onFocusChanged(z3, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z3) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        c cVar = this.f2460g;
        if (!z3) {
            this.f2459f = false;
            removeCallbacks(cVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f2459f = true;
                return;
            }
            this.f2459f = false;
            removeCallbacks(cVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(I0 i02) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.f2458e = i;
    }
}
