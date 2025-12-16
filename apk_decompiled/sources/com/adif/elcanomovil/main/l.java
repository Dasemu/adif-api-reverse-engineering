package com.adif.elcanomovil.main;

import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomNavViewModel f4557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BottomNavViewModel bottomNavViewModel) {
        super(0);
        this.f4557a = bottomNavViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d1.g gVar;
        d1.g gVar2;
        BottomNavViewModel bottomNavViewModel = this.f4557a;
        gVar = bottomNavViewModel.stringProvider;
        AlertAction alertAction = new AlertAction(((d1.h) gVar).a(R.string.dialog_action_accept), AlertAction.Style.POSITIVE);
        gVar2 = bottomNavViewModel.stringProvider;
        return new AlertActions(BottomNavViewModelKt.ALERT_KEY_MANDATORY_TERMS, alertAction, new AlertAction(((d1.h) gVar2).a(R.string.action_button_exit), AlertAction.Style.NEGATIVE));
    }
}
