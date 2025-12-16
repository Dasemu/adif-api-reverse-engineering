package A2;

import U.b;
import android.R;
import android.content.res.ColorStateList;
import m.C0442A;
import m3.d;

/* loaded from: classes3.dex */
public final class a extends C0442A {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f78g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f79e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f80f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f79e == null) {
            int t2 = d.t(this, com.adif.elcanomovil.R.attr.colorControlActivated);
            int t4 = d.t(this, com.adif.elcanomovil.R.attr.colorOnSurface);
            int t5 = d.t(this, com.adif.elcanomovil.R.attr.colorSurface);
            this.f79e = new ColorStateList(f78g, new int[]{d.y(1.0f, t5, t2), d.y(0.54f, t5, t4), d.y(0.38f, t5, t4), d.y(0.38f, t5, t4)});
        }
        return this.f79e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f80f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f80f = z3;
        if (z3) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
