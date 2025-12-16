package S2;

import C.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements Q2.m, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final h f1597c;

    /* renamed from: a, reason: collision with root package name */
    public List f1598a;

    /* renamed from: b, reason: collision with root package name */
    public List f1599b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, S2.h] */
    static {
        ?? obj = new Object();
        List list = Collections.EMPTY_LIST;
        obj.f1598a = list;
        obj.f1599b = list;
        f1597c = obj;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // Q2.m
    public final Q2.l a(Q2.d dVar, X2.a aVar) {
        boolean z3;
        boolean z4;
        boolean c4 = c(aVar.getRawType());
        if (c4) {
            z3 = true;
        } else {
            b(true);
            z3 = false;
        }
        if (c4) {
            z4 = true;
        } else {
            b(false);
            z4 = false;
        }
        if (z3 || z4) {
            return new g(this, z4, z3, dVar, aVar);
        }
        return null;
    }

    public final void b(boolean z3) {
        Iterator it = (z3 ? this.f1598a : this.f1599b).iterator();
        if (it.hasNext()) {
            throw w.g(it);
        }
    }

    public final Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }
}
