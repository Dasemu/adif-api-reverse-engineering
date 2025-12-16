package I2;

import android.text.Editable;

/* loaded from: classes3.dex */
public final class m extends x2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f835a;

    public m(q qVar) {
        this.f835a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f835a.b().a();
    }

    @Override // x2.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        this.f835a.b().b();
    }
}
