package H2;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f704a;

    /* renamed from: b, reason: collision with root package name */
    public int f705b;

    /* renamed from: c, reason: collision with root package name */
    public View f706c;

    /* renamed from: d, reason: collision with root package name */
    public TabLayout f707d;

    /* renamed from: e, reason: collision with root package name */
    public k f708e;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence)) {
            this.f708e.setContentDescription(charSequence);
        }
        this.f704a = charSequence;
        k kVar = this.f708e;
        if (kVar != null) {
            kVar.d();
        }
    }
}
