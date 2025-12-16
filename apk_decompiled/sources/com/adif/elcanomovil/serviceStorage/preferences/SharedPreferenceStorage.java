package com.adif.elcanomovil.serviceStorage.preferences;

import C.w;
import J0.q;
import Z2.G;
import Z2.L;
import android.content.Context;
import android.content.SharedPreferences;
import b3.d;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.FilterEntity;
import com.adif.elcanomovil.serviceStorage.model.OperatorLogoValidityEntity;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken;
import com.adif.elcanomovil.serviceStorage.model.subscriptions.SubscriptionEntity;
import com.adif.elcanomovil.serviceStorage.utils.BooleanPreference;
import com.adif.elcanomovil.serviceStorage.utils.LongPreference;
import com.adif.elcanomovil.serviceStorage.utils.ObjectPreference;
import com.adif.elcanomovil.serviceStorage.utils.ObjectPreferenceNotNull;
import com.adif.elcanomovil.serviceStorage.utils.StringPreference;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009e\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR+\u0010&\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR/\u0010.\u001a\u0004\u0018\u00010'2\b\u0010\r\u001a\u0004\u0018\u00010'8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u00102\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR+\u00106\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR;\u0010>\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010)\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R;\u0010C\u001a\n\u0012\u0004\u0012\u00020?\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020?\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\bA\u0010;\"\u0004\bB\u0010=R+\u0010K\u001a\u00020D2\u0006\u0010\r\u001a\u00020D8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR7\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0017072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u0017078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010;\"\u0004\bO\u0010=R7\u0010T\u001a\b\u0012\u0004\u0012\u00020\u0017072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u0017078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010;\"\u0004\bS\u0010=R;\u0010Y\u001a\n\u0012\u0004\u0012\u00020U\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020U\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010)\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R;\u0010^\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010)\u001a\u0004\b\\\u0010;\"\u0004\b]\u0010=R+\u0010b\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010\u0019\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010\u001dR;\u0010f\u001a\n\u0012\u0004\u0012\u00020U\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020U\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010)\u001a\u0004\bd\u0010;\"\u0004\be\u0010=R;\u0010k\u001a\n\u0012\u0004\u0012\u00020g\u0018\u0001072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020g\u0018\u0001078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010)\u001a\u0004\bi\u0010;\"\u0004\bj\u0010=R+\u0010o\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010\u0019\u001a\u0004\bm\u0010\u001b\"\u0004\bn\u0010\u001dR+\u0010q\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010\u000f\u001a\u0004\bq\u0010\u0011\"\u0004\br\u0010\u0013R+\u0010v\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bs\u0010\u0019\u001a\u0004\bt\u0010\u001b\"\u0004\bu\u0010\u001dR+\u0010z\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010\u0019\u001a\u0004\bx\u0010\u001b\"\u0004\by\u0010\u001dR+\u0010~\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010\u0019\u001a\u0004\b|\u0010\u001b\"\u0004\b}\u0010\u001dR.\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0014\n\u0004\b\u007f\u0010\u0019\u001a\u0005\b\u0080\u0001\u0010\u001b\"\u0005\b\u0081\u0001\u0010\u001dR/\u0010\u0086\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010\u000f\u001a\u0005\b\u0084\u0001\u0010\u0011\"\u0005\b\u0085\u0001\u0010\u0013RS\u0010\u008f\u0001\u001a\u0013\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0087\u00012\u0017\u0010\r\u001a\u0013\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0087\u00018V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010)\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R/\u0010\u0093\u0001\u001a\u00020D2\u0006\u0010\r\u001a\u00020D8V@VX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010F\u001a\u0005\b\u0091\u0001\u0010H\"\u0005\b\u0092\u0001\u0010JR/\u0010\u0095\u0001\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\u000f\u001a\u0005\b\u0095\u0001\u0010\u0011\"\u0005\b\u0096\u0001\u0010\u0013R,\u0010\u009d\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/preferences/SharedPreferenceStorage;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Landroid/content/Context;", "context", "LZ2/G;", "moshi", "<init>", "(Landroid/content/Context;LZ2/G;)V", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "prefs", "Lkotlin/Lazy;", "", "<set-?>", "isTermsAccepted$delegate", "Lcom/adif/elcanomovil/serviceStorage/utils/BooleanPreference;", "isTermsAccepted", "()Z", "setTermsAccepted", "(Z)V", "isRegistered$delegate", "isRegistered", "setRegistered", "", "avisaUserId$delegate", "Lcom/adif/elcanomovil/serviceStorage/utils/StringPreference;", "getAvisaUserId", "()Ljava/lang/String;", "setAvisaUserId", "(Ljava/lang/String;)V", "avisaUserId", "avisaPassword$delegate", "getAvisaPassword", "setAvisaPassword", "avisaPassword", "lastCheckedVersion$delegate", "getLastCheckedVersion", "setLastCheckedVersion", "lastCheckedVersion", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", "avisaToken$delegate", "Lcom/adif/elcanomovil/serviceStorage/utils/ObjectPreference;", "getAvisaToken", "()Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", "setAvisaToken", "(Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;)V", "avisaToken", "homeStationId$delegate", "getHomeStationId", "setHomeStationId", "homeStationId", "workStationId$delegate", "getWorkStationId", "setWorkStationId", "workStationId", "", "Lcom/adif/elcanomovil/serviceStorage/model/OperatorLogoValidityEntity;", "logosFetchDate$delegate", "getLogosFetchDate", "()Ljava/util/List;", "setLogosFetchDate", "(Ljava/util/List;)V", "logosFetchDate", "Lcom/adif/elcanomovil/serviceStorage/model/FilterEntity;", "filters$delegate", "getFilters", "setFilters", "filters", "", "lastPinningUpdateMillis$delegate", "Lcom/adif/elcanomovil/serviceStorage/utils/LongPreference;", "getLastPinningUpdateMillis", "()J", "setLastPinningUpdateMillis", "(J)V", "lastPinningUpdateMillis", "circulationPinHash$delegate", "Lcom/adif/elcanomovil/serviceStorage/utils/ObjectPreferenceNotNull;", "getCirculationPinHash", "setCirculationPinHash", "circulationPinHash", "elcanoPinHash$delegate", "getElcanoPinHash", "setElcanoPinHash", "elcanoPinHash", "Lcom/adif/elcanomovil/serviceStorage/model/StationStored;", "favorites$delegate", "getFavorites", "setFavorites", "favorites", "Lcom/adif/elcanomovil/serviceStorage/model/subscriptions/SubscriptionEntity;", "subscriptions$delegate", "getSubscriptions", "setSubscriptions", "subscriptions", "subscriptionsUserId$delegate", "getSubscriptionsUserId", "setSubscriptionsUserId", "subscriptionsUserId", "lastStationsSearched$delegate", "getLastStationsSearched", "setLastStationsSearched", "lastStationsSearched", "Lcom/adif/elcanomovil/serviceStorage/model/TrainStored;", "lastTrainsSearched$delegate", "getLastTrainsSearched", "setLastTrainsSearched", "lastTrainsSearched", "pushToken$delegate", "getPushToken", "setPushToken", "pushToken", "isPushTokenChanged$delegate", "isPushTokenChanged", "setPushTokenChanged", "stationListToken$delegate", "getStationListToken", "setStationListToken", "stationListToken", "lastVisitedStationCode$delegate", "getLastVisitedStationCode", "setLastVisitedStationCode", "lastVisitedStationCode", "lastDeparturesArrivalsStationCode$delegate", "getLastDeparturesArrivalsStationCode", "setLastDeparturesArrivalsStationCode", "lastDeparturesArrivalsStationCode", "lastDeparturesArrivalsStationToCode$delegate", "getLastDeparturesArrivalsStationToCode", "setLastDeparturesArrivalsStationToCode", "lastDeparturesArrivalsStationToCode", "lastDepartureTypeTrainIsCercanias$delegate", "getLastDepartureTypeTrainIsCercanias", "setLastDepartureTypeTrainIsCercanias", "lastDepartureTypeTrainIsCercanias", "", "", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "widgetInfo$delegate", "getWidgetInfo", "()Ljava/util/Map;", "setWidgetInfo", "(Ljava/util/Map;)V", "widgetInfo", "lastFetchStationsDate$delegate", "getLastFetchStationsDate", "setLastFetchStationsDate", "lastFetchStationsDate", "isSearchWarningMsgShowed$delegate", "isSearchWarningMsgShowed", "setSearchWarningMsgShowed", "Ljava/time/Instant;", "value", "getLastPinningUpdate", "()Ljava/time/Instant;", "setLastPinningUpdate", "(Ljava/time/Instant;)V", "lastPinningUpdate", "Companion", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedPreferenceStorage implements PreferenceStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {w.u(SharedPreferenceStorage.class, "isTermsAccepted", "isTermsAccepted()Z", 0), w.u(SharedPreferenceStorage.class, "isRegistered", "isRegistered()Z", 0), w.u(SharedPreferenceStorage.class, "avisaUserId", "getAvisaUserId()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "avisaPassword", "getAvisaPassword()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastCheckedVersion", "getLastCheckedVersion()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "avisaToken", "getAvisaToken()Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", 0), w.u(SharedPreferenceStorage.class, "homeStationId", "getHomeStationId()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "workStationId", "getWorkStationId()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "logosFetchDate", "getLogosFetchDate()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "filters", "getFilters()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "lastPinningUpdateMillis", "getLastPinningUpdateMillis()J", 0), w.u(SharedPreferenceStorage.class, "circulationPinHash", "getCirculationPinHash()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "elcanoPinHash", "getElcanoPinHash()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "favorites", "getFavorites()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "subscriptions", "getSubscriptions()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "subscriptionsUserId", "getSubscriptionsUserId()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastStationsSearched", "getLastStationsSearched()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "lastTrainsSearched", "getLastTrainsSearched()Ljava/util/List;", 0), w.u(SharedPreferenceStorage.class, "pushToken", "getPushToken()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "isPushTokenChanged", "isPushTokenChanged()Z", 0), w.u(SharedPreferenceStorage.class, "stationListToken", "getStationListToken()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastVisitedStationCode", "getLastVisitedStationCode()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastDeparturesArrivalsStationCode", "getLastDeparturesArrivalsStationCode()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastDeparturesArrivalsStationToCode", "getLastDeparturesArrivalsStationToCode()Ljava/lang/String;", 0), w.u(SharedPreferenceStorage.class, "lastDepartureTypeTrainIsCercanias", "getLastDepartureTypeTrainIsCercanias()Z", 0), w.u(SharedPreferenceStorage.class, "widgetInfo", "getWidgetInfo()Ljava/util/Map;", 0), w.u(SharedPreferenceStorage.class, "lastFetchStationsDate", "getLastFetchStationsDate()J", 0), w.u(SharedPreferenceStorage.class, "isSearchWarningMsgShowed", "isSearchWarningMsgShowed()Z", 0)};
    public static final String LAST_FETCH_STATION_DATE = "last_fetch_station_date";
    public static final String PREFS_ADIF_IS_TERMS_ACCEPTED = "pref_adif_is_terms_accepted";
    public static final String PREFS_AVISA_IS_REGISTERED = "pref_avisa_is_registered";
    public static final String PREFS_AVISA_PASSWORD = "pref_avisa_password";
    public static final String PREFS_AVISA_TOKEN = "pref_avisa_token";
    public static final String PREFS_AVISA_USER_ID = "pref_avisa_userId";
    public static final String PREFS_CIRCULATION_FILTERS = "pref_circulation_filters";
    public static final String PREFS_CIRCULATION_PIN_HASH = "pref_circulation_pin_hash";
    public static final String PREFS_ELCANO_PIN_HASH = "pref_elcano_pin_hash";
    public static final String PREFS_FAVORITES_ID = "pref_favorites_id";
    public static final String PREFS_HOME_STATION_ID = "pref_home_station_id";
    public static final String PREFS_LAST_CHECKED_VERSION = "pref_last_checked_version";
    public static final String PREFS_LAST_DEPARTURES_ARRIVALS_STATION_CODE = "pref_last_departures_arrivals_station_code";
    public static final String PREFS_LAST_DEPARTURES_ARRIVALS_STATION_CODE_DEFAULT_VALUE = "";
    public static final String PREFS_LAST_DEPARTURES_ARRIVALS_STATION_TO_CODE = "pref_last_departures_arrivals_station_to_code";
    public static final String PREFS_LAST_DEPARTURES_ARRIVALS_STATION_TO_CODE_DEFAULT_VALUE = "";
    public static final String PREFS_LAST_DEPARTURES_TYPE_TRAIN_ISCERCANIAS = "pref_last_departures_type_train_iscercanias";
    public static final String PREFS_LAST_PINNING_UPDATE = "pref_last_pinning_update";
    public static final String PREFS_LAST_VISITED_STATION_CODE = "pref_last_visited_station_code";
    public static final String PREFS_LAST_VISITED_STATION_CODE_DEFAULT_VALUE = "";
    public static final String PREFS_NAME = "elcanomovil";
    public static final String PREFS_OPERATOR_LOGOS_DOWNLOADED = "pref_operator_logos_downloaded";
    public static final String PREFS_SEARCH_WARNING = "pref_search_warning";
    public static final String PREFS_STATIONS_SEARCHED_ID = "pref_stations_searched_id";
    public static final String PREFS_STATION_LIST_TOKEN = "pref_station_list_token";
    public static final String PREFS_SUBSCRIPTIONS = "pref_subscriptions";
    public static final String PREFS_SUBSCRIPTIONS_USER_ID = "pref_subscriptions_userId";
    public static final String PREFS_TRAINS_SEARCHED_ID = "pref_trains_searched_id";
    public static final String PREFS_WIDGET_FAVOURITE = "pref_widget_favourite";
    public static final String PREFS_WORK_STATION_ID = "pref_work_station_id";
    public static final String PUSH_TOKEN = "pref_push_id_token";
    public static final String PUSH_TOKEN_CHANGED = "pref_push_id_token_has_changed";
    public static final String STATION_LIST_TOKEN_DEFAULT_VALUE = "0";

    /* renamed from: avisaPassword$delegate, reason: from kotlin metadata */
    private final StringPreference avisaPassword;

    /* renamed from: avisaToken$delegate, reason: from kotlin metadata */
    private final ObjectPreference avisaToken;

    /* renamed from: avisaUserId$delegate, reason: from kotlin metadata */
    private final StringPreference avisaUserId;

    /* renamed from: circulationPinHash$delegate, reason: from kotlin metadata */
    private final ObjectPreferenceNotNull circulationPinHash;

    /* renamed from: elcanoPinHash$delegate, reason: from kotlin metadata */
    private final ObjectPreferenceNotNull elcanoPinHash;

    /* renamed from: favorites$delegate, reason: from kotlin metadata */
    private final ObjectPreference favorites;

    /* renamed from: filters$delegate, reason: from kotlin metadata */
    private final ObjectPreference filters;

    /* renamed from: homeStationId$delegate, reason: from kotlin metadata */
    private final StringPreference homeStationId;

    /* renamed from: isPushTokenChanged$delegate, reason: from kotlin metadata */
    private final BooleanPreference isPushTokenChanged;

    /* renamed from: isRegistered$delegate, reason: from kotlin metadata */
    private final BooleanPreference isRegistered;

    /* renamed from: isSearchWarningMsgShowed$delegate, reason: from kotlin metadata */
    private final BooleanPreference isSearchWarningMsgShowed;

    /* renamed from: isTermsAccepted$delegate, reason: from kotlin metadata */
    private final BooleanPreference isTermsAccepted;

    /* renamed from: lastCheckedVersion$delegate, reason: from kotlin metadata */
    private final StringPreference lastCheckedVersion;

    /* renamed from: lastDepartureTypeTrainIsCercanias$delegate, reason: from kotlin metadata */
    private final BooleanPreference lastDepartureTypeTrainIsCercanias;

    /* renamed from: lastDeparturesArrivalsStationCode$delegate, reason: from kotlin metadata */
    private final StringPreference lastDeparturesArrivalsStationCode;

    /* renamed from: lastDeparturesArrivalsStationToCode$delegate, reason: from kotlin metadata */
    private final StringPreference lastDeparturesArrivalsStationToCode;

    /* renamed from: lastFetchStationsDate$delegate, reason: from kotlin metadata */
    private final LongPreference lastFetchStationsDate;

    /* renamed from: lastPinningUpdateMillis$delegate, reason: from kotlin metadata */
    private final LongPreference lastPinningUpdateMillis;

    /* renamed from: lastStationsSearched$delegate, reason: from kotlin metadata */
    private final ObjectPreference lastStationsSearched;

    /* renamed from: lastTrainsSearched$delegate, reason: from kotlin metadata */
    private final ObjectPreference lastTrainsSearched;

    /* renamed from: lastVisitedStationCode$delegate, reason: from kotlin metadata */
    private final StringPreference lastVisitedStationCode;

    /* renamed from: logosFetchDate$delegate, reason: from kotlin metadata */
    private final ObjectPreference logosFetchDate;
    private final Lazy<SharedPreferences> prefs;

    /* renamed from: pushToken$delegate, reason: from kotlin metadata */
    private final StringPreference pushToken;

    /* renamed from: stationListToken$delegate, reason: from kotlin metadata */
    private final StringPreference stationListToken;

    /* renamed from: subscriptions$delegate, reason: from kotlin metadata */
    private final ObjectPreference subscriptions;

    /* renamed from: subscriptionsUserId$delegate, reason: from kotlin metadata */
    private final StringPreference subscriptionsUserId;

    /* renamed from: widgetInfo$delegate, reason: from kotlin metadata */
    private final ObjectPreference widgetInfo;

    /* renamed from: workStationId$delegate, reason: from kotlin metadata */
    private final StringPreference workStationId;

    @Inject
    public SharedPreferenceStorage(@ApplicationContext Context context, G moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Lazy<SharedPreferences> lazy = LazyKt.lazy(new q(context, 2));
        this.prefs = lazy;
        this.isTermsAccepted = new BooleanPreference(lazy, PREFS_ADIF_IS_TERMS_ACCEPTED, false);
        this.isRegistered = new BooleanPreference(lazy, PREFS_AVISA_IS_REGISTERED, false);
        this.avisaUserId = new StringPreference(lazy, PREFS_AVISA_USER_ID, "");
        this.avisaPassword = new StringPreference(lazy, PREFS_AVISA_PASSWORD, "");
        this.lastCheckedVersion = new StringPreference(lazy, PREFS_LAST_CHECKED_VERSION, "");
        this.avisaToken = new ObjectPreference(lazy, moshi, PREFS_AVISA_TOKEN, null, AvisaToken.class);
        this.homeStationId = new StringPreference(lazy, PREFS_HOME_STATION_ID, "");
        this.workStationId = new StringPreference(lazy, PREFS_WORK_STATION_ID, "");
        List emptyList = CollectionsKt.emptyList();
        d f2 = L.f(List.class, OperatorLogoValidityEntity.class);
        Intrinsics.checkNotNullExpressionValue(f2, "newParameterizedType(...)");
        this.logosFetchDate = new ObjectPreference(lazy, moshi, PREFS_OPERATOR_LOGOS_DOWNLOADED, emptyList, f2);
        List emptyList2 = CollectionsKt.emptyList();
        d f4 = L.f(List.class, FilterEntity.class);
        Intrinsics.checkNotNullExpressionValue(f4, "newParameterizedType(...)");
        this.filters = new ObjectPreference(lazy, moshi, PREFS_CIRCULATION_FILTERS, emptyList2, f4);
        this.lastPinningUpdateMillis = new LongPreference(lazy, PREFS_LAST_PINNING_UPDATE);
        List emptyList3 = CollectionsKt.emptyList();
        d f5 = L.f(List.class, String.class);
        Intrinsics.checkNotNullExpressionValue(f5, "newParameterizedType(...)");
        this.circulationPinHash = new ObjectPreferenceNotNull(lazy, moshi, PREFS_CIRCULATION_PIN_HASH, emptyList3, f5);
        List emptyList4 = CollectionsKt.emptyList();
        d f6 = L.f(List.class, String.class);
        Intrinsics.checkNotNullExpressionValue(f6, "newParameterizedType(...)");
        this.elcanoPinHash = new ObjectPreferenceNotNull(lazy, moshi, PREFS_ELCANO_PIN_HASH, emptyList4, f6);
        List emptyList5 = CollectionsKt.emptyList();
        d f7 = L.f(List.class, StationStored.class);
        Intrinsics.checkNotNullExpressionValue(f7, "newParameterizedType(...)");
        this.favorites = new ObjectPreference(lazy, moshi, PREFS_FAVORITES_ID, emptyList5, f7);
        List emptyList6 = CollectionsKt.emptyList();
        d f8 = L.f(List.class, SubscriptionEntity.class);
        Intrinsics.checkNotNullExpressionValue(f8, "newParameterizedType(...)");
        this.subscriptions = new ObjectPreference(lazy, moshi, PREFS_FAVORITES_ID, emptyList6, f8);
        this.subscriptionsUserId = new StringPreference(lazy, PREFS_SUBSCRIPTIONS_USER_ID, "");
        List emptyList7 = CollectionsKt.emptyList();
        d f9 = L.f(List.class, StationStored.class);
        Intrinsics.checkNotNullExpressionValue(f9, "newParameterizedType(...)");
        this.lastStationsSearched = new ObjectPreference(lazy, moshi, PREFS_STATIONS_SEARCHED_ID, emptyList7, f9);
        List emptyList8 = CollectionsKt.emptyList();
        d f10 = L.f(List.class, TrainStored.class);
        Intrinsics.checkNotNullExpressionValue(f10, "newParameterizedType(...)");
        this.lastTrainsSearched = new ObjectPreference(lazy, moshi, PREFS_TRAINS_SEARCHED_ID, emptyList8, f10);
        this.pushToken = new StringPreference(lazy, PUSH_TOKEN, "");
        this.isPushTokenChanged = new BooleanPreference(lazy, PUSH_TOKEN_CHANGED, false);
        this.stationListToken = new StringPreference(lazy, PREFS_STATION_LIST_TOKEN, "0");
        this.lastVisitedStationCode = new StringPreference(lazy, PREFS_LAST_VISITED_STATION_CODE, "");
        this.lastDeparturesArrivalsStationCode = new StringPreference(lazy, PREFS_LAST_DEPARTURES_ARRIVALS_STATION_CODE, "");
        this.lastDeparturesArrivalsStationToCode = new StringPreference(lazy, PREFS_LAST_DEPARTURES_ARRIVALS_STATION_TO_CODE, "");
        this.lastDepartureTypeTrainIsCercanias = new BooleanPreference(lazy, PREFS_LAST_DEPARTURES_TYPE_TRAIN_ISCERCANIAS, false);
        HashMap hashMap = new HashMap();
        d f11 = L.f(Map.class, Integer.class, FavouriteEntity.class);
        Intrinsics.checkNotNullExpressionValue(f11, "newParameterizedType(...)");
        this.widgetInfo = new ObjectPreference(lazy, moshi, PREFS_WIDGET_FAVOURITE, hashMap, f11);
        this.lastFetchStationsDate = new LongPreference(lazy, LAST_FETCH_STATION_DATE);
        this.isSearchWarningMsgShowed = new BooleanPreference(lazy, PREFS_SEARCH_WARNING, false);
    }

    private final long getLastPinningUpdateMillis() {
        return this.lastPinningUpdateMillis.getValue((Object) this, $$delegatedProperties[10]).longValue();
    }

    private final void setLastPinningUpdateMillis(long j4) {
        this.lastPinningUpdateMillis.setValue(this, $$delegatedProperties[10], j4);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getAvisaPassword() {
        return this.avisaPassword.getValue((Object) this, $$delegatedProperties[3]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public AvisaToken getAvisaToken() {
        return (AvisaToken) this.avisaToken.getValue(this, $$delegatedProperties[5]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getAvisaUserId() {
        return this.avisaUserId.getValue((Object) this, $$delegatedProperties[2]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<String> getCirculationPinHash() {
        return (List) this.circulationPinHash.getValue(this, $$delegatedProperties[11]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<String> getElcanoPinHash() {
        return (List) this.elcanoPinHash.getValue(this, $$delegatedProperties[12]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<StationStored> getFavorites() {
        return (List) this.favorites.getValue(this, $$delegatedProperties[13]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<FilterEntity> getFilters() {
        return (List) this.filters.getValue(this, $$delegatedProperties[9]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getHomeStationId() {
        return this.homeStationId.getValue((Object) this, $$delegatedProperties[6]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getLastCheckedVersion() {
        return this.lastCheckedVersion.getValue((Object) this, $$delegatedProperties[4]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public boolean getLastDepartureTypeTrainIsCercanias() {
        return this.lastDepartureTypeTrainIsCercanias.getValue((Object) this, $$delegatedProperties[24]).booleanValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getLastDeparturesArrivalsStationCode() {
        return this.lastDeparturesArrivalsStationCode.getValue((Object) this, $$delegatedProperties[22]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getLastDeparturesArrivalsStationToCode() {
        return this.lastDeparturesArrivalsStationToCode.getValue((Object) this, $$delegatedProperties[23]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public long getLastFetchStationsDate() {
        return this.lastFetchStationsDate.getValue((Object) this, $$delegatedProperties[26]).longValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public Instant getLastPinningUpdate() {
        Instant ofEpochMilli = Instant.ofEpochMilli(getLastPinningUpdateMillis());
        Intrinsics.checkNotNullExpressionValue(ofEpochMilli, "ofEpochMilli(...)");
        return ofEpochMilli;
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<StationStored> getLastStationsSearched() {
        return (List) this.lastStationsSearched.getValue(this, $$delegatedProperties[16]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<TrainStored> getLastTrainsSearched() {
        return (List) this.lastTrainsSearched.getValue(this, $$delegatedProperties[17]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getLastVisitedStationCode() {
        return this.lastVisitedStationCode.getValue((Object) this, $$delegatedProperties[21]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<OperatorLogoValidityEntity> getLogosFetchDate() {
        return (List) this.logosFetchDate.getValue(this, $$delegatedProperties[8]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getPushToken() {
        return this.pushToken.getValue((Object) this, $$delegatedProperties[18]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getStationListToken() {
        return this.stationListToken.getValue((Object) this, $$delegatedProperties[20]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public List<SubscriptionEntity> getSubscriptions() {
        return (List) this.subscriptions.getValue(this, $$delegatedProperties[14]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getSubscriptionsUserId() {
        return this.subscriptionsUserId.getValue((Object) this, $$delegatedProperties[15]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public Map<Integer, FavouriteEntity> getWidgetInfo() {
        return (Map) this.widgetInfo.getValue(this, $$delegatedProperties[25]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public String getWorkStationId() {
        return this.workStationId.getValue((Object) this, $$delegatedProperties[7]);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public boolean isPushTokenChanged() {
        return this.isPushTokenChanged.getValue((Object) this, $$delegatedProperties[19]).booleanValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public boolean isRegistered() {
        return this.isRegistered.getValue((Object) this, $$delegatedProperties[1]).booleanValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public boolean isSearchWarningMsgShowed() {
        return this.isSearchWarningMsgShowed.getValue((Object) this, $$delegatedProperties[27]).booleanValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public boolean isTermsAccepted() {
        return this.isTermsAccepted.getValue((Object) this, $$delegatedProperties[0]).booleanValue();
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setAvisaPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avisaPassword.setValue2((Object) this, $$delegatedProperties[3], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setAvisaToken(AvisaToken avisaToken) {
        this.avisaToken.setValue(this, $$delegatedProperties[5], avisaToken);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setAvisaUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avisaUserId.setValue2((Object) this, $$delegatedProperties[2], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setCirculationPinHash(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.circulationPinHash.setValue(this, $$delegatedProperties[11], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setElcanoPinHash(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.elcanoPinHash.setValue(this, $$delegatedProperties[12], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setFavorites(List<? extends StationStored> list) {
        this.favorites.setValue(this, $$delegatedProperties[13], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setFilters(List<FilterEntity> list) {
        this.filters.setValue(this, $$delegatedProperties[9], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setHomeStationId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeStationId.setValue2((Object) this, $$delegatedProperties[6], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastCheckedVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastCheckedVersion.setValue2((Object) this, $$delegatedProperties[4], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastDepartureTypeTrainIsCercanias(boolean z3) {
        this.lastDepartureTypeTrainIsCercanias.setValue(this, $$delegatedProperties[24], z3);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastDeparturesArrivalsStationCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastDeparturesArrivalsStationCode.setValue2((Object) this, $$delegatedProperties[22], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastDeparturesArrivalsStationToCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastDeparturesArrivalsStationToCode.setValue2((Object) this, $$delegatedProperties[23], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastFetchStationsDate(long j4) {
        this.lastFetchStationsDate.setValue(this, $$delegatedProperties[26], j4);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastPinningUpdate(Instant value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setLastPinningUpdateMillis(value.toEpochMilli());
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastStationsSearched(List<? extends StationStored> list) {
        this.lastStationsSearched.setValue(this, $$delegatedProperties[16], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastTrainsSearched(List<? extends TrainStored> list) {
        this.lastTrainsSearched.setValue(this, $$delegatedProperties[17], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLastVisitedStationCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastVisitedStationCode.setValue2((Object) this, $$delegatedProperties[21], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setLogosFetchDate(List<OperatorLogoValidityEntity> list) {
        this.logosFetchDate.setValue(this, $$delegatedProperties[8], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setPushToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pushToken.setValue2((Object) this, $$delegatedProperties[18], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setPushTokenChanged(boolean z3) {
        this.isPushTokenChanged.setValue(this, $$delegatedProperties[19], z3);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setRegistered(boolean z3) {
        this.isRegistered.setValue(this, $$delegatedProperties[1], z3);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setSearchWarningMsgShowed(boolean z3) {
        this.isSearchWarningMsgShowed.setValue(this, $$delegatedProperties[27], z3);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setStationListToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stationListToken.setValue2((Object) this, $$delegatedProperties[20], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setSubscriptions(List<SubscriptionEntity> list) {
        this.subscriptions.setValue(this, $$delegatedProperties[14], list);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setSubscriptionsUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriptionsUserId.setValue2((Object) this, $$delegatedProperties[15], str);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setTermsAccepted(boolean z3) {
        this.isTermsAccepted.setValue(this, $$delegatedProperties[0], z3);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setWidgetInfo(Map<Integer, FavouriteEntity> map) {
        this.widgetInfo.setValue(this, $$delegatedProperties[25], map);
    }

    @Override // com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage
    public void setWorkStationId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.workStationId.setValue2((Object) this, $$delegatedProperties[7], str);
    }
}
