package com.adif.elcanomovil.uiStations.mappers;

import com.adif.elcanomovil.domain.entities.station.Accessible;
import com.adif.elcanomovil.domain.entities.station.Correspondence;
import com.adif.elcanomovil.domain.entities.station.Location;
import com.adif.elcanomovil.domain.entities.station.Locator;
import com.adif.elcanomovil.domain.entities.station.Offer;
import com.adif.elcanomovil.domain.entities.station.OpeningHours;
import com.adif.elcanomovil.domain.entities.station.RequestedStationInfo;
import com.adif.elcanomovil.domain.entities.station.StationCommercialServices;
import com.adif.elcanomovil.domain.entities.station.StationInfo;
import com.adif.elcanomovil.domain.entities.station.StationServices;
import com.adif.elcanomovil.domain.entities.station.StationTransportServices;
import com.adif.elcanomovil.uiStations.entities.Services;
import com.adif.elcanomovil.uiStations.entities.StationMarker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\r\u001a\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00150\u000f\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00170\u000f\u001a\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00170\u000f\u001a\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f\u001a\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00150\u000f\u001a\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\"\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {RequestedStationInfoMapperKt.ACCESS, "", RequestedStationInfoMapperKt.AVISA, RequestedStationInfoMapperKt.E_SHARING, RequestedStationInfoMapperKt.GROCERY_STORE, RequestedStationInfoMapperKt.LEISURE, RequestedStationInfoMapperKt.OTHERS, RequestedStationInfoMapperKt.RENT_A_CAR, RequestedStationInfoMapperKt.RESTAURANT, RequestedStationInfoMapperKt.SHOP, RequestedStationInfoMapperKt.SOUVENIR, "getIsAvisaStation", "", "Lcom/adif/elcanomovil/domain/entities/station/RequestedStationInfo;", "getOffers", "", "Lcom/adif/elcanomovil/uiStations/entities/Services;", "Lcom/adif/elcanomovil/domain/entities/station/StationCommercialServices;", "getStationMarker", "Lcom/adif/elcanomovil/uiStations/entities/StationMarker;", "toAccessibility", "Lcom/adif/elcanomovil/domain/entities/station/StationServices;", "toEcomiles", "Lcom/adif/elcanomovil/domain/entities/station/StationTransportServices;", "toGroceryStore", "toIntermodality", "toLeisure", "toOthers", "toRentACar", "toRestaurant", "toShop", "toSouvenir", "toStationServicesView", "toType", "serviceType", "ui-stations_proNon_corporateRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestedStationInfoMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestedStationInfoMapper.kt\ncom/adif/elcanomovil/uiStations/mappers/RequestedStationInfoMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n766#2:292\n857#2,2:293\n1045#2:295\n1549#2:296\n1620#2,2:297\n1603#2,9:299\n1855#2:308\n1856#2:310\n1612#2:311\n1622#2:312\n766#2:313\n857#2,2:314\n1045#2:316\n1549#2:317\n1620#2,2:318\n1603#2,9:320\n1855#2:329\n1856#2:331\n1612#2:332\n1622#2:333\n766#2:334\n857#2,2:335\n1045#2:337\n1549#2:338\n1620#2,3:339\n766#2:342\n857#2,2:343\n1045#2:345\n1549#2:346\n1620#2,3:347\n1747#2,3:350\n766#2:353\n857#2,2:354\n1045#2:356\n1549#2:357\n1620#2,2:358\n1855#2,2:360\n1622#2:362\n766#2:363\n857#2,2:364\n1045#2:366\n1549#2:367\n1620#2,3:368\n1#3:309\n1#3:330\n*S KotlinDebug\n*F\n+ 1 RequestedStationInfoMapper.kt\ncom/adif/elcanomovil/uiStations/mappers/RequestedStationInfoMapperKt\n*L\n78#1:292\n78#1:293,2\n81#1:295\n84#1:296\n84#1:297,2\n95#1:299,9\n95#1:308\n95#1:310\n95#1:311\n84#1:312\n106#1:313\n106#1:314,2\n109#1:316\n112#1:317\n112#1:318,2\n123#1:320,9\n123#1:329\n123#1:331\n123#1:332\n112#1:333\n134#1:334\n134#1:335,2\n137#1:337\n140#1:338\n140#1:339,3\n162#1:342\n162#1:343,2\n165#1:345\n168#1:346\n168#1:347,3\n197#1:350,3\n204#1:353\n204#1:354,2\n207#1:356\n210#1:357\n210#1:358,2\n211#1:360,2\n210#1:362\n266#1:363\n266#1:364,2\n269#1:366\n272#1:367\n272#1:368,3\n95#1:309\n123#1:330\n*E\n"})
/* loaded from: classes2.dex */
public final class RequestedStationInfoMapperKt {
    public static final String ACCESS = "ACCESS";
    public static final String AVISA = "AVISA";
    public static final String E_SHARING = "E_SHARING";
    public static final String GROCERY_STORE = "GROCERY_STORE";
    public static final String LEISURE = "LEISURE";
    public static final String OTHERS = "OTHERS";
    public static final String RENT_A_CAR = "RENT_A_CAR";
    public static final String RESTAURANT = "RESTAURANT";
    public static final String SHOP = "SHOP";
    public static final String SOUVENIR = "SOUVENIR";

