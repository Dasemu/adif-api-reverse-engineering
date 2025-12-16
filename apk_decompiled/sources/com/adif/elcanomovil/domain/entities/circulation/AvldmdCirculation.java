package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002hiBï\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\"J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0011HÆ\u0003J\t\u0010J\u001a\u00020\u0011HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003J\t\u0010M\u001a\u00020\u0011HÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0018HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000eHÆ\u0003J¥\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010b\u001a\u00020\u00112\b\u0010c\u001a\u0004\u0018\u00010dHÖ\u0003J\t\u0010e\u001a\u00020fHÖ\u0001J\t\u0010g\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0014\u0010\u0015\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0014\u0010\u0016\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010$R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0014\u0010\u0012\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0016\u0010!\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0016\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u001a\u0010\u001a\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u00106R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010=R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010&\"\u0004\b?\u0010=R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F¨\u0006j"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "date", "Ljava/util/Date;", "time", "", "delayedTime", "stationStepCode", "stationCode", "stationShortName", "stationLongName", NavArguments.ARG_DYNAMIC_TRAIN, "Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$Train;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;", "platform", "platformWarning", "", "platformMuted", "observation", "accessibleStation", "immediateDeparture", "isShortTrain", "trainCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "imageUrl", "showExtended", "operatorPlatform", "plannedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "preassignedPlatform", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$Train;Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;Ljava/lang/String;ZZLjava/lang/String;ZZZLcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessibleStation", "()Z", "getCtcPlatform", "()Ljava/lang/String;", "getDate", "()Ljava/util/Date;", "getDelayedTime", "getImageUrl", "getImmediateDeparture", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlatform", "getPlatformMuted", "getPlatformWarning", "getPreassignedPlatform", "getResultantPlatform", "getShowExtended", "setShowExtended", "(Z)V", "getSitraPlatform", "getState", "()Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;", "getStationCode", "getStationLongName", "setStationLongName", "(Ljava/lang/String;)V", "getStationShortName", "setStationShortName", "getStationStepCode", "getTechnicalNumber", "getTime", "getTrain", "()Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$Train;", "getTrainCirculation", "()Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "State", "Train", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AvldmdCirculation implements TrainCirculation {
    private final boolean accessibleStation;
    private final String ctcPlatform;
    private final Date date;
    private final String delayedTime;
    private final String imageUrl;
    private final boolean immediateDeparture;
    private final boolean isShortTrain;
    private final String observation;
    private final String operatorPlatform;
    private final String plannedPlatform;
    private final String platform;
    private final boolean platformMuted;
    private final boolean platformWarning;
    private final String preassignedPlatform;
    private final String resultantPlatform;
    private boolean showExtended;
    private final String sitraPlatform;
    private final State state;
    private final String stationCode;
    private String stationLongName;
    private String stationShortName;
    private final String stationStepCode;
    private final String technicalNumber;
    private final String time;
    private final Train train;
    private final TrainCirculationInfo trainCirculation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$State;", "", "(Ljava/lang/String;I)V", "SUPPRESSED", "BOARDING", "DELAYED", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State SUPPRESSED = new State("SUPPRESSED", 0);
        public static final State BOARDING = new State("BOARDING", 1);
        public static final State DELAYED = new State("DELAYED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{SUPPRESSED, BOARDING, DELAYED};
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation$Train;", "", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, "", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommercialNumber", "()Ljava/lang/String;", "getCommercialProduct", "getOperator", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Train {
        private final String commercialNumber;
        private final String commercialProduct;
        private final String operator;

        public Train(String operator, String commercialNumber, String commercialProduct) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
            this.operator = operator;
            this.commercialNumber = commercialNumber;
            this.commercialProduct = commercialProduct;
        }

        public static /* synthetic */ Train copy$default(Train train, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = train.operator;
            }
            if ((i & 2) != 0) {
                str2 = train.commercialNumber;
            }
            if ((i & 4) != 0) {
                str3 = train.commercialProduct;
            }
            return train.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOperator() {
            return this.operator;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCommercialProduct() {
            return this.commercialProduct;
        }

        public final Train copy(String operator, String commercialNumber, String commercialProduct) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
            Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
            return new Train(operator, commercialNumber, commercialProduct);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Train)) {
                return false;
            }
            Train train = (Train) other;
            return Intrinsics.areEqual(this.operator, train.operator) && Intrinsics.areEqual(this.commercialNumber, train.commercialNumber) && Intrinsics.areEqual(this.commercialProduct, train.commercialProduct);
        }

        public final String getCommercialNumber() {
            return this.commercialNumber;
        }

        public final String getCommercialProduct() {
            return this.commercialProduct;
        }

        public final String getOperator() {
            return this.operator;
        }

        public int hashCode() {
            return this.commercialProduct.hashCode() + a.d(this.commercialNumber, this.operator.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Train(operator=");
            sb.append(this.operator);
            sb.append(", commercialNumber=");
            sb.append(this.commercialNumber);
            sb.append(", commercialProduct=");
            return a.n(sb, this.commercialProduct, ')');
        }
    }

    public AvldmdCirculation(Date date, String time, String str, String stationStepCode, String stationCode, String str2, String str3, Train train, State state, String platform, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculation, String imageUrl, boolean z8, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(stationStepCode, "stationStepCode");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(train, "train");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.date = date;
        this.time = time;
        this.delayedTime = str;
        this.stationStepCode = stationStepCode;
        this.stationCode = stationCode;
        this.stationShortName = str2;
        this.stationLongName = str3;
        this.train = train;
        this.state = state;
        this.platform = platform;
        this.platformWarning = z3;
        this.platformMuted = z4;
        this.observation = str4;
        this.accessibleStation = z5;
        this.immediateDeparture = z6;
        this.isShortTrain = z7;
        this.trainCirculation = trainCirculation;
        this.imageUrl = imageUrl;
        this.showExtended = z8;
        this.operatorPlatform = str5;
        this.plannedPlatform = str6;
        this.sitraPlatform = str7;
        this.ctcPlatform = str8;
        this.technicalNumber = str9;
        this.resultantPlatform = str10;
        this.preassignedPlatform = str11;
    }

    public static /* synthetic */ AvldmdCirculation copy$default(AvldmdCirculation avldmdCirculation, Date date, String str, String str2, String str3, String str4, String str5, String str6, Train train, State state, String str7, boolean z3, boolean z4, String str8, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculationInfo, String str9, boolean z8, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        Date date2 = (i & 1) != 0 ? avldmdCirculation.date : date;
        String str19 = (i & 2) != 0 ? avldmdCirculation.time : str;
        String str20 = (i & 4) != 0 ? avldmdCirculation.delayedTime : str2;
        String str21 = (i & 8) != 0 ? avldmdCirculation.stationStepCode : str3;
        String str22 = (i & 16) != 0 ? avldmdCirculation.stationCode : str4;
        String str23 = (i & 32) != 0 ? avldmdCirculation.stationShortName : str5;
        String str24 = (i & 64) != 0 ? avldmdCirculation.stationLongName : str6;
        Train train2 = (i & 128) != 0 ? avldmdCirculation.train : train;
        State state2 = (i & 256) != 0 ? avldmdCirculation.state : state;
        String str25 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? avldmdCirculation.platform : str7;
        boolean z9 = (i & 1024) != 0 ? avldmdCirculation.platformWarning : z3;
        boolean z10 = (i & 2048) != 0 ? avldmdCirculation.platformMuted : z4;
        String str26 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? avldmdCirculation.observation : str8;
        boolean z11 = (i & 8192) != 0 ? avldmdCirculation.accessibleStation : z5;
        Date date3 = date2;
        boolean z12 = (i & 16384) != 0 ? avldmdCirculation.immediateDeparture : z6;
        boolean z13 = (i & 32768) != 0 ? avldmdCirculation.isShortTrain : z7;
        TrainCirculationInfo trainCirculationInfo2 = (i & 65536) != 0 ? avldmdCirculation.trainCirculation : trainCirculationInfo;
        String str27 = (i & 131072) != 0 ? avldmdCirculation.imageUrl : str9;
        boolean z14 = (i & 262144) != 0 ? avldmdCirculation.showExtended : z8;
        String str28 = (i & 524288) != 0 ? avldmdCirculation.operatorPlatform : str10;
        String str29 = (i & 1048576) != 0 ? avldmdCirculation.plannedPlatform : str11;
        String str30 = (i & 2097152) != 0 ? avldmdCirculation.sitraPlatform : str12;
        String str31 = (i & 4194304) != 0 ? avldmdCirculation.ctcPlatform : str13;
        String str32 = (i & 8388608) != 0 ? avldmdCirculation.technicalNumber : str14;
        String str33 = (i & 16777216) != 0 ? avldmdCirculation.resultantPlatform : str15;
        if ((i & 33554432) != 0) {
            str18 = str33;
            str17 = avldmdCirculation.preassignedPlatform;
        } else {
            str17 = str16;
            str18 = str33;
        }
        return avldmdCirculation.copy(date3, str19, str20, str21, str22, str23, str24, train2, state2, str25, z9, z10, str26, z11, z12, z13, trainCirculationInfo2, str27, z14, str28, str29, str30, str31, str32, str18, str17);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getPlatformWarning() {
        return this.platformWarning;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getPlatformMuted() {
        return this.platformMuted;
    }

    /* renamed from: component13, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAccessibleStation() {
        return this.accessibleStation;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsShortTrain() {
        return this.isShortTrain;
    }

    /* renamed from: component17, reason: from getter */
    public final TrainCirculationInfo getTrainCirculation() {
        return this.trainCirculation;
    }

    /* renamed from: component18, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShowExtended() {
        return this.showExtended;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: component20, reason: from getter */
    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    /* renamed from: component21, reason: from getter */
    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    /* renamed from: component22, reason: from getter */
    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    /* renamed from: component23, reason: from getter */
    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    /* renamed from: component24, reason: from getter */
    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    /* renamed from: component25, reason: from getter */
    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    /* renamed from: component26, reason: from getter */
    public final String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDelayedTime() {
        return this.delayedTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStationStepCode() {
        return this.stationStepCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStationShortName() {
        return this.stationShortName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStationLongName() {
        return this.stationLongName;
    }

    /* renamed from: component8, reason: from getter */
    public final Train getTrain() {
        return this.train;
    }

    /* renamed from: component9, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final AvldmdCirculation copy(Date date, String time, String delayedTime, String stationStepCode, String stationCode, String stationShortName, String stationLongName, Train train, State state, String platform, boolean platformWarning, boolean platformMuted, String observation, boolean accessibleStation, boolean immediateDeparture, boolean isShortTrain, TrainCirculationInfo trainCirculation, String imageUrl, boolean showExtended, String operatorPlatform, String plannedPlatform, String sitraPlatform, String ctcPlatform, String technicalNumber, String resultantPlatform, String preassignedPlatform) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(stationStepCode, "stationStepCode");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(train, "train");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new AvldmdCirculation(date, time, delayedTime, stationStepCode, stationCode, stationShortName, stationLongName, train, state, platform, platformWarning, platformMuted, observation, accessibleStation, immediateDeparture, isShortTrain, trainCirculation, imageUrl, showExtended, operatorPlatform, plannedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform, preassignedPlatform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvldmdCirculation)) {
            return false;
        }
        AvldmdCirculation avldmdCirculation = (AvldmdCirculation) other;
        return Intrinsics.areEqual(this.date, avldmdCirculation.date) && Intrinsics.areEqual(this.time, avldmdCirculation.time) && Intrinsics.areEqual(this.delayedTime, avldmdCirculation.delayedTime) && Intrinsics.areEqual(this.stationStepCode, avldmdCirculation.stationStepCode) && Intrinsics.areEqual(this.stationCode, avldmdCirculation.stationCode) && Intrinsics.areEqual(this.stationShortName, avldmdCirculation.stationShortName) && Intrinsics.areEqual(this.stationLongName, avldmdCirculation.stationLongName) && Intrinsics.areEqual(this.train, avldmdCirculation.train) && this.state == avldmdCirculation.state && Intrinsics.areEqual(this.platform, avldmdCirculation.platform) && this.platformWarning == avldmdCirculation.platformWarning && this.platformMuted == avldmdCirculation.platformMuted && Intrinsics.areEqual(this.observation, avldmdCirculation.observation) && this.accessibleStation == avldmdCirculation.accessibleStation && this.immediateDeparture == avldmdCirculation.immediateDeparture && this.isShortTrain == avldmdCirculation.isShortTrain && Intrinsics.areEqual(this.trainCirculation, avldmdCirculation.trainCirculation) && Intrinsics.areEqual(this.imageUrl, avldmdCirculation.imageUrl) && this.showExtended == avldmdCirculation.showExtended && Intrinsics.areEqual(this.operatorPlatform, avldmdCirculation.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, avldmdCirculation.plannedPlatform) && Intrinsics.areEqual(this.sitraPlatform, avldmdCirculation.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, avldmdCirculation.ctcPlatform) && Intrinsics.areEqual(this.technicalNumber, avldmdCirculation.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, avldmdCirculation.resultantPlatform) && Intrinsics.areEqual(this.preassignedPlatform, avldmdCirculation.preassignedPlatform);
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean getAccessibleStation() {
        return this.accessibleStation;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getCtcPlatform() {
        return this.ctcPlatform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public Date getDate() {
        return this.date;
    }

    public final String getDelayedTime() {
        return this.delayedTime;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getObservation() {
        return this.observation;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation, com.adif.elcanomovil.domain.entities.PlatformProvider
    public String getPlatform() {
        return this.platform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean getPlatformMuted() {
        return this.platformMuted;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean getPlatformWarning() {
        return this.platformWarning;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation, com.adif.elcanomovil.domain.entities.PlatformProvider
    public String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getResultantPlatform() {
        return this.resultantPlatform;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.Circulation
    public boolean getShowExtended() {
        return this.showExtended;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getSitraPlatform() {
        return this.sitraPlatform;
    }

    public final State getState() {
        return this.state;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getStationCode() {
        return this.stationCode;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getStationLongName() {
        return this.stationLongName;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getStationShortName() {
        return this.stationShortName;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getStationStepCode() {
        return this.stationStepCode;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getTechnicalNumber() {
        return this.technicalNumber;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public String getTime() {
        return this.time;
    }

    public final Train getTrain() {
        return this.train;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public TrainCirculationInfo getTrainCirculation() {
        return this.trainCirculation;
    }

    public int hashCode() {
        int d4 = a.d(this.time, this.date.hashCode() * 31, 31);
        String str = this.delayedTime;
        int d5 = a.d(this.stationCode, a.d(this.stationStepCode, (d4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.stationShortName;
        int hashCode = (d5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stationLongName;
        int hashCode2 = (this.train.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        State state = this.state;
        int c4 = w.c(w.c(a.d(this.platform, (hashCode2 + (state == null ? 0 : state.hashCode())) * 31, 31), 31, this.platformWarning), 31, this.platformMuted);
        String str4 = this.observation;
        int c5 = w.c(a.d(this.imageUrl, (this.trainCirculation.hashCode() + w.c(w.c(w.c((c4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.accessibleStation), 31, this.immediateDeparture), 31, this.isShortTrain)) * 31, 31), 31, this.showExtended);
        String str5 = this.operatorPlatform;
        int hashCode3 = (c5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.plannedPlatform;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sitraPlatform;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ctcPlatform;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.technicalNumber;
        int hashCode7 = (hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.resultantPlatform;
        int hashCode8 = (hashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.preassignedPlatform;
        return hashCode8 + (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean isShortTrain() {
        return this.isShortTrain;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.Circulation
    public void setShowExtended(boolean z3) {
        this.showExtended = z3;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public void setStationLongName(String str) {
        this.stationLongName = str;
    }

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public void setStationShortName(String str) {
        this.stationShortName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvldmdCirculation(date=");
        sb.append(this.date);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", delayedTime=");
        sb.append(this.delayedTime);
        sb.append(", stationStepCode=");
        sb.append(this.stationStepCode);
        sb.append(", stationCode=");
        sb.append(this.stationCode);
        sb.append(", stationShortName=");
        sb.append(this.stationShortName);
        sb.append(", stationLongName=");
        sb.append(this.stationLongName);
        sb.append(", train=");
        sb.append(this.train);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", platformWarning=");
        sb.append(this.platformWarning);
        sb.append(", platformMuted=");
        sb.append(this.platformMuted);
        sb.append(", observation=");
        sb.append(this.observation);
        sb.append(", accessibleStation=");
        sb.append(this.accessibleStation);
        sb.append(", immediateDeparture=");
        sb.append(this.immediateDeparture);
        sb.append(", isShortTrain=");
        sb.append(this.isShortTrain);
        sb.append(", trainCirculation=");
        sb.append(this.trainCirculation);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", showExtended=");
        sb.append(this.showExtended);
        sb.append(", operatorPlatform=");
        sb.append(this.operatorPlatform);
        sb.append(", plannedPlatform=");
        sb.append(this.plannedPlatform);
        sb.append(", sitraPlatform=");
        sb.append(this.sitraPlatform);
        sb.append(", ctcPlatform=");
        sb.append(this.ctcPlatform);
        sb.append(", technicalNumber=");
        sb.append(this.technicalNumber);
        sb.append(", resultantPlatform=");
        sb.append(this.resultantPlatform);
        sb.append(", preassignedPlatform=");
        return a.n(sb, this.preassignedPlatform, ')');
    }

    public /* synthetic */ AvldmdCirculation(Date date, String str, String str2, String str3, String str4, String str5, String str6, Train train, State state, String str7, boolean z3, boolean z4, String str8, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculationInfo, String str9, boolean z8, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, str, str2, str3, str4, str5, str6, train, state, str7, z3, z4, str8, z5, z6, z7, trainCirculationInfo, str9, (i & 262144) != 0 ? false : z8, str10, str11, str12, str13, str14, str15, str16);
    }
}
