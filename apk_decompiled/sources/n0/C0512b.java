package n0;

import androidx.fragment.app.C0164o0;
import androidx.lifecycle.w0;
import s.k;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0512b extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0164o0 f7839b = new C0164o0(1);

    /* renamed from: a, reason: collision with root package name */
    public final k f7840a = new k();

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        super.onCleared();
        k kVar = this.f7840a;
        if (kVar.f() > 0) {
            kVar.g(0).getClass();
            throw new ClassCastException();
        }
        int i = kVar.f8356d;
        Object[] objArr = kVar.f8355c;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        kVar.f8356d = 0;
        kVar.f8353a = false;
    }
}
