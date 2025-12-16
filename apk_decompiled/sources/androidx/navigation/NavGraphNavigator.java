package androidx.navigation;

import C.w;
import android.os.Bundle;
import f0.C0338b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o0.AbstractC0544v;
import o0.C0537n;
import o0.C0540q;
import o0.E;
import o0.H;
import o0.K;
import o0.U;
import o0.V;
import o0.W;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Lo0/V;", "Lo0/H;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@U("navigation")
/* loaded from: classes.dex */
public class NavGraphNavigator extends V {

    /* renamed from: c, reason: collision with root package name */
    public final W f3445c;

    public NavGraphNavigator(W navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f3445c = navigatorProvider;
    }

    @Override // o0.V
    public final E a() {
        return new H(this);
    }

    @Override // o0.V
    public final void d(List entries, K k4) {
        String str;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0537n c0537n = (C0537n) it.next();
            H h = (H) c0537n.f8006b;
            int i = h.f7932l;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i4 = h.h;
                if (i4 != 0) {
                    str = h.f7922c;
                    if (str == null) {
                        str = String.valueOf(i4);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            E destination = h.j(i, false);
            if (destination == null) {
                if (h.f7933m == null) {
                    h.f7933m = String.valueOf(h.f7932l);
                }
                String str2 = h.f7933m;
                Intrinsics.checkNotNull(str2);
                throw new IllegalArgumentException(w.o("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            V b4 = this.f3445c.b(destination.f7920a);
            C0540q b5 = b();
            Bundle b6 = destination.b(c0537n.f8007c);
            Intrinsics.checkNotNullParameter(destination, "destination");
            AbstractC0544v abstractC0544v = b5.h;
            b4.d(CollectionsKt.listOf(C0338b.k(abstractC0544v.f8048a, destination, b6, abstractC0544v.j(), abstractC0544v.p)), k4);
        }
    }
}
