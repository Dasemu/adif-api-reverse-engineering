package s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581a implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f8327a;

    /* renamed from: b, reason: collision with root package name */
    public int f8328b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8331e;

    public C0581a(int i) {
        this.f8327a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8328b < this.f8327a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8328b;
        switch (this.f8330d) {
            case 0:
                f2 = ((e) this.f8331e).f(i);
                break;
            case 1:
                f2 = ((e) this.f8331e).i(i);
                break;
            default:
                f2 = ((f) this.f8331e).f8342b[i];
                break;
        }
        this.f8328b++;
        this.f8329c = true;
        return f2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8329c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f8328b - 1;
        this.f8328b = i;
        switch (this.f8330d) {
            case 0:
                ((e) this.f8331e).g(i);
                break;
            case 1:
                ((e) this.f8331e).g(i);
                break;
            default:
                ((f) this.f8331e).a(i);
                break;
        }
        this.f8327a--;
        this.f8329c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0581a(f fVar) {
        this(fVar.f8343c);
        this.f8330d = 2;
        this.f8331e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0581a(e eVar, int i) {
        this(eVar.f8352c);
        this.f8330d = i;
        switch (i) {
            case 1:
                this.f8331e = eVar;
                this(eVar.f8352c);
                return;
            default:
                this.f8331e = eVar;
                return;
        }
    }
}
