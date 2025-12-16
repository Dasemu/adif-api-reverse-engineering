package com.adif.elcanomovil.serviceStorage.utils;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/DateConverter;", "", "()V", "toDate", "Ljava/util/Date;", "timestamp", "", "(Ljava/lang/Long;)Ljava/util/Date;", "toTimestamp", "date", "(Ljava/util/Date;)Ljava/lang/Long;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateConverter {
    public static final DateConverter INSTANCE = new DateConverter();

    private DateConverter() {
    }

    @JvmStatic
    public static final Date toDate(Long timestamp) {
        if (timestamp == null) {
            return null;
        }
        return new Date(timestamp.longValue());
    }

    @JvmStatic
    public static final Long toTimestamp(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
