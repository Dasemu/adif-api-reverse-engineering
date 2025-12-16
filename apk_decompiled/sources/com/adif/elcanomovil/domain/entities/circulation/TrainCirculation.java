package com.adif.elcanomovil.domain.entities.circulation;

import com.adif.elcanomovil.domain.entities.PlatformProvider;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u0012\u0010\u0018\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u0012\u0010\u001a\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u0012\u0010\u001c\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u0012\u0010$\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\nR\u001a\u0010&\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010)R\u0012\u0010-\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0014\u0010/\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\nR\u0012\u00101\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0012\u00103\u001a\u000204X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "Lcom/adif/elcanomovil/domain/entities/PlatformProvider;", "accessibleStation", "", "getAccessibleStation", "()Z", "ctcPlatform", "", "getCtcPlatform", "()Ljava/lang/String;", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "immediateDeparture", "getImmediateDeparture", "isShortTrain", "observation", "getObservation", "operatorPlatform", "getOperatorPlatform", "plannedPlatform", "getPlannedPlatform", "platform", "getPlatform", "platformMuted", "getPlatformMuted", "platformWarning", "getPlatformWarning", "preassignedPlatform", "getPreassignedPlatform", "resultantPlatform", "getResultantPlatform", "sitraPlatform", "getSitraPlatform", "stationCode", "getStationCode", "stationLongName", "getStationLongName", "setStationLongName", "(Ljava/lang/String;)V", "stationShortName", "getStationShortName", "setStationShortName", "stationStepCode", "getStationStepCode", "technicalNumber", "getTechnicalNumber", "time", "getTime", "trainCirculation", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "getTrainCirculation", "()Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculationInfo;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TrainCirculation extends Circulation, PlatformProvider {
    boolean getAccessibleStation();

    String getCtcPlatform();

    Date getDate();

    boolean getImmediateDeparture();

    String getObservation();

    String getOperatorPlatform();

    String getPlannedPlatform();

    String getPlatform();

    boolean getPlatformMuted();

    boolean getPlatformWarning();

    String getPreassignedPlatform();

    String getResultantPlatform();

    String getSitraPlatform();

    String getStationCode();

    String getStationLongName();

    String getStationShortName();

    String getStationStepCode();

    String getTechnicalNumber();

    String getTime();

    TrainCirculationInfo getTrainCirculation();

    boolean isShortTrain();

    void setStationLongName(String str);

    void setStationShortName(String str);
}
