package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class E extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f2847c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j4, int i) {
        List list = (List) s0.f2966d.i(j4, obj);
        if (list.isEmpty()) {
            List c4 = list instanceof D ? new C(i) : ((list instanceof X) && (list instanceof InterfaceC0132x)) ? ((InterfaceC0132x) list).d(i) : new ArrayList(i);
            s0.o(obj, j4, c4);
            return c4;
        }
        if (f2847c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            s0.o(obj, j4, arrayList);
            return arrayList;
        }
        if (list instanceof n0) {
            C c5 = new C(list.size() + i);
            c5.addAll((n0) list);
            s0.o(obj, j4, c5);
            return c5;
        }
        if ((list instanceof X) && (list instanceof InterfaceC0132x)) {
            InterfaceC0132x interfaceC0132x = (InterfaceC0132x) list;
            if (!((AbstractC0110b) interfaceC0132x).f2891a) {
                InterfaceC0132x d4 = interfaceC0132x.d(list.size() + i);
                s0.o(obj, j4, d4);
                return d4;
            }
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(long j4, Object obj) {
        Object unmodifiableList;
        List list = (List) s0.f2966d.i(j4, obj);
        if (list instanceof D) {
            unmodifiableList = ((D) list).getUnmodifiableView();
        } else {
            if (f2847c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof X) && (list instanceof InterfaceC0132x)) {
                AbstractC0110b abstractC0110b = (AbstractC0110b) ((InterfaceC0132x) list);
                if (abstractC0110b.f2891a) {
                    abstractC0110b.f2891a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        s0.o(obj, j4, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2, long j4) {
        List list = (List) s0.f2966d.i(j4, abstractC0130v2);
        List d4 = d(abstractC0130v, j4, list.size());
        int size = d4.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d4.addAll(list);
        }
        if (size > 0) {
            list = d4;
        }
        s0.o(abstractC0130v, j4, list);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(long j4, Object obj) {
        return d(obj, j4, 10);
    }
}
