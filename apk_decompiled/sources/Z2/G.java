package Z2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2216d;

    /* renamed from: a, reason: collision with root package name */
    public final List f2217a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f2218b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2219c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f2216d = arrayList;
        arrayList.add(L.f2234a);
        arrayList.add(C0100h.f2264c);
        arrayList.add(C0094b.f2244e);
        arrayList.add(C0094b.f2243d);
        arrayList.add(H.f2220a);
        arrayList.add(C0099g.f2260d);
    }

    public G(D d4) {
        ArrayList arrayList = d4.f2206a;
        int size = arrayList.size();
        ArrayList arrayList2 = f2216d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f2217a = Collections.unmodifiableList(arrayList3);
    }

    public final AbstractC0104l a(Class cls) {
        return c(cls, b3.f.f4193a, null);
    }

    public final AbstractC0104l b(Type type) {
        return c(type, b3.f.f4193a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [Z2.l] */
    public final AbstractC0104l c(Type type, Set set, String str) {
        E e4;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type a2 = b3.f.a(type);
        if (a2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) a2;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                a2 = upperBounds[0];
            }
        }
        Object asList = set.isEmpty() ? a2 : Arrays.asList(a2, set);
        synchronized (this.f2219c) {
            try {
                AbstractC0104l abstractC0104l = (AbstractC0104l) this.f2219c.get(asList);
                if (abstractC0104l != null) {
                    return abstractC0104l;
                }
                F f2 = (F) this.f2218b.get();
                if (f2 == null) {
                    f2 = new F(this);
                    this.f2218b.set(f2);
                }
                ArrayList arrayList = f2.f2212a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    ArrayDeque arrayDeque = f2.f2213b;
                    if (i >= size) {
                        E e5 = new E(a2, str, asList);
                        arrayList.add(e5);
                        arrayDeque.add(e5);
                        e4 = null;
                        break;
                    }
                    e4 = (E) arrayList.get(i);
                    if (e4.f2210c.equals(asList)) {
                        arrayDeque.add(e4);
                        ?? r13 = e4.f2211d;
                        if (r13 != 0) {
                            e4 = r13;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (e4 != null) {
                        return e4;
                    }
                    try {
                        int size2 = this.f2217a.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            AbstractC0104l a4 = ((InterfaceC0103k) this.f2217a.get(i4)).a(a2, set, this);
                            if (a4 != null) {
                                ((E) f2.f2213b.getLast()).f2211d = a4;
                                f2.b(true);
                                return a4;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + b3.f.j(a2, set));
                    } catch (IllegalArgumentException e6) {
                        throw f2.a(e6);
                    }
                } finally {
                    f2.b(false);
                }
            } finally {
            }
        }
    }
}
