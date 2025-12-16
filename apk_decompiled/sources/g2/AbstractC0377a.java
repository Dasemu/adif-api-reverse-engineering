package g2;

import T1.d;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0377a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f6743a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6744b;

    static {
        HashMap hashMap = new HashMap();
        f6744b = hashMap;
        hashMap.put(d.f1658a, 0);
        hashMap.put(d.f1659b, 1);
        hashMap.put(d.f1660c, 2);
        for (d dVar : hashMap.keySet()) {
            f6743a.append(((Integer) f6744b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f6744b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) f6743a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i, "Unknown Priority for value "));
    }
}
