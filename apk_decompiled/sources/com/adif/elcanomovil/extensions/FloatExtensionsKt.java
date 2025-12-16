package com.adif.elcanomovil.extensions;

import java.text.DecimalFormat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"toDistance", "", "", "toDuration", "common-resources_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatExtensionsKt {
    public static final String toDistance(float f2) {
        if (f2 > 1000000.0f) {
            return "> 1.000 km";
        }
        if (f2 > 1000.0f) {
            return new DecimalFormat("##.##").format(Float.valueOf(f2 / 1000)) + " km";
        }
        if (f2 < 50.0f) {
            return "< 50 m";
        }
        return new DecimalFormat("##").format(Float.valueOf(f2)) + " m";
    }

    public static final String toDuration(float f2) {
        int i = (int) f2;
        int i4 = (i / 60) % 60;
        int i5 = (i / 3600) % 24;
        if (i5 > 24) {
            return "> 24 h";
        }
        if (i5 <= 0) {
            return new DecimalFormat("##").format(Integer.valueOf(i4)) + " min";
        }
        if (i4 <= 0) {
            return new DecimalFormat("##").format(Integer.valueOf(i4)) + " h";
        }
        return new DecimalFormat("##").format(Integer.valueOf(i5)) + " h " + new DecimalFormat("##").format(Integer.valueOf(i4)) + " m";
    }
}
