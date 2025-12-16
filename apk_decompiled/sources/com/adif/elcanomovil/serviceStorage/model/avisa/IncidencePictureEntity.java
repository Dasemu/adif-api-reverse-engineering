package com.adif.elcanomovil.serviceStorage.model.avisa;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidencePictureEntity;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "type", "", FirebaseAnalytics.Param.CONTENT, "thumbnail", ServicePaths.IncidenceService.pathIncidenceId, NavArguments.ARG_DYNAMIC_LINKS_TAB, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getId", "()I", "getIncidenceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "getThumbnail", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidencePictureEntity;", "equals", "", "other", "hashCode", "toString", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidencePictureEntity {
    private final String content;
    private final int id;
    private final Integer incidenceId;
    private final String path;
    private final Integer thumbnail;
    private final String type;

    public IncidencePictureEntity(int i, String type, String content, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.type = type;
        this.content = content;
        this.thumbnail = num;
        this.incidenceId = num2;
        this.path = str;
    }

    public static /* synthetic */ IncidencePictureEntity copy$default(IncidencePictureEntity incidencePictureEntity, int i, String str, String str2, Integer num, Integer num2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = incidencePictureEntity.id;
        }
        if ((i4 & 2) != 0) {
            str = incidencePictureEntity.type;
        }
        if ((i4 & 4) != 0) {
            str2 = incidencePictureEntity.content;
        }
        if ((i4 & 8) != 0) {
            num = incidencePictureEntity.thumbnail;
        }
        if ((i4 & 16) != 0) {
            num2 = incidencePictureEntity.incidenceId;
        }
        if ((i4 & 32) != 0) {
            str3 = incidencePictureEntity.path;
        }
        Integer num3 = num2;
        String str4 = str3;
        return incidencePictureEntity.copy(i, str, str2, num, num3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final IncidencePictureEntity copy(int id, String type, String content, Integer thumbnail, Integer incidenceId, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new IncidencePictureEntity(id, type, content, thumbnail, incidenceId, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidencePictureEntity)) {
            return false;
        }
        IncidencePictureEntity incidencePictureEntity = (IncidencePictureEntity) other;
        return this.id == incidencePictureEntity.id && Intrinsics.areEqual(this.type, incidencePictureEntity.type) && Intrinsics.areEqual(this.content, incidencePictureEntity.content) && Intrinsics.areEqual(this.thumbnail, incidencePictureEntity.thumbnail) && Intrinsics.areEqual(this.incidenceId, incidencePictureEntity.incidenceId) && Intrinsics.areEqual(this.path, incidencePictureEntity.path);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getThumbnail() {
        return this.thumbnail;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int d4 = a.d(this.content, a.d(this.type, Integer.hashCode(this.id) * 31, 31), 31);
        Integer num = this.thumbnail;
        int hashCode = (d4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.incidenceId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.path;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidencePictureEntity(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", thumbnail=");
        sb.append(this.thumbnail);
        sb.append(", incidenceId=");
        sb.append(this.incidenceId);
        sb.append(", path=");
        return a.n(sb, this.path, ')');
    }

    public /* synthetic */ IncidencePictureEntity(int i, String str, String str2, Integer num, Integer num2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, str, str2, num, num2, str3);
    }
}
