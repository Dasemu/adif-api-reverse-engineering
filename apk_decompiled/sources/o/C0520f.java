package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0520f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0517c f7894a;

    /* renamed from: b, reason: collision with root package name */
    public C0517c f7895b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f7896c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f7897d = 0;

    public C0517c a(Object obj) {
        C0517c c0517c = this.f7894a;
        while (c0517c != null && !c0517c.f7887a.equals(obj)) {
            c0517c = c0517c.f7889c;
        }
        return c0517c;
    }

    public Object b(Object obj, Object obj2) {
        C0517c a2 = a(obj);
        if (a2 != null) {
            return a2.f7888b;
        }
        C0517c c0517c = new C0517c(obj, obj2);
        this.f7897d++;
        C0517c c0517c2 = this.f7895b;
        if (c0517c2 == null) {
            this.f7894a = c0517c;
            this.f7895b = c0517c;
            return null;
        }
        c0517c2.f7889c = c0517c;
        c0517c.f7890d = c0517c2;
        this.f7895b = c0517c;
        return null;
    }

    public Object c(Object obj) {
        C0517c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f7897d--;
        WeakHashMap weakHashMap = this.f7896c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0519e) it.next()).a(a2);
            }
        }
        C0517c c0517c = a2.f7890d;
        if (c0517c != null) {
            c0517c.f7889c = a2.f7889c;
        } else {
            this.f7894a = a2.f7889c;
        }
        C0517c c0517c2 = a2.f7889c;
        if (c0517c2 != null) {
            c0517c2.f7890d = c0517c;
        } else {
            this.f7895b = c0517c;
        }
        a2.f7889c = null;
        a2.f7890d = null;
        return a2.f7888b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C0516b) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof o.C0520f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.f r6 = (o.C0520f) r6
            int r1 = r5.f7897d
            int r3 = r6.f7897d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            o.b r1 = (o.C0516b) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            o.b r3 = (o.C0516b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            o.b r6 = (o.C0516b) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0520f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C0516b c0516b = (C0516b) it;
            if (!c0516b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c0516b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0516b c0516b = new C0516b(this.f7894a, this.f7895b, 0);
        this.f7896c.put(c0516b, Boolean.FALSE);
        return c0516b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0516b c0516b = (C0516b) it;
            if (!c0516b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0516b.next()).toString());
            if (c0516b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
