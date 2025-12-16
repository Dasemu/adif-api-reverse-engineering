package com.adif.elcanomovil.widget.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getStringDiffTime", "", "Ljava/util/Date;", "widget_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateExtensionKt {
    public static final String getStringDiffTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        long time = (date.getTime() - new Date().getTime()) / 86400000;
        if (time >= 1) {
            return time + " d";
        }
        return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date) + 'h';
    }
}
