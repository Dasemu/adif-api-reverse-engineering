package f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342f implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f6455a;

    /* renamed from: b, reason: collision with root package name */
    public final C0338b f6456b;

    public C0342f(KeyListener keyListener) {
        C0338b c0338b = new C0338b(1);
        this.f6455a = keyListener;
        this.f6456b = c0338b;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f6455a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f6455a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z3;
        this.f6456b.getClass();
        if (i != 67 ? i != 112 ? false : R0.h.c(editable, keyEvent, true) : R0.h.c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 || this.f6455a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f6455a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f6455a.onKeyUp(view, editable, i, keyEvent);
    }
}
