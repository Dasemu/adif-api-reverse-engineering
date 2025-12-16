package com.adif.elcanomovil.uiAvisa.components.home;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModelKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeViewModel f4917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AvisaHomeViewModel avisaHomeViewModel) {
        super(0);
        this.f4917a = avisaHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context;
        context = this.f4917a.context;
        String string = context.getString(R.string.stations_avisa_dialog_positive);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions(IssueDetailsViewModelKt.AVISA_GENERIC_ERROR, new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
