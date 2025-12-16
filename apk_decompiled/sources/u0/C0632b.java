package u0;

import C.w;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8595b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8597d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8600g;

    public C0632b(String name, String type, boolean z3, int i, String str, int i4) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        boolean contains$default7;
        boolean contains$default8;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8594a = name;
        this.f8595b = type;
        this.f8596c = z3;
        this.f8597d = i;
        this.f8598e = str;
        this.f8599f = i4;
        int i5 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            contains$default = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "INT", false, 2, (Object) null);
            if (contains$default) {
                i5 = 3;
            } else {
                contains$default2 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "CHAR", false, 2, (Object) null);
                if (!contains$default2) {
                    contains$default3 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "CLOB", false, 2, (Object) null);
                    if (!contains$default3) {
                        contains$default4 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "TEXT", false, 2, (Object) null);
                        if (!contains$default4) {
                            contains$default5 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "BLOB", false, 2, (Object) null);
                            if (!contains$default5) {
                                contains$default6 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "REAL", false, 2, (Object) null);
                                if (!contains$default6) {
                                    contains$default7 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "FLOA", false, 2, (Object) null);
                                    if (!contains$default7) {
                                        contains$default8 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) "DOUB", false, 2, (Object) null);
                                        if (!contains$default8) {
                                            i5 = 1;
                                        }
                                    }
                                }
                                i5 = 4;
                            }
                        }
                    }
                }
                i5 = 2;
            }
        }
        this.f8600g = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0632b)) {
                return false;
            }
            C0632b c0632b = (C0632b) obj;
            if (this.f8597d != c0632b.f8597d) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f8594a, c0632b.f8594a) || this.f8596c != c0632b.f8596c) {
                return false;
            }
            int i = c0632b.f8599f;
            String str = c0632b.f8598e;
            String str2 = this.f8598e;
            int i4 = this.f8599f;
            if (i4 == 1 && i == 2 && str2 != null && !AbstractC0631a.a(str2, str)) {
                return false;
            }
            if (i4 == 2 && i == 1 && str != null && !AbstractC0631a.a(str, str2)) {
                return false;
            }
            if (i4 != 0 && i4 == i) {
                if (str2 != null) {
                    if (!AbstractC0631a.a(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f8600g != c0632b.f8600g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f8594a.hashCode() * 31) + this.f8600g) * 31) + (this.f8596c ? 1231 : 1237)) * 31) + this.f8597d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f8594a);
        sb.append("', type='");
        sb.append(this.f8595b);
        sb.append("', affinity='");
        sb.append(this.f8600g);
        sb.append("', notNull=");
        sb.append(this.f8596c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f8597d);
        sb.append(", defaultValue='");
        String str = this.f8598e;
        if (str == null) {
            str = "undefined";
        }
        return w.r(sb, str, "'}");
    }
}
