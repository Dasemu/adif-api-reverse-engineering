package com.adif.elcanomovil.domain.entities.avisa.incidence;

import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceComment;", "", "createTime", "Ljava/util/Date;", "updatedTime", "type", "", "statusTypeId", "description", ServicePaths.IncidenceService.pathIncidenceId, "", "fixPhotos", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getCreateTime", "()Ljava/util/Date;", "getDescription", "()Ljava/lang/String;", "getFixPhotos", "()Ljava/util/List;", "getIncidenceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusTypeId", "getType", "getUpdatedTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceComment;", "equals", "", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceComment {
    private final Date createTime;
    private final String description;
    private final List<IncidencePicture> fixPhotos;
    private final Integer incidenceId;
    private final String statusTypeId;
    private final String type;
    private final Date updatedTime;

    public IncidenceComment(Date date, Date date2, String str, String statusTypeId, String description, Integer num, List<IncidencePicture> fixPhotos) {
        Intrinsics.checkNotNullParameter(statusTypeId, "statusTypeId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fixPhotos, "fixPhotos");
        this.createTime = date;
        this.updatedTime = date2;
        this.type = str;
        this.statusTypeId = statusTypeId;
        this.description = description;
        this.incidenceId = num;
        this.fixPhotos = fixPhotos;
    }

    public static /* synthetic */ IncidenceComment copy$default(IncidenceComment incidenceComment, Date date, Date date2, String str, String str2, String str3, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            date = incidenceComment.createTime;
        }
        if ((i & 2) != 0) {
            date2 = incidenceComment.updatedTime;
        }
        if ((i & 4) != 0) {
            str = incidenceComment.type;
        }
        if ((i & 8) != 0) {
            str2 = incidenceComment.statusTypeId;
        }
        if ((i & 16) != 0) {
            str3 = incidenceComment.description;
        }
        if ((i & 32) != 0) {
            num = incidenceComment.incidenceId;
        }
        if ((i & 64) != 0) {
            list = incidenceComment.fixPhotos;
        }
        Integer num2 = num;
        List list2 = list;
        String str4 = str3;
        String str5 = str;
        return incidenceComment.copy(date, date2, str5, str2, str4, num2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getUpdatedTime() {
        return this.updatedTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatusTypeId() {
        return this.statusTypeId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    public final List<IncidencePicture> component7() {
        return this.fixPhotos;
    }

    public final IncidenceComment copy(Date createTime, Date updatedTime, String type, String statusTypeId, String description, Integer incidenceId, List<IncidencePicture> fixPhotos) {
        Intrinsics.checkNotNullParameter(statusTypeId, "statusTypeId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fixPhotos, "fixPhotos");
        return new IncidenceComment(createTime, updatedTime, type, statusTypeId, description, incidenceId, fixPhotos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceComment)) {
            return false;
        }
        IncidenceComment incidenceComment = (IncidenceComment) other;
        return Intrinsics.areEqual(this.createTime, incidenceComment.createTime) && Intrinsics.areEqual(this.updatedTime, incidenceComment.updatedTime) && Intrinsics.areEqual(this.type, incidenceComment.type) && Intrinsics.areEqual(this.statusTypeId, incidenceComment.statusTypeId) && Intrinsics.areEqual(this.description, incidenceComment.description) && Intrinsics.areEqual(this.incidenceId, incidenceComment.incidenceId) && Intrinsics.areEqual(this.fixPhotos, incidenceComment.fixPhotos);
    }

    public final Date getCreateTime() {
        return this.createTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<IncidencePicture> getFixPhotos() {
        return this.fixPhotos;
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
        Date date = this.createTime;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.updatedTime;
        int hashCode2 = (hashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.type;
        int d4 = a.d(this.description, a.d(this.statusTypeId, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.incidenceId;
        return this.fixPhotos.hashCode() + ((d4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidenceComment(createTime=");
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
}
