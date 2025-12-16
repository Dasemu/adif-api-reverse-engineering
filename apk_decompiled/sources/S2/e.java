package S2;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class e implements p, d0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1588b;

    public /* synthetic */ e(String str, int i) {
        this.f1587a = i;
        this.f1588b = str;
    }

    @Override // d0.m
    public Object d() {
        return this;
    }

    @Override // S2.p
    public Object j() {
        switch (this.f1587a) {
            case 0:
                throw new RuntimeException(this.f1588b);
            default:
                throw new RuntimeException(this.f1588b);
        }
    }

    @Override // d0.m
    public boolean k(CharSequence charSequence, int i, int i4, d0.t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), this.f1588b)) {
            return true;
        }
        tVar.f6157c = (tVar.f6157c & 3) | 4;
        return false;
    }
}
