package x2;

import android.content.Context;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import s2.C0608a;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public float f8960c;

    /* renamed from: d, reason: collision with root package name */
    public float f8961d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f8963f;

    /* renamed from: g, reason: collision with root package name */
    public B2.d f8964g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f8958a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C0608a f8959b = new C0608a(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f8962e = true;

    public j(i iVar) {
        this.f8963f = new WeakReference(null);
        this.f8963f = new WeakReference(iVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f8958a;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        this.f8960c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            f2 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f8961d = f2;
        this.f8962e = false;
    }

    public final void b(B2.d dVar, Context context) {
        if (this.f8964g != dVar) {
            this.f8964g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f8958a;
                C0608a c0608a = this.f8959b;
                dVar.f(context, textPaint, c0608a);
                i iVar = (i) this.f8963f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, c0608a);
                this.f8962e = true;
            }
            i iVar2 = (i) this.f8963f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}
