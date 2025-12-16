package s;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class l implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f8357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8358b;

    public l(k kVar) {
        this.f8358b = kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8357a < this.f8358b.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8357a;
        this.f8357a = i + 1;
        return this.f8358b.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
