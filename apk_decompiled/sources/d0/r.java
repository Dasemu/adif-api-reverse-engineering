package d0;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6150a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6151b = new AtomicInteger(0);

    public r(Object obj) {
        this.f6150a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f6150a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        ((TextWatcher) this.f6150a).beforeTextChanged(charSequence, i, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i4) {
        if (this.f6151b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f6150a).onSpanAdded(spannable, obj, i, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i4, int i5, int i6) {
        if (this.f6151b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f6150a).onSpanChanged(spannable, obj, i, i4, i5, i6);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i4) {
        if (this.f6151b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f6150a).onSpanRemoved(spannable, obj, i, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        ((TextWatcher) this.f6150a).onTextChanged(charSequence, i, i4, i5);
    }
}
