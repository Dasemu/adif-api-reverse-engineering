package I0;

import C.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.adif.elcanomovil.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import m.C0487t;
import m.E0;
import m.K0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Object f753a;

    /* renamed from: b, reason: collision with root package name */
    public Object f754b = W0.d.f1886a;

    /* renamed from: c, reason: collision with root package name */
    public Object f755c = null;

    /* renamed from: d, reason: collision with root package name */
    public Object f756d = null;

    /* renamed from: e, reason: collision with root package name */
    public Object f757e = null;

    /* renamed from: f, reason: collision with root package name */
    public Object f758f = new W0.h(true, true, true, 4, J0.l.f946a);

    public g(Context context) {
        this.f753a = context.getApplicationContext();
    }

    public static boolean b(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i) {
        int c4 = K0.c(context, R.attr.colorControlHighlight);
        int b4 = K0.b(context, R.attr.colorButtonNormal);
        int[] iArr = K0.f7582b;
        int[] iArr2 = K0.f7584d;
        int b5 = G.a.b(c4, i);
        return new ColorStateList(new int[][]{iArr, iArr2, K0.f7583c, K0.f7586f}, new int[]{b4, b5, G.a.b(c4, i), i});
    }

    public static LayerDrawable f(E0 e02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c4 = e02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c5 = e02.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c4;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c5 instanceof BitmapDrawable) && c5.getIntrinsicWidth() == dimensionPixelSize && c5.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c5;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c5.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void h(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0487t.f7743b;
        }
        mutate.setColorFilter(C0487t.c(i, mode));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f758f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public p c() {
        S0.c cVar = (S0.c) this.f754b;
        Lazy lazy = (Lazy) this.f755c;
        if (lazy == null) {
            lazy = LazyKt.lazy(new e(this, 0));
        }
        Lazy lazy2 = lazy;
        Lazy lazy3 = (Lazy) this.f756d;
        if (lazy3 == null) {
            lazy3 = LazyKt.lazy(new e(this, 1));
        }
        Lazy lazy4 = lazy3;
        Lazy lazy5 = (Lazy) this.f757e;
        if (lazy5 == null) {
            lazy5 = LazyKt.lazy(f.f752a);
        }
        return new p((Context) this.f753a, cVar, lazy2, lazy4, lazy5, new c(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList()), (W0.h) this.f758f);
    }

    public W1.i d() {
        String str = ((String) this.f753a) == null ? " transportName" : "";
        if (((W1.m) this.f755c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f756d) == null) {
            str = w.n(str, " eventMillis");
        }
        if (((Long) this.f757e) == null) {
            str = w.n(str, " uptimeMillis");
        }
        if (((HashMap) this.f758f) == null) {
            str = w.n(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new W1.i((String) this.f753a, (Integer) this.f754b, (W1.m) this.f755c, ((Long) this.f756d).longValue(), ((Long) this.f757e).longValue(), (HashMap) this.f758f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return D.h.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return D.h.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, K0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return e(context, K0.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return D.h.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f754b, i)) {
                return K0.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f757e, i)) {
                return D.h.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f758f, i)) {
                return D.h.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return D.h.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList d4 = K0.d(context, R.attr.colorSwitchThumbNormal);
        if (d4 == null || !d4.isStateful()) {
            iArr[0] = K0.f7582b;
            iArr2[0] = K0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = K0.f7585e;
            iArr2[1] = K0.c(context, R.attr.colorControlActivated);
            iArr[2] = K0.f7586f;
            iArr2[2] = K0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = K0.f7582b;
            iArr[0] = iArr3;
            iArr2[0] = d4.getColorForState(iArr3, 0);
            iArr[1] = K0.f7585e;
            iArr2[1] = K0.c(context, R.attr.colorControlActivated);
            iArr[2] = K0.f7586f;
            iArr2[2] = d4.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
