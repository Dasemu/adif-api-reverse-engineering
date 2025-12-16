package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CirculationsViewModel$handleFilterChanged$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Filter.values().length];
        try {
            iArr[Filter.FULL_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Filter.ALL_STATIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Filter.ALL_STOPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
