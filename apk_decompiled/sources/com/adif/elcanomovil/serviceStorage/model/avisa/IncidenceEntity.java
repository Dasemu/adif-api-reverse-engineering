package com.adif.elcanomovil.serviceStorage.model.avisa;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0099\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001e¨\u00067"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "incidenceCode", "", "stationId", "statusTypeId", "description", "notificationTypeId", "createdTime", "Ljava/util/Date;", "estimatedDateTo", "solvedDate", "categoryId", "photos", "", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidencePictureEntity;", "comments", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceCommentEntity;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "getCreatedTime", "()Ljava/util/Date;", "getDescription", "getEstimatedDateTo", "getId", "()I", "getIncidenceCode", "getNotificationTypeId", "getPhotos", "getSolvedDate", "getStationId", "getStatusTypeId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceEntity {
    private final String categoryId;
    private final List<IncidenceCommentEntity> comments;
    private final Date createdTime;
    private final String description;
    private final Date estimatedDateTo;
    private final int id;
    private final String incidenceCode;
    private final int notificationTypeId;
    private final List<IncidencePictureEntity> photos;
    private final Date solvedDate;
    private final String stationId;
    private final int statusTypeId;

    public IncidenceEntity(int i, String incidenceCode, String str, int i4, String description, int i5, Date createdTime, Date date, Date date2, String str2, List<IncidencePictureEntity> list, List<IncidenceCommentEntity> list2) {
        Intrinsics.checkNotNullParameter(incidenceCode, "incidenceCode");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(createdTime, "createdTime");
        this.id = i;
        this.incidenceCode = incidenceCode;
        this.stationId = str;
        this.statusTypeId = i4;
        this.description = description;
        this.notificationTypeId = i5;
        this.createdTime = createdTime;
        this.estimatedDateTo = date;
        this.solvedDate = date2;
        this.categoryId = str2;
        this.photos = list;
        this.comments = list2;
    }

    public static /* synthetic */ IncidenceEntity copy$default(IncidenceEntity incidenceEntity, int i, String str, String str2, int i4, String str3, int i5, Date date, Date date2, Date date3, String str4, List list, List list2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = incidenceEntity.id;
        }
        if ((i6 & 2) != 0) {
            str = incidenceEntity.incidenceCode;
        }
        if ((i6 & 4) != 0) {
            str2 = incidenceEntity.stationId;
        }
        if ((i6 & 8) != 0) {
            i4 = incidenceEntity.statusTypeId;
        }
        if ((i6 & 16) != 0) {
            str3 = incidenceEntity.description;
        }
        if ((i6 & 32) != 0) {
            i5 = incidenceEntity.notificationTypeId;
        }
        if ((i6 & 64) != 0) {
            date = incidenceEntity.createdTime;
        }
        if ((i6 & 128) != 0) {
            date2 = incidenceEntity.estimatedDateTo;
        }
        if ((i6 & 256) != 0) {
            date3 = incidenceEntity.solvedDate;
        }
        if ((i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            str4 = incidenceEntity.categoryId;
        }
        if ((i6 & 1024) != 0) {
            list = incidenceEntity.photos;
        }
        if ((i6 & 2048) != 0) {
            list2 = incidenceEntity.comments;
        }
        List list3 = list;
        List list4 = list2;
        Date date4 = date3;
        String str5 = str4;
        Date date5 = date;
        Date date6 = date2;
        String str6 = str3;
        int i7 = i5;
        return incidenceEntity.copy(i, str, str2, i4, str6, i7, date5, date6, date4, str5, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<IncidencePictureEntity> component11() {
        return this.photos;
    }

    public final List<IncidenceCommentEntity> component12() {
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
    public final Date getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getEstimatedDateTo() {
        return this.estimatedDateTo;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getSolvedDate() {
        return this.solvedDate;
    }

    public final IncidenceEntity copy(int id, String incidenceCode, String stationId, int statusTypeId, String description, int notificationTypeId, Date createdTime, Date estimatedDateTo, Date solvedDate, String categoryId, List<IncidencePictureEntity> photos, List<IncidenceCommentEntity> comments) {
        Intrinsics.checkNotNullParameter(incidenceCode, "incidenceCode");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(createdTime, "createdTime");
        return new IncidenceEntity(id, incidenceCode, stationId, statusTypeId, description, notificationTypeId, createdTime, estimatedDateTo, solvedDate, categoryId, photos, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceEntity)) {
            return false;
        }
        IncidenceEntity incidenceEntity = (IncidenceEntity) other;
        return this.id == incidenceEntity.id && Intrinsics.areEqual(this.incidenceCode, incidenceEntity.incidenceCode) && Intrinsics.areEqual(this.stationId, incidenceEntity.stationId) && this.statusTypeId == incidenceEntity.statusTypeId && Intrinsics.areEqual(this.description, incidenceEntity.description) && this.notificationTypeId == incidenceEntity.notificationTypeId && Intrinsics.areEqual(this.createdTime, incidenceEntity.createdTime) && Intrinsics.areEqual(this.estimatedDateTo, incidenceEntity.estimatedDateTo) && Intrinsics.areEqual(this.solvedDate, incidenceEntity.solvedDate) && Intrinsics.areEqual(this.categoryId, incidenceEntity.categoryId) && Intrinsics.areEqual(this.photos, incidenceEntity.photos) && Intrinsics.areEqual(this.comments, incidenceEntity.comments);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<IncidenceCommentEntity> getComments() {
        return this.comments;
    }

    public final Date getCreatedTime() {
        return this.createdTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Date getEstimatedDateTo() {
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

    public final List<IncidencePictureEntity> getPhotos() {
        return this.photos;
    }

    public final Date getSolvedDate() {
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
        int hashCode = (this.createdTime.hashCode() + w.x(this.notificationTypeId, a.d(this.description, w.x(this.statusTypeId, (d4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31;
        Date date = this.estimatedDateTo;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.solvedDate;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str2 = this.categoryId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<IncidencePictureEntity> list = this.photos;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<IncidenceCommentEntity> list2 = this.comments;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidenceEntity(id=");
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
