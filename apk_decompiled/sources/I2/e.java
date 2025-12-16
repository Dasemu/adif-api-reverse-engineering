package I2;

import a.AbstractC0105a;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q qVar, int i) {
        super(qVar);
        this.f813e = i;
    }

    @Override // I2.r
    public void r() {
        switch (this.f813e) {
            case 0:
                q qVar = this.f863b;
                qVar.f855o = null;
                CheckableImageButton checkableImageButton = qVar.f849g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0105a.P(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
