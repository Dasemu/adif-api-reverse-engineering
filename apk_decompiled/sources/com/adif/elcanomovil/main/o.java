package com.adif.elcanomovil.main;

import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomNavViewModel f4560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BottomNavViewModel bottomNavViewModel) {
        super(0);
        this.f4560a = bottomNavViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d1.g gVar;
        gVar = this.f4560a.stringProvider;
        return new AlertActions(BottomNavViewModelKt.ALERT_KEY_ROOT_DETECTED, new AlertAction(((d1.h) gVar).a(R.string.action_button_exit), AlertAction.Style.NEGATIVE));
    }
}
