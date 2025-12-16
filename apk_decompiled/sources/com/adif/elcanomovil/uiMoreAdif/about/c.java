package com.adif.elcanomovil.uiMoreAdif.about;

import android.content.Context;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.uiMoreAdif.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.f5159a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string = this.f5159a.getString(R.string.dialog_action_close);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new AlertActions("observation", new AlertAction(string, AlertAction.Style.POSITIVE));
    }
}
