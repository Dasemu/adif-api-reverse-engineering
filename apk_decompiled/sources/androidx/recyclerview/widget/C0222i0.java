package androidx.recyclerview.widget;

import android.database.Observable;

/* renamed from: androidx.recyclerview.widget.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222i0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).d(i, i4);
        }
    }

    public final void d(int i, int i4, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).b(i, i4, obj);
        }
    }

    public final void e(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).c(i, i4);
        }
    }

    public final void f(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).e(i, i4);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0224j0) ((Observable) this).mObservers.get(size)).f();
        }
    }
}
