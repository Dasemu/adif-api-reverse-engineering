package d0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6152a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6153b;

    public s(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f6153b = new ArrayList();
        m3.d.i(cls, "watcherClass cannot be null");
        this.f6152a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6153b;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).f6151b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6153b;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final r c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6153b;
            if (i >= arrayList.size()) {
                return null;
            }
            r rVar = (r) arrayList.get(i);
            if (rVar.f6150a == obj) {
                return rVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f6152a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6153b;
            if (i >= arrayList.size()) {
                return;
            }
            ((r) arrayList.get(i)).f6151b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        r c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        r c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        r c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        if (this.f6152a != cls) {
            return super.getSpans(i, i4, cls);
        }
        r[] rVarArr = (r[]) super.getSpans(i, i4, r.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, rVarArr.length);
        for (int i5 = 0; i5 < rVarArr.length; i5++) {
            objArr[i5] = rVarArr[i5].f6150a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        if (cls == null || this.f6152a == cls) {
            cls = r.class;
        }
        return super.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        r rVar;
        if (d(obj)) {
            rVar = c(obj);
            if (rVar != null) {
                obj = rVar;
            }
        } else {
            rVar = null;
        }
        super.removeSpan(obj);
        if (rVar != null) {
            this.f6153b.remove(rVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence) {
        replace(i, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i5) {
        if (d(obj)) {
            r rVar = new r(obj);
            this.f6153b.add(rVar);
            obj = rVar;
        }
        super.setSpan(obj, i, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new s(this.f6152a, this, i, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence, int i5, int i6) {
        replace(i, i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i4, int i5) {
        super.insert(i, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence) {
        a();
        super.replace(i, i4, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i4, int i5) {
        super.insert(i, charSequence, i4, i5);
        return this;
    }

    public s(Class cls, s sVar, int i, int i4) {
        super(sVar, i, i4);
        this.f6153b = new ArrayList();
        m3.d.i(cls, "watcherClass cannot be null");
        this.f6152a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence, int i5, int i6) {
        a();
        super.replace(i, i4, charSequence, i5, i6);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
