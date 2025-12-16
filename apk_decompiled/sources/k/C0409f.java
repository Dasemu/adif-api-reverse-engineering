package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC0419B;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6968a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0405b f6969b;

    public C0409f(Context context, AbstractC0405b abstractC0405b) {
        this.f6968a = context;
        this.f6969b = abstractC0405b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f6969b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f6969b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0419B(this.f6968a, this.f6969b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f6969b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f6969b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f6969b.f6955a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f6969b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f6969b.f6956b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f6969b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f6969b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f6969b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f6969b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f6969b.f6955a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f6969b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f6969b.p(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f6969b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f6969b.n(i);
    }
}
