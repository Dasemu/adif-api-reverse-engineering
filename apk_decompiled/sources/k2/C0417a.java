package k2;

import B2.d;
import E2.g;
import E2.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adif.elcanomovil.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import x2.i;
import x2.j;
import x2.m;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0417a extends Drawable implements i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7050a;

    /* renamed from: b, reason: collision with root package name */
    public final g f7051b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7052c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7053d;

    /* renamed from: e, reason: collision with root package name */
    public final c f7054e;

    /* renamed from: f, reason: collision with root package name */
    public float f7055f;

    /* renamed from: g, reason: collision with root package name */
    public float f7056g;
    public final int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f7057j;

    /* renamed from: k, reason: collision with root package name */
    public float f7058k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f7059l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f7060m;

    public C0417a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f7050a = weakReference;
        m.c(context, m.f8966b, "Theme.MaterialComponents");
        this.f7053d = new Rect();
        j jVar = new j(this);
        this.f7052c = jVar;
        TextPaint textPaint = jVar.f8958a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, bVar);
        this.f7054e = cVar;
        boolean f2 = f();
        b bVar2 = cVar.f7089b;
        g gVar = new g(k.a(context, f2 ? bVar2.f7071g.intValue() : bVar2.f7069e.intValue(), f() ? bVar2.h.intValue() : bVar2.f7070f.intValue(), new E2.a(0)).a());
        this.f7051b = gVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f8964g != (dVar = new d(context2, bVar2.f7068d.intValue()))) {
            jVar.b(dVar, context2);
            textPaint.setColor(bVar2.f7067c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = bVar2.f7074l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.h = bVar2.f7075m;
        }
        jVar.f8962e = true;
        j();
        invalidateSelf();
        jVar.f8962e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar2.f7066b.intValue());
        if (gVar.f400a.f388c != valueOf) {
            gVar.j(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f7067c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f7059l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f7059l.get();
            WeakReference weakReference3 = this.f7060m;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(bVar2.f7081t.booleanValue(), false);
    }

    @Override // x2.i
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.f7054e;
        b bVar = cVar.f7089b;
        String str = bVar.f7072j;
        boolean z3 = str != null;
        WeakReference weakReference = this.f7050a;
        if (z3) {
            int i = bVar.f7074l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!g()) {
            return null;
        }
        int i4 = this.h;
        b bVar2 = cVar.f7089b;
        if (i4 == -2 || e() <= this.h) {
            return NumberFormat.getInstance(bVar2.f7076n).format(e());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(bVar2.f7076n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.h), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        c cVar = this.f7054e;
        b bVar = cVar.f7089b;
        String str = bVar.f7072j;
        if (str != null) {
            String str2 = bVar.f7077o;
            return str2 != null ? str2 : str;
        }
        boolean g4 = g();
        b bVar2 = cVar.f7089b;
        if (!g4) {
            return bVar2.p;
        }
        if (bVar2.f7078q == 0 || (context = (Context) this.f7050a.get()) == null) {
            return null;
        }
        if (this.h != -2) {
            int e4 = e();
            int i = this.h;
            if (e4 > i) {
                return context.getString(bVar2.f7079r, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(bVar2.f7078q, e(), Integer.valueOf(e()));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f7060m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b4;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f7051b.draw(canvas);
        if (!f() || (b4 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        j jVar = this.f7052c;
        jVar.f8958a.getTextBounds(b4, 0, b4.length(), rect);
        float exactCenterY = this.f7056g - rect.exactCenterY();
        canvas.drawText(b4, this.f7055f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), jVar.f8958a);
    }

    public final int e() {
        int i = this.f7054e.f7089b.f7073k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.f7054e.f7089b.f7072j != null || g();
    }

    public final boolean g() {
        b bVar = this.f7054e.f7089b;
        return bVar.f7072j == null && bVar.f7073k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7054e.f7089b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7053d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7053d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f7050a.get();
        if (context == null) {
            return;
        }
        boolean f2 = f();
        c cVar = this.f7054e;
        this.f7051b.setShapeAppearanceModel(k.a(context, f2 ? cVar.f7089b.f7071g.intValue() : cVar.f7089b.f7069e.intValue(), f() ? cVar.f7089b.h.intValue() : cVar.f7089b.f7070f.intValue(), new E2.a(0)).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f7059l = new WeakReference(view);
        this.f7060m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C0417a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, x2.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.f7054e;
        cVar.f7088a.i = i;
        cVar.f7089b.i = i;
        this.f7052c.f8958a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
