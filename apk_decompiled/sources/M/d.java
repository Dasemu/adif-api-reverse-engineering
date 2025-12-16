package M;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1073d;

    public d(PrecomputedText.Params params) {
        this.f1070a = params.getTextPaint();
        this.f1071b = params.getTextDirection();
        this.f1072c = params.getBreakStrategy();
        this.f1073d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1072c != dVar.f1072c || this.f1073d != dVar.f1073d) {
            return false;
        }
        TextPaint textPaint = this.f1070a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = dVar.f1070a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f1071b == dVar.f1071b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1070a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1071b, Integer.valueOf(this.f1072c), Integer.valueOf(this.f1073d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1070a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f1071b);
        sb.append(", breakStrategy=" + this.f1072c);
        sb.append(", hyphenationFrequency=" + this.f1073d);
        sb.append("}");
        return sb.toString();
    }
}
