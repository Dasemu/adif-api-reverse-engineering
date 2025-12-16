package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f8333a;

    /* renamed from: b, reason: collision with root package name */
    public int f8334b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8336d;

    public c(e eVar) {
        this.f8336d = eVar;
        this.f8333a = eVar.f8352c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8335c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f8334b;
        e eVar = this.f8336d;
        return Intrinsics.areEqual(key, eVar.f(i)) && Intrinsics.areEqual(entry.getValue(), eVar.i(this.f8334b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8335c) {
            return this.f8336d.f(this.f8334b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8335c) {
            return this.f8336d.i(this.f8334b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8334b < this.f8333a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8335c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f8334b;
        e eVar = this.f8336d;
        Object f2 = eVar.f(i);
        Object i4 = eVar.i(this.f8334b);
        return (f2 == null ? 0 : f2.hashCode()) ^ (i4 != null ? i4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8334b++;
        this.f8335c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8335c) {
            throw new IllegalStateException();
        }
        this.f8336d.g(this.f8334b);
        this.f8334b--;
        this.f8333a--;
        this.f8335c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8335c) {
            return this.f8336d.h(this.f8334b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
