package M;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1060e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1062b;

    /* renamed from: c, reason: collision with root package name */
    public int f1063c;

    /* renamed from: d, reason: collision with root package name */
    public char f1064d;

    static {
        for (int i = 0; i < 1792; i++) {
            f1060e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f1061a = charSequence;
        this.f1062b = charSequence.length();
    }

    public final byte a() {
        int i = this.f1063c - 1;
        CharSequence charSequence = this.f1061a;
        char charAt = charSequence.charAt(i);
        this.f1064d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1063c);
            this.f1063c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1063c--;
        char c4 = this.f1064d;
        return c4 < 1792 ? f1060e[c4] : Character.getDirectionality(c4);
    }
}
