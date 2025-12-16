package com.adif.elcanomovil.commonNavGraph.arguments;

import com.adif.elcanomovil.commonNavGraph.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/Filter;", "", "Ljava/io/Serializable;", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "resource", "text", "enable", "", "(Ljava/lang/String;IIIIZ)V", "getEnable", "()Z", "setEnable", "(Z)V", "getId", "()I", "getResource", "getText", "setText", "(I)V", "FULL_DATA", "ALL_STATIONS", "ALL_STOPS", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Filter implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Filter[] $VALUES;
    public static final Filter ALL_STATIONS;
    public static final Filter ALL_STOPS;
    public static final Filter FULL_DATA = new Filter("FULL_DATA", 0, 0, R.drawable.ic_baseline_add_chart, R.string.corporate_filter_full_data_option, true);
    private boolean enable;
    private final int id;
    private final int resource;
    private int text;

    private static final /* synthetic */ Filter[] $values() {
        return new Filter[]{FULL_DATA, ALL_STATIONS, ALL_STOPS};
    }

    static {
        int i = R.drawable.ic_baseline_remove_road_24;
        ALL_STATIONS = new Filter("ALL_STATIONS", 1, 1, i, R.string.corporate_filter_all_stations_option, true);
        ALL_STOPS = new Filter("ALL_STOPS", 2, 1, i, R.string.corporate_filter_all_stops_option, true);
        Filter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Filter(String str, int i, int i4, int i5, int i6, boolean z3) {
        this.id = i4;
        this.resource = i5;
        this.text = i6;
        this.enable = z3;
    }

    public static EnumEntries<Filter> getEntries() {
        return $ENTRIES;
    }

    public static Filter valueOf(String str) {
        return (Filter) Enum.valueOf(Filter.class, str);
    }

    public static Filter[] values() {
        return (Filter[]) $VALUES.clone();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getId() {
        return this.id;
    }

    public final int getResource() {
        return this.resource;
    }

    public final int getText() {
        return this.text;
    }

    public final void setEnable(boolean z3) {
        this.enable = z3;
    }

    public final void setText(int i) {
        this.text = i;
    }

    public /* synthetic */ Filter(String str, int i, int i4, int i5, int i6, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i4, i5, i6, (i7 & 8) != 0 ? false : z3);
    }
}
