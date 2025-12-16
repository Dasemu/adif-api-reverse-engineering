package com.adif.elcanomovil.serviceNetworking.avisa.model;

import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/CreateIncidenceRequest;", "", "categoryId", "", "description", "notificationTypeId", "stationId", "photos", "", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceRequestPicture;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/String;", "getDescription", "getNotificationTypeId", "getPhotos", "()Ljava/util/List;", "getStationId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CreateIncidenceRequest {
    private final String categoryId;
    private final String description;
    private final String notificationTypeId;
    private final List<IncidenceRequestPicture> photos;
    private final String stationId;

    public CreateIncidenceRequest(String categoryId, String description, String notificationTypeId, String stationId, List<IncidenceRequestPicture> photos) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(notificationTypeId, "notificationTypeId");
        Intrinsics.checkNotNullParameter(stationId, "stationId");
        Intrinsics.checkNotNullParameter(photos, "photos");
        this.categoryId = categoryId;
        this.description = description;
        this.notificationTypeId = notificationTypeId;
        this.stationId = stationId;
        this.photos = photos;
    }

    public static /* synthetic */ CreateIncidenceRequest copy$default(CreateIncidenceRequest createIncidenceRequest, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createIncidenceRequest.categoryId;
        }
        if ((i & 2) != 0) {
            str2 = createIncidenceRequest.description;
        }
        if ((i & 4) != 0) {
            str3 = createIncidenceRequest.notificationTypeId;
        }
        if ((i & 8) != 0) {
            str4 = createIncidenceRequest.stationId;
        }
        if ((i & 16) != 0) {
            list = createIncidenceRequest.photos;
        }
        List list2 = list;
        String str5 = str3;
        return createIncidenceRequest.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNotificationTypeId() {
        return this.notificationTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStationId() {
        return this.stationId;
    }

    public final List<IncidenceRequestPicture> component5() {
        return this.photos;
    }

    public final CreateIncidenceRequest copy(String categoryId, String description, String notificationTypeId, String stationId, List<IncidenceRequestPicture> photos) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(notificationTypeId, "notificationTypeId");
        Intrinsics.checkNotNullParameter(stationId, "stationId");
        Intrinsics.checkNotNullParameter(photos, "photos");
        return new CreateIncidenceRequest(categoryId, description, notificationTypeId, stationId, photos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateIncidenceRequest)) {
            return false;
        }
        CreateIncidenceRequest createIncidenceRequest = (CreateIncidenceRequest) other;
        return Intrinsics.areEqual(this.categoryId, createIncidenceRequest.categoryId) && Intrinsics.areEqual(this.description, createIncidenceRequest.description) && Intrinsics.areEqual(this.notificationTypeId, createIncidenceRequest.notificationTypeId) && Intrinsics.areEqual(this.stationId, createIncidenceRequest.stationId) && Intrinsics.areEqual(this.photos, createIncidenceRequest.photos);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNotificationTypeId() {
        return this.notificationTypeId;
    }

    public final List<IncidenceRequestPicture> getPhotos() {
        return this.photos;
    }

    public final String getStationId() {
        return this.stationId;
    }

    public int hashCode() {
        return this.photos.hashCode() + a.d(this.stationId, a.d(this.notificationTypeId, a.d(this.description, this.categoryId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateIncidenceRequest(categoryId=");
        sb.append(this.categoryId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", notificationTypeId=");
        sb.append(this.notificationTypeId);
        sb.append(", stationId=");
        sb.append(this.stationId);
        sb.append(", photos=");
        return a.o(sb, this.photos, ')');
    }
}
