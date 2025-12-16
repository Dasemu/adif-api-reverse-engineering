package l3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import r3.C0579k;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0440c[] f7401a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7402b;

    static {
        C0440c c0440c = new C0440c(C0440c.i, "");
        C0579k c0579k = C0440c.f7382f;
        C0440c c0440c2 = new C0440c(c0579k, "GET");
        C0440c c0440c3 = new C0440c(c0579k, "POST");
        C0579k c0579k2 = C0440c.f7383g;
        C0440c c0440c4 = new C0440c(c0579k2, RemoteSettings.FORWARD_SLASH_STRING);
        C0440c c0440c5 = new C0440c(c0579k2, "/index.html");
        C0579k c0579k3 = C0440c.h;
        C0440c c0440c6 = new C0440c(c0579k3, "http");
        C0440c c0440c7 = new C0440c(c0579k3, "https");
        C0579k c0579k4 = C0440c.f7381e;
        C0440c[] c0440cArr = {c0440c, c0440c2, c0440c3, c0440c4, c0440c5, c0440c6, c0440c7, new C0440c(c0579k4, "200"), new C0440c(c0579k4, "204"), new C0440c(c0579k4, "206"), new C0440c(c0579k4, "304"), new C0440c(c0579k4, "400"), new C0440c(c0579k4, "404"), new C0440c(c0579k4, "500"), new C0440c("accept-charset", ""), new C0440c("accept-encoding", "gzip, deflate"), new C0440c("accept-language", ""), new C0440c("accept-ranges", ""), new C0440c("accept", ""), new C0440c("access-control-allow-origin", ""), new C0440c("age", ""), new C0440c("allow", ""), new C0440c("authorization", ""), new C0440c("cache-control", ""), new C0440c("content-disposition", ""), new C0440c("content-encoding", ""), new C0440c("content-language", ""), new C0440c("content-length", ""), new C0440c("content-location", ""), new C0440c("content-range", ""), new C0440c("content-type", ""), new C0440c("cookie", ""), new C0440c("date", ""), new C0440c("etag", ""), new C0440c("expect", ""), new C0440c("expires", ""), new C0440c(Constants.MessagePayloadKeys.FROM, ""), new C0440c("host", ""), new C0440c("if-match", ""), new C0440c("if-modified-since", ""), new C0440c("if-none-match", ""), new C0440c("if-range", ""), new C0440c("if-unmodified-since", ""), new C0440c("last-modified", ""), new C0440c(DynamicLink.Builder.KEY_LINK, ""), new C0440c(FirebaseAnalytics.Param.LOCATION, ""), new C0440c("max-forwards", ""), new C0440c("proxy-authenticate", ""), new C0440c("proxy-authorization", ""), new C0440c("range", ""), new C0440c("referer", ""), new C0440c("refresh", ""), new C0440c("retry-after", ""), new C0440c("server", ""), new C0440c("set-cookie", ""), new C0440c("strict-transport-security", ""), new C0440c("transfer-encoding", ""), new C0440c("user-agent", ""), new C0440c("vary", ""), new C0440c("via", ""), new C0440c("www-authenticate", "")};
        f7401a = c0440cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0440cArr[i].f7384a)) {
                linkedHashMap.put(c0440cArr[i].f7384a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        f7402b = unmodifiableMap;
    }

    public static void a(C0579k name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int d4 = name.d();
        for (int i = 0; i < d4; i++) {
            byte i4 = name.i(i);
            if (65 <= i4 && i4 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
    }
}
