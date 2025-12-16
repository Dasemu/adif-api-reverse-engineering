package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.DataType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"toDataType", "Lcom/adif/elcanomovil/domain/entities/DataType;", "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "getToDataType", "(Lcom/adif/elcanomovil/domain/entities/CirculationType;)Lcom/adif/elcanomovil/domain/entities/DataType;", "ui-departures_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirculationsViewModelKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CirculationType.values().length];
            try {
                iArr[CirculationType.ARRIVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CirculationType.BETWEEN_STATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CirculationType.DEPARTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataType getToDataType(CirculationType circulationType) {
        int i = WhenMappings.$EnumSwitchMapping$0[circulationType.ordinal()];
        if (i == 1) {
            return DataType.ARRIVALS;
        }
        if (i == 2) {
            return DataType.ROUTE;
        }
        if (i == 3) {
            return DataType.DEPARTURES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
