package com.adif.elcanomovil.uiDepartures.views;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/views/StationAction;", "", "(Ljava/lang/String;I)V", "FAV", "SEARCH", "SEARCH_TO", "SWITCH_STATIONS", "SHARE", "SUBSCRIPTION", "CREATE_WIDGET", "SHOW_OBSERVATIONS", "SHOW_FILTERS", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StationAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StationAction[] $VALUES;
    public static final StationAction FAV = new StationAction("FAV", 0);
    public static final StationAction SEARCH = new StationAction("SEARCH", 1);
    public static final StationAction SEARCH_TO = new StationAction("SEARCH_TO", 2);
    public static final StationAction SWITCH_STATIONS = new StationAction("SWITCH_STATIONS", 3);
    public static final StationAction SHARE = new StationAction("SHARE", 4);
    public static final StationAction SUBSCRIPTION = new StationAction("SUBSCRIPTION", 5);
    public static final StationAction CREATE_WIDGET = new StationAction("CREATE_WIDGET", 6);
    public static final StationAction SHOW_OBSERVATIONS = new StationAction("SHOW_OBSERVATIONS", 7);
    public static final StationAction SHOW_FILTERS = new StationAction("SHOW_FILTERS", 8);

    private static final /* synthetic */ StationAction[] $values() {
        return new StationAction[]{FAV, SEARCH, SEARCH_TO, SWITCH_STATIONS, SHARE, SUBSCRIPTION, CREATE_WIDGET, SHOW_OBSERVATIONS, SHOW_FILTERS};
    }

    static {
        StationAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private StationAction(String str, int i) {
    }

    public static EnumEntries<StationAction> getEntries() {
        return $ENTRIES;
    }

    public static StationAction valueOf(String str) {
        return (StationAction) Enum.valueOf(StationAction.class, str);
    }

    public static StationAction[] values() {
        return (StationAction[]) $VALUES.clone();
    }
}
