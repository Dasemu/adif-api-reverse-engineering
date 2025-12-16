package androidx.room;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import w0.InterfaceC0649e;

/* loaded from: classes.dex */
public abstract class j extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void d(InterfaceC0649e interfaceC0649e, Object obj);

    public final void e(Iterable entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC0649e a2 = a();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                d(a2, it.next());
                a2.T();
            }
        } finally {
            c(a2);
        }
    }
}
