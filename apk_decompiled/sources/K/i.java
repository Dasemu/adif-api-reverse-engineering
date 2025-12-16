package K;

import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f971b = new i(new j(h.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final j f972a;

    public i(j jVar) {
        this.f972a = jVar;
    }

    public static i a(String str) {
        if (str == null || str.isEmpty()) {
            return f971b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = g.a(split[i]);
        }
        return new i(new j(h.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f972a.equals(((i) obj).f972a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f972a.f973a.hashCode();
    }

    public final String toString() {
        return this.f972a.f973a.toString();
    }
}
