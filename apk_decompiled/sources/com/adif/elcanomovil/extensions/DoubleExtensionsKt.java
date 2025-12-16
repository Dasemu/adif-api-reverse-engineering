package com.adif.elcanomovil.extensions;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"round", "", "decimals", "", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DoubleExtensionsKt {
    public static final double round(double d4, int i) {
        String format = String.format(Locale.ENGLISH, "%." + i + 'f', Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return Double.parseDouble(format);
    }

    public static /* synthetic */ double round$default(double d4, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 1;
        }
        return round(d4, i);
    }
}
