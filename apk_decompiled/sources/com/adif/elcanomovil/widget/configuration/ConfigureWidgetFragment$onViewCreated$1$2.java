package com.adif.elcanomovil.widget.configuration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ConfigureWidgetFragment$onViewCreated$1$2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public ConfigureWidgetFragment$onViewCreated$1$2(Object obj) {
        super(1, obj, ConfigureWidgetFragment.class, "handleSelectedStationTo", "handleSelectedStationTo(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ConfigureWidgetFragment) this.receiver).handleSelectedStationTo(p02);
    }
}
