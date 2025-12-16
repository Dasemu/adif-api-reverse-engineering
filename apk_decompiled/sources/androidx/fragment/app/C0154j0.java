package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: androidx.fragment.app.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154j0 implements InterfaceC0150h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0158l0 f3137a;

    public C0154j0(AbstractC0158l0 abstractC0158l0) {
        this.f3137a = abstractC0158l0;
    }

    @Override // androidx.fragment.app.InterfaceC0150h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0158l0 abstractC0158l0 = this.f3137a;
        ArrayList arrayList3 = abstractC0158l0.f3161d;
        C0135a c0135a = (C0135a) arrayList3.get(arrayList3.size() - 1);
        abstractC0158l0.h = c0135a;
        Iterator it = c0135a.f3257a.iterator();
        while (it.hasNext()) {
            K k4 = ((v0) it.next()).f3250b;
            if (k4 != null) {
                k4.mTransitioning = true;
            }
        }
        boolean V3 = abstractC0158l0.V(arrayList, arrayList2, null, -1, 0);
        if (!abstractC0158l0.f3169n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(AbstractC0158l0.H((C0135a) it2.next()));
            }
            Iterator it3 = abstractC0158l0.f3169n.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return V3;
    }
}
