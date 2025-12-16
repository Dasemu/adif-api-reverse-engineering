package com.adif.elcanomovil.repositories.utils;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"check24Hours", "", "Ljava/util/Date;", "other", "", "repositories_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateExtensionKt {
    public static final boolean check24Hours(Date date, long j4) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return (new Date().getTime() - j4) / ((long) 86400000) >= 1;
    }
}
