package com.adif.elcanomovil.domain.entities.stationObservations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservationType;", "", "(Ljava/lang/String;I)V", "WARNING", "INFO", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StationObservationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StationObservationType[] $VALUES;
    public static final StationObservationType WARNING = new StationObservationType("WARNING", 0);
    public static final StationObservationType INFO = new StationObservationType("INFO", 1);

    private static final /* synthetic */ StationObservationType[] $values() {
        return new StationObservationType[]{WARNING, INFO};
    }

    static {
        StationObservationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private StationObservationType(String str, int i) {
    }

    public static EnumEntries<StationObservationType> getEntries() {
        return $ENTRIES;
    }

    public static StationObservationType valueOf(String str) {
        return (StationObservationType) Enum.valueOf(StationObservationType.class, str);
    }

    public static StationObservationType[] values() {
        return (StationObservationType[]) $VALUES.clone();
    }
}
