package com.adif.elcanomovil.serviceNetworking.circulations.model.response;

import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/model/response/TrafficType;", "", "(Ljava/lang/String;I)V", TrainInfoMapperKt.CERCANIAS, "AVLDMD", "OTHER", "TRAVELERS", "GOODS", "ALL", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrafficType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrafficType[] $VALUES;
    public static final TrafficType CERCANIAS = new TrafficType(TrainInfoMapperKt.CERCANIAS, 0);
    public static final TrafficType AVLDMD = new TrafficType("AVLDMD", 1);
    public static final TrafficType OTHER = new TrafficType("OTHER", 2);
    public static final TrafficType TRAVELERS = new TrafficType("TRAVELERS", 3);
    public static final TrafficType GOODS = new TrafficType("GOODS", 4);
    public static final TrafficType ALL = new TrafficType("ALL", 5);

    private static final /* synthetic */ TrafficType[] $values() {
        return new TrafficType[]{CERCANIAS, AVLDMD, OTHER, TRAVELERS, GOODS, ALL};
    }

    static {
        TrafficType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TrafficType(String str, int i) {
    }

    public static EnumEntries<TrafficType> getEntries() {
        return $ENTRIES;
    }

    public static TrafficType valueOf(String str) {
        return (TrafficType) Enum.valueOf(TrafficType.class, str);
    }

    public static TrafficType[] values() {
        return (TrafficType[]) $VALUES.clone();
    }
}
