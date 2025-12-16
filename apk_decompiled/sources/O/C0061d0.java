package O;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: O.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061d0 implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f1241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1242b;

    public C0061d0(ViewGroup viewGroup) {
        this.f1242b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1241a < this.f1242b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1241a;
        this.f1241a = i + 1;
        View childAt = this.f1242b.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1241a - 1;
        this.f1241a = i;
        this.f1242b.removeViewAt(i);
    }
}
