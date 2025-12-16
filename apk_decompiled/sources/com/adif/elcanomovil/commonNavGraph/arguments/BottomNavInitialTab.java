package com.adif.elcanomovil.commonNavGraph.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.adif.elcanomovil.commonNavGraph.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "Landroid/os/Parcelable;", "tabId", "", "(I)V", "directions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "getDirections", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "getTabId", "()I", "Companion", "Departures", "Home", "MoreAdif", "Station", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Departures;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Home;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$MoreAdif;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Station;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BottomNavInitialTab implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Departures DEPARTURES;
    private static final Home HOME;
    private static final MoreAdif MORE_ADIF;
    private static final Station STATIONS;
    private final int tabId;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Companion;", "", "()V", "DEPARTURES", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Departures;", "getDEPARTURES", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Departures;", "HOME", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Home;", "getHOME", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Home;", "MORE_ADIF", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$MoreAdif;", "getMORE_ADIF", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$MoreAdif;", "STATIONS", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Station;", "getSTATIONS", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Station;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Departures getDEPARTURES() {
            return BottomNavInitialTab.DEPARTURES;
        }

        public final Home getHOME() {
            return BottomNavInitialTab.HOME;
        }

        public final MoreAdif getMORE_ADIF() {
            return BottomNavInitialTab.MORE_ADIF;
        }

        public final Station getSTATIONS() {
            return BottomNavInitialTab.STATIONS;
        }

        private Companion() {
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Departures;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "directions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;)V", "getDirections", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Departures extends BottomNavInitialTab {
        public static final Parcelable.Creator<Departures> CREATOR = new Creator();
        private final ChildDirections directions;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Departures> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Departures createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Departures(parcel.readInt() == 0 ? null : ChildDirections.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Departures[] newArray(int i) {
                return new Departures[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Departures() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Departures copy$default(Departures departures, ChildDirections childDirections, int i, Object obj) {
            if ((i & 1) != 0) {
                childDirections = departures.directions;
            }
            return departures.copy(childDirections);
        }

        /* renamed from: component1, reason: from getter */
        public final ChildDirections getDirections() {
            return this.directions;
        }

        public final Departures copy(ChildDirections directions) {
            return new Departures(directions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Departures) && Intrinsics.areEqual(this.directions, ((Departures) other).directions);
        }

        @Override // com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab
        public ChildDirections getDirections() {
            return this.directions;
        }

        public int hashCode() {
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                return 0;
            }
            return childDirections.hashCode();
        }

        public String toString() {
            return "Departures(directions=" + this.directions + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childDirections.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Departures(ChildDirections childDirections, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : childDirections);
        }

        public Departures(ChildDirections childDirections) {
            super(R.id.departures_tab_navigation, null);
            this.directions = childDirections;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Home;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "directions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;)V", "getDirections", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Home extends BottomNavInitialTab {
        public static final Parcelable.Creator<Home> CREATOR = new Creator();
        private final ChildDirections directions;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Home> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() == 0 ? null : ChildDirections.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home[] newArray(int i) {
                return new Home[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Home() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Home copy$default(Home home, ChildDirections childDirections, int i, Object obj) {
            if ((i & 1) != 0) {
                childDirections = home.directions;
            }
            return home.copy(childDirections);
        }

        /* renamed from: component1, reason: from getter */
        public final ChildDirections getDirections() {
            return this.directions;
        }

        public final Home copy(ChildDirections directions) {
            return new Home(directions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Home) && Intrinsics.areEqual(this.directions, ((Home) other).directions);
        }

        @Override // com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab
        public ChildDirections getDirections() {
            return this.directions;
        }

        public int hashCode() {
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                return 0;
            }
            return childDirections.hashCode();
        }

        public String toString() {
            return "Home(directions=" + this.directions + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childDirections.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Home(ChildDirections childDirections, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : childDirections);
        }

        public Home(ChildDirections childDirections) {
            super(R.id.home_tab_navigation, null);
            this.directions = childDirections;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$MoreAdif;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "directions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;)V", "getDirections", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class MoreAdif extends BottomNavInitialTab {
        public static final Parcelable.Creator<MoreAdif> CREATOR = new Creator();
        private final ChildDirections directions;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<MoreAdif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MoreAdif createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoreAdif(parcel.readInt() == 0 ? null : ChildDirections.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MoreAdif[] newArray(int i) {
                return new MoreAdif[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MoreAdif() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ MoreAdif copy$default(MoreAdif moreAdif, ChildDirections childDirections, int i, Object obj) {
            if ((i & 1) != 0) {
                childDirections = moreAdif.directions;
            }
            return moreAdif.copy(childDirections);
        }

        /* renamed from: component1, reason: from getter */
        public final ChildDirections getDirections() {
            return this.directions;
        }

        public final MoreAdif copy(ChildDirections directions) {
            return new MoreAdif(directions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MoreAdif) && Intrinsics.areEqual(this.directions, ((MoreAdif) other).directions);
        }

        @Override // com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab
        public ChildDirections getDirections() {
            return this.directions;
        }

        public int hashCode() {
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                return 0;
            }
            return childDirections.hashCode();
        }

        public String toString() {
            return "MoreAdif(directions=" + this.directions + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childDirections.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ MoreAdif(ChildDirections childDirections, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : childDirections);
        }

        public MoreAdif(ChildDirections childDirections) {
            super(R.id.more_adif_tab_navigation, null);
            this.directions = childDirections;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab$Station;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/BottomNavInitialTab;", "directions", "Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;)V", "getDirections", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/ChildDirections;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Station extends BottomNavInitialTab {
        public static final Parcelable.Creator<Station> CREATOR = new Creator();
        private final ChildDirections directions;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Station> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Station createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Station(parcel.readInt() == 0 ? null : ChildDirections.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Station[] newArray(int i) {
                return new Station[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Station() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Station copy$default(Station station, ChildDirections childDirections, int i, Object obj) {
            if ((i & 1) != 0) {
                childDirections = station.directions;
            }
            return station.copy(childDirections);
        }

        /* renamed from: component1, reason: from getter */
        public final ChildDirections getDirections() {
            return this.directions;
        }

        public final Station copy(ChildDirections directions) {
            return new Station(directions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Station) && Intrinsics.areEqual(this.directions, ((Station) other).directions);
        }

        @Override // com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab
        public ChildDirections getDirections() {
            return this.directions;
        }

        public int hashCode() {
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                return 0;
            }
            return childDirections.hashCode();
        }

        public String toString() {
            return "Station(directions=" + this.directions + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            ChildDirections childDirections = this.directions;
            if (childDirections == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childDirections.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Station(ChildDirections childDirections, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : childDirections);
        }

        public Station(ChildDirections childDirections) {
            super(R.id.stations_tab_navigation, null);
            this.directions = childDirections;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 1;
        HOME = new Home(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        DEPARTURES = new Departures(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        STATIONS = new Station(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        MORE_ADIF = new MoreAdif(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BottomNavInitialTab(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract ChildDirections getDirections();

    public final int getTabId() {
        return this.tabId;
    }

    private BottomNavInitialTab(int i) {
        this.tabId = i;
    }
}
