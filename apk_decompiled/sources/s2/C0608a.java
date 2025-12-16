package s2;

import a.AbstractC0106b;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import x2.i;
import x2.j;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0608a extends AbstractC0106b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8411b;

    public /* synthetic */ C0608a(Object obj, int i) {
        this.f8410a = i;
        this.f8411b = obj;
    }

    private final void J(int i) {
    }

    @Override // a.AbstractC0106b
    public final void y(int i) {
        switch (this.f8410a) {
            case 0:
                return;
            default:
                j jVar = (j) this.f8411b;
                jVar.f8962e = true;
                i iVar = (i) jVar.f8963f.get();
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
        }
    }

    @Override // a.AbstractC0106b
    public final void z(Typeface typeface, boolean z3) {
        switch (this.f8410a) {
            case 0:
                Chip chip = (Chip) this.f8411b;
                C0612e c0612e = chip.f5616e;
                chip.setText(c0612e.A0 ? c0612e.f8418C : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z3) {
                    return;
                }
                j jVar = (j) this.f8411b;
                jVar.f8962e = true;
                i iVar = (i) jVar.f8963f.get();
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
        }
    }
}
