package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J·\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006?"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationServicesDTO;", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/StationServicesInterface;", "serviceType", "", "identifier", AppMeasurementSdk.ConditionalUserProperty.NAME, "logo", "phoneNumber", "accessible", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "locator", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;", "web", "androidLink", "huaweiLink", "description", "openingHours", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;", "pictures", "", "ioslink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;Ljava/util/List;Ljava/lang/String;)V", "getAccessible", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/AccessibleDTO;", "getAndroidLink", "()Ljava/lang/String;", "getDescription", "getHuaweiLink", "getIdentifier", "getIoslink", "getLocator", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;", "getLogo", "getName", "getOpeningHours", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;", "getPhoneNumber", "getPictures", "()Ljava/util/List;", "getServiceType", "getWeb", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationServicesDTO implements StationServicesInterface {
    private final AccessibleDTO accessible;
    private final String androidLink;
    private final String description;
    private final String huaweiLink;
    private final String identifier;
    private final String ioslink;
    private final LocatorDTO locator;
    private final String logo;
    private final String name;
    private final OpeningHoursDTO openingHours;
    private final String phoneNumber;
    private final List<String> pictures;
    private final String serviceType;
    private final String web;

    public StationServicesDTO(String str, String str2, String str3, String str4, String str5, AccessibleDTO accessibleDTO, LocatorDTO locatorDTO, String str6, String str7, String str8, String str9, OpeningHoursDTO openingHoursDTO, List<String> list, String str10) {
        this.serviceType = str;
        this.identifier = str2;
        this.name = str3;
        this.logo = str4;
        this.phoneNumber = str5;
        this.accessible = accessibleDTO;
        this.locator = locatorDTO;
        this.web = str6;
        this.androidLink = str7;
        this.huaweiLink = str8;
        this.description = str9;
        this.openingHours = openingHoursDTO;
        this.pictures = list;
        this.ioslink = str10;
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceType() {
        return this.serviceType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHuaweiLink() {
        return this.huaweiLink;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final OpeningHoursDTO getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> component13() {
        return this.pictures;
    }

    /* renamed from: component14, reason: from getter */
    public final String getIoslink() {
        return this.ioslink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
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
    public final AccessibleDTO getAccessible() {
        return this.accessible;
    }

    /* renamed from: component7, reason: from getter */
    public final LocatorDTO getLocator() {
        return this.locator;
    }

    /* renamed from: component8, reason: from getter */
    public final String getWeb() {
        return this.web;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAndroidLink() {
        return this.androidLink;
    }

    public final StationServicesDTO copy(String serviceType, String identifier, String name, String logo, String phoneNumber, AccessibleDTO accessible, LocatorDTO locator, String web, String androidLink, String huaweiLink, String description, OpeningHoursDTO openingHours, List<String> pictures, String ioslink) {
        return new StationServicesDTO(serviceType, identifier, name, logo, phoneNumber, accessible, locator, web, androidLink, huaweiLink, description, openingHours, pictures, ioslink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationServicesDTO)) {
            return false;
        }
        StationServicesDTO stationServicesDTO = (StationServicesDTO) other;
        return Intrinsics.areEqual(this.serviceType, stationServicesDTO.serviceType) && Intrinsics.areEqual(this.identifier, stationServicesDTO.identifier) && Intrinsics.areEqual(this.name, stationServicesDTO.name) && Intrinsics.areEqual(this.logo, stationServicesDTO.logo) && Intrinsics.areEqual(this.phoneNumber, stationServicesDTO.phoneNumber) && Intrinsics.areEqual(this.accessible, stationServicesDTO.accessible) && Intrinsics.areEqual(this.locator, stationServicesDTO.locator) && Intrinsics.areEqual(this.web, stationServicesDTO.web) && Intrinsics.areEqual(this.androidLink, stationServicesDTO.androidLink) && Intrinsics.areEqual(this.huaweiLink, stationServicesDTO.huaweiLink) && Intrinsics.areEqual(this.description, stationServicesDTO.description) && Intrinsics.areEqual(this.openingHours, stationServicesDTO.openingHours) && Intrinsics.areEqual(this.pictures, stationServicesDTO.pictures) && Intrinsics.areEqual(this.ioslink, stationServicesDTO.ioslink);
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public AccessibleDTO getAccessible() {
        return this.accessible;
    }

    public final String getAndroidLink() {
        return this.androidLink;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getDescription() {
        return this.description;
    }

    public final String getHuaweiLink() {
        return this.huaweiLink;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getIdentifier() {
        return this.identifier;
    }

    public final String getIoslink() {
        return this.ioslink;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public LocatorDTO getLocator() {
        return this.locator;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getLogo() {
        return this.logo;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getName() {
        return this.name;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public OpeningHoursDTO getOpeningHours() {
        return this.openingHours;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public List<String> getPictures() {
        return this.pictures;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    @Override // com.adif.elcanomovil.serviceNetworking.stations.model.StationServicesInterface
    public String getWeb() {
        return this.web;
    }

    public int hashCode() {
        String str = this.serviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identifier;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AccessibleDTO accessibleDTO = this.accessible;
        int hashCode6 = (hashCode5 + (accessibleDTO == null ? 0 : accessibleDTO.hashCode())) * 31;
        LocatorDTO locatorDTO = this.locator;
        int hashCode7 = (hashCode6 + (locatorDTO == null ? 0 : locatorDTO.hashCode())) * 31;
        String str6 = this.web;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidLink;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.huaweiLink;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.description;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        OpeningHoursDTO openingHoursDTO = this.openingHours;
        int hashCode12 = (hashCode11 + (openingHoursDTO == null ? 0 : openingHoursDTO.hashCode())) * 31;
        List<String> list = this.pictures;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.ioslink;
        return hashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationServicesDTO(serviceType=");
        sb.append(this.serviceType);
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
