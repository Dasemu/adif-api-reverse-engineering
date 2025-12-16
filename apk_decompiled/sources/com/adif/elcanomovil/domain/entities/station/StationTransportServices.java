package com.adif.elcanomovil.domain.entities.station;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b¨\u0006C"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/StationTransportServices;", "Lcom/adif/elcanomovil/domain/entities/station/StationServicesInterface;", "serviceType", "", "correspondences", "", "Lcom/adif/elcanomovil/domain/entities/station/Correspondence;", "identifier", AppMeasurementSdk.ConditionalUserProperty.NAME, "logo", "phoneNumber", "accessible", "Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "locator", "Lcom/adif/elcanomovil/domain/entities/station/Locator;", "web", "androidLink", "huaweiLink", "description", "openingHours", "Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "pictures", "ioslink", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/Accessible;Lcom/adif/elcanomovil/domain/entities/station/Locator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;Ljava/util/List;Ljava/lang/String;)V", "getAccessible", "()Lcom/adif/elcanomovil/domain/entities/station/Accessible;", "getAndroidLink", "()Ljava/lang/String;", "getCorrespondences", "()Ljava/util/List;", "getDescription", "getHuaweiLink", "getIdentifier", "getIoslink", "getLocator", "()Lcom/adif/elcanomovil/domain/entities/station/Locator;", "getLogo", "getName", "getOpeningHours", "()Lcom/adif/elcanomovil/domain/entities/station/OpeningHours;", "getPhoneNumber", "getPictures", "getServiceType", "getWeb", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationTransportServices implements StationServicesInterface {
    private final Accessible accessible;
    private final String androidLink;
    private final List<Correspondence> correspondences;
    private final String description;
    private final String huaweiLink;
    private final String identifier;
    private final String ioslink;
    private final Locator locator;
    private final String logo;
    private final String name;
    private final OpeningHours openingHours;
    private final String phoneNumber;
    private final List<String> pictures;
    private final String serviceType;
    private final String web;

    public StationTransportServices(String str, List<Correspondence> list, String str2, String str3, String str4, String str5, Accessible accessible, Locator locator, String str6, String str7, String str8, String str9, OpeningHours openingHours, List<String> list2, String str10) {
        this.serviceType = str;
        this.correspondences = list;
        this.identifier = str2;
        this.name = str3;
        this.logo = str4;
        this.phoneNumber = str5;
        this.accessible = accessible;
        this.locator = locator;
        this.web = str6;
        this.androidLink = str7;
        this.huaweiLink = str8;
        this.description = str9;
        this.openingHours = openingHours;
        this.pictures = list2;
        this.ioslink = str10;
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceType() {
        return this.serviceType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    /* renamed from: component11, reason: from getter */
    public final String getHuaweiLink() {
        return this.huaweiLink;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component13, reason: from getter */
    public final OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> component14() {
        return this.pictures;
    }

    /* renamed from: component15, reason: from getter */
    public final String getIoslink() {
        return this.ioslink;
    }

    public final List<Correspondence> component2() {
        return this.correspondences;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final Accessible getAccessible() {
        return this.accessible;
    }

    /* renamed from: component8, reason: from getter */
    public final Locator getLocator() {
        return this.locator;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    public final StationTransportServices copy(String serviceType, List<Correspondence> correspondences, String identifier, String name, String logo, String phoneNumber, Accessible accessible, Locator locator, String web, String androidLink, String huaweiLink, String description, OpeningHours openingHours, List<String> pictures, String ioslink) {
        return new StationTransportServices(serviceType, correspondences, identifier, name, logo, phoneNumber, accessible, locator, web, androidLink, huaweiLink, description, openingHours, pictures, ioslink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationTransportServices)) {
            return false;
        }
        StationTransportServices stationTransportServices = (StationTransportServices) other;
        return Intrinsics.areEqual(this.serviceType, stationTransportServices.serviceType) && Intrinsics.areEqual(this.correspondences, stationTransportServices.correspondences) && Intrinsics.areEqual(this.identifier, stationTransportServices.identifier) && Intrinsics.areEqual(this.name, stationTransportServices.name) && Intrinsics.areEqual(this.logo, stationTransportServices.logo) && Intrinsics.areEqual(this.phoneNumber, stationTransportServices.phoneNumber) && Intrinsics.areEqual(this.accessible, stationTransportServices.accessible) && Intrinsics.areEqual(this.locator, stationTransportServices.locator) && Intrinsics.areEqual(this.web, stationTransportServices.web) && Intrinsics.areEqual(this.androidLink, stationTransportServices.androidLink) && Intrinsics.areEqual(this.huaweiLink, stationTransportServices.huaweiLink) && Intrinsics.areEqual(this.description, stationTransportServices.description) && Intrinsics.areEqual(this.openingHours, stationTransportServices.openingHours) && Intrinsics.areEqual(this.pictures, stationTransportServices.pictures) && Intrinsics.areEqual(this.ioslink, stationTransportServices.ioslink);
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public Accessible getAccessible() {
        return this.accessible;
    }

    public final String getAndroidLink() {
        return this.androidLink;
    }

    public final List<Correspondence> getCorrespondences() {
        return this.correspondences;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getDescription() {
        return this.description;
    }

    public final String getHuaweiLink() {
        return this.huaweiLink;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getIdentifier() {
        return this.identifier;
    }

    public final String getIoslink() {
        return this.ioslink;
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

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public OpeningHours getOpeningHours() {
        return this.openingHours;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public List<String> getPictures() {
        return this.pictures;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    @Override // com.adif.elcanomovil.domain.entities.station.StationServicesInterface
    public String getWeb() {
        return this.web;
    }

    public int hashCode() {
        String str = this.serviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Correspondence> list = this.correspondences;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.identifier;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Accessible accessible = this.accessible;
        int hashCode7 = (hashCode6 + (accessible == null ? 0 : accessible.hashCode())) * 31;
        Locator locator = this.locator;
        int hashCode8 = (hashCode7 + (locator == null ? 0 : locator.hashCode())) * 31;
        String str6 = this.web;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidLink;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.huaweiLink;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.description;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        OpeningHours openingHours = this.openingHours;
        int hashCode13 = (hashCode12 + (openingHours == null ? 0 : openingHours.hashCode())) * 31;
        List<String> list2 = this.pictures;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.ioslink;
        return hashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationTransportServices(serviceType=");
        sb.append(this.serviceType);
        sb.append(", correspondences=");
        sb.append(this.correspondences);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", locator=");
        sb.append(this.locator);
        sb.append(", web=");
        sb.append(this.web);
        sb.append(", androidLink=");
        sb.append(this.androidLink);
        sb.append(", huaweiLink=");
        sb.append(this.huaweiLink);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", openingHours=");
        sb.append(this.openingHours);
        sb.append(", pictures=");
        sb.append(this.pictures);
        sb.append(", ioslink=");
        return a.n(sb, this.ioslink, ')');
    }
}
