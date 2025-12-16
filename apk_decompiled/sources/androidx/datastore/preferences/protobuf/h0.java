package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2924a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2925b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f2927d;

    public h0(d0 d0Var) {
        this.f2927d = d0Var;
    }

    public final Iterator a() {
        if (this.f2926c == null) {
            this.f2926c = this.f2927d.f2901c.entrySet().iterator();
        }
        return this.f2926c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2924a + 1;
        d0 d0Var = this.f2927d;
        return i < d0Var.f2900b.size() || (!d0Var.f2901c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2925b = true;
        int i = this.f2924a + 1;
        this.f2924a = i;
        d0 d0Var = this.f2927d;
        return i < d0Var.f2900b.size() ? (Map.Entry) d0Var.f2900b.get(this.f2924a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2925b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2925b = false;
        int i = d0.f2898g;
        d0 d0Var = this.f2927d;
        d0Var.b();
        if (this.f2924a >= d0Var.f2900b.size()) {
            a().remove();
            return;
        }
        int i4 = this.f2924a;
        this.f2924a = i4 - 1;
        d0Var.g(i4);
    }
}
