package e3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0328n {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f6376j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f6377k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f6378l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f6379m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f6380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6381b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6383d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6384e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6385f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6386g;
    public final boolean h;
    public final boolean i;

    public C0328n(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f6380a = str;
        this.f6381b = str2;
        this.f6382c = j4;
        this.f6383d = str3;
        this.f6384e = str4;
        this.f6385f = z3;
        this.f6386g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0328n)) {
            return false;
        }
        C0328n c0328n = (C0328n) obj;
        return Intrinsics.areEqual(c0328n.f6380a, this.f6380a) && Intrinsics.areEqual(c0328n.f6381b, this.f6381b) && c0328n.f6382c == this.f6382c && Intrinsics.areEqual(c0328n.f6383d, this.f6383d) && Intrinsics.areEqual(c0328n.f6384e, this.f6384e) && c0328n.f6385f == this.f6385f && c0328n.f6386g == this.f6386g && c0328n.h == this.h && c0328n.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + C.w.c(C.w.c(C.w.c(com.google.android.gms.measurement.internal.a.d(this.f6384e, com.google.android.gms.measurement.internal.a.d(this.f6383d, com.google.android.gms.measurement.internal.a.b(this.f6382c, com.google.android.gms.measurement.internal.a.d(this.f6381b, com.google.android.gms.measurement.internal.a.d(this.f6380a, 527, 31), 31), 31), 31), 31), 31, this.f6385f), 31, this.f6386g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6380a);
        sb.append('=');
        sb.append(this.f6381b);
        if (this.h) {
            long j4 = this.f6382c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(j4);
                j3.c cVar = j3.d.f6945a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) j3.d.f6945a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f6383d);
        }
        sb.append("; path=");
        sb.append(this.f6384e);
        if (this.f6385f) {
            sb.append("; secure");
        }
        if (this.f6386g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }
}
