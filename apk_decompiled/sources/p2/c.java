package p2;

import E2.f;
import E2.g;
import E2.k;
import E2.u;
import O.X;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.adif.elcanomovil.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f8122a;

    /* renamed from: b, reason: collision with root package name */
    public k f8123b;

    /* renamed from: c, reason: collision with root package name */
    public int f8124c;

    /* renamed from: d, reason: collision with root package name */
    public int f8125d;

    /* renamed from: e, reason: collision with root package name */
    public int f8126e;

    /* renamed from: f, reason: collision with root package name */
    public int f8127f;

    /* renamed from: g, reason: collision with root package name */
    public int f8128g;
    public int h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8129j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f8130k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8131l;

    /* renamed from: m, reason: collision with root package name */
    public g f8132m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8135q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f8137s;

    /* renamed from: t, reason: collision with root package name */
    public int f8138t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8133n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8134o = false;
    public boolean p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8136r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f8122a = materialButton;
        this.f8123b = kVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f8137s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f8137s.getNumberOfLayers() > 2 ? (u) this.f8137s.getDrawable(2) : (u) this.f8137s.getDrawable(1);
    }

    public final g b(boolean z3) {
        RippleDrawable rippleDrawable = this.f8137s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f8137s.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f8123b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i4) {
        WeakHashMap weakHashMap = X.f1226a;
        MaterialButton materialButton = this.f8122a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f8126e;
        int i6 = this.f8127f;
        this.f8127f = i4;
        this.f8126e = i;
        if (!this.f8134o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i5, paddingEnd, (paddingBottom + i4) - i6);
    }

    public final void e() {
        g gVar = new g(this.f8123b);
        MaterialButton materialButton = this.f8122a;
        gVar.h(materialButton.getContext());
        H.a.h(gVar, this.f8129j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            H.a.i(gVar, mode);
        }
        float f2 = this.h;
        ColorStateList colorStateList = this.f8130k;
        gVar.f400a.f393j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f400a;
        if (fVar.f389d != colorStateList) {
            fVar.f389d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f8123b);
        gVar2.setTint(0);
        float f4 = this.h;
        int t2 = this.f8133n ? m3.d.t(materialButton, R.attr.colorSurface) : 0;
        gVar2.f400a.f393j = f4;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(t2);
        f fVar2 = gVar2.f400a;
        if (fVar2.f389d != valueOf) {
            fVar2.f389d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f8123b);
        this.f8132m = gVar3;
        H.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C2.a.c(this.f8131l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f8124c, this.f8126e, this.f8125d, this.f8127f), this.f8132m);
        this.f8137s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b4 = b(false);
        if (b4 != null) {
            b4.i(this.f8138t);
            b4.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b4 = b(false);
        g b5 = b(true);
        if (b4 != null) {
            float f2 = this.h;
            ColorStateList colorStateList = this.f8130k;
            b4.f400a.f393j = f2;
            b4.invalidateSelf();
            f fVar = b4.f400a;
            if (fVar.f389d != colorStateList) {
                fVar.f389d = colorStateList;
                b4.onStateChange(b4.getState());
            }
            if (b5 != null) {
                float f4 = this.h;
                int t2 = this.f8133n ? m3.d.t(this.f8122a, R.attr.colorSurface) : 0;
                b5.f400a.f393j = f4;
                b5.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(t2);
                f fVar2 = b5.f400a;
                if (fVar2.f389d != valueOf) {
                    fVar2.f389d = valueOf;
                    b5.onStateChange(b5.getState());
                }
            }
        }
    }
}
