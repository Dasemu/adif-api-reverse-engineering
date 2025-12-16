package com.adif.elcanomovil.serviceNetworking.interceptors;

import K.f;
import android.content.res.Resources;
import e3.H;
import e3.O;
import e3.x;
import e3.y;
import j3.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/interceptors/LanguageHeaderInterceptor;", "Le3/y;", "<init>", "()V", "Le3/x;", "chain", "Le3/O;", "intercept", "(Le3/x;)Le3/O;", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LanguageHeaderInterceptor implements y {
    @Override // e3.y
    public O intercept(x chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        H c4 = gVar.f6952e.c();
        Locale locale = f.a(Resources.getSystem().getConfiguration()).get(0);
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        if (languageTag == null) {
            languageTag = "";
        } else {
            Intrinsics.checkNotNull(languageTag);
        }
        c4.c("Accept-Language", languageTag);
        return gVar.b(c4.a());
    }
}
