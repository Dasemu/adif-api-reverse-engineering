package f0;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import m.J0;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345i extends d0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6461a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f6462b;

    public C0345i(EditText editText) {
        this.f6462b = new WeakReference(editText);
    }

    @Override // d0.f
    public void a() {
        switch (this.f6461a) {
            case 1:
                J0 j02 = (J0) this.f6462b.get();
                if (j02 != null) {
                    j02.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d0.f
    public final void b() {
        switch (this.f6461a) {
            case 0:
                C0346j.a((EditText) this.f6462b.get(), 1);
                return;
            default:
                J0 j02 = (J0) this.f6462b.get();
                if (j02 != null) {
                    j02.c();
                    return;
                }
                return;
        }
    }

    public C0345i(J0 j02) {
        this.f6462b = new WeakReference(j02);
    }
}
