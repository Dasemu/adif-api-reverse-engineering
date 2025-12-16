package Z2;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u implements Iterator, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final q f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2299b;

    /* renamed from: c, reason: collision with root package name */
    public int f2300c;

    public u(q qVar, Object[] objArr, int i) {
        this.f2298a = qVar;
        this.f2299b = objArr;
        this.f2300c = i;
    }

    public final Object clone() {
        return new u(this.f2298a, this.f2299b, this.f2300c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2300c < this.f2299b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2300c;
        this.f2300c = i + 1;
        return this.f2299b[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
