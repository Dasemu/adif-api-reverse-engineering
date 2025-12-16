package com.adif.elcanomovil.uiStations.mappers;

import com.adif.elcanomovil.domain.entities.station.Accessible;
import com.adif.elcanomovil.domain.entities.station.Banner;
import com.adif.elcanomovil.domain.entities.station.ExtendedStationInfo;
import com.adif.elcanomovil.domain.entities.station.Locator;
import com.adif.elcanomovil.domain.entities.station.OpeningHours;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.StationCommercialServices;
import com.adif.elcanomovil.domain.entities.station.StationInfo;
import com.adif.elcanomovil.domain.entities.station.StationServices;
import com.adif.elcanomovil.domain.entities.station.StationTransportServices;
import com.adif.elcanomovil.uiStations.entities.ActivitiesTabViewData;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.adif.elcanomovil.uiStations.entities.CommercialTabViewData;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import com.adif.elcanomovil.uiStations.entities.StationMarker;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/uiStations/mappers/RequestedStationInfoMapper;", "", "()V", "mapToActivitiesTabViewData", "Lcom/adif/elcanomovil/uiStations/entities/ActivitiesTabViewData;", Constants.MessagePayloadKeys.FROM, "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "mapToCommercialTabViewData", "Lcom/adif/elcanomovil/uiStations/entities/CommercialTabViewData;", "mapToServicesTabViewData", "Lcom/adif/elcanomovil/uiStations/entities/ServicesTabViewData;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestedStationInfoMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestedStationInfoMapper.kt\ncom/adif/elcanomovil/uiStations/mappers/RequestedStationInfoMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1549#2:292\n1620#2,3:293\n*S KotlinDebug\n*F\n+ 1 RequestedStationInfoMapper.kt\ncom/adif/elcanomovil/uiStations/mappers/RequestedStationInfoMapper\n*L\n54#1:292\n54#1:293,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RequestedStationInfoMapper {
    public static final RequestedStationInfoMapper INSTANCE = new RequestedStationInfoMapper();

    private RequestedStationInfoMapper() {
    }

    public final ActivitiesTabViewData mapToActivitiesTabViewData(RequestedStationInfo from) {
        int collectionSizeOrDefault;
        Boolean accessible;
        ArrayList arrayList = null;
        if (from == null) {
            return null;
        }
        List<StationCommercialServices> stationActivities = from.getStationActivities();
        if (stationActivities != null) {
            List<StationCommercialServices> list = stationActivities;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (StationCommercialServices stationCommercialServices : list) {
                String logo = stationCommercialServices.getLogo();
                String name = stationCommercialServices.getName();
                String phoneNumber = stationCommercialServices.getPhoneNumber();
                String description = stationCommercialServices.getDescription();
                Accessible accessible2 = stationCommercialServices.getAccessible();
                boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
                List<String> paymentWay = stationCommercialServices.getPaymentWay();
                String web = stationCommercialServices.getWeb();
                Locator locator = stationCommercialServices.getLocator();
                String description2 = locator != null ? locator.getDescription() : null;
                Accessible accessible3 = stationCommercialServices.getAccessible();
                String description3 = accessible3 != null ? accessible3.getDescription() : null;
                OpeningHours openingHours = stationCommercialServices.getOpeningHours();
                arrayList2.add(new Activity(logo, name, phoneNumber, description, booleanValue, paymentWay, null, null, web, description2, description3, openingHours != null ? openingHours.getShortText() : null, stationCommercialServices.getAndroidLink()));
            }
            arrayList = arrayList2;
        }
        return new ActivitiesTabViewData(arrayList);
    }

    public final CommercialTabViewData mapToCommercialTabViewData(RequestedStationInfo from) {
        if (from == null) {
            return null;
        }
        StationInfo stationInfo = from.getStationInfo();
        String commercialZoneType = stationInfo != null ? stationInfo.getCommercialZoneType() : null;
        List<StationCommercialServices> stationCommercialServices = from.getStationCommercialServices();
        List<Services> offers = stationCommercialServices != null ? RequestedStationInfoMapperKt.getOffers(stationCommercialServices) : null;
        List<StationCommercialServices> stationCommercialServices2 = from.getStationCommercialServices();
        List<Services> groceryStore = stationCommercialServices2 != null ? RequestedStationInfoMapperKt.toGroceryStore(stationCommercialServices2) : null;
        List<StationCommercialServices> stationCommercialServices3 = from.getStationCommercialServices();
        List<Services> leisure = stationCommercialServices3 != null ? RequestedStationInfoMapperKt.toLeisure(stationCommercialServices3) : null;
        List<StationCommercialServices> stationCommercialServices4 = from.getStationCommercialServices();
        List<Services> others = stationCommercialServices4 != null ? RequestedStationInfoMapperKt.toOthers(stationCommercialServices4) : null;
        List<StationCommercialServices> stationCommercialServices5 = from.getStationCommercialServices();
        List<Services> rentACar = stationCommercialServices5 != null ? RequestedStationInfoMapperKt.toRentACar(stationCommercialServices5) : null;
        List<StationCommercialServices> stationCommercialServices6 = from.getStationCommercialServices();
        List<Services> restaurant = stationCommercialServices6 != null ? RequestedStationInfoMapperKt.toRestaurant(stationCommercialServices6) : null;
        List<StationCommercialServices> stationCommercialServices7 = from.getStationCommercialServices();
        List<Services> shop = stationCommercialServices7 != null ? RequestedStationInfoMapperKt.toShop(stationCommercialServices7) : null;
        List<StationCommercialServices> stationCommercialServices8 = from.getStationCommercialServices();
        return new CommercialTabViewData(commercialZoneType, offers, groceryStore, leisure, others, rentACar, restaurant, shop, stationCommercialServices8 != null ? RequestedStationInfoMapperKt.toSouvenir(stationCommercialServices8) : null);
    }

    public final ServicesTabViewData mapToServicesTabViewData(RequestedStationInfo from) {
        Locator locator;
        OpeningHours openingHours;
        if (from == null) {
            return null;
        }
        List<StationTransportServices> stationTransportServices = from.getStationTransportServices();
        List<Services> ecomiles = stationTransportServices != null ? RequestedStationInfoMapperKt.toEcomiles(stationTransportServices) : null;
        List<StationTransportServices> stationTransportServices2 = from.getStationTransportServices();
        List<Services> intermodality = stationTransportServices2 != null ? RequestedStationInfoMapperKt.toIntermodality(stationTransportServices2) : null;
        List<StationServices> stationServices = from.getStationServices();
        List<Services> accessibility = stationServices != null ? RequestedStationInfoMapperKt.toAccessibility(stationServices) : null;
        List<StationServices> stationServices2 = from.getStationServices();
        List<Services> stationServicesView = stationServices2 != null ? RequestedStationInfoMapperKt.toStationServicesView(stationServices2) : null;
        StationMarker stationMarker = RequestedStationInfoMapperKt.getStationMarker(from);
        boolean isAvisaStation = RequestedStationInfoMapperKt.getIsAvisaStation(from);
        ExtendedStationInfo extendedStationInfo = from.getExtendedStationInfo();
        String shortText = (extendedStationInfo == null || (openingHours = extendedStationInfo.getOpeningHours()) == null) ? null : openingHours.getShortText();
        ExtendedStationInfo extendedStationInfo2 = from.getExtendedStationInfo();
        String description = (extendedStationInfo2 == null || (locator = extendedStationInfo2.getLocator()) == null) ? null : locator.getDescription();
        Banner banner = from.getBanner();
        String bannerURI = banner != null ? banner.getBannerURI() : null;
        Banner banner2 = from.getBanner();
        String bannerTitle = banner2 != null ? banner2.getBannerTitle() : null;
        Banner banner3 = from.getBanner();
        return new ServicesTabViewData(ecomiles, intermodality, accessibility, stationServicesView, stationMarker, false, isAvisaStation, shortText, description, bannerURI, bannerTitle, banner3 != null ? banner3.getBannerDescription() : null);
    }
}
