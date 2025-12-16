package e3;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f6412k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f6413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6416d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6417e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6418f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6419g;
    public final String h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6420j;

    public w(String scheme, String username, String password, String host, int i, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6413a = scheme;
        this.f6414b = username;
        this.f6415c = password;
        this.f6416d = host;
        this.f6417e = i;
        this.f6418f = pathSegments;
        this.f6419g = arrayList;
        this.h = str;
        this.i = url;
        this.f6420j = Intrinsics.areEqual(scheme, "https");
    }

    public final String a() {
        int indexOf$default;
        int indexOf$default2;
        if (this.f6415c.length() == 0) {
            return "";
        }
        int length = this.f6413a.length() + 3;
        String str = this.i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', length, false, 4, (Object) null);
        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null);
        String substring = str.substring(indexOf$default + 1, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int indexOf$default;
        int length = this.f6413a.length() + 3;
        String str = this.i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        String substring = str.substring(indexOf$default, f3.c.f(str, indexOf$default, str.length(), "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int indexOf$default;
        int length = this.f6413a.length() + 3;
        String str = this.i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        int f2 = f3.c.f(str, indexOf$default, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < f2) {
            int i = indexOf$default + 1;
            int e4 = f3.c.e(str, '/', i, f2);
            String substring = str.substring(i, e4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = e4;
        }
        return arrayList;
    }

    public final String d() {
        int indexOf$default;
        if (this.f6419g == null) {
            return null;
        }
        String str = this.i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        int i = indexOf$default + 1;
        String substring = str.substring(i, f3.c.e(str, '#', i, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6414b.length() == 0) {
            return "";
        }
        int length = this.f6413a.length() + 3;
        String str = this.i;
        String substring = str.substring(length, f3.c.f(str, length, str.length(), ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && Intrinsics.areEqual(((w) obj).i, this.i);
    }

    public final C0335v f(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            C0335v c0335v = new C0335v();
            c0335v.d(this, link);
            return c0335v;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        C0335v f2 = f("/...");
        Intrinsics.checkNotNull(f2);
        f2.getClass();
        Intrinsics.checkNotNullParameter("", ServicePaths.AvisaLoginService.queryUsername);
        f2.f6406b = C0329o.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        Intrinsics.checkNotNullParameter("", ServicePaths.AvisaLoginService.queryPassword);
        f2.f6407c = C0329o.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return f2.a().i;
    }

    public final URI h() {
        int indexOf$default;
        String substring;
        C0335v c0335v = new C0335v();
        String scheme = this.f6413a;
        c0335v.f6405a = scheme;
        String e4 = e();
        Intrinsics.checkNotNullParameter(e4, "<set-?>");
        c0335v.f6406b = e4;
        String a2 = a();
        Intrinsics.checkNotNullParameter(a2, "<set-?>");
        c0335v.f6407c = a2;
        c0335v.f6408d = this.f6416d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        int i4 = this.f6417e;
        c0335v.f6409e = i4 != i ? i4 : -1;
        ArrayList arrayList = c0335v.f6410f;
        arrayList.clear();
        arrayList.addAll(c());
        c0335v.c(d());
        if (this.h == null) {
            substring = null;
        } else {
            String str = this.i;
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '#', 0, false, 6, (Object) null);
            substring = str.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        }
        c0335v.h = substring;
        String str2 = c0335v.f6408d;
        c0335v.f6408d = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, "") : null;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.set(i5, C0329o.b(0, 0, 227, (String) arrayList.get(i5), "[]"));
        }
        ArrayList arrayList2 = c0335v.f6411g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str3 = (String) arrayList2.get(i6);
                arrayList2.set(i6, str3 != null ? C0329o.b(0, 0, 195, str3, "\\^`{|}") : null);
            }
        }
        String str4 = c0335v.h;
        c0335v.h = str4 != null ? C0329o.b(0, 0, 163, str4, " \"#<>\\^`{|}") : null;
        String c0335v2 = c0335v.toString();
        try {
            return new URI(c0335v2);
        } catch (URISyntaxException e5) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(c0335v2, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
