package H0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f631a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f632b;

    public b() {
        this.f631a = 0;
        this.f632b = new ArrayList(3);
    }

    @Override // H0.j
    public final void a(int i) {
        switch (this.f631a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f632b).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                ((androidx.viewpager2.adapter.d) this.f632b).b(false);
                return;
        }
    }

    @Override // H0.j
    public void b(int i, float f2, int i4) {
        switch (this.f631a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f632b).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).b(i, f2, i4);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                return;
        }
    }

    @Override // H0.j
    public final void c(int i) {
        switch (this.f631a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f632b).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                ((androidx.viewpager2.adapter.d) this.f632b).b(false);
                return;
        }
    }

    public b(androidx.viewpager2.adapter.d dVar) {
        this.f631a = 1;
        this.f632b = dVar;
    }
}
