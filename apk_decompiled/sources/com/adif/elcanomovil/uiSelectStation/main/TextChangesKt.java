package com.adif.elcanomovil.uiSelectStation.main;

import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"textChanges", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "ui-select-station_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextChangesKt {
    public static final Flow<CharSequence> textChanges(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return FlowKt.onStart(FlowKt.callbackFlow(new p(editText, null)), new q(editText, null));
    }
}