    public static final boolean getIsAvisaStation(RequestedStationInfo requestedStationInfo) {
        Intrinsics.checkNotNullParameter(requestedStationInfo, "<this>");
        List<StationServices> stationServices = requestedStationInfo.getStationServices();
        if (stationServices != null) {
            List<StationServices> list = stationServices;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((StationServices) it.next()).getServiceType(), AVISA)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final List<Services> getOffers(List<StationCommercialServices> list) {
        int collectionSizeOrDefault;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((StationCommercialServices) obj).getOffers() != null && (!r4.isEmpty())) {
                arrayList2.add(obj);
            }
        }
        List<StationCommercialServices> sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$getOffers$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationCommercialServices) t2).getName(), ((StationCommercialServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (StationCommercialServices stationCommercialServices : sortedWith) {
            List<Offer> offers = stationCommercialServices.getOffers();
            Unit unit = null;
            if (offers != null) {
                for (Offer offer : offers) {
                    String logo = stationCommercialServices.getLogo();
                    String name = stationCommercialServices.getName();
                    String phoneNumber = stationCommercialServices.getPhoneNumber();
                    String description = stationCommercialServices.getDescription();
                    Accessible accessible2 = stationCommercialServices.getAccessible();
                    boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
                    List<String> paymentWay = stationCommercialServices.getPaymentWay();
                    String name2 = offer.getName();
                    String description2 = offer.getDescription();
                    String logo2 = offer.getLogo();
                    String web = stationCommercialServices.getWeb();
                    Locator locator = stationCommercialServices.getLocator();
                    Location location = locator != null ? locator.getLocation() : null;
                    Accessible accessible3 = stationCommercialServices.getAccessible();
                    String description3 = accessible3 != null ? accessible3.getDescription() : null;
                    OpeningHours openingHours = stationCommercialServices.getOpeningHours();
                    arrayList.add(new Services(logo, name, phoneNumber, description, booleanValue, paymentWay, name2, description2, logo2, null, web, location, description3, openingHours != null ? openingHours.getShortText() : null, stationCommercialServices.getAndroidLink()));
                }
                unit = Unit.INSTANCE;
            }
            arrayList3.add(unit);
        }
        return arrayList;
    }

    public static final StationMarker getStationMarker(RequestedStationInfo requestedStationInfo) {
        Location location;
        Location location2;
        Intrinsics.checkNotNullParameter(requestedStationInfo, "<this>");
        StationInfo stationInfo = requestedStationInfo.getStationInfo();
        Double d4 = null;
        Double latitude = (stationInfo == null || (location2 = stationInfo.getLocation()) == null) ? null : location2.getLatitude();
        Intrinsics.checkNotNull(latitude);
        double doubleValue = latitude.doubleValue();
        StationInfo stationInfo2 = requestedStationInfo.getStationInfo();
        if (stationInfo2 != null && (location = stationInfo2.getLocation()) != null) {
            d4 = location.getLongitude();
        }
        Intrinsics.checkNotNull(d4);
        return new StationMarker(doubleValue, d4.doubleValue(), 0, 4, null);
    }

    public static final List<Services> toAccessibility(List<StationServices> list) {
        int collectionSizeOrDefault;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((StationServices) obj).getServiceType(), ACCESS)) {
                arrayList.add(obj);
            }
        }
        List<StationServices> sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$toAccessibility$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationServices) t2).getName(), ((StationServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (StationServices stationServices : sortedWith) {
            String logo = stationServices.getLogo();
            String name = stationServices.getName();
            String phoneNumber = stationServices.getPhoneNumber();
            String description = stationServices.getDescription();
            Accessible accessible2 = stationServices.getAccessible();
            boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
            String web = stationServices.getWeb();
            Locator locator = stationServices.getLocator();
            String str = null;
            Location location = locator != null ? locator.getLocation() : null;
            Accessible accessible3 = stationServices.getAccessible();
            String description2 = accessible3 != null ? accessible3.getDescription() : null;
            OpeningHours openingHours = stationServices.getOpeningHours();
            if (openingHours != null) {
                str = openingHours.getShortText();
            }
            arrayList2.add(new Services(logo, name, phoneNumber, description, booleanValue, null, null, null, null, null, web, location, description2, str, stationServices.getAndroidLink()));
        }
        return arrayList2;
    }

    public static final List<Services> toEcomiles(List<StationTransportServices> list) {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((StationTransportServices) obj).getServiceType(), E_SHARING)) {
                arrayList2.add(obj);
            }
        }
        List<StationTransportServices> sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$toEcomiles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationTransportServices) t2).getName(), ((StationTransportServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (StationTransportServices stationTransportServices : sortedWith) {
            String logo = stationTransportServices.getLogo();
            String name = stationTransportServices.getName();
            String phoneNumber = stationTransportServices.getPhoneNumber();
            String description = stationTransportServices.getDescription();
            Accessible accessible2 = stationTransportServices.getAccessible();
            boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
            List<Correspondence> correspondences = stationTransportServices.getCorrespondences();
            String str = null;
            if (correspondences != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it = correspondences.iterator();
                while (it.hasNext()) {
                    String logo2 = ((Correspondence) it.next()).getLogo();
                    if (logo2 != null) {
                        arrayList4.add(logo2);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String web = stationTransportServices.getWeb();
            Locator locator = stationTransportServices.getLocator();
            Location location = locator != null ? locator.getLocation() : null;
            Accessible accessible3 = stationTransportServices.getAccessible();
            String description2 = accessible3 != null ? accessible3.getDescription() : null;
            OpeningHours openingHours = stationTransportServices.getOpeningHours();
            if (openingHours != null) {
                str = openingHours.getShortText();
            }
            arrayList3.add(new Services(logo, name, phoneNumber, description, booleanValue, null, null, null, null, arrayList, web, location, description2, str, stationTransportServices.getAndroidLink()));
        }
        return arrayList3;
    }

    public static final List<Services> toGroceryStore(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, GROCERY_STORE);
    }

    public static final List<Services> toIntermodality(List<StationTransportServices> list) {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((StationTransportServices) obj).getServiceType(), E_SHARING)) {
                arrayList2.add(obj);
            }
        }
        List<StationTransportServices> sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$toIntermodality$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationTransportServices) t2).getName(), ((StationTransportServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (StationTransportServices stationTransportServices : sortedWith) {
            String logo = stationTransportServices.getLogo();
            String name = stationTransportServices.getName();
            String phoneNumber = stationTransportServices.getPhoneNumber();
            String description = stationTransportServices.getDescription();
            Accessible accessible2 = stationTransportServices.getAccessible();
            boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
            List<Correspondence> correspondences = stationTransportServices.getCorrespondences();
            String str = null;
            if (correspondences != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it = correspondences.iterator();
                while (it.hasNext()) {
                    String logo2 = ((Correspondence) it.next()).getLogo();
                    if (logo2 != null) {
                        arrayList4.add(logo2);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String web = stationTransportServices.getWeb();
            Locator locator = stationTransportServices.getLocator();
            Location location = locator != null ? locator.getLocation() : null;
            Accessible accessible3 = stationTransportServices.getAccessible();
            String description2 = accessible3 != null ? accessible3.getDescription() : null;
            OpeningHours openingHours = stationTransportServices.getOpeningHours();
            if (openingHours != null) {
                str = openingHours.getShortText();
            }
            arrayList3.add(new Services(logo, name, phoneNumber, description, booleanValue, null, null, null, null, arrayList, web, location, description2, str, stationTransportServices.getAndroidLink()));
        }
        return arrayList3;
    }

    public static final List<Services> toLeisure(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, LEISURE);
    }

    public static final List<Services> toOthers(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, OTHERS);
    }

    public static final List<Services> toRentACar(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, RENT_A_CAR);
    }

    public static final List<Services> toRestaurant(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, RESTAURANT);
    }

    public static final List<Services> toShop(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, SHOP);
    }

    public static final List<Services> toSouvenir(List<StationCommercialServices> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return toType(list, SOUVENIR);
    }

    public static final List<Services> toStationServicesView(List<StationServices> list) {
        int collectionSizeOrDefault;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((StationServices) obj).getServiceType(), ACCESS)) {
                arrayList.add(obj);
            }
        }
        List<StationServices> sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$toStationServicesView$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationServices) t2).getName(), ((StationServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (StationServices stationServices : sortedWith) {
            String logo = stationServices.getLogo();
            String name = stationServices.getName();
            String phoneNumber = stationServices.getPhoneNumber();
            String description = stationServices.getDescription();
            Accessible accessible2 = stationServices.getAccessible();
            boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
            String web = stationServices.getWeb();
            Locator locator = stationServices.getLocator();
            String str = null;
            Location location = locator != null ? locator.getLocation() : null;
            Accessible accessible3 = stationServices.getAccessible();
            String description2 = accessible3 != null ? accessible3.getDescription() : null;
            OpeningHours openingHours = stationServices.getOpeningHours();
            if (openingHours != null) {
                str = openingHours.getShortText();
            }
            arrayList2.add(new Services(logo, name, phoneNumber, description, booleanValue, null, null, null, null, null, web, location, description2, str, stationServices.getAndroidLink()));
        }
        return arrayList2;
    }

    public static final List<Services> toType(List<StationCommercialServices> list, String serviceType) {
        int collectionSizeOrDefault;
        List<Offer> offers;
        Offer offer;
        List<Offer> offers2;
        Offer offer2;
        Boolean accessible;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((StationCommercialServices) obj).getServiceType(), serviceType)) {
                arrayList.add(obj);
            }
        }
        List<StationCommercialServices> sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.adif.elcanomovil.uiStations.mappers.RequestedStationInfoMapperKt$toType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((StationCommercialServices) t2).getName(), ((StationCommercialServices) t4).getName());
            }
        });
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (StationCommercialServices stationCommercialServices : sortedWith) {
            String logo = stationCommercialServices.getLogo();
            String name = stationCommercialServices.getName();
            String phoneNumber = stationCommercialServices.getPhoneNumber();
            String description = stationCommercialServices.getDescription();
            Accessible accessible2 = stationCommercialServices.getAccessible();
            boolean booleanValue = (accessible2 == null || (accessible = accessible2.getAccessible()) == null) ? false : accessible.booleanValue();
            List<String> paymentWay = stationCommercialServices.getPaymentWay();
            List<Offer> offers3 = stationCommercialServices.getOffers();
            String str = null;
            String description2 = (offers3 == null || !(offers3.isEmpty() ^ true) || (offers2 = stationCommercialServices.getOffers()) == null || (offer2 = offers2.get(0)) == null) ? null : offer2.getDescription();
            List<Offer> offers4 = stationCommercialServices.getOffers();
            String description3 = (offers4 == null || !(offers4.isEmpty() ^ true) || (offers = stationCommercialServices.getOffers()) == null || (offer = offers.get(0)) == null) ? null : offer.getDescription();
            String web = stationCommercialServices.getWeb();
            Locator locator = stationCommercialServices.getLocator();
            Location location = locator != null ? locator.getLocation() : null;
            Accessible accessible3 = stationCommercialServices.getAccessible();
            String description4 = accessible3 != null ? accessible3.getDescription() : null;
            OpeningHours openingHours = stationCommercialServices.getOpeningHours();
            if (openingHours != null) {
                str = openingHours.getShortText();
            }
            arrayList2.add(new Services(logo, name, phoneNumber, description, booleanValue, paymentWay, description2, description3, null, null, web, location, description4, str, stationCommercialServices.getAndroidLink()));
        }
        return arrayList2;
    }
}
