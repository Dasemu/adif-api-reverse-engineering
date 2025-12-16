package com.adif.elcanomovil.uiAvisa.components.details;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiAvisa.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IssueDetailsViewModel f4887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IssueDetailsViewModel issueDetailsViewModel) {
        super(0);
        this.f4887a = issueDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f4887a.context;
        String string = context.getString(R.string.stations_avisa_dialog_positive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions(IssueDetailsViewModelKt.AVISA_GENERIC_ERROR, new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
