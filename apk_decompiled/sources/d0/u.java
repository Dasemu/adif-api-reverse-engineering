package d0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final t f6159b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f6162e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f6158a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f6160c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f6161d = 1.0f;

    public u(t tVar) {
        m3.d.i(tVar, "rasterizer cannot be null");
        this.f6159b = tVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f2, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f6162e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f6162e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i5, f2 + this.f6160c, i7, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        h.a().getClass();
        float f4 = i6;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        t tVar = this.f6159b;
        A.j jVar = tVar.f6156b;
        Typeface typeface = (Typeface) jVar.f30d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) jVar.f28b, tVar.f6155a * 2, 2, f2, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f6158a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t tVar = this.f6159b;
        this.f6161d = abs / (tVar.b().a(14) != 0 ? ((ByteBuffer) r8.f1221d).getShort(r1 + r8.f1218a) : (short) 0);
        e0.a b4 = tVar.b();
        int a2 = b4.a(14);
        if (a2 != 0) {
            ((ByteBuffer) b4.f1221d).getShort(a2 + b4.f1218a);
        }
        short s4 = (short) ((tVar.b().a(12) != 0 ? ((ByteBuffer) r5.f1221d).getShort(r7 + r5.f1218a) : (short) 0) * this.f6161d);
        this.f6160c = s4;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }
}
