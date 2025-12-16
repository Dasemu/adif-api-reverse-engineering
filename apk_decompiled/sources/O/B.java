package O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class B implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final C0059c0 f1200a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1201b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Iterator f1202c;

    public B(C0061d0 c0061d0, C0059c0 c0059c0) {
        this.f1200a = c0059c0;
        this.f1202c = c0061d0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1202c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f1202c.next();
        Iterator it = (Iterator) this.f1200a.invoke(next);
        ArrayList arrayList = this.f1201b;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f1202c);
            this.f1202c = it;
            return next;
        }
        while (!this.f1202c.hasNext() && !arrayList.isEmpty()) {
            this.f1202c = (Iterator) CollectionsKt.last((List) arrayList);
            CollectionsKt.removeLast(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
