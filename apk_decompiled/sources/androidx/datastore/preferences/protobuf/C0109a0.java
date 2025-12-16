package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0130v f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2888b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2889c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2890d;

    public C0109a0(AbstractC0130v abstractC0130v, String str, Object[] objArr) {
        this.f2887a = abstractC0130v;
        this.f2888b = str;
        this.f2889c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2890d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f2890d = i | (charAt2 << i5);
                return;
            } else {
                i |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }
}
