package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2905a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0116g f2907c;

    public C0114e(C0116g c0116g) {
        this.f2907c = c0116g;
        this.f2906b = c0116g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2905a < this.f2906b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2905a;
        if (i >= this.f2906b) {
            throw new NoSuchElementException();
        }
        this.f2905a = i + 1;
        return Byte.valueOf(this.f2907c.f2912b[i]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
