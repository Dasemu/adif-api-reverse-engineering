package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.adif.elcanomovil.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: g, reason: collision with root package name */
    public static E0 f7512g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f7514b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f7515c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7516d;

    /* renamed from: e, reason: collision with root package name */
    public I0.g f7517e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f7511f = PorterDuff.Mode.SRC_IN;
    public static final D0 h = new s.i(6);

    public static synchronized E0 b() {
        E0 e02;
        synchronized (E0.class) {
            try {
                if (f7512g == null) {
                    f7512g = new E0();
                }
                e02 = f7512g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (E0.class) {
            D0 d02 = h;
            d02.getClass();
            int i4 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) d02.get(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f7515c == null) {
            this.f7515c = new TypedValue();
        }
        TypedValue typedValue = this.f7515c;
        context.getResources().getValue(i, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.g gVar = (s.g) this.f7514b.get(context);
            drawable = null;
            if (gVar != null) {
                WeakReference weakReference = (WeakReference) gVar.b(j4);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        gVar.f(j4);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f7517e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = I0.g.f(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = I0.g.f(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = I0.g.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    s.g gVar2 = (s.g) this.f7514b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new s.g();
                        this.f7514b.put(context, gVar2);
                    }
                    gVar2.e(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z3) {
        Drawable a2;
        try {
            if (!this.f7516d) {
                this.f7516d = true;
                Drawable c4 = c(context, R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof C0.p) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.f7516d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = D.h.getDrawable(context, i);
            }
            if (a2 != null) {
                a2 = g(context, i, z3, a2);
            }
            if (a2 != null) {
                AbstractC0463g0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        s.k kVar;
        WeakHashMap weakHashMap = this.f7513a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (s.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.c(i);
        if (colorStateList == null) {
            I0.g gVar = this.f7517e;
            if (gVar != null) {
                colorStateList2 = gVar.g(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f7513a == null) {
                    this.f7513a = new WeakHashMap();
                }
                s.k kVar2 = (s.k) this.f7513a.get(context);
                if (kVar2 == null) {
                    kVar2 = new s.k();
                    this.f7513a.put(context, kVar2);
                }
                kVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.E0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
