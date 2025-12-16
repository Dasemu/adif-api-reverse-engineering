package e3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0317c {

    /* renamed from: n, reason: collision with root package name */
    public static final C0317c f6330n = new C0317c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0317c f6331o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6335d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6336e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6337f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6338g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6339j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6340k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6341l;

    /* renamed from: m, reason: collision with root package name */
    public String f6342m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f6331o = new C0317c(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C0317c(boolean z3, boolean z4, int i, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str) {
        this.f6332a = z3;
        this.f6333b = z4;
        this.f6334c = i;
        this.f6335d = i4;
        this.f6336e = z5;
        this.f6337f = z6;
        this.f6338g = z7;
        this.h = i5;
        this.i = i6;
        this.f6339j = z8;
        this.f6340k = z9;
        this.f6341l = z10;
        this.f6342m = str;
    }

    public final String toString() {
        String str = this.f6342m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6332a) {
            sb.append("no-cache, ");
        }
        if (this.f6333b) {
            sb.append("no-store, ");
        }
        int i = this.f6334c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i4 = this.f6335d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f6336e) {
            sb.append("private, ");
        }
        if (this.f6337f) {
            sb.append("public, ");
        }
        if (this.f6338g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f6339j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6340k) {
            sb.append("no-transform, ");
        }
        if (this.f6341l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f6342m = sb2;
        return sb2;
    }
}
