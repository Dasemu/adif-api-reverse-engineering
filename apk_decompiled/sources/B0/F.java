package B0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public final View f99b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f98a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f100c = new ArrayList();

    public F(View view) {
        this.f99b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f2 = (F) obj;
        return this.f99b == f2.f99b && this.f98a.equals(f2.f98a);
    }

    public final int hashCode() {
        return this.f98a.hashCode() + (this.f99b.hashCode() * 31);
    }

    public final String toString() {
        String n4 = C.w.n(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f99b + "\n", "    values:");
        HashMap hashMap = this.f98a;
        for (String str : hashMap.keySet()) {
            n4 = n4 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return n4;
    }
}
