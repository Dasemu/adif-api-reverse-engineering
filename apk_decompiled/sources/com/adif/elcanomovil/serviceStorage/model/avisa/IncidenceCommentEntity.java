package com.adif.elcanomovil.serviceStorage.model.avisa;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006-"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceCommentEntity;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "createTime", "Ljava/util/Date;", "updatedTime", "type", "", "statusTypeId", "description", ServicePaths.IncidenceService.pathIncidenceId, "fixPhotos", "", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidencePictureEntity;", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getCreateTime", "()Ljava/util/Date;", "getDescription", "()Ljava/lang/String;", "getFixPhotos", "()Ljava/util/List;", "getId", "()I", "getIncidenceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusTypeId", "getType", "getUpdatedTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceCommentEntity;", "equals", "", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceCommentEntity {
    private final Date createTime;
    private final String description;
    private final List<IncidencePictureEntity> fixPhotos;
    private final int id;
    private final Integer incidenceId;
    private final String statusTypeId;
    private final String type;
    private final Date updatedTime;

    public IncidenceCommentEntity(int i, Date date, Date date2, String str, String statusTypeId, String description, Integer num, List<IncidencePictureEntity> fixPhotos) {
        Intrinsics.checkNotNullParameter(statusTypeId, "statusTypeId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fixPhotos, "fixPhotos");
        this.id = i;
        this.createTime = date;
        this.updatedTime = date2;
        this.type = str;
        this.statusTypeId = statusTypeId;
        this.description = description;
        this.incidenceId = num;
        this.fixPhotos = fixPhotos;
    }

    public static /* synthetic */ IncidenceCommentEntity copy$default(IncidenceCommentEntity incidenceCommentEntity, int i, Date date, Date date2, String str, String str2, String str3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = incidenceCommentEntity.id;
        }
        if ((i4 & 2) != 0) {
            date = incidenceCommentEntity.createTime;
        }
        if ((i4 & 4) != 0) {
            date2 = incidenceCommentEntity.updatedTime;
        }
        if ((i4 & 8) != 0) {
            str = incidenceCommentEntity.type;
        }
        if ((i4 & 16) != 0) {
            str2 = incidenceCommentEntity.statusTypeId;
        }
        if ((i4 & 32) != 0) {
            str3 = incidenceCommentEntity.description;
        }
        if ((i4 & 64) != 0) {
            num = incidenceCommentEntity.incidenceId;
        }
        if ((i4 & 128) != 0) {
            list = incidenceCommentEntity.fixPhotos;
        }
        Integer num2 = num;
        List list2 = list;
        String str4 = str2;
        String str5 = str3;
        return incidenceCommentEntity.copy(i, date, date2, str, str4, str5, num2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getUpdatedTime() {
        return this.updatedTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStatusTypeId() {
        return this.statusTypeId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    public final List<IncidencePictureEntity> component8() {
        return this.fixPhotos;
    }

    public final IncidenceCommentEntity copy(int id, Date createTime, Date updatedTime, String type, String statusTypeId, String description, Integer incidenceId, List<IncidencePictureEntity> fixPhotos) {
        Intrinsics.checkNotNullParameter(statusTypeId, "statusTypeId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fixPhotos, "fixPhotos");
        return new IncidenceCommentEntity(id, createTime, updatedTime, type, statusTypeId, description, incidenceId, fixPhotos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceCommentEntity)) {
            return false;
        }
        IncidenceCommentEntity incidenceCommentEntity = (IncidenceCommentEntity) other;
        return this.id == incidenceCommentEntity.id && Intrinsics.areEqual(this.createTime, incidenceCommentEntity.createTime) && Intrinsics.areEqual(this.updatedTime, incidenceCommentEntity.updatedTime) && Intrinsics.areEqual(this.type, incidenceCommentEntity.type) && Intrinsics.areEqual(this.statusTypeId, incidenceCommentEntity.statusTypeId) && Intrinsics.areEqual(this.description, incidenceCommentEntity.description) && Intrinsics.areEqual(this.incidenceId, incidenceCommentEntity.incidenceId) && Intrinsics.areEqual(this.fixPhotos, incidenceCommentEntity.fixPhotos);
    }

    public final Date getCreateTime() {
        return this.createTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<IncidencePictureEntity> getFixPhotos() {
        return this.fixPhotos;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    public final String getStatusTypeId() {
        return this.statusTypeId;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Date date = this.createTime;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedTime;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.type;
        int d4 = a.d(this.description, a.d(this.statusTypeId, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.incidenceId;
        return this.fixPhotos.hashCode() + ((d4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidenceCommentEntity(id=");
        sb.append(this.id);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updatedTime=");
        sb.append(this.updatedTime);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", statusTypeId=");
        sb.append(this.statusTypeId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", incidenceId=");
        sb.append(this.incidenceId);
        sb.append(", fixPhotos=");
        return a.o(sb, this.fixPhotos, ')');
    }

    public /* synthetic */ IncidenceCommentEntity(int i, Date date, Date date2, String str, String str2, String str3, Integer num, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, date, date2, str, str2, str3, num, list);
    }
}
