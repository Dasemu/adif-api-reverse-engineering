package com.adif.elcanomovil.serviceNetworking.interceptors;

import com.adif.commonKeys.GetKeysHelper;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.interceptors.auth.ElcanoClientAuth;
import e3.C0333t;
import e3.C0334u;
import e3.H;
import e3.I;
import e3.M;
import e3.O;
import e3.w;
import e3.x;
import e3.y;
import j3.g;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import t3.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/interceptors/AuthHeaderInterceptor;", "Le3/y;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "<init>", "(Ljava/lang/String;)V", "Le3/x;", "chain", "Le3/O;", "intercept", "(Le3/x;)Le3/O;", "Ljava/lang/String;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthHeaderInterceptor.kt\ncom/adif/elcanomovil/serviceNetworking/interceptors/AuthHeaderInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,51:1\n1#2:52\n125#3:53\n152#3,3:54\n*S KotlinDebug\n*F\n+ 1 AuthHeaderInterceptor.kt\ncom/adif/elcanomovil/serviceNetworking/interceptors/AuthHeaderInterceptor\n*L\n43#1:53\n43#1:54,3\n*E\n"})
/* loaded from: classes.dex */
public final class AuthHeaderInterceptor implements y {
    private final String id;

    public AuthHeaderInterceptor(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [r3.i, java.lang.Object, r3.h] */
    @Override // e3.y
    public O intercept(x chain) {
        String replace$default;
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        I i = gVar.f6952e;
        GetKeysHelper getKeysHelper = GetKeysHelper.f4297a;
        ElcanoClientAuth.Builder contentType = new ElcanoClientAuth.Builder(getKeysHelper.a(), getKeysHelper.b()).host(i.f6267a.f6416d).contentType("application/json;charset=utf-8");
        w wVar = i.f6267a;
        ElcanoClientAuth.Builder path = contentType.path(wVar.b());
        String d4 = wVar.d();
        if (d4 == null) {
            d4 = "";
        }
        ElcanoClientAuth.Builder httpMethodName = path.params(d4).xElcanoClient("AndroidElcanoApp").xElcanoUserId(this.id).httpMethodName(i.f6268b);
        ?? obj = new Object();
        M m4 = i.f6270d;
        if (m4 != 0) {
            m4.writeTo(obj);
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(obj.e0(), " ", "", false, 4, (Object) null);
        ElcanoClientAuth build = httpMethodName.payload(replace$default).build();
        Intrinsics.checkNotNullExpressionValue(build, "with(...)");
        try {
            map = build.getHeaders();
        } catch (Exception e4) {
            String message = "Exception getting the headers. Ex: " + e4.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            c.f8551a.a(message, new Object[0]);
            map = null;
        }
        I i4 = gVar.f6952e;
        H c4 = i4.c();
        C0333t c5 = i4.f6269c.c();
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c5.c(entry.getKey(), entry.getValue());
                arrayList.add(c5);
            }
        }
        C0334u headers = c5.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        c4.f6264c = headers.c();
        return gVar.b(c4.a());
    }
}
