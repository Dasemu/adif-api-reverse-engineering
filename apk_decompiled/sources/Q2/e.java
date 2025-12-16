package Q2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e extends f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1387a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f1387a.equals(this.f1387a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1387a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1387a.iterator();
    }
}
