package f0;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6453a;

    /* renamed from: b, reason: collision with root package name */
    public C0340d f6454b;

    public C0341e(TextView textView) {
        this.f6453a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f6453a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            d0.h r1 = d0.h.a()
            int r1 = r1.b()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            d0.h r3 = d0.h.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.e(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            d0.h r5 = d0.h.a()
            f0.d r6 = r3.f6454b
            if (r6 != 0) goto L58
            f0.d r6 = new f0.d
            r6.<init>(r0, r3)
            r3.f6454b = r6
        L58:
            f0.d r3 = r3.f6454b
            r5.f(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0341e.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
