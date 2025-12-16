package com.adif.elcanomovil.commonNavGraph.navigation;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", Constants.MessagePayloadKeys.FROM, "", "to", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "getFrom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getTo", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;I)Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent;", "equals", "", "other", "hashCode", "toString", "BottomNavTab", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NavigationEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SCHEMA = "navigation_event";
    private final Integer from;
    private final String name;
    private final int to;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "(Ljava/lang/String;II)V", "getId", "()I", "Home", "Departures", "Station", "MoreAdif", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BottomNavTab {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BottomNavTab[] $VALUES;
        private final int id;
        public static final BottomNavTab Home = new BottomNavTab("Home", 0, 1);
        public static final BottomNavTab Departures = new BottomNavTab("Departures", 1, 2);
        public static final BottomNavTab Station = new BottomNavTab("Station", 2, 3);
        public static final BottomNavTab MoreAdif = new BottomNavTab("MoreAdif", 3, 4);

        private static final /* synthetic */ BottomNavTab[] $values() {
            return new BottomNavTab[]{Home, Departures, Station, MoreAdif};
        }

        static {
            BottomNavTab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BottomNavTab(String str, int i, int i4) {
            this.id = i4;
        }

        public static EnumEntries<BottomNavTab> getEntries() {
            return $ENTRIES;
        }

        public static BottomNavTab valueOf(String str) {
            return (BottomNavTab) Enum.valueOf(BottomNavTab.class, str);
        }

        public static BottomNavTab[] values() {
            return (BottomNavTab[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$Companion;", "", "()V", "SCHEMA", "", "onNavigationChanged", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationEvent$BottomNavTab;", "to", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavigationEvent onNavigationChanged$default(Companion companion, BottomNavTab bottomNavTab, BottomNavTab bottomNavTab2, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomNavTab = null;
            }
            return companion.onNavigationChanged(bottomNavTab, bottomNavTab2);
        }

        public final NavigationEvent onNavigationChanged(BottomNavTab from, BottomNavTab to) {
            Intrinsics.checkNotNullParameter(to, "to");
            return new NavigationEvent("navigation_bar/tab_switched", from != null ? Integer.valueOf(from.getId()) : null, to.getId());
        }

        private Companion() {
        }
    }

    public NavigationEvent(String name, Integer num, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.from = num;
        this.to = i;
    }

    public static /* synthetic */ NavigationEvent copy$default(NavigationEvent navigationEvent, String str, Integer num, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = navigationEvent.name;
        }
        if ((i4 & 2) != 0) {
            num = navigationEvent.from;
        }
        if ((i4 & 4) != 0) {
            i = navigationEvent.to;
        }
        return navigationEvent.copy(str, num, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFrom() {
        return this.from;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTo() {
        return this.to;
    }

    public final NavigationEvent copy(String name, Integer from, int to) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new NavigationEvent(name, from, to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationEvent)) {
            return false;
        }
        NavigationEvent navigationEvent = (NavigationEvent) other;
        return Intrinsics.areEqual(this.name, navigationEvent.name) && Intrinsics.areEqual(this.from, navigationEvent.from) && this.to == navigationEvent.to;
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTo() {
        return this.to;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Integer num = this.from;
        return Integer.hashCode(this.to) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(name=");
        sb.append(this.name);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", to=");
        return w.p(sb, this.to, ')');
    }
}
