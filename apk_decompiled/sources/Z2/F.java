package Z2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2212a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2213b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f2215d;

    public F(G g4) {
        this.f2215d = g4;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f2214c) {
            this.f2214c = true;
            ArrayDeque arrayDeque = this.f2213b;
            if (arrayDeque.size() != 1 || ((E) arrayDeque.getFirst()).f2209b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    E e4 = (E) descendingIterator.next();
                    sb.append("\nfor ");
                    sb.append(e4.f2208a);
                    String str = e4.f2209b;
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z3) {
        this.f2213b.removeLast();
        if (this.f2213b.isEmpty()) {
            this.f2215d.f2218b.remove();
            if (z3) {
                synchronized (this.f2215d.f2219c) {
                    try {
                        int size = this.f2212a.size();
                        for (int i = 0; i < size; i++) {
                            E e4 = (E) this.f2212a.get(i);
                            AbstractC0104l abstractC0104l = (AbstractC0104l) this.f2215d.f2219c.put(e4.f2210c, e4.f2211d);
                            if (abstractC0104l != null) {
                                e4.f2211d = abstractC0104l;
                                this.f2215d.f2219c.put(e4.f2210c, abstractC0104l);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
