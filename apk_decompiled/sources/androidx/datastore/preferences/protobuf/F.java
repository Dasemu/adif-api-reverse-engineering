package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class F extends G {
    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(long j4, Object obj) {
        ((AbstractC0110b) ((InterfaceC0132x) s0.f2966d.i(j4, obj))).f2891a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2, long j4) {
        r0 r0Var = s0.f2966d;
        InterfaceC0132x interfaceC0132x = (InterfaceC0132x) r0Var.i(j4, abstractC0130v);
        InterfaceC0132x interfaceC0132x2 = (InterfaceC0132x) r0Var.i(j4, abstractC0130v2);
        int size = interfaceC0132x.size();
        int size2 = interfaceC0132x2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0110b) interfaceC0132x).f2891a) {
                interfaceC0132x = interfaceC0132x.d(size2 + size);
            }
            interfaceC0132x.addAll(interfaceC0132x2);
        }
        if (size > 0) {
            interfaceC0132x2 = interfaceC0132x;
        }
        s0.o(abstractC0130v, j4, interfaceC0132x2);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(long j4, Object obj) {
        InterfaceC0132x interfaceC0132x = (InterfaceC0132x) s0.f2966d.i(j4, obj);
        if (((AbstractC0110b) interfaceC0132x).f2891a) {
            return interfaceC0132x;
        }
        int size = interfaceC0132x.size();
        InterfaceC0132x d4 = interfaceC0132x.d(size == 0 ? 10 : size * 2);
        s0.o(obj, j4, d4);
        return d4;
    }
}
