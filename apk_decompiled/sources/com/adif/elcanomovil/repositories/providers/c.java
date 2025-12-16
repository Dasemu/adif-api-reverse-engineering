package com.adif.elcanomovil.repositories.providers;

import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(1);
        this.f4638a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicLink.IosParameters.Builder iosParameters = (DynamicLink.IosParameters.Builder) obj;
        Intrinsics.checkNotNullParameter(iosParameters, "$this$iosParameters");
        iosParameters.setAppStoreId(this.f4638a);
        return Unit.INSTANCE;
    }
}
