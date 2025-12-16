package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3637a;

    /* renamed from: b, reason: collision with root package name */
    public int f3638b;

    /* renamed from: c, reason: collision with root package name */
    public int f3639c;

    /* renamed from: d, reason: collision with root package name */
    public int f3640d;

    /* renamed from: e, reason: collision with root package name */
    public int f3641e;

    public final boolean a() {
        int i = this.f3637a;
        int i4 = 2;
        if ((i & 7) != 0) {
            int i5 = this.f3640d;
            int i6 = this.f3638b;
            if (((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i7 = this.f3640d;
            int i8 = this.f3639c;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i9 = this.f3641e;
            int i10 = this.f3638b;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i11 = this.f3641e;
            int i12 = this.f3639c;
            if (i11 > i12) {
                i4 = 1;
            } else if (i11 != i12) {
                i4 = 4;
            }
            if (((i4 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
