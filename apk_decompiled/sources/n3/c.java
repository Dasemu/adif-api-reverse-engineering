package n3;

import e3.F;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f7869a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7870b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = F.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = F.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = l3.g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = h3.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f7870b = MapsKt.toMap(linkedHashMap);
    }
}
