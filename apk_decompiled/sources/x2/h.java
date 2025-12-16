package x2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8949a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f8950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8951c;

    /* renamed from: d, reason: collision with root package name */
    public int f8952d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8956j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f8953e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f8954f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f8955g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f8957k = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f8949a = charSequence;
        this.f8950b = textPaint;
        this.f8951c = i;
        this.f8952d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f8949a == null) {
            this.f8949a = "";
        }
        int max = Math.max(0, this.f8951c);
        CharSequence charSequence = this.f8949a;
        int i = this.f8954f;
        TextPaint textPaint = this.f8950b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f8957k);
        }
        int min = Math.min(charSequence.length(), this.f8952d);
        this.f8952d = min;
        if (this.f8956j && this.f8954f == 1) {
            this.f8953e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f8953e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f8956j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8957k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f8954f);
        float f2 = this.f8955g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(BitmapDescriptorFactory.HUE_RED, f2);
        }
        if (this.f8954f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
