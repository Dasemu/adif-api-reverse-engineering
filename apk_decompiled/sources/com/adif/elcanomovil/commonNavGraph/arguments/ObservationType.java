package com.adif.elcanomovil.commonNavGraph.arguments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/ObservationType;", "", "(Ljava/lang/String;I)V", "IS_WARNING", "IS_INFO", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObservationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ObservationType[] $VALUES;
    public static final ObservationType IS_WARNING = new ObservationType("IS_WARNING", 0);
    public static final ObservationType IS_INFO = new ObservationType("IS_INFO", 1);

    private static final /* synthetic */ ObservationType[] $values() {
        return new ObservationType[]{IS_WARNING, IS_INFO};
    }

    static {
        ObservationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ObservationType(String str, int i) {
    }

    public static EnumEntries<ObservationType> getEntries() {
        return $ENTRIES;
    }

    public static ObservationType valueOf(String str) {
        return (ObservationType) Enum.valueOf(ObservationType.class, str);
    }

    public static ObservationType[] values() {
        return (ObservationType[]) $VALUES.clone();
    }
}
