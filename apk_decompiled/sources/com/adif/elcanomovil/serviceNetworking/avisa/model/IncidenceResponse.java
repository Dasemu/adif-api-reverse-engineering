package com.adif.elcanomovil.serviceNetworking.avisa.model;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u009e\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 ¨\u0006:"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceResponse;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "incidenceCode", "", "stationId", "statusTypeId", "description", "notificationTypeId", "createdTime", "", "estimatedDateTo", "solvedDate", "categoryId", "photos", "", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidencePictureResponse;", "comments", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceCommentResponse;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "getCreatedTime", "()J", "getDescription", "getEstimatedDateTo", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()I", "getIncidenceCode", "getNotificationTypeId", "getPhotos", "getSolvedDate", "getStationId", "getStatusTypeId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceResponse;", "equals", "", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceResponse {
    private final String categoryId;
    private final List<IncidenceCommentResponse> comments;
    private final long createdTime;
    private final String description;
    private final Long estimatedDateTo;
    private final int id;
    private final String incidenceCode;
    private final int notificationTypeId;
    private final List<IncidencePictureResponse> photos;
    private final Long solvedDate;
    private final String stationId;
    private final int statusTypeId;

    public IncidenceResponse(int i, String incidenceCode, String str, int i4, String description, int i5, long j4, Long l4, Long l5, String str2, List<IncidencePictureResponse> list, List<IncidenceCommentResponse> list2) {
        Intrinsics.checkNotNullParameter(incidenceCode, "incidenceCode");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.incidenceCode = incidenceCode;
        this.stationId = str;
        this.statusTypeId = i4;
        this.description = description;
        this.notificationTypeId = i5;
        this.createdTime = j4;
        this.estimatedDateTo = l4;
        this.solvedDate = l5;
        this.categoryId = str2;
        this.photos = list;
        this.comments = list2;
    }

    public static /* synthetic */ IncidenceResponse copy$default(IncidenceResponse incidenceResponse, int i, String str, String str2, int i4, String str3, int i5, long j4, Long l4, Long l5, String str4, List list, List list2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = incidenceResponse.id;
        }
        return incidenceResponse.copy(i, (i6 & 2) != 0 ? incidenceResponse.incidenceCode : str, (i6 & 4) != 0 ? incidenceResponse.stationId : str2, (i6 & 8) != 0 ? incidenceResponse.statusTypeId : i4, (i6 & 16) != 0 ? incidenceResponse.description : str3, (i6 & 32) != 0 ? incidenceResponse.notificationTypeId : i5, (i6 & 64) != 0 ? incidenceResponse.createdTime : j4, (i6 & 128) != 0 ? incidenceResponse.estimatedDateTo : l4, (i6 & 256) != 0 ? incidenceResponse.solvedDate : l5, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? incidenceResponse.categoryId : str4, (i6 & 1024) != 0 ? incidenceResponse.photos : list, (i6 & 2048) != 0 ? incidenceResponse.comments : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<IncidencePictureResponse> component11() {
        return this.photos;
    }

    public final List<IncidenceCommentResponse> component12() {
        return this.comments;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIncidenceCode() {
        return this.incidenceCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStationId() {
        return this.stationId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStatusTypeId() {
        return this.statusTypeId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNotificationTypeId() {
        return this.notificationTypeId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getEstimatedDateTo() {
        return this.estimatedDateTo;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getSolvedDate() {
        return this.solvedDate;
    }

    public final IncidenceResponse copy(int id, String incidenceCode, String stationId, int statusTypeId, String description, int notificationTypeId, long createdTime, Long estimatedDateTo, Long solvedDate, String categoryId, List<IncidencePictureResponse> photos, List<IncidenceCommentResponse> comments) {
        Intrinsics.checkNotNullParameter(incidenceCode, "incidenceCode");
        Intrinsics.checkNotNullParameter(description, "description");
        return new IncidenceResponse(id, incidenceCode, stationId, statusTypeId, description, notificationTypeId, createdTime, estimatedDateTo, solvedDate, categoryId, photos, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceResponse)) {
            return false;
        }
        IncidenceResponse incidenceResponse = (IncidenceResponse) other;
        return this.id == incidenceResponse.id && Intrinsics.areEqual(this.incidenceCode, incidenceResponse.incidenceCode) && Intrinsics.areEqual(this.stationId, incidenceResponse.stationId) && this.statusTypeId == incidenceResponse.statusTypeId && Intrinsics.areEqual(this.description, incidenceResponse.description) && this.notificationTypeId == incidenceResponse.notificationTypeId && this.createdTime == incidenceResponse.createdTime && Intrinsics.areEqual(this.estimatedDateTo, incidenceResponse.estimatedDateTo) && Intrinsics.areEqual(this.solvedDate, incidenceResponse.solvedDate) && Intrinsics.areEqual(this.categoryId, incidenceResponse.categoryId) && Intrinsics.areEqual(this.photos, incidenceResponse.photos) && Intrinsics.areEqual(this.comments, incidenceResponse.comments);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<IncidenceCommentResponse> getComments() {
        return this.comments;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getEstimatedDateTo() {
        return this.estimatedDateTo;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIncidenceCode() {
        return this.incidenceCode;
    }

    public final int getNotificationTypeId() {
        return this.notificationTypeId;
    }

    public final List<IncidencePictureResponse> getPhotos() {
        return this.photos;
    }

    public final Long getSolvedDate() {
        return this.solvedDate;
    }

    public final String getStationId() {
        return this.stationId;
    }

    public final int getStatusTypeId() {
        return this.statusTypeId;
    }

    public int hashCode() {
        int d4 = a.d(this.incidenceCode, Integer.hashCode(this.id) * 31, 31);
        String str = this.stationId;
        int b4 = a.b(this.createdTime, w.x(this.notificationTypeId, a.d(this.description, w.x(this.statusTypeId, (d4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        Long l4 = this.estimatedDateTo;
        int hashCode = (b4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.solvedDate;
        int hashCode2 = (hashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.categoryId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<IncidencePictureResponse> list = this.photos;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<IncidenceCommentResponse> list2 = this.comments;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidenceResponse(id=");
        sb.append(this.id);
        sb.append(", incidenceCode=");
        sb.append(this.incidenceCode);
        sb.append(", stationId=");
        sb.append(this.stationId);
        sb.append(", statusTypeId=");
        sb.append(this.statusTypeId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", notificationTypeId=");
        sb.append(this.notificationTypeId);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", estimatedDateTo=");
        sb.append(this.estimatedDateTo);
        sb.append(", solvedDate=");
        sb.append(this.solvedDate);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", comments=");
        return a.o(sb, this.comments, ')');
    }
}
