package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiAvisa.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NewIssueViewModel newIssueViewModel) {
        super(0);
        this.f4874a = newIssueViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f4874a.context;
        String string = context.getString(R.string.create_issue_confirmation_positive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions(NewIssueViewModelKt.AVISA_CREATE_ISSUE_WITHOUT_ACTION, new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
