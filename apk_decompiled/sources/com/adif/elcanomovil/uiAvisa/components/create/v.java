package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiAvisa.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(NewIssueViewModel newIssueViewModel) {
        super(0);
        this.f4872a = newIssueViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        Context context2;
        NewIssueViewModel newIssueViewModel = this.f4872a;
        context = newIssueViewModel.context;
        String string = context.getString(R.string.dialog_action_accept);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertAction alertAction = new AlertAction(string, AlertAction.Style.POSITIVE);
        context2 = newIssueViewModel.context;
        String string2 = context2.getString(R.string.create_issue_confirmation_negative);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new AlertActions(NewIssueViewModelKt.AVISA_PRE_CREATE_ISSUE, alertAction, new AlertAction(string2, AlertAction.Style.NEGATIVE));
    }
}
