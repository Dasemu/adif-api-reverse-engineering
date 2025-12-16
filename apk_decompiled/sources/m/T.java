package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e3.C0325k;
import f.AbstractC0336a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f7608a;

    /* renamed from: b, reason: collision with root package name */
    public C0325k f7609b;

    /* renamed from: c, reason: collision with root package name */
    public C0325k f7610c;

    /* renamed from: d, reason: collision with root package name */
    public C0325k f7611d;

    /* renamed from: e, reason: collision with root package name */
    public C0325k f7612e;

    /* renamed from: f, reason: collision with root package name */
    public C0325k f7613f;

    /* renamed from: g, reason: collision with root package name */
    public C0325k f7614g;
    public C0325k h;
    public final C0451a0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f7615j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7616k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f7617l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7618m;

    public T(TextView textView) {
        this.f7608a = textView;
        this.i = new C0451a0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e3.k, java.lang.Object] */
    public static C0325k c(Context context, C0487t c0487t, int i) {
        ColorStateList f2;
        synchronized (c0487t) {
            f2 = c0487t.f7745a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f6367b = true;
        obj.f6368c = f2;
        return obj;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            T.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            T.a.a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = text.length();
        if (i6 < 0 || i4 > length) {
            m3.d.I(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            m3.d.I(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m3.d.I(editorInfo, text, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(text.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (Character.isLowSurrogate(text.charAt(i11))) {
            i11++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
            min--;
        }
        int i12 = min2 + i9;
        m3.d.I(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public final void a(Drawable drawable, C0325k c0325k) {
        if (drawable == null || c0325k == null) {
            return;
        }
        C0487t.e(drawable, c0325k, this.f7608a.getDrawableState());
    }

    public final void b() {
        C0325k c0325k = this.f7609b;
        TextView textView = this.f7608a;
        if (c0325k != null || this.f7610c != null || this.f7611d != null || this.f7612e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f7609b);
            a(compoundDrawables[1], this.f7610c);
            a(compoundDrawables[2], this.f7611d);
            a(compoundDrawables[3], this.f7612e);
        }
        if (this.f7613f == null && this.f7614g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f7613f);
        a(compoundDrawablesRelative[2], this.f7614g);
    }

    public final ColorStateList d() {
        C0325k c0325k = this.h;
        if (c0325k != null) {
            return (ColorStateList) c0325k.f6368c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0325k c0325k = this.h;
        if (c0325k != null) {
            return (PorterDuff.Mode) c0325k.f6369d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0336a.f6441w);
        R0.h hVar = new R0.h(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f7608a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        k(context, hVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            Q.d(textView, string);
        }
        hVar.n();
        Typeface typeface = this.f7617l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7615j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e3.k, java.lang.Object] */
    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new Object();
        }
        C0325k c0325k = this.h;
        c0325k.f6368c = colorStateList;
        c0325k.f6367b = colorStateList != null;
        this.f7609b = c0325k;
        this.f7610c = c0325k;
        this.f7611d = c0325k;
        this.f7612e = c0325k;
        this.f7613f = c0325k;
        this.f7614g = c0325k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e3.k, java.lang.Object] */
    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new Object();
        }
        C0325k c0325k = this.h;
        c0325k.f6369d = mode;
        c0325k.f6366a = mode != null;
        this.f7609b = c0325k;
        this.f7610c = c0325k;
        this.f7611d = c0325k;
        this.f7612e = c0325k;
        this.f7613f = c0325k;
        this.f7614g = c0325k;
    }

    public final void k(Context context, R0.h hVar) {
        String string;
        int i = this.f7615j;
        TypedArray typedArray = (TypedArray) hVar.f1414b;
        this.f7615j = typedArray.getInt(2, i);
        int i4 = typedArray.getInt(11, -1);
        this.f7616k = i4;
        if (i4 != -1) {
            this.f7615j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7618m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f7617l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f7617l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f7617l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7617l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f7616k;
        int i8 = this.f7615j;
        if (!context.isRestricted()) {
            try {
                Typeface h = hVar.h(i6, this.f7615j, new O(this, i7, i8, new WeakReference(this.f7608a)));
                if (h != null) {
                    if (this.f7616k != -1) {
                        this.f7617l = S.a(Typeface.create(h, 0), this.f7616k, (this.f7615j & 2) != 0);
                    } else {
                        this.f7617l = h;
                    }
                }
                this.f7618m = this.f7617l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7617l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (this.f7616k != -1) {
            this.f7617l = S.a(Typeface.create(string, 0), this.f7616k, (this.f7615j & 2) != 0);
        } else {
            this.f7617l = Typeface.create(string, this.f7615j);
        }
    }
}
