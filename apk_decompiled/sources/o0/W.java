package o0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7966b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7967a = new LinkedHashMap();

    public final void a(V navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = m3.d.u(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f7967a;
        V v3 = (V) linkedHashMap.get(name);
        if (Intrinsics.areEqual(v3, navigator)) {
            return;
        }
        boolean z3 = false;
        if (v3 != null && v3.f7965b) {
            z3 = true;
        }
        if (z3) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + v3).toString());
        }
        if (!navigator.f7965b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final V b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        V v3 = (V) this.f7967a.get(name);
        if (v3 != null) {
            return v3;
        }
        throw new IllegalStateException(C.w.o("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
