package m;

import l.InterfaceC0420C;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447F extends AbstractViewOnTouchListenerC0481p0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K f7518j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N f7519k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447F(N n4, N n5, K k4) {
        super(n5);
        this.f7519k = n4;
        this.f7518j = k4;
    }

    @Override // m.AbstractViewOnTouchListenerC0481p0
    public final InterfaceC0420C b() {
        return this.f7518j;
    }

    @Override // m.AbstractViewOnTouchListenerC0481p0
    public final boolean c() {
        N n4 = this.f7519k;
        if (n4.getInternalPopup().a()) {
            return true;
        }
        n4.f7595f.l(n4.getTextDirection(), n4.getTextAlignment());
        return true;
    }
}
