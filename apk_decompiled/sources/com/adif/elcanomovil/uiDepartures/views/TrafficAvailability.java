package com.adif.elcanomovil.uiDepartures.views;

import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/views/TrafficAvailability;", "", "(Ljava/lang/String;I)V", "hasAVELDMD", "", "hasCercanias", TrainInfoMapperKt.CERCANIAS, "AVELDMD", "BOTH", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrafficAvailability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrafficAvailability[] $VALUES;
    public static final TrafficAvailability CERCANIAS = new TrafficAvailability(TrainInfoMapperKt.CERCANIAS, 0);
    public static final TrafficAvailability AVELDMD = new TrafficAvailability("AVELDMD", 1);
    public static final TrafficAvailability BOTH = new TrafficAvailability("BOTH", 2);

    private static final /* synthetic */ TrafficAvailability[] $values() {
        return new TrafficAvailability[]{CERCANIAS, AVELDMD, BOTH};
    }

    static {
        TrafficAvailability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TrafficAvailability(String str, int i) {
    }

    public static EnumEntries<TrafficAvailability> getEntries() {
        return $ENTRIES;
    }

    public static TrafficAvailability valueOf(String str) {
        return (TrafficAvailability) Enum.valueOf(TrafficAvailability.class, str);
    }

    public static TrafficAvailability[] values() {
        return (TrafficAvailability[]) $VALUES.clone();
    }

    public final boolean hasAVELDMD() {
        return this == AVELDMD || this == BOTH;
    }

    public final boolean hasCercanias() {
        return this == CERCANIAS || this == BOTH;
    }
}
