package com.adif.elcanomovil.domain.entities.circulation;

import C.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001]BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0015HÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u000eHÆ\u0003J\u0083\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010W\u001a\u00020\u000e2\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0014\u0010\u0013\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u001a\u0010\u0016\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u00102R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u00107R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u00107R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006^"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "date", "Ljava/util/Date;", "time", "", "stationStepCode", "stationCode", "stationShortName", "stationLongName", "line", "Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation$Line;", "platform", "platformWarning", "", "platformMuted", "observation", "accessibleStation", "immediateDeparture", "isShortTrain", "trainCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "showExtended", "operatorPlatform", "plannedPlatform", "sitraPlatform", "ctcPlatform", "technicalNumber", "resultantPlatform", "preassignedPlatform", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation$Line;Ljava/lang/String;ZZLjava/lang/String;ZZZLcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessibleStation", "()Z", "getCtcPlatform", "()Ljava/lang/String;", "getDate", "()Ljava/util/Date;", "getImmediateDeparture", "getLine", "()Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation$Line;", "getObservation", "getOperatorPlatform", "getPlannedPlatform", "getPlatform", "getPlatformMuted", "getPlatformWarning", "getPreassignedPlatform", "getResultantPlatform", "getShowExtended", "setShowExtended", "(Z)V", "getSitraPlatform", "getStationCode", "getStationLongName", "setStationLongName", "(Ljava/lang/String;)V", "getStationShortName", "setStationShortName", "getStationStepCode", "getTechnicalNumber", "getTime", "getTrainCirculation", "()Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Line", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CercaniasCirculation implements TrainCirculation {
    private final boolean accessibleStation;
    private final String ctcPlatform;
    private final Date date;
    private final boolean immediateDeparture;
    private final boolean isShortTrain;
    private final Line line;
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
    private final String stationCode;
    private String stationLongName;
    private String stationShortName;
    private final String stationStepCode;
    private final String technicalNumber;
    private final String time;
    private final TrainCirculationInfo trainCirculation;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation$Line;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "color", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getIconUrl", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Line {
        private final String color;
        private final String iconUrl;
        private final String name;

        public Line(String name, String color, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(color, "color");
            this.name = name;
            this.color = color;
            this.iconUrl = str;
        }

        public static /* synthetic */ Line copy$default(Line line, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = line.name;
            }
            if ((i & 2) != 0) {
                str2 = line.color;
            }
            if ((i & 4) != 0) {
                str3 = line.iconUrl;
            }
            return line.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final Line copy(String name, String color, String iconUrl) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(color, "color");
            return new Line(name, color, iconUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Line)) {
                return false;
            }
            Line line = (Line) other;
            return Intrinsics.areEqual(this.name, line.name) && Intrinsics.areEqual(this.color, line.color) && Intrinsics.areEqual(this.iconUrl, line.iconUrl);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int d4 = a.d(this.color, this.name.hashCode() * 31, 31);
            String str = this.iconUrl;
            return d4 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Line(name=");
            sb.append(this.name);
            sb.append(", color=");
            sb.append(this.color);
            sb.append(", iconUrl=");
            return a.n(sb, this.iconUrl, ')');
        }
    }

    public CercaniasCirculation(Date date, String time, String stationStepCode, String stationCode, String str, String str2, Line line, String platform, boolean z3, boolean z4, String str3, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculation, boolean z8, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(stationStepCode, "stationStepCode");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
        this.date = date;
        this.time = time;
        this.stationStepCode = stationStepCode;
        this.stationCode = stationCode;
        this.stationShortName = str;
        this.stationLongName = str2;
        this.line = line;
        this.platform = platform;
        this.platformWarning = z3;
        this.platformMuted = z4;
        this.observation = str3;
        this.accessibleStation = z5;
        this.immediateDeparture = z6;
        this.isShortTrain = z7;
        this.trainCirculation = trainCirculation;
        this.showExtended = z8;
        this.operatorPlatform = str4;
        this.plannedPlatform = str5;
        this.sitraPlatform = str6;
        this.ctcPlatform = str7;
        this.technicalNumber = str8;
        this.resultantPlatform = str9;
        this.preassignedPlatform = str10;
    }

    public static /* synthetic */ CercaniasCirculation copy$default(CercaniasCirculation cercaniasCirculation, Date date, String str, String str2, String str3, String str4, String str5, Line line, String str6, boolean z3, boolean z4, String str7, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculationInfo, boolean z8, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        String str15;
        String str16;
        Date date2 = (i & 1) != 0 ? cercaniasCirculation.date : date;
        String str17 = (i & 2) != 0 ? cercaniasCirculation.time : str;
        String str18 = (i & 4) != 0 ? cercaniasCirculation.stationStepCode : str2;
        String str19 = (i & 8) != 0 ? cercaniasCirculation.stationCode : str3;
        String str20 = (i & 16) != 0 ? cercaniasCirculation.stationShortName : str4;
        String str21 = (i & 32) != 0 ? cercaniasCirculation.stationLongName : str5;
        Line line2 = (i & 64) != 0 ? cercaniasCirculation.line : line;
        String str22 = (i & 128) != 0 ? cercaniasCirculation.platform : str6;
        boolean z9 = (i & 256) != 0 ? cercaniasCirculation.platformWarning : z3;
        boolean z10 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? cercaniasCirculation.platformMuted : z4;
        String str23 = (i & 1024) != 0 ? cercaniasCirculation.observation : str7;
        boolean z11 = (i & 2048) != 0 ? cercaniasCirculation.accessibleStation : z5;
        boolean z12 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? cercaniasCirculation.immediateDeparture : z6;
        boolean z13 = (i & 8192) != 0 ? cercaniasCirculation.isShortTrain : z7;
        Date date3 = date2;
        TrainCirculationInfo trainCirculationInfo2 = (i & 16384) != 0 ? cercaniasCirculation.trainCirculation : trainCirculationInfo;
        boolean z14 = (i & 32768) != 0 ? cercaniasCirculation.showExtended : z8;
        String str24 = (i & 65536) != 0 ? cercaniasCirculation.operatorPlatform : str8;
        String str25 = (i & 131072) != 0 ? cercaniasCirculation.plannedPlatform : str9;
        String str26 = (i & 262144) != 0 ? cercaniasCirculation.sitraPlatform : str10;
        String str27 = (i & 524288) != 0 ? cercaniasCirculation.ctcPlatform : str11;
        String str28 = (i & 1048576) != 0 ? cercaniasCirculation.technicalNumber : str12;
        String str29 = (i & 2097152) != 0 ? cercaniasCirculation.resultantPlatform : str13;
        if ((i & 4194304) != 0) {
            str16 = str29;
            str15 = cercaniasCirculation.preassignedPlatform;
        } else {
            str15 = str14;
            str16 = str29;
        }
        return cercaniasCirculation.copy(date3, str17, str18, str19, str20, str21, line2, str22, z9, z10, str23, z11, z12, z13, trainCirculationInfo2, z14, str24, str25, str26, str27, str28, str16, str15);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getPlatformMuted() {
        return this.platformMuted;
    }

    /* renamed from: component11, reason: from getter */
    public final String getObservation() {
        return this.observation;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getAccessibleStation() {
        return this.accessibleStation;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsShortTrain() {
        return this.isShortTrain;
    }

    /* renamed from: component15, reason: from getter */
    public final TrainCirculationInfo getTrainCirculation() {
        return this.trainCirculation;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowExtended() {
        return this.showExtended;
    }

    /* renamed from: component17, reason: from getter */
    public final String getOperatorPlatform() {
        return this.operatorPlatform;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPlannedPlatform() {
        return this.plannedPlatform;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSitraPlatform() {
        return this.sitraPlatform;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: component20, reason: from getter */
    public final String getCtcPlatform() {
        return this.ctcPlatform;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTechnicalNumber() {
        return this.technicalNumber;
    }

    /* renamed from: component22, reason: from getter */
    public final String getResultantPlatform() {
        return this.resultantPlatform;
    }

    /* renamed from: component23, reason: from getter */
    public final String getPreassignedPlatform() {
        return this.preassignedPlatform;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationStepCode() {
        return this.stationStepCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStationCode() {
        return this.stationCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStationShortName() {
        return this.stationShortName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStationLongName() {
        return this.stationLongName;
    }

    /* renamed from: component7, reason: from getter */
    public final Line getLine() {
        return this.line;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getPlatformWarning() {
        return this.platformWarning;
    }

    public final CercaniasCirculation copy(Date date, String time, String stationStepCode, String stationCode, String stationShortName, String stationLongName, Line line, String platform, boolean platformWarning, boolean platformMuted, String observation, boolean accessibleStation, boolean immediateDeparture, boolean isShortTrain, TrainCirculationInfo trainCirculation, boolean showExtended, String operatorPlatform, String plannedPlatform, String sitraPlatform, String ctcPlatform, String technicalNumber, String resultantPlatform, String preassignedPlatform) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(stationStepCode, "stationStepCode");
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(trainCirculation, "trainCirculation");
        return new CercaniasCirculation(date, time, stationStepCode, stationCode, stationShortName, stationLongName, line, platform, platformWarning, platformMuted, observation, accessibleStation, immediateDeparture, isShortTrain, trainCirculation, showExtended, operatorPlatform, plannedPlatform, sitraPlatform, ctcPlatform, technicalNumber, resultantPlatform, preassignedPlatform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CercaniasCirculation)) {
            return false;
        }
        CercaniasCirculation cercaniasCirculation = (CercaniasCirculation) other;
        return Intrinsics.areEqual(this.date, cercaniasCirculation.date) && Intrinsics.areEqual(this.time, cercaniasCirculation.time) && Intrinsics.areEqual(this.stationStepCode, cercaniasCirculation.stationStepCode) && Intrinsics.areEqual(this.stationCode, cercaniasCirculation.stationCode) && Intrinsics.areEqual(this.stationShortName, cercaniasCirculation.stationShortName) && Intrinsics.areEqual(this.stationLongName, cercaniasCirculation.stationLongName) && Intrinsics.areEqual(this.line, cercaniasCirculation.line) && Intrinsics.areEqual(this.platform, cercaniasCirculation.platform) && this.platformWarning == cercaniasCirculation.platformWarning && this.platformMuted == cercaniasCirculation.platformMuted && Intrinsics.areEqual(this.observation, cercaniasCirculation.observation) && this.accessibleStation == cercaniasCirculation.accessibleStation && this.immediateDeparture == cercaniasCirculation.immediateDeparture && this.isShortTrain == cercaniasCirculation.isShortTrain && Intrinsics.areEqual(this.trainCirculation, cercaniasCirculation.trainCirculation) && this.showExtended == cercaniasCirculation.showExtended && Intrinsics.areEqual(this.operatorPlatform, cercaniasCirculation.operatorPlatform) && Intrinsics.areEqual(this.plannedPlatform, cercaniasCirculation.plannedPlatform) && Intrinsics.areEqual(this.sitraPlatform, cercaniasCirculation.sitraPlatform) && Intrinsics.areEqual(this.ctcPlatform, cercaniasCirculation.ctcPlatform) && Intrinsics.areEqual(this.technicalNumber, cercaniasCirculation.technicalNumber) && Intrinsics.areEqual(this.resultantPlatform, cercaniasCirculation.resultantPlatform) && Intrinsics.areEqual(this.preassignedPlatform, cercaniasCirculation.preassignedPlatform);
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

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public boolean getImmediateDeparture() {
        return this.immediateDeparture;
    }

    public final Line getLine() {
        return this.line;
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

    @Override // com.adif.elcanomovil.domain.entities.circulation.TrainCirculation
    public TrainCirculationInfo getTrainCirculation() {
        return this.trainCirculation;
    }

    public int hashCode() {
        int d4 = a.d(this.stationCode, a.d(this.stationStepCode, a.d(this.time, this.date.hashCode() * 31, 31), 31), 31);
        String str = this.stationShortName;
        int hashCode = (d4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stationLongName;
        int c4 = w.c(w.c(a.d(this.platform, (this.line.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31, this.platformWarning), 31, this.platformMuted);
        String str3 = this.observation;
        int c5 = w.c((this.trainCirculation.hashCode() + w.c(w.c(w.c((c4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.accessibleStation), 31, this.immediateDeparture), 31, this.isShortTrain)) * 31, 31, this.showExtended);
        String str4 = this.operatorPlatform;
        int hashCode2 = (c5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.plannedPlatform;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sitraPlatform;
        int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ctcPlatform;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.technicalNumber;
        int hashCode6 = (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.resultantPlatform;
        int hashCode7 = (hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.preassignedPlatform;
        return hashCode7 + (str10 != null ? str10.hashCode() : 0);
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
        StringBuilder sb = new StringBuilder("CercaniasCirculation(date=");
        sb.append(this.date);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", stationStepCode=");
        sb.append(this.stationStepCode);
        sb.append(", stationCode=");
        sb.append(this.stationCode);
        sb.append(", stationShortName=");
        sb.append(this.stationShortName);
        sb.append(", stationLongName=");
        sb.append(this.stationLongName);
        sb.append(", line=");
        sb.append(this.line);
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

    public /* synthetic */ CercaniasCirculation(Date date, String str, String str2, String str3, String str4, String str5, Line line, String str6, boolean z3, boolean z4, String str7, boolean z5, boolean z6, boolean z7, TrainCirculationInfo trainCirculationInfo, boolean z8, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, str, str2, str3, str4, str5, line, str6, z3, z4, str7, z5, z6, z7, trainCirculationInfo, (i & 32768) != 0 ? false : z8, str8, str9, str10, str11, str12, str13, str14);
    }
}
