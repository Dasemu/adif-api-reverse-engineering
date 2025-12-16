package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/ExtendedStationInfoDTO;", "", "openingHours", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;", "locator", "Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;", "pictures", "", "", "blueprints", "(Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;Ljava/util/List;Ljava/util/List;)V", "getBlueprints", "()Ljava/util/List;", "getLocator", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/LocatorDTO;", "getOpeningHours", "()Lcom/adif/elcanomovil/serviceNetworking/stations/model/OpeningHoursDTO;", "getPictures", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExtendedStationInfoDTO {
    private final List<String> blueprints;
    private final LocatorDTO locator;
    private final OpeningHoursDTO openingHours;
    private final List<String> pictures;

    public ExtendedStationInfoDTO(OpeningHoursDTO openingHoursDTO, LocatorDTO locatorDTO, List<String> list, List<String> list2) {
        this.openingHours = openingHoursDTO;
        this.locator = locatorDTO;
        this.pictures = list;
        this.blueprints = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedStationInfoDTO copy$default(ExtendedStationInfoDTO extendedStationInfoDTO, OpeningHoursDTO openingHoursDTO, LocatorDTO locatorDTO, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            openingHoursDTO = extendedStationInfoDTO.openingHours;
        }
        if ((i & 2) != 0) {
            locatorDTO = extendedStationInfoDTO.locator;
        }
        if ((i & 4) != 0) {
            list = extendedStationInfoDTO.pictures;
        }
        if ((i & 8) != 0) {
            list2 = extendedStationInfoDTO.blueprints;
        }
        return extendedStationInfoDTO.copy(openingHoursDTO, locatorDTO, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final OpeningHoursDTO getOpeningHours() {
        return this.openingHours;
    }

    /* renamed from: component2, reason: from getter */
    public final LocatorDTO getLocator() {
        return this.locator;
    }

    public final List<String> component3() {
        return this.pictures;
    }

    public final List<String> component4() {
        return this.blueprints;
    }

    public final ExtendedStationInfoDTO copy(OpeningHoursDTO openingHours, LocatorDTO locator, List<String> pictures, List<String> blueprints) {
        return new ExtendedStationInfoDTO(openingHours, locator, pictures, blueprints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedStationInfoDTO)) {
            return false;
        }
        ExtendedStationInfoDTO extendedStationInfoDTO = (ExtendedStationInfoDTO) other;
        return Intrinsics.areEqual(this.openingHours, extendedStationInfoDTO.openingHours) && Intrinsics.areEqual(this.locator, extendedStationInfoDTO.locator) && Intrinsics.areEqual(this.pictures, extendedStationInfoDTO.pictures) && Intrinsics.areEqual(this.blueprints, extendedStationInfoDTO.blueprints);
    }

    public final List<String> getBlueprints() {
        return this.blueprints;
    }

    public final LocatorDTO getLocator() {
        return this.locator;
    }

    public final OpeningHoursDTO getOpeningHours() {
        return this.openingHours;
    }

    public final List<String> getPictures() {
        return this.pictures;
    }

    public int hashCode() {
        OpeningHoursDTO openingHoursDTO = this.openingHours;
        int hashCode = (openingHoursDTO == null ? 0 : openingHoursDTO.hashCode()) * 31;
        LocatorDTO locatorDTO = this.locator;
        int hashCode2 = (hashCode + (locatorDTO == null ? 0 : locatorDTO.hashCode())) * 31;
        List<String> list = this.pictures;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.blueprints;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtendedStationInfoDTO(openingHours=");
        sb.append(this.openingHours);
        sb.append(", locator=");
        sb.append(this.locator);
        sb.append(", pictures=");
        sb.append(this.pictures);
        sb.append(", blueprints=");
        return a.o(sb, this.blueprints, ')');
    }
}
