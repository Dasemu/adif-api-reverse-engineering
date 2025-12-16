package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiDepartures.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CirculationsViewModel circulationsViewModel) {
        super(0);
        this.f5015a = circulationsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d1.g gVar;
        gVar = this.f5015a.stringProvider;
        return new AlertActions("observation", new AlertAction(((d1.h) gVar).a(R.string.dialog_action_close), AlertAction.Style.POSITIVE));
    }
}
