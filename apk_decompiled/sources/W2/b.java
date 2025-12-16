package W2;

import T2.e;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1971a;

    /* renamed from: b, reason: collision with root package name */
    public static final T2.a f1972b;

    /* renamed from: c, reason: collision with root package name */
    public static final T2.a f1973c;

    /* renamed from: d, reason: collision with root package name */
    public static final T2.a f1974d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f1971a = z3;
        if (!z3) {
            f1972b = null;
            f1973c = null;
            f1974d = null;
        } else {
            new e(Date.class);
            new e(Timestamp.class);
            f1972b = a.f1966c;
            f1973c = a.f1967d;
            f1974d = a.f1968e;
        }
    }
}
