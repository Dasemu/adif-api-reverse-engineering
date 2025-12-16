package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3353a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3354b;

    public C0184e(HashMap hashMap) {
        this.f3354b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            A a2 = (A) entry.getValue();
            List list = (List) this.f3353a.get(a2);
            if (list == null) {
                list = new ArrayList();
                this.f3353a.put(a2, list);
            }
            list.add((C0185f) entry.getKey());
        }
    }

    public static void a(List list, J j4, A a2, I i) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0185f c0185f = (C0185f) list.get(size);
                c0185f.getClass();
                try {
                    int i4 = c0185f.f3360a;
                    Method method = c0185f.f3361b;
                    if (i4 == 0) {
                        method.invoke(i, new Object[0]);
                    } else if (i4 == 1) {
                        method.invoke(i, j4);
                    } else if (i4 == 2) {
                        method.invoke(i, j4, a2);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to call observer method", e5.getCause());
                }
            }
        }
    }
}
