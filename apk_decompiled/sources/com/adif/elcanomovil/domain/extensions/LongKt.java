package com.adif.elcanomovil.domain.extensions;

import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ONE_SECOND_IN_MILLIS", "", "getDelayedDate", "Ljava/util/Date;", "", "delayInSeconds", "domain_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LongKt {
    private static final int ONE_SECOND_IN_MILLIS = 1000;

    public static final Date getDelayedDate(long j4, int i) {
        return new Date(j4 + (i * 1000));
    }
}
