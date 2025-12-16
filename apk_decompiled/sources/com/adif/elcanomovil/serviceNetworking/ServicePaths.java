package com.adif.elcanomovil.serviceNetworking;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths;", "", "()V", "AvisaLoginService", "AvisaStationService", "CirculationService", "CompositionService", "Headers", "IncidenceService", "StationObservationsService", "StationService", "SubscriptionsService", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServicePaths {
    public static final ServicePaths INSTANCE = new ServicePaths();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$AvisaLoginService;", "", "()V", FirebaseAnalytics.Event.LOGIN, "", "queryGranType", "queryPassword", "queryRefreshToken", "queryUsername", "refresh", "register", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AvisaLoginService {
        public static final AvisaLoginService INSTANCE = new AvisaLoginService();
        public static final String login = "token";
        public static final String queryGranType = "grant_type";
        public static final String queryPassword = "password";
        public static final String queryRefreshToken = "refresh_token";
        public static final String queryUsername = "username";
        public static final String refresh = "token";
        public static final String register = "v1/client";

        private AvisaLoginService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$AvisaStationService;", "", "()V", "stationCategory", "", "stations", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AvisaStationService {
        public static final AvisaStationService INSTANCE = new AvisaStationService();
        public static final String stationCategory = "/avisa-ws/api/v1/category";
        public static final String stations = "/avisa-ws/api/v1/station";

        private AvisaStationService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$CirculationService;", "", "()V", NavArguments.ARG_DYNAMIC_ARRIVALS, "", "betweenStations", NavArguments.ARG_DYNAMIC_DEPARTURES, "onePaths", "severalPaths", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CirculationService {
        public static final CirculationService INSTANCE = new CirculationService();
        public static final String arrivals = "/portroyalmanager/secure/circulationpaths/arrivals/traffictype/";
        public static final String betweenStations = "/portroyalmanager/secure/circulationpaths/betweenstations/traffictype/";
        public static final String departures = "/portroyalmanager/secure/circulationpaths/departures/traffictype/";
        public static final String onePaths = "/portroyalmanager/secure/circulationpathdetails/onepaths/";
        public static final String severalPaths = "/portroyalmanager/secure/circulationpathdetails/severalpaths/";

        private CirculationService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$CompositionService;", "", "()V", "compositions", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CompositionService {
        public static final CompositionService INSTANCE = new CompositionService();
        public static final String compositions = "/portroyalmanager/secure/circulationpaths/compositions/path/";

        private CompositionService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$Headers;", "", "()V", "apiManagerUserKeyCirculations", "", "apiManagerUserKeyStations", "authorization", "avisaLoginToken", "avisaRefreshToken", "canalMovilAuthentication", "canalMovilDeviceID", "canalMovilPushID", "contentType", "mockRequest", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Headers {
        public static final Headers INSTANCE = new Headers();
        public static final String apiManagerUserKeyCirculations = "User-key: f4ce9fbfa9d721e39b8984805901b5df";
        public static final String apiManagerUserKeyStations = "User-key: 0d021447a2fd2ac64553674d5a0c1a6f";
        public static final String authorization = "Authorization";
        public static final String avisaLoginToken = "Basic YXZpc3RhX2NsaWVudF9hbmRyb2lkOjh5WzZKNyFmSjwhXypmYXE1NyNnOSohNElwa2MjWC1BTg==";
        public static final String avisaRefreshToken = "Basic YXZpc3RhX2NsaWVudF9hbmRyb2lkOjh5WzZKNyFmSjwhXypmYXE1NyNnOSohNElwa2MjWC1BTg==";
        public static final String canalMovilAuthentication = "X-CanalMovil-Authentication";
        public static final String canalMovilDeviceID = "X-CanalMovil-deviceID";
        public static final String canalMovilPushID = "X-CanalMovil-pushID";
        public static final String contentType = "Content-Type: application/json;charset=utf-8";
        public static final String mockRequest = "x-mock-match-request-body: false";

        private Headers() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$IncidenceService;", "", "()V", "incidenceDetails", "", "incidences", "pathIncidenceId", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IncidenceService {
        public static final IncidenceService INSTANCE = new IncidenceService();
        public static final String incidenceDetails = "/avisa-ws/api/v1/incidence/{incidenceId}";
        public static final String incidences = "/avisa-ws/api/v1/incidence";
        public static final String pathIncidenceId = "incidenceId";

        private IncidenceService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$StationObservationsService;", "", "()V", "observations", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class StationObservationsService {
        public static final StationObservationsService INSTANCE = new StationObservationsService();
        public static final String observations = "/portroyalmanager/secure/stationsobservations/";

        private StationObservationsService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$StationService;", "", "()V", "stationDetails", "", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class StationService {
        public static final StationService INSTANCE = new StationService();
        public static final String stationDetails = "/portroyalmanager/secure/stations/onestation/";

        private StationService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/ServicePaths$SubscriptionsService;", "", "()V", "authentication", "", "create_subcriptions", "subcriptions", "subcriptionsMuteEndPath", "subcriptionsPath", "subscriptionToken", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SubscriptionsService {
        public static final SubscriptionsService INSTANCE = new SubscriptionsService();
        public static final String authentication = "3b0672*34n89?7n=34ass";
        public static final String create_subcriptions = "/api/subscriptions";
        public static final String subcriptions = "/api/subscriptions?platform=300";
        public static final String subcriptionsMuteEndPath = "/mute";
        public static final String subcriptionsPath = "subscriptions/";
        public static final String subscriptionToken = "Basic ZGVpbW9zOmRlaW1vc3R0";

        private SubscriptionsService() {
        }
    }

    private ServicePaths() {
    }
}
