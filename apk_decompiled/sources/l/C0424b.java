package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC0481p0;
import m.C0462g;
import m.C0464h;
import m.C0468j;
import m.C0472l;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424b extends AbstractViewOnTouchListenerC0481p0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7193j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f7194k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f7194k = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC0481p0
    public final InterfaceC0420C b() {
        C0462g c0462g;
        switch (this.f7193j) {
            case 0:
                AbstractC0425c abstractC0425c = ((ActionMenuItemView) this.f7194k).f2339l;
                if (abstractC0425c == null || (c0462g = ((C0464h) abstractC0425c).f7665a.f7693u) == null) {
                    return null;
                }
                return c0462g.a();
            default:
                C0462g c0462g2 = ((C0468j) this.f7194k).f7672d.f7692t;
                if (c0462g2 == null) {
                    return null;
                }
                return c0462g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0481p0
    public final boolean c() {
        InterfaceC0420C b4;
        switch (this.f7193j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f7194k;
                InterfaceC0434l interfaceC0434l = actionMenuItemView.f2337j;
                return interfaceC0434l != null && interfaceC0434l.c(actionMenuItemView.f2336g) && (b4 = b()) != null && b4.a();
            default:
                ((C0468j) this.f7194k).f7672d.n();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0481p0
    public boolean d() {
        switch (this.f7193j) {
            case 1:
                C0472l c0472l = ((C0468j) this.f7194k).f7672d;
                if (c0472l.f7694v != null) {
                    return false;
                }
                c0472l.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424b(C0468j c0468j, C0468j c0468j2) {
        super(c0468j2);
        this.f7194k = c0468j;
    }
}
