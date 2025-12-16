package com.adif.elcanomovil.domain.entities.station;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/station/Offer;", "", "logo", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "pictures", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getLogo", "getName", "getPictures", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Offer {
    private final String description;
    private final String logo;
    private final String name;
    private final List<String> pictures;

    public Offer(String str, String str2, String str3, List<String> list) {
        this.logo = str;
        this.name = str2;
        this.description = str3;
        this.pictures = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offer.logo;
        }
        if ((i & 2) != 0) {
            str2 = offer.name;
        }
        if ((i & 4) != 0) {
            str3 = offer.description;
        }
        if ((i & 8) != 0) {
            list = offer.pictures;
        }
        return offer.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component4() {
        return this.pictures;
    }

    public final Offer copy(String logo, String name, String description, List<String> pictures) {
        return new Offer(logo, name, description, pictures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return Intrinsics.areEqual(this.logo, offer.logo) && Intrinsics.areEqual(this.name, offer.name) && Intrinsics.areEqual(this.description, offer.description) && Intrinsics.areEqual(this.pictures, offer.pictures);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getPictures() {
        return this.pictures;
    }

    public int hashCode() {
        String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.pictures;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Offer(logo=");
        sb.append(this.logo);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", pictures=");
        return a.o(sb, this.pictures, ')');
    }
}
