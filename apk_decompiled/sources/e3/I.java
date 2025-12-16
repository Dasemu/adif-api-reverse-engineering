package e3;

import a.AbstractC0106b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final w f6267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6268b;

    /* renamed from: c, reason: collision with root package name */
    public final C0334u f6269c;

    /* renamed from: d, reason: collision with root package name */
    public final M f6270d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f6271e;

    /* renamed from: f, reason: collision with root package name */
    public C0317c f6272f;

    public I(w url, String method, C0334u headers, M m4, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f6267a = url;
        this.f6268b = method;
        this.f6269c = headers;
        this.f6270d = m4;
        this.f6271e = tags;
    }

    public final C0317c a() {
        C0317c c0317c = this.f6272f;
        if (c0317c != null) {
            return c0317c;
        }
        C0317c c0317c2 = C0317c.f6330n;
        C0317c A3 = AbstractC0106b.A(this.f6269c);
        this.f6272f = A3;
        return A3;
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f6269c.a(name);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e3.H, java.lang.Object] */
    public final H c() {
        Intrinsics.checkNotNullParameter(this, "request");
        ?? obj = new Object();
        obj.f6266e = new LinkedHashMap();
        obj.f6262a = this.f6267a;
        obj.f6263b = this.f6268b;
        obj.f6265d = this.f6270d;
        Map map = this.f6271e;
        obj.f6266e = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        obj.f6264c = this.f6269c.c();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f6268b);
        sb.append(", url=");
        sb.append(this.f6267a);
        C0334u c0334u = this.f6269c;
        if (c0334u.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c0334u) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i4;
            }
            sb.append(']');
        }
        Map map = this.f6271e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
