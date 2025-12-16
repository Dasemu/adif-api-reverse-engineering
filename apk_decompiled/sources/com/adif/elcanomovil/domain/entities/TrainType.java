package com.adif.elcanomovil.domain.entities;

import com.adif.elcanomovil.uiTrain.entities.TrainInfoMapperKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/TrainType;", "", "(Ljava/lang/String;I)V", TrainInfoMapperKt.CERCANIAS, "AVELDMD", "CORPORATE_OTHERS", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrainType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrainType[] $VALUES;
    public static final TrainType CERCANIAS = new TrainType(TrainInfoMapperKt.CERCANIAS, 0);
    public static final TrainType AVELDMD = new TrainType("AVELDMD", 1);
    public static final TrainType CORPORATE_OTHERS = new TrainType("CORPORATE_OTHERS", 2);

    private static final /* synthetic */ TrainType[] $values() {
        return new TrainType[]{CERCANIAS, AVELDMD, CORPORATE_OTHERS};
    }

    static {
        TrainType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TrainType(String str, int i) {
    }

    public static EnumEntries<TrainType> getEntries() {
        return $ENTRIES;
    }

    public static TrainType valueOf(String str) {
        return (TrainType) Enum.valueOf(TrainType.class, str);
    }

    public static TrainType[] values() {
        return (TrainType[]) $VALUES.clone();
    }
}
