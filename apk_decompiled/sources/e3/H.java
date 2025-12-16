package e3;

import a.AbstractC0105a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public w f6262a;

    /* renamed from: d, reason: collision with root package name */
    public M f6265d;

    /* renamed from: e, reason: collision with root package name */
    public Map f6266e = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f6263b = "GET";

    /* renamed from: c, reason: collision with root package name */
    public C0333t f6264c = new C0333t();

    public final I a() {
        Map unmodifiableMap;
        w wVar = this.f6262a;
        if (wVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f6263b;
        C0334u d4 = this.f6264c.d();
        M m4 = this.f6265d;
        Map map = this.f6266e;
        byte[] bArr = f3.c.f6469a;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            unmodifiableMap = MapsKt.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new I(wVar, str, d4, m4, unmodifiableMap);
    }

    public final void b(C0317c cacheControl) {
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        String c0317c = cacheControl.toString();
        if (c0317c.length() == 0) {
            e("Cache-Control");
        } else {
            c("Cache-Control", c0317c);
        }
    }

    public final void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0333t c0333t = this.f6264c;
        c0333t.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        AbstractC0105a.g(name);
        AbstractC0105a.h(value, name);
        c0333t.e(name);
        c0333t.b(name, value);
    }

    public final void d(String method, M m4) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (m4 == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")) {
                throw new IllegalArgumentException(C.w.o("method ", method, " must have a request body.").toString());
            }
        } else if (!m3.l.R(method)) {
            throw new IllegalArgumentException(C.w.o("method ", method, " must not have a request body.").toString());
        }
        this.f6263b = method;
        this.f6265d = m4;
    }

    public final void e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6264c.e(name);
    }

    public final void f(Class type, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (obj == null) {
            this.f6266e.remove(type);
            return;
        }
        if (this.f6266e.isEmpty()) {
            this.f6266e = new LinkedHashMap();
        }
        Map map = this.f6266e;
        Object cast = type.cast(obj);
        Intrinsics.checkNotNull(cast);
        map.put(type, cast);
    }

    public final void g(String url) {
        boolean startsWith;
        boolean startsWith2;
        Intrinsics.checkNotNullParameter(url, "url");
        startsWith = StringsKt__StringsJVMKt.startsWith(url, "ws:", true);
        if (startsWith) {
            StringBuilder sb = new StringBuilder("http:");
            String substring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            url = sb.toString();
        } else {
            startsWith2 = StringsKt__StringsJVMKt.startsWith(url, "wss:", true);
            if (startsWith2) {
                StringBuilder sb2 = new StringBuilder("https:");
                String substring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                url = sb2.toString();
            }
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        C0335v c0335v = new C0335v();
        c0335v.d(null, url);
        w url2 = c0335v.a();
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f6262a = url2;
    }
}
