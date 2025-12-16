package o0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* loaded from: classes.dex */
public final class G implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f7927a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f7929c;

    public G(H h) {
        this.f7929c = h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7927a + 1 < this.f7929c.f7931k.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7928b = true;
        s.k kVar = this.f7929c.f7931k;
        int i = this.f7927a + 1;
        this.f7927a = i;
        Object g4 = kVar.g(i);
        Intrinsics.checkNotNullExpressionValue(g4, "nodes.valueAt(++index)");
        return (E) g4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7928b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        H h = this.f7929c;
        int i = this.f7927a;
        s.k kVar = h.f7931k;
        ((E) kVar.g(i)).f7921b = null;
        int i4 = this.f7927a;
        Object[] objArr = kVar.f8355c;
        Object obj = objArr[i4];
        Object obj2 = s.h.f8349b;
        if (obj != obj2) {
            objArr[i4] = obj2;
            kVar.f8353a = true;
        }
        this.f7927a = i4 - 1;
        this.f7928b = false;
    }
}
