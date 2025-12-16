package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.InterfaceC0433k;
import m.C0472l;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408e extends AbstractC0405b implements InterfaceC0433k {

    /* renamed from: c, reason: collision with root package name */
    public Context f6963c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f6964d;

    /* renamed from: e, reason: collision with root package name */
    public F.i f6965e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f6966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6967g;
    public l.m h;

    @Override // k.AbstractC0405b
    public final void a() {
        if (this.f6967g) {
            return;
        }
        this.f6967g = true;
        this.f6965e.j(this);
    }

    @Override // k.AbstractC0405b
    public final View b() {
        WeakReference weakReference = this.f6966f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.InterfaceC0433k
    public final boolean c(l.m mVar, MenuItem menuItem) {
        return ((InterfaceC0404a) this.f6965e.f490b).e(this, menuItem);
    }

    @Override // k.AbstractC0405b
    public final l.m d() {
        return this.h;
    }

    @Override // k.AbstractC0405b
    public final MenuInflater e() {
        return new C0412i(this.f6964d.getContext());
    }

    @Override // k.AbstractC0405b
    public final CharSequence f() {
        return this.f6964d.getSubtitle();
    }

    @Override // k.AbstractC0405b
    public final CharSequence g() {
        return this.f6964d.getTitle();
    }

    @Override // k.AbstractC0405b
    public final void h() {
        this.f6965e.f(this, this.h);
    }

    @Override // l.InterfaceC0433k
    public final void i(l.m mVar) {
        h();
        C0472l c0472l = this.f6964d.f2370d;
        if (c0472l != null) {
            c0472l.n();
        }
    }

    @Override // k.AbstractC0405b
    public final boolean j() {
        return this.f6964d.f2382s;
    }

    @Override // k.AbstractC0405b
    public final void k(View view) {
        this.f6964d.setCustomView(view);
        this.f6966f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC0405b
    public final void l(int i) {
        m(this.f6963c.getString(i));
    }

    @Override // k.AbstractC0405b
    public final void m(CharSequence charSequence) {
        this.f6964d.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0405b
    public final void n(int i) {
        o(this.f6963c.getString(i));
    }

    @Override // k.AbstractC0405b
    public final void o(CharSequence charSequence) {
        this.f6964d.setTitle(charSequence);
    }

    @Override // k.AbstractC0405b
    public final void p(boolean z3) {
        this.f6956b = z3;
        this.f6964d.setTitleOptional(z3);
    }
}
