package i0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0382c f6808c = new C0382c(SetsKt.emptySet(), MapsKt.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public final Set f6809a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6810b;

    public C0382c(Set flags, Map allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f6809a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allowedViolations.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.f6810b = linkedHashMap;
    }
}
