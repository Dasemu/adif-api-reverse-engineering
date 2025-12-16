package com.adif.elcanomovil;

import a.AbstractC0105a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e3.C0317c;
import e3.C0333t;
import e3.I;
import e3.N;
import e3.O;
import e3.x;
import e3.y;
import j3.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/CacheInterceptor;", "Le3/y;", "<init>", "()V", "Le3/x;", "chain", "Le3/O;", "intercept", "(Le3/x;)Le3/O;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheInterceptor implements y {
    @Override // e3.y
    public O intercept(x chain) {
        long j4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        I i = gVar.f6952e;
        System.currentTimeMillis();
        O b4 = gVar.b(i);
        System.currentTimeMillis();
        j4 = CoilSetupKt.CACHE_MAX_AGE_MINUTES;
        int i4 = (int) j4;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        if (i4 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.l(i4, "maxAge < 0: ").toString());
        }
        long seconds = timeUnit.toSeconds(i4);
        C0317c c0317c = new C0317c(false, false, seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds, -1, false, false, false, -1, -1, false, false, false, null);
        N s4 = b4.s();
        String value = c0317c.toString();
        Intrinsics.checkNotNullParameter("Cache-Control", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(value, "value");
        C0333t c0333t = s4.f6285f;
        c0333t.getClass();
        Intrinsics.checkNotNullParameter("Cache-Control", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(value, "value");
        AbstractC0105a.g("Cache-Control");
        AbstractC0105a.h(value, "Cache-Control");
        c0333t.e("Cache-Control");
        c0333t.b("Cache-Control", value);
        return s4.a();
    }
}
