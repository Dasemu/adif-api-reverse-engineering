package o0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public C0540q f7964a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7965b;

    public abstract E a();

    public final C0540q b() {
        C0540q c0540q = this.f7964a;
        if (c0540q != null) {
            return c0540q;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public E c(E destination, Bundle bundle, K k4) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, K k4) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(entries), new b1.e(5, this, k4))).iterator();
        while (it.hasNext()) {
            b().e((C0537n) it.next());
        }
    }

    public void e(C0540q state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f7964a = state;
        this.f7965b = true;
    }

    public void f(C0537n backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        E e4 = backStackEntry.f8006b;
        if (e4 == null) {
            e4 = null;
        }
        if (e4 == null) {
            return;
        }
        c(e4, null, m3.l.K(C0526c.f7984l));
        b().b(backStackEntry);
    }

    public void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle h() {
        return null;
    }

    public void i(C0537n popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().f8026e.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0537n c0537n = null;
        while (j()) {
            c0537n = (C0537n) listIterator.previous();
            if (Intrinsics.areEqual(c0537n, popUpTo)) {
                break;
            }
        }
        if (c0537n != null) {
            b().c(c0537n, z3);
        }
    }

    public boolean j() {
        return true;
    }
}
