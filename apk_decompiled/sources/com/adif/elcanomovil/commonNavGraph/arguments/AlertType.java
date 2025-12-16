package com.adif.elcanomovil.commonNavGraph.arguments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertType;", "", "(Ljava/lang/String;I)V", "WARNING", "INFO", "ERROR", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlertType[] $VALUES;
    public static final AlertType WARNING = new AlertType("WARNING", 0);
    public static final AlertType INFO = new AlertType("INFO", 1);
    public static final AlertType ERROR = new AlertType("ERROR", 2);

    private static final /* synthetic */ AlertType[] $values() {
        return new AlertType[]{WARNING, INFO, ERROR};
    }

    static {
        AlertType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlertType(String str, int i) {
    }

    public static EnumEntries<AlertType> getEntries() {
        return $ENTRIES;
    }

    public static AlertType valueOf(String str) {
        return (AlertType) Enum.valueOf(AlertType.class, str);
    }

    public static AlertType[] values() {
        return (AlertType[]) $VALUES.clone();
    }
}
