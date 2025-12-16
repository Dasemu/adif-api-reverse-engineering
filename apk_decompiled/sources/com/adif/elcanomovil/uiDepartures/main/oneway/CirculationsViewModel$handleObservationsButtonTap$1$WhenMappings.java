package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.stationObservations.StationObservationType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CirculationsViewModel$handleObservationsButtonTap$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[TrainType.values().length];
        try {
            iArr[TrainType.CERCANIAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrainType.AVELDMD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrainType.CORPORATE_OTHERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[StationObservationType.values().length];
        try {
            iArr2[StationObservationType.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StationObservationType.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
