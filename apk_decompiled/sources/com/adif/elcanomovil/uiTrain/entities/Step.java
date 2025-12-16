package com.adif.elcanomovil.uiTrain.entities;

import com.adif.elcanomovil.domain.entities.PlatformProvider;
import com.adif.elcanomovil.domain.entities.compositions.Wagon;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u00012\u00020\u0002:\u0001ABÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010/R\u0011\u0010\u0017\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010/R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0016\u0010!\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010$¨\u0006B"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/Step;", "Lcom/adif/elcanomovil/uiTrain/entities/StepItems;", "Lcom/adif/elcanomovil/domain/entities/PlatformProvider;", "date", "Ljava/util/Date;", "time", "", "plannedTime", "", "delayedTime", "delayedDate", "action", "station", "stationName", "notes", "platform", "platformWarning", "", "platformMuted", "arrivalState", "Lcom/adif/elcanomovil/uiTrain/entities/Step$State;", "departureState", "isArrivalAudited", "isDepartureAudited", "composition", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Wagon;", "operatorPlatform", "plannedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "preassignedPlatform", "(Ljava/util/Date;Ljava/lang/String;JLjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/adif/elcanomovil/uiTrain/entities/Step$State;Lcom/adif/elcanomovil/uiTrain/entities/Step$State;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getArrivalState", "()Lcom/adif/elcanomovil/uiTrain/entities/Step$State;", "getComposition", "()Ljava/util/List;", "getCtcPlatform", "getDate", "()Ljava/util/Date;", "getDelayedDate", "getDelayedTime", "getDepartureState", "()Z", "getNotes", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getPlatform", "getPlatformMuted", "getPlatformWarning", "getPreassignedPlatform", "getResultantPlatform", "getSitraPlatform", "getStation", "getStationName", "setStationName", "(Ljava/lang/String;)V", "getTechnicalNumber", "getTime", "State", "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Step implements StepItems, PlatformProvider {
    private final String action;
    private final State arrivalState;
    private final List<Wagon> composition;
    private final String ctcPlatform;
    private final Date date;
    private final Date delayedDate;
    private final String delayedTime;
    private final State departureState;
    private final boolean isArrivalAudited;
    private final boolean isDepartureAudited;
    private final String notes;
    private final String operatorPlatform;
    private final String plannedPlatform;
    private final long plannedTime;
    private final String platform;
    private final boolean platformMuted;
    private final boolean platformWarning;
    private final String preassignedPlatform;
    private final String resultantPlatform;
    private final String sitraPlatform;
    private final String station;
    private String stationName;
    private final String technicalNumber;
    private final String time;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/uiTrain/entities/Step$State;", "", "(Ljava/lang/String;I)V", "SUPPRESSED", "BOARDING", "DELAYED", DebugCoroutineInfoImplKt.RUNNING, "ui-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State SUPPRESSED = new State("SUPPRESSED", 0);
        public static final State BOARDING = new State("BOARDING", 1);
        public static final State DELAYED = new State("DELAYED", 2);
        public static final State RUNNING = new State(DebugCoroutineInfoImplKt.RUNNING, 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{SUPPRESSED, BOARDING, DELAYED, RUNNING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Step(Date date, String time, long j4, String delayedTime, Date delayedDate, String action, String station, String str, String notes, String platform, boolean z3, boolean z4, State arrivalState, State departureState, boolean z5, boolean z6, List<? extends Wagon> composition, String operatorPlatform, String plannedPlatform, String sitraPlatform, String ctcPlatform, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(delayedTime, "delayedTime");
        Intrinsics.checkNotNullParameter(delayedDate, "delayedDate");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(station, "station");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(arrivalState, "arrivalState");
        Intrinsics.checkNotNullParameter(departureState, "departureState");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(operatorPlatform, "operatorPlatform");
        Intrinsics.checkNotNullParameter(plannedPlatform, "plannedPlatform");
        Intrinsics.checkNotNullParameter(sitraPlatform, "sitraPlatform");
        Intrinsics.checkNotNullParameter(ctcPlatform, "ctcPlatform");
        this.date = date;
        this.time = time;
        this.plannedTime = j4;
        this.delayedTime = delayedTime;
        this.delayedDate = delayedDate;
        this.action = action;
        this.station = station;
        this.stationName = str;
        this.notes = notes;
        this.platform = platform;
        this.platformWarning = z3;
        this.platformMuted = z4;
        this.arrivalState = arrivalState;
        this.departureState = departureState;
        this.isArrivalAudited = z5;
        this.isDepartureAudited = z6;
        this.composition = composition;
        this.operatorPlatform = operatorPlatform;
        this.plannedPlatform = plannedPlatform;
        this.sitraPlatform = sitraPlatform;
        this.ctcPlatform = ctcPlatform;
        this.technicalNumber = str2;
        this.resultantPlatform = str3;
        this.preassignedPlatform = str4;
    }

    public final String getAction() {
        return this.action;
    }

    public final State getArrivalState() {
        return this.arrivalState;
    }

    public final List<Wagon> getComposition() {
        return this.composition;
    }

    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    public final Date getDate() {
        return this.date;
    }

    public final Date getDelayedDate() {
        return this.delayedDate;
    }

    public final String getDelayedTime() {
        return this.delayedTime;
    }

    public final State getDepartureState() {
        return this.departureState;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    public final long getPlannedTime() {
        return this.plannedTime;
    }

    @Override // com.adif.elcanomovil.domain.entities.PlatformProvider
    public String getPlatform() {
        return this.platform;
    }

    public final boolean getPlatformMuted() {
        return this.platformMuted;
    }

    public final boolean getPlatformWarning() {
        return this.platformWarning;
    }

    @Override // com.adif.elcanomovil.domain.entities.PlatformProvider
    public String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    public final String getStation() {
        return this.station;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    public final String getTime() {
        return this.time;
    }

    /* renamed from: isArrivalAudited, reason: from getter */
    public final boolean getIsArrivalAudited() {
        return this.isArrivalAudited;
    }

    /* renamed from: isDepartureAudited, reason: from getter */
    public final boolean getIsDepartureAudited() {
        return this.isDepartureAudited;
    }

    public final void setStationName(String str) {
        this.stationName = str;
    }

    public /* synthetic */ Step(Date date, String str, long j4, String str2, Date date2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4, State state, State state2, boolean z5, boolean z6, List list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, str, j4, str2, date2, str3, str4, (i & 128) != 0 ? null : str5, str6, str7, z3, z4, state, state2, z5, z6, list, str8, str9, str10, str11, str12, str13, str14);
    }
}
