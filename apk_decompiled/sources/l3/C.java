package l3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f7370a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7371b = new int[10];

    public final int a() {
        if ((this.f7370a & 128) != 0) {
            return this.f7371b[7];
        }
        return 65535;
    }

    public final void b(C other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f7370a) != 0) {
                c(i, other.f7371b[i]);
            }
        }
    }

    public final void c(int i, int i4) {
        if (i >= 0) {
            int[] iArr = this.f7371b;
            if (i >= iArr.length) {
                return;
            }
            this.f7370a = (1 << i) | this.f7370a;
            iArr[i] = i4;
        }
    }
}
