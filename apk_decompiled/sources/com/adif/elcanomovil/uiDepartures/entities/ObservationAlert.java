package com.adif.elcanomovil.uiDepartures.entities;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/entities/ObservationAlert;", "", "(Ljava/lang/String;I)V", "NOTHING", "INFO", "WARNING", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObservationAlert {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ObservationAlert[] $VALUES;
    public static final ObservationAlert NOTHING = new ObservationAlert("NOTHING", 0);
    public static final ObservationAlert INFO = new ObservationAlert("INFO", 1);
    public static final ObservationAlert WARNING = new ObservationAlert("WARNING", 2);

    private static final /* synthetic */ ObservationAlert[] $values() {
        return new ObservationAlert[]{NOTHING, INFO, WARNING};
    }

    static {
        ObservationAlert[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ObservationAlert(String str, int i) {
    }

    public static EnumEntries<ObservationAlert> getEntries() {
        return $ENTRIES;
    }

    public static ObservationAlert valueOf(String str) {
        return (ObservationAlert) Enum.valueOf(ObservationAlert.class, str);
    }

    public static ObservationAlert[] values() {
        return (ObservationAlert[]) $VALUES.clone();
    }
}
