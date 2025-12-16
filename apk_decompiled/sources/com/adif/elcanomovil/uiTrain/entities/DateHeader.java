package com.adif.elcanomovil.uiTrain.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/DateHeader;", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", "formattedDate", "", "formattedDateShort", "(Ljava/lang/String;Ljava/lang/String;)V", "getFormattedDate", "()Ljava/lang/String;", "getFormattedDateShort", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateHeader implements StepItems {
    private final String formattedDate;
    private final String formattedDateShort;

    public DateHeader(String formattedDate, String formattedDateShort) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(formattedDateShort, "formattedDateShort");
        this.formattedDate = formattedDate;
        this.formattedDateShort = formattedDateShort;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final String getFormattedDateShort() {
        return this.formattedDateShort;
    }
}
