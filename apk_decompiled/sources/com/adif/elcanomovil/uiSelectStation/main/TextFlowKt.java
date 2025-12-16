package com.adif.elcanomovil.uiSelectStation.main;

import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"textFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "getTextFlow", "(Landroid/widget/EditText;)Lkotlinx/coroutines/flow/Flow;", "ui-select-station_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFlowKt {
    public static final Flow<String> getTextFlow(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return FlowKt.callbackFlow(new r(editText, null));
    }
}
