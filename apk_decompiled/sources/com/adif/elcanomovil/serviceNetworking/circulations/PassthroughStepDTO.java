package com.adif.elcanomovil.serviceNetworking.circulations;

import C.w;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\b#$%&'()*B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO;", "", "stopType", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;", "announceable", "", "stationCode", "", "arrivalPassthroughStepSides", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "departurePassthroughStepSides", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;)V", "getAnnounceable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getArrivalPassthroughStepSides", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "getDeparturePassthroughStepSides", "getStationCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStopType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;)Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO;", "equals", "other", "hashCode", "toString", "", "AnnounceStateDTO", "CirculationStateDTO", "DeparturePassthroughStepSidesDTO", "ResultantPlatformDTO", "StopTypeDTO", "TechnicalCirculationKeyDTO", "TimeTypeDTO", "VisualEffectsDTO", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PassthroughStepDTO {
    private final Boolean announceable;
    private final DeparturePassthroughStepSidesDTO arrivalPassthroughStepSides;
    private final DeparturePassthroughStepSidesDTO departurePassthroughStepSides;
    private final Integer stationCode;
    private final StopTypeDTO stopType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$AnnounceStateDTO;", "", "(Ljava/lang/String;I)V", "shouldBeAnnounced", "", "NORMAL", "DISABLED", "MUTED", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AnnounceStateDTO {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnnounceStateDTO[] $VALUES;
        public static final AnnounceStateDTO NORMAL = new AnnounceStateDTO("NORMAL", 0);
        public static final AnnounceStateDTO DISABLED = new AnnounceStateDTO("DISABLED", 1);
        public static final AnnounceStateDTO MUTED = new AnnounceStateDTO("MUTED", 2);

        private static final /* synthetic */ AnnounceStateDTO[] $values() {
            return new AnnounceStateDTO[]{NORMAL, DISABLED, MUTED};
        }

        static {
            AnnounceStateDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private AnnounceStateDTO(String str, int i) {
        }

        public static EnumEntries<AnnounceStateDTO> getEntries() {
            return $ENTRIES;
        }

        public static AnnounceStateDTO valueOf(String str) {
            return (AnnounceStateDTO) Enum.valueOf(AnnounceStateDTO.class, str);
        }

        public static AnnounceStateDTO[] values() {
            return (AnnounceStateDTO[]) $VALUES.clone();
        }

        public final boolean shouldBeAnnounced() {
            return this == NORMAL;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$CirculationStateDTO;", "", "(Ljava/lang/String;I)V", "isSuppressed", "", "()Z", "PENDING_TO_CIRCULATE", DebugCoroutineInfoImplKt.RUNNING, "STOPPED", "SUPPRESSED", "FINISHED", "TRACKING_LOST", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CirculationStateDTO {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CirculationStateDTO[] $VALUES;
        public static final CirculationStateDTO PENDING_TO_CIRCULATE = new CirculationStateDTO("PENDING_TO_CIRCULATE", 0);
        public static final CirculationStateDTO RUNNING = new CirculationStateDTO(DebugCoroutineInfoImplKt.RUNNING, 1);
        public static final CirculationStateDTO STOPPED = new CirculationStateDTO("STOPPED", 2);
        public static final CirculationStateDTO SUPPRESSED = new CirculationStateDTO("SUPPRESSED", 3);
        public static final CirculationStateDTO FINISHED = new CirculationStateDTO("FINISHED", 4);
        public static final CirculationStateDTO TRACKING_LOST = new CirculationStateDTO("TRACKING_LOST", 5);

        private static final /* synthetic */ CirculationStateDTO[] $values() {
            return new CirculationStateDTO[]{PENDING_TO_CIRCULATE, RUNNING, STOPPED, SUPPRESSED, FINISHED, TRACKING_LOST};
        }

        static {
            CirculationStateDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private CirculationStateDTO(String str, int i) {
        }

        public static EnumEntries<CirculationStateDTO> getEntries() {
            return $ENTRIES;
        }

        public static CirculationStateDTO valueOf(String str) {
            return (CirculationStateDTO) Enum.valueOf(CirculationStateDTO.class, str);
        }

        public static CirculationStateDTO[] values() {
            return (CirculationStateDTO[]) $VALUES.clone();
        }

        public final boolean isSuppressed() {
            return this == SUPPRESSED;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010 J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0018HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00108J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\u000eHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003JÜ\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u00052\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u0007HÖ\u0001J\t\u0010Z\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b(\u0010$R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b-\u0010$R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b5\u0010$R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006["}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "", "stopType", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;", "announceable", "", "stationCode", "", "plannedTime", "", "forecastedOrAuditedDelay", "timeType", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TimeTypeDTO;", "plannedPlatform", "", "sitraPlatform", "ctcPlatform", "operatorPlatform", "resultantPlatform", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$ResultantPlatformDTO;", "observation", "circulationState", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$CirculationStateDTO;", "announceState", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$AnnounceStateDTO;", "technicalCirculationKey", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "visualEffects", "Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$VisualEffectsDTO;", "inmediateDeparture", "countDown", "showDelay", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;Ljava/lang/Boolean;Ljava/lang/Integer;JILcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TimeTypeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$ResultantPlatformDTO;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$CirculationStateDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$AnnounceStateDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$VisualEffectsDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAnnounceState", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$AnnounceStateDTO;", "getAnnounceable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCirculationState", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$CirculationStateDTO;", "getCountDown", "getCtcPlatform", "()Ljava/lang/String;", "getForecastedOrAuditedDelay", "()I", "getInmediateDeparture", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlannedTime", "()J", "getResultantPlatform", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$ResultantPlatformDTO;", "getShowDelay", "getSitraPlatform", "getStationCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStopType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;", "getTechnicalCirculationKey", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "getTimeType", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TimeTypeDTO;", "getVisualEffects", "()Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$VisualEffectsDTO;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;Ljava/lang/Boolean;Ljava/lang/Integer;JILcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TimeTypeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$ResultantPlatformDTO;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$CirculationStateDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$AnnounceStateDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$VisualEffectsDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$DeparturePassthroughStepSidesDTO;", "equals", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class DeparturePassthroughStepSidesDTO {
        private final AnnounceStateDTO announceState;
        private final Boolean announceable;
        private final CirculationStateDTO circulationState;
        private final Boolean countDown;
        private final String ctcPlatform;
        private final int forecastedOrAuditedDelay;
        private final Boolean inmediateDeparture;
        private final String observation;
        private final String operatorPlatform;
        private final String plannedPlatform;
        private final long plannedTime;
        private final ResultantPlatformDTO resultantPlatform;
        private final Boolean showDelay;
        private final String sitraPlatform;
        private final Integer stationCode;
        private final StopTypeDTO stopType;
        private final TechnicalCirculationKeyDTO technicalCirculationKey;
        private final TimeTypeDTO timeType;
        private final VisualEffectsDTO visualEffects;

        public DeparturePassthroughStepSidesDTO(StopTypeDTO stopTypeDTO, Boolean bool, Integer num, long j4, int i, TimeTypeDTO timeType, String plannedPlatform, String sitraPlatform, String ctcPlatform, String operatorPlatform, ResultantPlatformDTO resultantPlatform, String observation, CirculationStateDTO circulationState, AnnounceStateDTO announceState, TechnicalCirculationKeyDTO technicalCirculationKeyDTO, VisualEffectsDTO visualEffectsDTO, Boolean bool2, Boolean bool3, Boolean bool4) {
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(plannedPlatform, "plannedPlatform");
            Intrinsics.checkNotNullParameter(sitraPlatform, "sitraPlatform");
            Intrinsics.checkNotNullParameter(ctcPlatform, "ctcPlatform");
            Intrinsics.checkNotNullParameter(operatorPlatform, "operatorPlatform");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            Intrinsics.checkNotNullParameter(observation, "observation");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            this.stopType = stopTypeDTO;
            this.announceable = bool;
            this.stationCode = num;
            this.plannedTime = j4;
            this.forecastedOrAuditedDelay = i;
            this.timeType = timeType;
            this.plannedPlatform = plannedPlatform;
            this.sitraPlatform = sitraPlatform;
            this.ctcPlatform = ctcPlatform;
            this.operatorPlatform = operatorPlatform;
            this.resultantPlatform = resultantPlatform;
            this.observation = observation;
            this.circulationState = circulationState;
            this.announceState = announceState;
            this.technicalCirculationKey = technicalCirculationKeyDTO;
            this.visualEffects = visualEffectsDTO;
            this.inmediateDeparture = bool2;
            this.countDown = bool3;
            this.showDelay = bool4;
        }

        public static /* synthetic */ DeparturePassthroughStepSidesDTO copy$default(DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO, StopTypeDTO stopTypeDTO, Boolean bool, Integer num, long j4, int i, TimeTypeDTO timeTypeDTO, String str, String str2, String str3, String str4, ResultantPlatformDTO resultantPlatformDTO, String str5, CirculationStateDTO circulationStateDTO, AnnounceStateDTO announceStateDTO, TechnicalCirculationKeyDTO technicalCirculationKeyDTO, VisualEffectsDTO visualEffectsDTO, Boolean bool2, Boolean bool3, Boolean bool4, int i4, Object obj) {
            Boolean bool5;
            Boolean bool6;
            StopTypeDTO stopTypeDTO2 = (i4 & 1) != 0 ? departurePassthroughStepSidesDTO.stopType : stopTypeDTO;
            Boolean bool7 = (i4 & 2) != 0 ? departurePassthroughStepSidesDTO.announceable : bool;
            Integer num2 = (i4 & 4) != 0 ? departurePassthroughStepSidesDTO.stationCode : num;
            long j5 = (i4 & 8) != 0 ? departurePassthroughStepSidesDTO.plannedTime : j4;
            int i5 = (i4 & 16) != 0 ? departurePassthroughStepSidesDTO.forecastedOrAuditedDelay : i;
            TimeTypeDTO timeTypeDTO2 = (i4 & 32) != 0 ? departurePassthroughStepSidesDTO.timeType : timeTypeDTO;
            String str6 = (i4 & 64) != 0 ? departurePassthroughStepSidesDTO.plannedPlatform : str;
            String str7 = (i4 & 128) != 0 ? departurePassthroughStepSidesDTO.sitraPlatform : str2;
            String str8 = (i4 & 256) != 0 ? departurePassthroughStepSidesDTO.ctcPlatform : str3;
            String str9 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? departurePassthroughStepSidesDTO.operatorPlatform : str4;
            ResultantPlatformDTO resultantPlatformDTO2 = (i4 & 1024) != 0 ? departurePassthroughStepSidesDTO.resultantPlatform : resultantPlatformDTO;
            String str10 = (i4 & 2048) != 0 ? departurePassthroughStepSidesDTO.observation : str5;
            CirculationStateDTO circulationStateDTO2 = (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? departurePassthroughStepSidesDTO.circulationState : circulationStateDTO;
            StopTypeDTO stopTypeDTO3 = stopTypeDTO2;
            AnnounceStateDTO announceStateDTO2 = (i4 & 8192) != 0 ? departurePassthroughStepSidesDTO.announceState : announceStateDTO;
            TechnicalCirculationKeyDTO technicalCirculationKeyDTO2 = (i4 & 16384) != 0 ? departurePassthroughStepSidesDTO.technicalCirculationKey : technicalCirculationKeyDTO;
            VisualEffectsDTO visualEffectsDTO2 = (i4 & 32768) != 0 ? departurePassthroughStepSidesDTO.visualEffects : visualEffectsDTO;
            Boolean bool8 = (i4 & 65536) != 0 ? departurePassthroughStepSidesDTO.inmediateDeparture : bool2;
            Boolean bool9 = (i4 & 131072) != 0 ? departurePassthroughStepSidesDTO.countDown : bool3;
            if ((i4 & 262144) != 0) {
                bool6 = bool9;
                bool5 = departurePassthroughStepSidesDTO.showDelay;
            } else {
                bool5 = bool4;
                bool6 = bool9;
            }
            return departurePassthroughStepSidesDTO.copy(stopTypeDTO3, bool7, num2, j5, i5, timeTypeDTO2, str6, str7, str8, str9, resultantPlatformDTO2, str10, circulationStateDTO2, announceStateDTO2, technicalCirculationKeyDTO2, visualEffectsDTO2, bool8, bool6, bool5);
        }

        /* renamed from: component1, reason: from getter */
        public final StopTypeDTO getStopType() {
            return this.stopType;
        }

        /* renamed from: component10, reason: from getter */
        public final String getOperatorPlatform() {
            return this.operatorPlatform;
        }

        /* renamed from: component11, reason: from getter */
        public final ResultantPlatformDTO getResultantPlatform() {
            return this.resultantPlatform;
        }

        /* renamed from: component12, reason: from getter */
        public final String getObservation() {
            return this.observation;
        }

        /* renamed from: component13, reason: from getter */
        public final CirculationStateDTO getCirculationState() {
            return this.circulationState;
        }

        /* renamed from: component14, reason: from getter */
        public final AnnounceStateDTO getAnnounceState() {
            return this.announceState;
        }

        /* renamed from: component15, reason: from getter */
        public final TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        /* renamed from: component16, reason: from getter */
        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        /* renamed from: component17, reason: from getter */
        public final Boolean getInmediateDeparture() {
            return this.inmediateDeparture;
        }

        /* renamed from: component18, reason: from getter */
        public final Boolean getCountDown() {
            return this.countDown;
        }

        /* renamed from: component19, reason: from getter */
        public final Boolean getShowDelay() {
            return this.showDelay;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getAnnounceable() {
            return this.announceable;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getStationCode() {
            return this.stationCode;
        }

        /* renamed from: component4, reason: from getter */
        public final long getPlannedTime() {
            return this.plannedTime;
        }

        /* renamed from: component5, reason: from getter */
        public final int getForecastedOrAuditedDelay() {
            return this.forecastedOrAuditedDelay;
        }

        /* renamed from: component6, reason: from getter */
        public final TimeTypeDTO getTimeType() {
            return this.timeType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPlannedPlatform() {
            return this.plannedPlatform;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCtcPlatform() {
            return this.ctcPlatform;
        }

        public final DeparturePassthroughStepSidesDTO copy(StopTypeDTO stopType, Boolean announceable, Integer stationCode, long plannedTime, int forecastedOrAuditedDelay, TimeTypeDTO timeType, String plannedPlatform, String sitraPlatform, String ctcPlatform, String operatorPlatform, ResultantPlatformDTO resultantPlatform, String observation, CirculationStateDTO circulationState, AnnounceStateDTO announceState, TechnicalCirculationKeyDTO technicalCirculationKey, VisualEffectsDTO visualEffects, Boolean inmediateDeparture, Boolean countDown, Boolean showDelay) {
            Intrinsics.checkNotNullParameter(timeType, "timeType");
            Intrinsics.checkNotNullParameter(plannedPlatform, "plannedPlatform");
            Intrinsics.checkNotNullParameter(sitraPlatform, "sitraPlatform");
            Intrinsics.checkNotNullParameter(ctcPlatform, "ctcPlatform");
            Intrinsics.checkNotNullParameter(operatorPlatform, "operatorPlatform");
            Intrinsics.checkNotNullParameter(resultantPlatform, "resultantPlatform");
            Intrinsics.checkNotNullParameter(observation, "observation");
            Intrinsics.checkNotNullParameter(circulationState, "circulationState");
            Intrinsics.checkNotNullParameter(announceState, "announceState");
            return new DeparturePassthroughStepSidesDTO(stopType, announceable, stationCode, plannedTime, forecastedOrAuditedDelay, timeType, plannedPlatform, sitraPlatform, ctcPlatform, operatorPlatform, resultantPlatform, observation, circulationState, announceState, technicalCirculationKey, visualEffects, inmediateDeparture, countDown, showDelay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeparturePassthroughStepSidesDTO)) {
                return false;
            }
            DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO = (DeparturePassthroughStepSidesDTO) other;
            return this.stopType == departurePassthroughStepSidesDTO.stopType && Intrinsics.areEqual(this.announceable, departurePassthroughStepSidesDTO.announceable) && Intrinsics.areEqual(this.stationCode, departurePassthroughStepSidesDTO.stationCode) && this.plannedTime == departurePassthroughStepSidesDTO.plannedTime && this.forecastedOrAuditedDelay == departurePassthroughStepSidesDTO.forecastedOrAuditedDelay && this.timeType == departurePassthroughStepSidesDTO.timeType && Intrinsics.areEqual(this.plannedPlatform, departurePassthroughStepSidesDTO.plannedPlatform) && Intrinsics.areEqual(this.sitraPlatform, departurePassthroughStepSidesDTO.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, departurePassthroughStepSidesDTO.ctcPlatform) && Intrinsics.areEqual(this.operatorPlatform, departurePassthroughStepSidesDTO.operatorPlatform) && this.resultantPlatform == departurePassthroughStepSidesDTO.resultantPlatform && Intrinsics.areEqual(this.observation, departurePassthroughStepSidesDTO.observation) && this.circulationState == departurePassthroughStepSidesDTO.circulationState && this.announceState == departurePassthroughStepSidesDTO.announceState && Intrinsics.areEqual(this.technicalCirculationKey, departurePassthroughStepSidesDTO.technicalCirculationKey) && Intrinsics.areEqual(this.visualEffects, departurePassthroughStepSidesDTO.visualEffects) && Intrinsics.areEqual(this.inmediateDeparture, departurePassthroughStepSidesDTO.inmediateDeparture) && Intrinsics.areEqual(this.countDown, departurePassthroughStepSidesDTO.countDown) && Intrinsics.areEqual(this.showDelay, departurePassthroughStepSidesDTO.showDelay);
        }

        public final AnnounceStateDTO getAnnounceState() {
            return this.announceState;
        }

        public final Boolean getAnnounceable() {
            return this.announceable;
        }

        public final CirculationStateDTO getCirculationState() {
            return this.circulationState;
        }

        public final Boolean getCountDown() {
            return this.countDown;
        }

        public final String getCtcPlatform() {
            return this.ctcPlatform;
        }

        public final int getForecastedOrAuditedDelay() {
            return this.forecastedOrAuditedDelay;
        }

        public final Boolean getInmediateDeparture() {
            return this.inmediateDeparture;
        }

        public final String getObservation() {
            return this.observation;
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

        public final ResultantPlatformDTO getResultantPlatform() {
            return this.resultantPlatform;
        }

        public final Boolean getShowDelay() {
            return this.showDelay;
        }

        public final String getSitraPlatform() {
            return this.sitraPlatform;
        }

        public final Integer getStationCode() {
            return this.stationCode;
        }

        public final StopTypeDTO getStopType() {
            return this.stopType;
        }

        public final TechnicalCirculationKeyDTO getTechnicalCirculationKey() {
            return this.technicalCirculationKey;
        }

        public final TimeTypeDTO getTimeType() {
            return this.timeType;
        }

        public final VisualEffectsDTO getVisualEffects() {
            return this.visualEffects;
        }

        public int hashCode() {
            StopTypeDTO stopTypeDTO = this.stopType;
            int hashCode = (stopTypeDTO == null ? 0 : stopTypeDTO.hashCode()) * 31;
            Boolean bool = this.announceable;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.stationCode;
            int hashCode3 = (this.announceState.hashCode() + ((this.circulationState.hashCode() + a.d(this.observation, (this.resultantPlatform.hashCode() + a.d(this.operatorPlatform, a.d(this.ctcPlatform, a.d(this.sitraPlatform, a.d(this.plannedPlatform, (this.timeType.hashCode() + w.x(this.forecastedOrAuditedDelay, a.b(this.plannedTime, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31)) * 31, 31), 31), 31), 31)) * 31, 31)) * 31)) * 31;
            TechnicalCirculationKeyDTO technicalCirculationKeyDTO = this.technicalCirculationKey;
            int hashCode4 = (hashCode3 + (technicalCirculationKeyDTO == null ? 0 : technicalCirculationKeyDTO.hashCode())) * 31;
            VisualEffectsDTO visualEffectsDTO = this.visualEffects;
            int hashCode5 = (hashCode4 + (visualEffectsDTO == null ? 0 : visualEffectsDTO.hashCode())) * 31;
            Boolean bool2 = this.inmediateDeparture;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.countDown;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.showDelay;
            return hashCode7 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public String toString() {
            return "DeparturePassthroughStepSidesDTO(stopType=" + this.stopType + ", announceable=" + this.announceable + ", stationCode=" + this.stationCode + ", plannedTime=" + this.plannedTime + ", forecastedOrAuditedDelay=" + this.forecastedOrAuditedDelay + ", timeType=" + this.timeType + ", plannedPlatform=" + this.plannedPlatform + ", sitraPlatform=" + this.sitraPlatform + ", ctcPlatform=" + this.ctcPlatform + ", operatorPlatform=" + this.operatorPlatform + ", resultantPlatform=" + this.resultantPlatform + ", observation=" + this.observation + ", circulationState=" + this.circulationState + ", announceState=" + this.announceState + ", technicalCirculationKey=" + this.technicalCirculationKey + ", visualEffects=" + this.visualEffects + ", inmediateDeparture=" + this.inmediateDeparture + ", countDown=" + this.countDown + ", showDelay=" + this.showDelay + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$ResultantPlatformDTO;", "", "(Ljava/lang/String;I)V", "PLANNED", "RELIABLE_PLANNED", "SITRA", "CTC", "OPERATOR", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ResultantPlatformDTO {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultantPlatformDTO[] $VALUES;
        public static final ResultantPlatformDTO PLANNED = new ResultantPlatformDTO("PLANNED", 0);
        public static final ResultantPlatformDTO RELIABLE_PLANNED = new ResultantPlatformDTO("RELIABLE_PLANNED", 1);
        public static final ResultantPlatformDTO SITRA = new ResultantPlatformDTO("SITRA", 2);
        public static final ResultantPlatformDTO CTC = new ResultantPlatformDTO("CTC", 3);
        public static final ResultantPlatformDTO OPERATOR = new ResultantPlatformDTO("OPERATOR", 4);

        private static final /* synthetic */ ResultantPlatformDTO[] $values() {
            return new ResultantPlatformDTO[]{PLANNED, RELIABLE_PLANNED, SITRA, CTC, OPERATOR};
        }

        static {
            ResultantPlatformDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ResultantPlatformDTO(String str, int i) {
        }

        public static EnumEntries<ResultantPlatformDTO> getEntries() {
            return $ENTRIES;
        }

        public static ResultantPlatformDTO valueOf(String str) {
            return (ResultantPlatformDTO) Enum.valueOf(ResultantPlatformDTO.class, str);
        }

        public static ResultantPlatformDTO[] values() {
            return (ResultantPlatformDTO[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$StopTypeDTO;", "", "(Ljava/lang/String;I)V", "isCommercial", "", "COMMERCIAL", "FACULTATIVE", "RESTRICTIVE", "FOR_A_WHILE", "NO_STOP", "OCCASIONAL", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class StopTypeDTO {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StopTypeDTO[] $VALUES;
        public static final StopTypeDTO COMMERCIAL = new StopTypeDTO("COMMERCIAL", 0);
        public static final StopTypeDTO FACULTATIVE = new StopTypeDTO("FACULTATIVE", 1);
        public static final StopTypeDTO RESTRICTIVE = new StopTypeDTO("RESTRICTIVE", 2);
        public static final StopTypeDTO FOR_A_WHILE = new StopTypeDTO("FOR_A_WHILE", 3);
        public static final StopTypeDTO NO_STOP = new StopTypeDTO("NO_STOP", 4);
        public static final StopTypeDTO OCCASIONAL = new StopTypeDTO("OCCASIONAL", 5);

        private static final /* synthetic */ StopTypeDTO[] $values() {
            return new StopTypeDTO[]{COMMERCIAL, FACULTATIVE, RESTRICTIVE, FOR_A_WHILE, NO_STOP, OCCASIONAL};
        }

        static {
            StopTypeDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StopTypeDTO(String str, int i) {
        }

        public static EnumEntries<StopTypeDTO> getEntries() {
            return $ENTRIES;
        }

        public static StopTypeDTO valueOf(String str) {
            return (StopTypeDTO) Enum.valueOf(StopTypeDTO.class, str);
        }

        public static StopTypeDTO[] values() {
            return (StopTypeDTO[]) $VALUES.clone();
        }

        public final boolean isCommercial() {
            return this == COMMERCIAL;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TechnicalCirculationKeyDTO;", "", "technicalNumber", "", "technicalLaunchingDate", "", "(Ljava/lang/String;J)V", "getTechnicalLaunchingDate", "()J", "getTechnicalNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TechnicalCirculationKeyDTO {
        private final long technicalLaunchingDate;
        private final String technicalNumber;

        public TechnicalCirculationKeyDTO(String technicalNumber, long j4) {
            Intrinsics.checkNotNullParameter(technicalNumber, "technicalNumber");
            this.technicalNumber = technicalNumber;
            this.technicalLaunchingDate = j4;
        }

        public static /* synthetic */ TechnicalCirculationKeyDTO copy$default(TechnicalCirculationKeyDTO technicalCirculationKeyDTO, String str, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = technicalCirculationKeyDTO.technicalNumber;
            }
            if ((i & 2) != 0) {
                j4 = technicalCirculationKeyDTO.technicalLaunchingDate;
            }
            return technicalCirculationKeyDTO.copy(str, j4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTechnicalLaunchingDate() {
            return this.technicalLaunchingDate;
        }

        public final TechnicalCirculationKeyDTO copy(String technicalNumber, long technicalLaunchingDate) {
            Intrinsics.checkNotNullParameter(technicalNumber, "technicalNumber");
            return new TechnicalCirculationKeyDTO(technicalNumber, technicalLaunchingDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TechnicalCirculationKeyDTO)) {
                return false;
            }
            TechnicalCirculationKeyDTO technicalCirculationKeyDTO = (TechnicalCirculationKeyDTO) other;
            return Intrinsics.areEqual(this.technicalNumber, technicalCirculationKeyDTO.technicalNumber) && this.technicalLaunchingDate == technicalCirculationKeyDTO.technicalLaunchingDate;
        }

        public final long getTechnicalLaunchingDate() {
            return this.technicalLaunchingDate;
        }

        public final String getTechnicalNumber() {
            return this.technicalNumber;
        }

        public int hashCode() {
            return Long.hashCode(this.technicalLaunchingDate) + (this.technicalNumber.hashCode() * 31);
        }

        public String toString() {
            return "TechnicalCirculationKeyDTO(technicalNumber=" + this.technicalNumber + ", technicalLaunchingDate=" + this.technicalLaunchingDate + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$TimeTypeDTO;", "", "(Ljava/lang/String;I)V", "isAudited", "", "AUDITED", "FORECASTED", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TimeTypeDTO {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TimeTypeDTO[] $VALUES;
        public static final TimeTypeDTO AUDITED = new TimeTypeDTO("AUDITED", 0);
        public static final TimeTypeDTO FORECASTED = new TimeTypeDTO("FORECASTED", 1);

        private static final /* synthetic */ TimeTypeDTO[] $values() {
            return new TimeTypeDTO[]{AUDITED, FORECASTED};
        }

        static {
            TimeTypeDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private TimeTypeDTO(String str, int i) {
        }

        public static EnumEntries<TimeTypeDTO> getEntries() {
            return $ENTRIES;
        }

        public static TimeTypeDTO valueOf(String str) {
            return (TimeTypeDTO) Enum.valueOf(TimeTypeDTO.class, str);
        }

        public static TimeTypeDTO[] values() {
            return (TimeTypeDTO[]) $VALUES.clone();
        }

        public final boolean isAudited() {
            return this == AUDITED;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/circulations/PassthroughStepDTO$VisualEffectsDTO;", "", "inmediateDeparture", "", "countDown", "showDelay", "(ZZZ)V", "getCountDown", "()Z", "getInmediateDeparture", "getShowDelay", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class VisualEffectsDTO {
        private final boolean countDown;
        private final boolean inmediateDeparture;
        private final boolean showDelay;

        public VisualEffectsDTO(boolean z3, boolean z4, boolean z5) {
            this.inmediateDeparture = z3;
            this.countDown = z4;
            this.showDelay = z5;
        }

        public static /* synthetic */ VisualEffectsDTO copy$default(VisualEffectsDTO visualEffectsDTO, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z3 = visualEffectsDTO.inmediateDeparture;
            }
            if ((i & 2) != 0) {
                z4 = visualEffectsDTO.countDown;
            }
            if ((i & 4) != 0) {
                z5 = visualEffectsDTO.showDelay;
            }
            return visualEffectsDTO.copy(z3, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInmediateDeparture() {
            return this.inmediateDeparture;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCountDown() {
            return this.countDown;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDelay() {
            return this.showDelay;
        }

        public final VisualEffectsDTO copy(boolean inmediateDeparture, boolean countDown, boolean showDelay) {
            return new VisualEffectsDTO(inmediateDeparture, countDown, showDelay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisualEffectsDTO)) {
                return false;
            }
            VisualEffectsDTO visualEffectsDTO = (VisualEffectsDTO) other;
            return this.inmediateDeparture == visualEffectsDTO.inmediateDeparture && this.countDown == visualEffectsDTO.countDown && this.showDelay == visualEffectsDTO.showDelay;
        }

        public final boolean getCountDown() {
            return this.countDown;
        }

        public final boolean getInmediateDeparture() {
            return this.inmediateDeparture;
        }

        public final boolean getShowDelay() {
            return this.showDelay;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showDelay) + w.c(Boolean.hashCode(this.inmediateDeparture) * 31, 31, this.countDown);
        }

        public String toString() {
            return "VisualEffectsDTO(inmediateDeparture=" + this.inmediateDeparture + ", countDown=" + this.countDown + ", showDelay=" + this.showDelay + ')';
        }
    }

    public PassthroughStepDTO(StopTypeDTO stopTypeDTO, Boolean bool, Integer num, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2) {
        this.stopType = stopTypeDTO;
        this.announceable = bool;
        this.stationCode = num;
        this.arrivalPassthroughStepSides = departurePassthroughStepSidesDTO;
        this.departurePassthroughStepSides = departurePassthroughStepSidesDTO2;
    }

    public static /* synthetic */ PassthroughStepDTO copy$default(PassthroughStepDTO passthroughStepDTO, StopTypeDTO stopTypeDTO, Boolean bool, Integer num, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO, DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            stopTypeDTO = passthroughStepDTO.stopType;
        }
        if ((i & 2) != 0) {
            bool = passthroughStepDTO.announceable;
        }
        if ((i & 4) != 0) {
            num = passthroughStepDTO.stationCode;
        }
        if ((i & 8) != 0) {
            departurePassthroughStepSidesDTO = passthroughStepDTO.arrivalPassthroughStepSides;
        }
        if ((i & 16) != 0) {
            departurePassthroughStepSidesDTO2 = passthroughStepDTO.departurePassthroughStepSides;
        }
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO3 = departurePassthroughStepSidesDTO2;
        Integer num2 = num;
        return passthroughStepDTO.copy(stopTypeDTO, bool, num2, departurePassthroughStepSidesDTO, departurePassthroughStepSidesDTO3);
    }

    /* renamed from: component1, reason: from getter */
    public final StopTypeDTO getStopType() {
        return this.stopType;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAnnounceable() {
        return this.announceable;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component4, reason: from getter */
    public final DeparturePassthroughStepSidesDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    /* renamed from: component5, reason: from getter */
    public final DeparturePassthroughStepSidesDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final PassthroughStepDTO copy(StopTypeDTO stopType, Boolean announceable, Integer stationCode, DeparturePassthroughStepSidesDTO arrivalPassthroughStepSides, DeparturePassthroughStepSidesDTO departurePassthroughStepSides) {
        return new PassthroughStepDTO(stopType, announceable, stationCode, arrivalPassthroughStepSides, departurePassthroughStepSides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassthroughStepDTO)) {
            return false;
        }
        PassthroughStepDTO passthroughStepDTO = (PassthroughStepDTO) other;
        return this.stopType == passthroughStepDTO.stopType && Intrinsics.areEqual(this.announceable, passthroughStepDTO.announceable) && Intrinsics.areEqual(this.stationCode, passthroughStepDTO.stationCode) && Intrinsics.areEqual(this.arrivalPassthroughStepSides, passthroughStepDTO.arrivalPassthroughStepSides) && Intrinsics.areEqual(this.departurePassthroughStepSides, passthroughStepDTO.departurePassthroughStepSides);
    }

    public final Boolean getAnnounceable() {
        return this.announceable;
    }

    public final DeparturePassthroughStepSidesDTO getArrivalPassthroughStepSides() {
        return this.arrivalPassthroughStepSides;
    }

    public final DeparturePassthroughStepSidesDTO getDeparturePassthroughStepSides() {
        return this.departurePassthroughStepSides;
    }

    public final Integer getStationCode() {
        return this.stationCode;
    }

    public final StopTypeDTO getStopType() {
        return this.stopType;
    }

    public int hashCode() {
        StopTypeDTO stopTypeDTO = this.stopType;
        int hashCode = (stopTypeDTO == null ? 0 : stopTypeDTO.hashCode()) * 31;
        Boolean bool = this.announceable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.stationCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO = this.arrivalPassthroughStepSides;
        int hashCode4 = (hashCode3 + (departurePassthroughStepSidesDTO == null ? 0 : departurePassthroughStepSidesDTO.hashCode())) * 31;
        DeparturePassthroughStepSidesDTO departurePassthroughStepSidesDTO2 = this.departurePassthroughStepSides;
        return hashCode4 + (departurePassthroughStepSidesDTO2 != null ? departurePassthroughStepSidesDTO2.hashCode() : 0);
    }

    public String toString() {
        return "PassthroughStepDTO(stopType=" + this.stopType + ", announceable=" + this.announceable + ", stationCode=" + this.stationCode + ", arrivalPassthroughStepSides=" + this.arrivalPassthroughStepSides + ", departurePassthroughStepSides=" + this.departurePassthroughStepSides + ')';
    }
}
