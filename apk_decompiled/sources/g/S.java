package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC0405b;
import k.C0412i;
import k.InterfaceC0404a;
import l.InterfaceC0433k;
import m.C0472l;

/* loaded from: classes.dex */
public final class S extends AbstractC0405b implements InterfaceC0433k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f6571c;

    /* renamed from: d, reason: collision with root package name */
    public final l.m f6572d;

    /* renamed from: e, reason: collision with root package name */
    public F.i f6573e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f6574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T f6575g;

    public S(T t2, Context context, F.i iVar) {
        this.f6575g = t2;
        this.f6571c = context;
        this.f6573e = iVar;
        l.m mVar = new l.m(context);
        mVar.f7250l = 1;
        this.f6572d = mVar;
        mVar.f7245e = this;
    }

    @Override // k.AbstractC0405b
    public final void a() {
        T t2 = this.f6575g;
        if (t2.i != this) {
            return;
        }
        if (t2.p) {
            t2.f6585j = this;
            t2.f6586k = this.f6573e;
        } else {
            this.f6573e.j(this);
        }
        this.f6573e = null;
        t2.p(false);
        ActionBarContextView actionBarContextView = t2.f6583f;
        if (actionBarContextView.f2375k == null) {
            actionBarContextView.e();
        }
        t2.f6580c.setHideOnContentScrollEnabled(t2.f6595u);
        t2.i = null;
    }

    @Override // k.AbstractC0405b
    public final View b() {
        WeakReference weakReference = this.f6574f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.InterfaceC0433k
    public final boolean c(l.m mVar, MenuItem menuItem) {
        F.i iVar = this.f6573e;
        if (iVar != null) {
            return ((InterfaceC0404a) iVar.f490b).e(this, menuItem);
        }
        return false;
    }

    @Override // k.AbstractC0405b
    public final l.m d() {
        return this.f6572d;
    }

    @Override // k.AbstractC0405b
    public final MenuInflater e() {
        return new C0412i(this.f6571c);
    }

    @Override // k.AbstractC0405b
    public final CharSequence f() {
        return this.f6575g.f6583f.getSubtitle();
    }

    @Override // k.AbstractC0405b
    public final CharSequence g() {
        return this.f6575g.f6583f.getTitle();
    }

    @Override // k.AbstractC0405b
    public final void h() {
        if (this.f6575g.i != this) {
            return;
        }
        l.m mVar = this.f6572d;
        mVar.w();
        try {
            this.f6573e.f(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // l.InterfaceC0433k
    public final void i(l.m mVar) {
        if (this.f6573e == null) {
            return;
        }
        h();
        C0472l c0472l = this.f6575g.f6583f.f2370d;
        if (c0472l != null) {
            c0472l.n();
        }
    }

    @Override // k.AbstractC0405b
    public final boolean j() {
        return this.f6575g.f6583f.f2382s;
    }

    @Override // k.AbstractC0405b
    public final void k(View view) {
        this.f6575g.f6583f.setCustomView(view);
        this.f6574f = new WeakReference(view);
    }

    @Override // k.AbstractC0405b
    public final void l(int i) {
        m(this.f6575g.f6578a.getResources().getString(i));
    }

    @Override // k.AbstractC0405b
    public final void m(CharSequence charSequence) {
        this.f6575g.f6583f.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0405b
    public final void n(int i) {
        o(this.f6575g.f6578a.getResources().getString(i));
    }

    @Override // k.AbstractC0405b
    public final void o(CharSequence charSequence) {
        this.f6575g.f6583f.setTitle(charSequence);
    }

    @Override // k.AbstractC0405b
    public final void p(boolean z3) {
        this.f6956b = z3;
        this.f6575g.f6583f.setTitleOptional(z3);
    }
}
