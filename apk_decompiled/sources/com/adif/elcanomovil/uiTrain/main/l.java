package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(0);
        this.f5427a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AlertActions("observation", new AlertAction(this.f5427a, AlertAction.Style.POSITIVE));
    }
}
