package com.adif.elcanomovil.uiMoreAdif;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/uiMoreAdif/HelpActions;", "", "title", "", "(Ljava/lang/String;II)V", "getTitle", "()I", "HOME_DRAG", "HOME_MENU", "DEPARTURES_SHARE", "DEPARTURES_NOT_SELECTED_FAV", "DEPARTURES_SELECTED_FAV", "DEPARTURES_CREATE_SUSCRIPTION", "DIRECTION_CHANGE", "CIRCULATION_POSITION_BETWEEN_STATIONS", "CIRCULATION_POSITION_IN_STATION", "ui-more-adif_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HelpActions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HelpActions[] $VALUES;
    private final int title;
    public static final HelpActions HOME_DRAG = new HelpActions("HOME_DRAG", 0, R.string.help_home_drag);
    public static final HelpActions HOME_MENU = new HelpActions("HOME_MENU", 1, R.string.help_home_menu);
    public static final HelpActions DEPARTURES_SHARE = new HelpActions("DEPARTURES_SHARE", 2, R.string.help_departures_share);
    public static final HelpActions DEPARTURES_NOT_SELECTED_FAV = new HelpActions("DEPARTURES_NOT_SELECTED_FAV", 3, R.string.help_departures_not_selected_fav);
    public static final HelpActions DEPARTURES_SELECTED_FAV = new HelpActions("DEPARTURES_SELECTED_FAV", 4, R.string.help_departures_selected_fav);
    public static final HelpActions DEPARTURES_CREATE_SUSCRIPTION = new HelpActions("DEPARTURES_CREATE_SUSCRIPTION", 5, R.string.help_departures_create_suscription);
    public static final HelpActions DIRECTION_CHANGE = new HelpActions("DIRECTION_CHANGE", 6, R.string.help_direction_change);
    public static final HelpActions CIRCULATION_POSITION_BETWEEN_STATIONS = new HelpActions("CIRCULATION_POSITION_BETWEEN_STATIONS", 7, R.string.help_circulation_between_stations);
    public static final HelpActions CIRCULATION_POSITION_IN_STATION = new HelpActions("CIRCULATION_POSITION_IN_STATION", 8, R.string.help_circulation_in_station);

    private static final /* synthetic */ HelpActions[] $values() {
        return new HelpActions[]{HOME_DRAG, HOME_MENU, DEPARTURES_SHARE, DEPARTURES_NOT_SELECTED_FAV, DEPARTURES_SELECTED_FAV, DEPARTURES_CREATE_SUSCRIPTION, DIRECTION_CHANGE, CIRCULATION_POSITION_BETWEEN_STATIONS, CIRCULATION_POSITION_IN_STATION};
    }

    static {
        HelpActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private HelpActions(String str, int i, int i4) {
        this.title = i4;
    }

    public static EnumEntries<HelpActions> getEntries() {
        return $ENTRIES;
    }

    public static HelpActions valueOf(String str) {
        return (HelpActions) Enum.valueOf(HelpActions.class, str);
    }

    public static HelpActions[] values() {
        return (HelpActions[]) $VALUES.clone();
    }

    public final int getTitle() {
        return this.title;
    }

    public /* synthetic */ HelpActions(String str, int i, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i5 & 1) != 0 ? 0 : i4);
    }
}
