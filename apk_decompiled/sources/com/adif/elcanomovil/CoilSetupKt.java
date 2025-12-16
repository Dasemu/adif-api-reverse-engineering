package com.adif.elcanomovil;

import I0.g;
import I0.h;
import android.content.Context;
import e3.E;
import e3.F;
import f0.C0338b;
import java.io.File;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.z;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "applicationContext", "LI0/h;", "newImageLoader", "(Landroid/content/Context;)LI0/h;", "", "CACHE_SIZE_PERCENT", "D", "", "CACHE_MAX_AGE_MINUTES", "J", "app_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoilSetupKt {
    private static final long CACHE_MAX_AGE_MINUTES = 1440;
    private static final double CACHE_SIZE_PERCENT = 0.25d;

    public static final h newImageLoader(Context applicationContext) {
        File resolve;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        E e4 = new E();
        CacheInterceptor interceptor = new CacheInterceptor();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        e4.f6217d.add(interceptor);
        F f2 = new F(e4);
        g gVar = new g(applicationContext);
        gVar.f757e = LazyKt.lazyOf(f2);
        S0.b bVar = S0.b.f1443c;
        gVar.f754b = S0.c.a((S0.c) gVar.f754b, null, 28671);
        Q0.a aVar = new Q0.a(applicationContext);
        aVar.f1351b = CACHE_SIZE_PERCENT;
        gVar.f755c = LazyKt.lazyOf(aVar.a());
        gVar.f754b = S0.c.a((S0.c) gVar.f754b, null, 24575);
        K0.a aVar2 = new K0.a();
        File cacheDir = applicationContext.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        resolve = FilesKt__UtilsKt.resolve(cacheDir, "image_cache");
        String str = z.f8321b;
        aVar2.f974a = C0338b.p(resolve);
        aVar2.f976c = CACHE_SIZE_PERCENT;
        gVar.f756d = LazyKt.lazyOf(aVar2.a());
        gVar.f754b = S0.c.a((S0.c) gVar.f754b, null, 16383);
        gVar.f754b = S0.c.a((S0.c) gVar.f754b, new V0.a(100), 32751);
        W0.h hVar = (W0.h) gVar.f758f;
        gVar.f758f = new W0.h(hVar.f1892a, hVar.f1893b, true, hVar.f1895d, hVar.f1896e);
        return gVar.c();
    }
}
