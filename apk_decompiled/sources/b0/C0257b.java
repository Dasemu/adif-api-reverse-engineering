package b0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257b extends AbstractC0262g {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4153a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4154b;

    public C0257b(Map preferencesMap, boolean z3) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f4153a = preferencesMap;
        this.f4154b = new AtomicBoolean(z3);
    }

    @Override // b0.AbstractC0262g
    public final Object a(C0260e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f4153a.get(key);
    }

    public final void b() {
        if (this.f4154b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(C0260e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        Map map = this.f4153a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            b();
            map.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                map.put(key, obj);
                return;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet((Iterable) obj));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, unmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0257b)) {
            return false;
        }
        return Intrinsics.areEqual(this.f4153a, ((C0257b) obj).f4153a);
    }

    public final int hashCode() {
        return this.f4153a.hashCode();
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f4153a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0256a.f4152a, 24, null);
        return joinToString$default;
    }

    public /* synthetic */ C0257b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
