package com.adif.elcanomovil.repositories.providers;

import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4637a = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicLink.AndroidParameters.Builder androidParameters = (DynamicLink.AndroidParameters.Builder) obj;
        Intrinsics.checkNotNullParameter(androidParameters, "$this$androidParameters");
        return Unit.INSTANCE;
    }
}
