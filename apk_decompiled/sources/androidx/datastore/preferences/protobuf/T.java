package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class T implements InterfaceC0111b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0130v f2876a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f2877b;

    /* renamed from: c, reason: collision with root package name */
    public final C0123n f2878c;

    public T(k0 k0Var, C0123n c0123n, AbstractC0130v abstractC0130v) {
        this.f2877b = k0Var;
        c0123n.getClass();
        this.f2878c = c0123n;
        this.f2876a = abstractC0130v;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void a(Object obj, J j4) {
        this.f2878c.getClass();
        C.w.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final int b(AbstractC0130v abstractC0130v) {
        this.f2877b.getClass();
        return abstractC0130v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void c(Object obj, Z2.y yVar, C0122m c0122m) {
        this.f2877b.getClass();
        AbstractC0130v abstractC0130v = (AbstractC0130v) obj;
        if (abstractC0130v.unknownFields == j0.f2935f) {
            abstractC0130v.unknownFields = j0.b();
        }
        this.f2878c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void d(Object obj) {
        this.f2877b.getClass();
        ((AbstractC0130v) obj).unknownFields.f2940e = false;
        this.f2878c.getClass();
        C.w.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final int e(AbstractC0108a abstractC0108a) {
        this.f2877b.getClass();
        j0 j0Var = ((AbstractC0130v) abstractC0108a).unknownFields;
        int i = j0Var.f2939d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < j0Var.f2936a; i5++) {
            int i6 = j0Var.f2937b[i5] >>> 3;
            i4 += C0119j.r(3, (C0116g) j0Var.f2938c[i5]) + C0119j.z(i6) + C0119j.y(2) + (C0119j.y(1) * 2);
        }
        j0Var.f2939d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final boolean f(Object obj) {
        this.f2878c.getClass();
        C.w.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final boolean g(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2) {
        this.f2877b.getClass();
        return abstractC0130v.unknownFields.equals(abstractC0130v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final void h(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2) {
        c0.x(this.f2877b, abstractC0130v, abstractC0130v2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0111b0
    public final Object i() {
        return ((AbstractC0128t) this.f2876a.d(5)).b();
    }
}
