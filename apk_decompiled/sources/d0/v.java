package d0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class v implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6163a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f6164b;

    public v(Spannable spannable) {
        this.f6164b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6164b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6164b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6164b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6164b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6164b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6164b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        return this.f6164b.getSpans(i, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6164b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        return this.f6164b.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f6164b;
        if (!this.f6163a && (spannable instanceof PrecomputedText)) {
            this.f6164b = new SpannableString(spannable);
        }
        this.f6163a = true;
        this.f6164b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i5) {
        Spannable spannable = this.f6164b;
        if (!this.f6163a && (spannable instanceof PrecomputedText)) {
            this.f6164b = new SpannableString(spannable);
        }
        this.f6163a = true;
        this.f6164b.setSpan(obj, i, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return this.f6164b.subSequence(i, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6164b.toString();
    }
}
