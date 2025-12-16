package com.adif.elcanomovil.serviceNetworking.avisa.model;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidencePictureResponse;", "", "type", "", FirebaseAnalytics.Param.CONTENT, "thumbnail", "", ServicePaths.IncidenceService.pathIncidenceId, NavArguments.ARG_DYNAMIC_LINKS_TAB, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getIncidenceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "getThumbnail", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidencePictureResponse;", "equals", "", "other", "hashCode", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidencePictureResponse {
    private final String content;
    private final Integer incidenceId;
    private final String path;
    private final Integer thumbnail;
    private final String type;

    public IncidencePictureResponse(String type, String content, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = type;
        this.content = content;
        this.thumbnail = num;
        this.incidenceId = num2;
        this.path = str;
    }

    public static /* synthetic */ IncidencePictureResponse copy$default(IncidencePictureResponse incidencePictureResponse, String str, String str2, Integer num, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = incidencePictureResponse.type;
        }
        if ((i & 2) != 0) {
            str2 = incidencePictureResponse.content;
        }
        if ((i & 4) != 0) {
            num = incidencePictureResponse.thumbnail;
        }
        if ((i & 8) != 0) {
            num2 = incidencePictureResponse.incidenceId;
        }
        if ((i & 16) != 0) {
            str3 = incidencePictureResponse.path;
        }
        String str4 = str3;
        Integer num3 = num;
        return incidencePictureResponse.copy(str, str2, num3, num2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getIncidenceId() {
        return this.incidenceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final IncidencePictureResponse copy(String type, String content, Integer thumbnail, Integer incidenceId, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new IncidencePictureResponse(type, content, thumbnail, incidenceId, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidencePictureResponse)) {
            return false;
        }
        IncidencePictureResponse incidencePictureResponse = (IncidencePictureResponse) other;
        return Intrinsics.areEqual(this.type, incidencePictureResponse.type) && Intrinsics.areEqual(this.content, incidencePictureResponse.content) && Intrinsics.areEqual(this.thumbnail, incidencePictureResponse.thumbnail) && Intrinsics.areEqual(this.incidenceId, incidencePictureResponse.incidenceId) && Intrinsics.areEqual(this.path, incidencePictureResponse.path);
    }

    public final String getContent() {
        return this.content;
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
        int d4 = a.d(this.content, this.type.hashCode() * 31, 31);
        Integer num = this.thumbnail;
        int hashCode = (d4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.incidenceId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.path;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidencePictureResponse(type=");
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
}
