package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0128t implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0130v f2970a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0130v f2971b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2972c = false;

    public AbstractC0128t(AbstractC0130v abstractC0130v) {
        this.f2970a = abstractC0130v;
        this.f2971b = (AbstractC0130v) abstractC0130v.d(4);
    }

    public static void d(AbstractC0130v abstractC0130v, AbstractC0130v abstractC0130v2) {
        Y y3 = Y.f2881c;
        y3.getClass();
        y3.a(abstractC0130v.getClass()).h(abstractC0130v, abstractC0130v2);
    }

    public final AbstractC0130v a() {
        AbstractC0130v b4 = b();
        if (b4.g()) {
            return b4;
        }
        throw new Q2.j();
    }

    public final AbstractC0130v b() {
        if (this.f2972c) {
            return this.f2971b;
        }
        AbstractC0130v abstractC0130v = this.f2971b;
        abstractC0130v.getClass();
        Y y3 = Y.f2881c;
        y3.getClass();
        y3.a(abstractC0130v.getClass()).d(abstractC0130v);
        this.f2972c = true;
        return this.f2971b;
    }

    public final void c() {
        if (this.f2972c) {
            AbstractC0130v abstractC0130v = (AbstractC0130v) this.f2971b.d(4);
            d(abstractC0130v, this.f2971b);
            this.f2971b = abstractC0130v;
            this.f2972c = false;
        }
    }

    public final Object clone() {
        AbstractC0128t abstractC0128t = (AbstractC0128t) this.f2970a.d(5);
        AbstractC0130v b4 = b();
        abstractC0128t.c();
        d(abstractC0128t.f2971b, b4);
        return abstractC0128t;
    }
}
