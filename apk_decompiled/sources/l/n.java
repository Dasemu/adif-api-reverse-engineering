package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0362i;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0422E f7262a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0362i f7263b;

    /* renamed from: c, reason: collision with root package name */
    public C0431i f7264c;

    @Override // l.x
    public final void b(m mVar, boolean z3) {
        DialogInterfaceC0362i dialogInterfaceC0362i;
        if ((z3 || mVar == this.f7262a) && (dialogInterfaceC0362i = this.f7263b) != null) {
            dialogInterfaceC0362i.dismiss();
        }
    }

    @Override // l.x
    public final boolean f(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0431i c0431i = this.f7264c;
        if (c0431i.f7233f == null) {
            c0431i.f7233f = new C0430h(c0431i);
        }
        this.f7262a.q(c0431i.f7233f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f7264c.b(this.f7262a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0422E subMenuC0422E = this.f7262a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7263b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7263b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0422E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0422E.performShortcut(i, keyEvent, 0);
    }
}
