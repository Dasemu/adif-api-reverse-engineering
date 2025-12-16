package g;

import a.AbstractC0106b;
import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.q0;
import k.AbstractC0405b;
import k.InterfaceC0404a;

/* renamed from: g.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0353G extends b.p implements InterfaceC0365l {

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflaterFactory2C0351E f6543d;

    /* renamed from: e, reason: collision with root package name */
    public final C0352F f6544e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC0353G(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903463(0x7f0301a7, float:1.7413745E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            g.F r2 = new g.F
            r2.<init>(r4)
            r4.f6544e = r2
            g.r r4 = r4.c()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r4
            g.E r5 = (g.LayoutInflaterFactory2C0351E) r5
            r5.f6513T = r6
            r4.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.DialogC0353G.<init>(android.content.Context, int):void");
    }

    @Override // b.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) c();
        layoutInflaterFactory2C0351E.x();
        ((ViewGroup) layoutInflaterFactory2C0351E.f6495A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0351E.f6529m.a(layoutInflaterFactory2C0351E.f6528l.getCallback());
    }

    public final r c() {
        if (this.f6543d == null) {
            ExecutorC0369p executorC0369p = r.f6658a;
            this.f6543d = new LayoutInflaterFactory2C0351E(getContext(), getWindow(), this, this);
        }
        return this.f6543d;
    }

    public final void d() {
        q0.m(getWindow().getDecorView(), this);
        m3.d.D(getWindow().getDecorView(), this);
        AbstractC0106b.H(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C0352F c0352f = this.f6544e;
        if (c0352f == null) {
            return false;
        }
        return c0352f.f6542a.e(keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) c();
        layoutInflaterFactory2C0351E.x();
        return layoutInflaterFactory2C0351E.f6528l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // b.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().e();
    }

    @Override // b.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0351E layoutInflaterFactory2C0351E = (LayoutInflaterFactory2C0351E) c();
        layoutInflaterFactory2C0351E.B();
        AbstractC0354a abstractC0354a = layoutInflaterFactory2C0351E.f6531o;
        if (abstractC0354a != null) {
            abstractC0354a.m(false);
        }
    }

    @Override // g.InterfaceC0365l
    public final void onSupportActionModeFinished(AbstractC0405b abstractC0405b) {
    }

    @Override // g.InterfaceC0365l
    public final void onSupportActionModeStarted(AbstractC0405b abstractC0405b) {
    }

    @Override // g.InterfaceC0365l
    public final AbstractC0405b onWindowStartingSupportActionMode(InterfaceC0404a interfaceC0404a) {
        return null;
    }

    @Override // b.p, android.app.Dialog
    public void setContentView(int i) {
        d();
        c().j(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().m(charSequence);
    }

    @Override // b.p, android.app.Dialog
    public void setContentView(View view) {
        d();
        c().k(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().m(getContext().getString(i));
    }

    @Override // b.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c().l(view, layoutParams);
    }
}
