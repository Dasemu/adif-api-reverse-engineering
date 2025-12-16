package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152i0 implements InterfaceC0150h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0158l0 f3134c;

    public C0152i0(AbstractC0158l0 abstractC0158l0, String str, int i) {
        this.f3134c = abstractC0158l0;
        this.f3132a = str;
        this.f3133b = i;
    }

    @Override // androidx.fragment.app.InterfaceC0150h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        K k4 = this.f3134c.f3180z;
        if (k4 == null || this.f3133b >= 0 || this.f3132a != null || !k4.getChildFragmentManager().U(-1, 0)) {
            return this.f3134c.V(arrayList, arrayList2, this.f3132a, this.f3133b, 1);
        }
        return false;
    }
}
