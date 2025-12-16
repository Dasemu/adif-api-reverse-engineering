package com.adif.elcanomovil.main;

import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlertAction.Style p02 = (AlertAction.Style) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((BottomNavViewModel) this.receiver).handleMandatoryTermnsAlertResult(p02);
        return Unit.INSTANCE;
    }
}
