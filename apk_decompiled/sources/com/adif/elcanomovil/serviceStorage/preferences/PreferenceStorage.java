package com.adif.elcanomovil.serviceStorage.preferences;

import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FilterEntity;
import com.adif.elcanomovil.serviceStorage.model.OperatorLogoValidityEntity;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R \u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u0018\u0010\"\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0005\"\u0004\b$\u0010\u0007R\u0018\u0010%\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u0018\u0010,\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0018\u0010.\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u0018\u00100\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0005\"\u0004\b2\u0010\u0007R\u0018\u00103\u001a\u00020&X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u0018\u00106\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0005\"\u0004\b8\u0010\u0007R\u0018\u00109\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0005\"\u0004\b;\u0010\u0007R\u0018\u0010<\u001a\u00020=X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010B\u001a\u00020CX¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010H\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0014\"\u0004\bJ\u0010\u0016R \u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\bM\u0010\u0014\"\u0004\bN\u0010\u0016R\u0018\u0010O\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bP\u0010\u0005\"\u0004\bQ\u0010\u0007R \u0010R\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\bT\u0010\u0014\"\u0004\bU\u0010\u0016R\u0018\u0010V\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bW\u0010\u0005\"\u0004\bX\u0010\u0007R\u0018\u0010Y\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010\u0005\"\u0004\b[\u0010\u0007R \u0010\\\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010\u0014\"\u0004\b_\u0010\u0016R\u0018\u0010`\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010\u0005\"\u0004\bb\u0010\u0007R&\u0010c\u001a\u0010\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020f\u0018\u00010dX¦\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010k\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010\u0005\"\u0004\bm\u0010\u0007¨\u0006n"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "", "avisaPassword", "", "getAvisaPassword", "()Ljava/lang/String;", "setAvisaPassword", "(Ljava/lang/String;)V", "avisaToken", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", "getAvisaToken", "()Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", "setAvisaToken", "(Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;)V", "avisaUserId", "getAvisaUserId", "setAvisaUserId", "circulationPinHash", "", "getCirculationPinHash", "()Ljava/util/List;", "setCirculationPinHash", "(Ljava/util/List;)V", "elcanoPinHash", "getElcanoPinHash", "setElcanoPinHash", "favorites", "Lcom/adif/elcanomovil/serviceStorage/model/StationStored;", "getFavorites", "setFavorites", "filters", "Lcom/adif/elcanomovil/serviceStorage/model/FilterEntity;", "getFilters", "setFilters", "homeStationId", "getHomeStationId", "setHomeStationId", "isPushTokenChanged", "", "()Z", "setPushTokenChanged", "(Z)V", "isRegistered", "setRegistered", "isSearchWarningMsgShowed", "setSearchWarningMsgShowed", "isTermsAccepted", "setTermsAccepted", "lastCheckedVersion", "getLastCheckedVersion", "setLastCheckedVersion", "lastDepartureTypeTrainIsCercanias", "getLastDepartureTypeTrainIsCercanias", "setLastDepartureTypeTrainIsCercanias", "lastDeparturesArrivalsStationCode", "getLastDeparturesArrivalsStationCode", "setLastDeparturesArrivalsStationCode", "lastDeparturesArrivalsStationToCode", "getLastDeparturesArrivalsStationToCode", "setLastDeparturesArrivalsStationToCode", "lastFetchStationsDate", "", "getLastFetchStationsDate", "()J", "setLastFetchStationsDate", "(J)V", "lastPinningUpdate", "Ljava/time/Instant;", "getLastPinningUpdate", "()Ljava/time/Instant;", "setLastPinningUpdate", "(Ljava/time/Instant;)V", "lastStationsSearched", "getLastStationsSearched", "setLastStationsSearched", "lastTrainsSearched", "Lcom/adif/elcanomovil/serviceStorage/model/TrainStored;", "getLastTrainsSearched", "setLastTrainsSearched", "lastVisitedStationCode", "getLastVisitedStationCode", "setLastVisitedStationCode", "logosFetchDate", "Lcom/adif/elcanomovil/serviceStorage/model/OperatorLogoValidityEntity;", "getLogosFetchDate", "setLogosFetchDate", "pushToken", "getPushToken", "setPushToken", "stationListToken", "getStationListToken", "setStationListToken", "subscriptions", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "getSubscriptions", "setSubscriptions", "subscriptionsUserId", "getSubscriptionsUserId", "setSubscriptionsUserId", "widgetInfo", "", "", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "getWidgetInfo", "()Ljava/util/Map;", "setWidgetInfo", "(Ljava/util/Map;)V", "workStationId", "getWorkStationId", "setWorkStationId", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PreferenceStorage {
    String getAvisaPassword();

    AvisaToken getAvisaToken();

    String getAvisaUserId();

    List<String> getCirculationPinHash();

    List<String> getElcanoPinHash();

    List<StationStored> getFavorites();

    List<FilterEntity> getFilters();

    String getHomeStationId();

    String getLastCheckedVersion();

    boolean getLastDepartureTypeTrainIsCercanias();

    String getLastDeparturesArrivalsStationCode();

    String getLastDeparturesArrivalsStationToCode();

    long getLastFetchStationsDate();

    Instant getLastPinningUpdate();

    List<StationStored> getLastStationsSearched();

    List<TrainStored> getLastTrainsSearched();

    String getLastVisitedStationCode();

    List<OperatorLogoValidityEntity> getLogosFetchDate();

    String getPushToken();

    String getStationListToken();

    List<SubscriptionEntity> getSubscriptions();

    String getSubscriptionsUserId();

    Map<Integer, FavouriteEntity> getWidgetInfo();

    String getWorkStationId();

    boolean isPushTokenChanged();

    boolean isRegistered();

    boolean isSearchWarningMsgShowed();

    boolean isTermsAccepted();

    void setAvisaPassword(String str);

    void setAvisaToken(AvisaToken avisaToken);

    void setAvisaUserId(String str);

    void setCirculationPinHash(List<String> list);

    void setElcanoPinHash(List<String> list);

    void setFavorites(List<? extends StationStored> list);

    void setFilters(List<FilterEntity> list);

    void setHomeStationId(String str);

    void setLastCheckedVersion(String str);

    void setLastDepartureTypeTrainIsCercanias(boolean z3);

    void setLastDeparturesArrivalsStationCode(String str);

    void setLastDeparturesArrivalsStationToCode(String str);

    void setLastFetchStationsDate(long j4);

    void setLastPinningUpdate(Instant instant);

    void setLastStationsSearched(List<? extends StationStored> list);

    void setLastTrainsSearched(List<? extends TrainStored> list);

    void setLastVisitedStationCode(String str);

    void setLogosFetchDate(List<OperatorLogoValidityEntity> list);

    void setPushToken(String str);

    void setPushTokenChanged(boolean z3);

    void setRegistered(boolean z3);

    void setSearchWarningMsgShowed(boolean z3);

    void setStationListToken(String str);

    void setSubscriptions(List<SubscriptionEntity> list);

    void setSubscriptionsUserId(String str);

    void setTermsAccepted(boolean z3);

    void setWidgetInfo(Map<Integer, FavouriteEntity> map);

    void setWorkStationId(String str);
}
