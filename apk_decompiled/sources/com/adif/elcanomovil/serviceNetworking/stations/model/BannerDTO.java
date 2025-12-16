package com.adif.elcanomovil.serviceNetworking.stations.model;

import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/stations/model/BannerDTO;", "", "bannerURI", "", "bannerTitle", "bannerDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerDescription", "()Ljava/lang/String;", "getBannerTitle", "getBannerURI", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BannerDTO {
    private final String bannerDescription;
    private final String bannerTitle;
    private final String bannerURI;

    public BannerDTO(String str, String str2, String str3) {
        this.bannerURI = str;
        this.bannerTitle = str2;
        this.bannerDescription = str3;
    }

    public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerDTO.bannerURI;
        }
        if ((i & 2) != 0) {
            str2 = bannerDTO.bannerTitle;
        }
        if ((i & 4) != 0) {
            str3 = bannerDTO.bannerDescription;
        }
        return bannerDTO.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBannerURI() {
        return this.bannerURI;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBannerDescription() {
        return this.bannerDescription;
    }

    public final BannerDTO copy(String bannerURI, String bannerTitle, String bannerDescription) {
        return new BannerDTO(bannerURI, bannerTitle, bannerDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDTO)) {
            return false;
        }
        BannerDTO bannerDTO = (BannerDTO) other;
        return Intrinsics.areEqual(this.bannerURI, bannerDTO.bannerURI) && Intrinsics.areEqual(this.bannerTitle, bannerDTO.bannerTitle) && Intrinsics.areEqual(this.bannerDescription, bannerDTO.bannerDescription);
    }

    public final String getBannerDescription() {
        return this.bannerDescription;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final String getBannerURI() {
        return this.bannerURI;
    }

    public int hashCode() {
        String str = this.bannerURI;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerDescription;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerDTO(bannerURI=");
        sb.append(this.bannerURI);
        sb.append(", bannerTitle=");
        sb.append(this.bannerTitle);
        sb.append(", bannerDescription=");
        return a.n(sb, this.bannerDescription, ')');
    }
}
