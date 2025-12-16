package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.CirculationType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CirculationsViewModel$handleShareButtonTap$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CirculationType.values().length];
        try {
            iArr[CirculationType.ARRIVAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CirculationType.DEPARTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CirculationType.BETWEEN_STATIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
