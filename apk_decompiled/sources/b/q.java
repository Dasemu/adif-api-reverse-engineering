package b;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4131a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4132b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4133c;

    public q(j executor, n reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f4131a = new Object();
        this.f4133c = new ArrayList();
    }

    public final void a() {
        synchronized (this.f4131a) {
            try {
                this.f4132b = true;
                Iterator it = this.f4133c.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f4133c.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
