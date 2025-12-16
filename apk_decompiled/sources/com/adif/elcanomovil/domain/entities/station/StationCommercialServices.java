package com.adif.elcanomovil.domain.entities.station;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÛ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006F"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/StationCommercialServices;", "Lcom/adif/elcanomovil/domain/entities/station/StationServicesInterface;", "identifier", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "serviceType", "logo", "phoneNumber", "localNumber", "sapNumber", "locator", "Lcom/adif/elcanomovil/domain/entities/station/Locator;", "web", "androidLink", "description", "openingHours", "Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "pictures", "", "accessible", "Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "paymentWay", "offers", "Lcom/adif/elcanomovil/domain/entities/station/Offer;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Locator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;Ljava/util/List;Lcom/adif/elcanomovil/domain/entities/station/Accessible;Ljava/util/List;Ljava/util/List;)V", "getAccessible", "()Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "getAndroidLink", "()Ljava/lang/String;", "getDescription", "getIdentifier", "getLocalNumber", "getLocator", "()Lcom/adif/elcanomovil/domain/entities/station/Locator;", "getLogo", "getName", "getOffers", "()Ljava/util/List;", "getOpeningHours", "()Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "getPaymentWay", "getPhoneNumber", "getPictures", "getSapNumber", "getServiceType", "getWeb", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationCommercialServices implements StationServicesInterface {
    private final Accessible accessible;
    private final String androidLink;
    private final String description;
    private final String identifier;
    private final String localNumber;
    private final Locator locator;
    private final String logo;
    private final String name;
    private final List<Offer> offers;
    private final OpeningHours openingHours;
    private final List<String> paymentWay;
    private final String phoneNumber;
    private final List<String> pictures;
    private final String sapNumber;
    private final String serviceType;
    private final String web;

    public StationCommercialServices(String str, String str2, String str3, String str4, String str5, String str6, String str7, Locator locator, String str8, String str9, String str10, OpeningHours openingHours, List<String> list, Accessible accessible, List<String> list2, List<Offer> list3) {
        this.identifier = str;
        this.name = str2;
        this.serviceType = str3;
        this.logo = str4;
        this.phoneNumber = str5;
        this.localNumber = str6;
        this.sapNumber = str7;
        this.locator = locator;
        this.web = str8;
        this.androidLink = str9;
        this.description = str10;
        this.openingHours = openingHours;
        this.pictures = list;
        this.accessible = accessible;
        this.paymentWay = list2;
        this.offers = list3;
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> component13() {
        return this.pictures;
    }

    /* renamed from: component14, reason: from getter */
    public final Accessible getAccessible() {
        return this.accessible;
    }

    public final List<String> component15() {
        return this.paymentWay;
    }

    public final List<Offer> component16() {
        return this.offers;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getServiceType() {
        return this.serviceType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLocalNumber() {
        return this.localNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSapNumber() {
        return this.sapNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final Locator getLocator() {
        return this.locator;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    public final StationCommercialServices copy(String identifier, String name, String serviceType, String logo, String phoneNumber, String localNumber, String sapNumber, Locator locator, String web, String androidLink, String description, OpeningHours openingHours, List<String> pictures, Accessible accessible, List<String> paymentWay, List<Offer> offers) {
        return new StationCommercialServices(identifier, name, serviceType, logo, phoneNumber, localNumber, sapNumber, locator, web, androidLink, description, openingHours, pictures, accessible, paymentWay, offers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationCommercialServices)) {
            return false;
        }
        StationCommercialServices stationCommercialServices = (StationCommercialServices) other;
        return Intrinsics.areEqual(this.identifier, stationCommercialServices.identifier) && Intrinsics.areEqual(this.name, stationCommercialServices.name) && Intrinsics.areEqual(this.serviceType, stationCommercialServices.serviceType) && Intrinsics.areEqual(this.logo, stationCommercialServices.logo) && Intrinsics.areEqual(this.phoneNumber, stationCommercialServices.phoneNumber) && Intrinsics.areEqual(this.localNumber, stationCommercialServices.localNumber) && Intrinsics.areEqual(this.sapNumber, stationCommercialServices.sapNumber) && Intrinsics.areEqual(this.locator, stationCommercialServices.locator) && Intrinsics.areEqual(this.web, stationCommercialServices.web) && Intrinsics.areEqual(this.androidLink, stationCommercialServices.androidLink) && Intrinsics.areEqual(this.description, stationCommercialServices.description) && Intrinsics.areEqual(this.openingHours, stationCommercialServices.openingHours) && Intrinsics.areEqual(this.pictures, stationCommercialServices.pictures) && Intrinsics.areEqual(this.accessible, stationCommercialServices.accessible) && Intrinsics.areEqual(this.paymentWay, stationCommercialServices.paymentWay) && Intrinsics.areEqual(this.offers, stationCommercialServices.offers);
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public Accessible getAccessible() {
        return this.accessible;
    }

    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getDescription() {
        return this.description;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getIdentifier() {
        return this.identifier;
    }

    public final String getLocalNumber() {
        return this.localNumber;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public Locator getLocator() {
        return this.locator;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getLogo() {
        return this.logo;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getName() {
        return this.name;
    }

    public final List<Offer> getOffers() {
        return this.offers;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> getPaymentWay() {
        return this.paymentWay;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public List<String> getPictures() {
        return this.pictures;
    }

    public final String getSapNumber() {
        return this.sapNumber;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getWeb() {
        return this.web;
    }

    public int hashCode() {
        String str = this.identifier;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.localNumber;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sapNumber;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Locator locator = this.locator;
        int hashCode8 = (hashCode7 + (locator == null ? 0 : locator.hashCode())) * 31;
        String str8 = this.web;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.androidLink;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.description;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        OpeningHours openingHours = this.openingHours;
        int hashCode12 = (hashCode11 + (openingHours == null ? 0 : openingHours.hashCode())) * 31;
        List<String> list = this.pictures;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Accessible accessible = this.accessible;
        int hashCode14 = (hashCode13 + (accessible == null ? 0 : accessible.hashCode())) * 31;
        List<String> list2 = this.paymentWay;
        int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Offer> list3 = this.offers;
        return hashCode15 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationCommercialServices(identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", serviceType=");
        sb.append(this.serviceType);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", localNumber=");
        sb.append(this.localNumber);
        sb.append(", sapNumber=");
        sb.append(this.sapNumber);
        sb.append(", locator=");
        sb.append(this.locator);
        sb.append(", web=");
        sb.append(this.web);
        sb.append(", androidLink=");
        sb.append(this.androidLink);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", openingHours=");
        sb.append(this.openingHours);
        sb.append(", pictures=");
        sb.append(this.pictures);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", paymentWay=");
        sb.append(this.paymentWay);
        sb.append(", offers=");
        return a.o(sb, this.offers, ')');
    }
}
