package o0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final E f7914a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7916c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7918e;

    public D(E destination, Bundle bundle, boolean z3, boolean z4, int i) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f7914a = destination;
        this.f7915b = bundle;
        this.f7916c = z3;
        this.f7917d = z4;
        this.f7918e = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(D other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z3 = this.f7916c;
        if (z3 && !other.f7916c) {
            return 1;
        }
        if (!z3 && other.f7916c) {
            return -1;
        }
        Bundle bundle = this.f7915b;
        if (bundle != null && other.f7915b == null) {
            return 1;
        }
        if (bundle == null && other.f7915b != null) {
            return -1;
        }
        if (bundle != null) {
            int size = bundle.size();
            Bundle bundle2 = other.f7915b;
            Intrinsics.checkNotNull(bundle2);
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.f7917d;
        if (z4 && !other.f7917d) {
            return 1;
        }
        if (z4 || !other.f7917d) {
            return this.f7918e - other.f7918e;
        }
        return -1;
    }
}
