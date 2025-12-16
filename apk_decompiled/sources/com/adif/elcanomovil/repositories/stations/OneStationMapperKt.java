package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.domain.entities.station.Accessible;
import com.adif.elcanomovil.domain.entities.station.Banner;
import com.adif.elcanomovil.domain.entities.station.Correspondence;
import com.adif.elcanomovil.domain.entities.station.ExtendedStationInfo;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.adif.elcanomovil.domain.entities.station.Locator;
import com.adif.elcanomovil.domain.entities.station.Offer;
import com.adif.elcanomovil.domain.entities.station.OpeningHours;
import com.adif.elcanomovil.domain.entities.station.StationCommercialServices;
import com.adif.elcanomovil.domain.entities.station.StationInfo;
import com.adif.elcanomovil.domain.entities.station.StationServices;
import com.adif.elcanomovil.domain.entities.station.StationTransportServices;
import com.adif.elcanomovil.serviceNetworking.stations.model.AccessibleDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.BannerDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.CorrespondenceDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.ExtendedStationInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.LocationDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.LocatorDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.OfferDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.OpeningHoursDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationCommercialServicesDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.StationTransportServicesDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0002\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\b\u0012\u0004\u0012\u00020\t0\u0001H\u0002\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\b\u0012\u0004\u0012\u00020\f0\u0001H\u0002\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\f\u0010\r\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\f\u0010\r\u001a\u00020\u0012*\u00020\u0013H\u0002\u001a\f\u0010\r\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010\r\u001a\u00020\u0016*\u00020\u0017H\u0002\u001a\f\u0010\r\u001a\u00020\u0018*\u00020\u0019H\u0002\u001a\f\u0010\r\u001a\u00020\u001a*\u00020\u001bH\u0002\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\b\u0012\u0004\u0012\u00020\u001d0\u0001H\u0002¨\u0006\u001e"}, d2 = {"correspondenceDTOtoDomain", "", "Lcom/adif/elcanomovil/domain/entities/station/Correspondence;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/CorrespondenceDTO;", "offersToDomain", "Lcom/adif/elcanomovil/domain/entities/station/Offer;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/OfferDTO;", "stationCommercialServicesToDomain", "Lcom/adif/elcanomovil/domain/entities/station/StationCommercialServices;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationCommercialServicesDTO;", "stationTransportServicesToDomain", "Lcom/adif/elcanomovil/domain/entities/station/StationTransportServices;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationTransportServicesDTO;", "toDomain", "Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "Lcom/adif/elcanomovil/domain/entities/station/Banner;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/BannerDTO;", "Lcom/adif/elcanomovil/domain/entities/station/ExtendedStationInfo;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/ExtendedStationInfoDTO;", "Lcom/adif/elcanomovil/domain/entities/station/Location;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocationDTO;", "Lcom/adif/elcanomovil/domain/entities/station/Locator;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;", "Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;", "Lcom/adif/elcanomovil/domain/entities/station/StationInfo;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationInfoDTO;", "Lcom/adif/elcanomovil/domain/entities/station/StationServices;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationServicesDTO;", "repositories_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOneStationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStationMapper.kt\ncom/adif/elcanomovil/repositories/stations/OneStationMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,3:187\n1549#2:190\n1620#2,3:191\n1549#2:194\n1620#2,3:195\n1549#2:198\n1620#2,3:199\n*S KotlinDebug\n*F\n+ 1 OneStationMapper.kt\ncom/adif/elcanomovil/repositories/stations/OneStationMapperKt\n*L\n87#1:182\n87#1:183,3\n118#1:186\n118#1:187,3\n140#1:190\n140#1:191,3\n149#1:194\n149#1:195,3\n172#1:198\n172#1:199,3\n*E\n"})
/* loaded from: classes.dex */
public final class OneStationMapperKt {
    private static final List<Correspondence> correspondenceDTOtoDomain(List<CorrespondenceDTO> list) {
        int collectionSizeOrDefault;
        List<CorrespondenceDTO> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CorrespondenceDTO correspondenceDTO : list2) {
            arrayList.add(new Correspondence(correspondenceDTO.getName(), correspondenceDTO.getLogo()));
        }
        return arrayList;
    }

    private static final List<Offer> offersToDomain(List<OfferDTO> list) {
        int collectionSizeOrDefault;
        List<OfferDTO> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OfferDTO offerDTO : list2) {
            arrayList.add(new Offer(offerDTO.getLogo(), offerDTO.getName(), offerDTO.getDescription(), offerDTO.getPictures()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StationCommercialServices> stationCommercialServicesToDomain(List<StationCommercialServicesDTO> list) {
        int collectionSizeOrDefault;
        List<StationCommercialServicesDTO> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (StationCommercialServicesDTO stationCommercialServicesDTO : list2) {
            String identifier = stationCommercialServicesDTO.getIdentifier();
            String name = stationCommercialServicesDTO.getName();
            String serviceType = stationCommercialServicesDTO.getServiceType();
            String logo = stationCommercialServicesDTO.getLogo();
            String phoneNumber = stationCommercialServicesDTO.getPhoneNumber();
            String localNumber = stationCommercialServicesDTO.getLocalNumber();
            String sapNumber = stationCommercialServicesDTO.getSapNumber();
            LocatorDTO locator = stationCommercialServicesDTO.getLocator();
            List<Offer> list3 = null;
            Locator domain = locator != null ? toDomain(locator) : null;
            String web = stationCommercialServicesDTO.getWeb();
            String description = stationCommercialServicesDTO.getDescription();
            OpeningHoursDTO openingHours = stationCommercialServicesDTO.getOpeningHours();
            OpeningHours domain2 = openingHours != null ? toDomain(openingHours) : null;
            List<String> pictures = stationCommercialServicesDTO.getPictures();
            AccessibleDTO accessible = stationCommercialServicesDTO.getAccessible();
            Accessible domain3 = accessible != null ? toDomain(accessible) : null;
            List<String> paymentWay = stationCommercialServicesDTO.getPaymentWay();
            List<OfferDTO> offers = stationCommercialServicesDTO.getOffers();
            if (offers != null) {
                list3 = offersToDomain(offers);
            }
            arrayList.add(new StationCommercialServices(identifier, name, serviceType, logo, phoneNumber, localNumber, sapNumber, domain, web, stationCommercialServicesDTO.getAndroidLink(), description, domain2, pictures, domain3, paymentWay, list3));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<StationTransportServices> stationTransportServicesToDomain(List<StationTransportServicesDTO> list) {
        int collectionSizeOrDefault;
        List<Correspondence> list2;
        Accessible accessible;
        List<StationTransportServicesDTO> list3 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (StationTransportServicesDTO stationTransportServicesDTO : list3) {
            String serviceType = stationTransportServicesDTO.getServiceType();
            List<CorrespondenceDTO> correspondences = stationTransportServicesDTO.getCorrespondences();
            if (correspondences != null) {
                list2 = correspondenceDTOtoDomain(correspondences);
                accessible = null;
            } else {
                list2 = null;
                accessible = null;
            }
            String identifier = stationTransportServicesDTO.getIdentifier();
            Accessible accessible2 = accessible;
            String name = stationTransportServicesDTO.getName();
            String logo = stationTransportServicesDTO.getLogo();
            String phoneNumber = stationTransportServicesDTO.getPhoneNumber();
            AccessibleDTO accessible3 = stationTransportServicesDTO.getAccessible();
            Accessible domain = accessible3 != null ? toDomain(accessible3) : accessible2;
            LocatorDTO locator = stationTransportServicesDTO.getLocator();
            Object domain2 = locator != null ? toDomain(locator) : accessible2;
            String web = stationTransportServicesDTO.getWeb();
            Accessible accessible4 = domain;
            Locator locator2 = domain2;
            String androidLink = stationTransportServicesDTO.getAndroidLink();
            String huaweiLink = stationTransportServicesDTO.getHuaweiLink();
            OpeningHours openingHours = accessible2;
            String description = stationTransportServicesDTO.getDescription();
            OpeningHoursDTO openingHours2 = stationTransportServicesDTO.getOpeningHours();
            if (openingHours2 != null) {
                openingHours = toDomain(openingHours2);
            }
            arrayList.add(new StationTransportServices(serviceType, list2, identifier, name, logo, phoneNumber, accessible4, locator2, web, androidLink, huaweiLink, description, openingHours, stationTransportServicesDTO.getPictures(), stationTransportServicesDTO.getIoslink()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Banner toDomain(BannerDTO bannerDTO) {
        return new Banner(bannerDTO.getBannerURI(), bannerDTO.getBannerTitle(), bannerDTO.getBannerDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StationInfo toDomain(StationInfoDTO stationInfoDTO) {
        String stationCode = stationInfoDTO.getStationCode();
        String stationType = stationInfoDTO.getStationType();
        String longName = stationInfoDTO.getLongName();
        String shortName = stationInfoDTO.getShortName();
        List<String> akaList = stationInfoDTO.getAkaList();
        List<String> trafficType = stationInfoDTO.getTrafficType();
        List<String> lines = stationInfoDTO.getLines();
        String commercialZoneType = stationInfoDTO.getCommercialZoneType();
        String commuterNetwork = stationInfoDTO.getCommuterNetwork();
        AccessibleDTO accessible = stationInfoDTO.getAccessible();
        return new StationInfo(stationCode, stationType, longName, shortName, akaList, trafficType, lines, commercialZoneType, commuterNetwork, accessible != null ? toDomain(accessible) : null, stationInfoDTO.getDescription(), toDomain(stationInfoDTO.getLocation()));
    }

    private static final Accessible toDomain(AccessibleDTO accessibleDTO) {
        return new Accessible(Boolean.valueOf(accessibleDTO.getAccessible()), accessibleDTO.getDescription());
    }

    private static final Location toDomain(LocationDTO locationDTO) {
        return new Location(Double.valueOf(locationDTO.getLongitude()), Double.valueOf(locationDTO.getLatitude()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtendedStationInfo toDomain(ExtendedStationInfoDTO extendedStationInfoDTO) {
        OpeningHoursDTO openingHours = extendedStationInfoDTO.getOpeningHours();
        OpeningHours domain = openingHours != null ? toDomain(openingHours) : null;
        LocatorDTO locator = extendedStationInfoDTO.getLocator();
        return new ExtendedStationInfo(domain, locator != null ? toDomain(locator) : null, extendedStationInfoDTO.getPictures(), extendedStationInfoDTO.getBlueprints());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StationServices> toDomain(List<StationServicesDTO> list) {
        int collectionSizeOrDefault;
        List<StationServicesDTO> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (StationServicesDTO stationServicesDTO : list2) {
            String serviceType = stationServicesDTO.getServiceType();
            String identifier = stationServicesDTO.getIdentifier();
            String name = stationServicesDTO.getName();
            String logo = stationServicesDTO.getLogo();
            String phoneNumber = stationServicesDTO.getPhoneNumber();
            AccessibleDTO accessible = stationServicesDTO.getAccessible();
            Accessible domain = accessible != null ? toDomain(accessible) : null;
            LocatorDTO locator = stationServicesDTO.getLocator();
            Locator domain2 = locator != null ? toDomain(locator) : null;
            String web = stationServicesDTO.getWeb();
            Locator locator2 = domain2;
            String androidLink = stationServicesDTO.getAndroidLink();
            String huaweiLink = stationServicesDTO.getHuaweiLink();
            OpeningHours openingHours = null;
            String description = stationServicesDTO.getDescription();
            OpeningHoursDTO openingHours2 = stationServicesDTO.getOpeningHours();
            if (openingHours2 != null) {
                openingHours = toDomain(openingHours2);
            }
            arrayList.add(new StationServices(serviceType, identifier, name, logo, phoneNumber, domain, locator2, web, androidLink, huaweiLink, description, openingHours, stationServicesDTO.getPictures(), stationServicesDTO.getIoslink()));
        }
        return arrayList;
    }

    private static final Locator toDomain(LocatorDTO locatorDTO) {
        String description = locatorDTO.getDescription();
        LocationDTO location = locatorDTO.getLocation();
        return new Locator(description, location != null ? toDomain(location) : null);
    }

    private static final OpeningHours toDomain(OpeningHoursDTO openingHoursDTO) {
        return new OpeningHours(openingHoursDTO.getShortText(), openingHoursDTO.getLongText());
    }
}
