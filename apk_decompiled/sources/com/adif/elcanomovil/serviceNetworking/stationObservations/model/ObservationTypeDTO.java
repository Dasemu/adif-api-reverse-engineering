package com.adif.elcanomovil.serviceNetworking.stationObservations.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/ObservationTypeDTO;", "", "(Ljava/lang/String;I)V", "INCIDENCE", "INFO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObservationTypeDTO {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ObservationTypeDTO[] $VALUES;
    public static final ObservationTypeDTO INCIDENCE = new ObservationTypeDTO("INCIDENCE", 0);
    public static final ObservationTypeDTO INFO = new ObservationTypeDTO("INFO", 1);

    private static final /* synthetic */ ObservationTypeDTO[] $values() {
        return new ObservationTypeDTO[]{INCIDENCE, INFO};
    }

    static {
        ObservationTypeDTO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ObservationTypeDTO(String str, int i) {
    }

    public static EnumEntries<ObservationTypeDTO> getEntries() {
        return $ENTRIES;
    }

    public static ObservationTypeDTO valueOf(String str) {
        return (ObservationTypeDTO) Enum.valueOf(ObservationTypeDTO.class, str);
    }

    public static ObservationTypeDTO[] values() {
        return (ObservationTypeDTO[]) $VALUES.clone();
    }
}
