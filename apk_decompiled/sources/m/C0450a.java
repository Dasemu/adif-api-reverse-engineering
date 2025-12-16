package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450a implements O.i0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7644a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f7645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f7646c;

    public C0450a(ActionBarContextView actionBarContextView) {
        this.f7646c = actionBarContextView;
    }

    @Override // O.i0
    public final void a() {
        if (this.f7644a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f7646c;
        actionBarContextView.f2372f = null;
        super/*android.view.View*/.setVisibility(this.f7645b);
    }

    @Override // O.i0
    public final void b() {
        this.f7644a = true;
    }

    @Override // O.i0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f7644a = false;
    }
}
