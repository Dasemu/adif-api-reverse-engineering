package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiAvisa.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewIssueViewModel f4873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(NewIssueViewModel newIssueViewModel) {
        super(0);
        this.f4873a = newIssueViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f4873a.context;
        String string = context.getString(R.string.stations_avisa_dialog_positive_return);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions(NewIssueViewModelKt.AVISA_CREATE_ISSUE, new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
