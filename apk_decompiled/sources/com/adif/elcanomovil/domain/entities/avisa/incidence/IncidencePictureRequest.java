package com.adif.elcanomovil.domain.entities.avisa.incidence;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePictureRequest;", "", "type", "", FirebaseAnalytics.Param.CONTENT, "thumbnail", "", ServicePaths.IncidenceService.pathIncidenceId, NavArguments.ARG_DYNAMIC_LINKS_TAB, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getIncidenceId", "()I", "getPath", "getThumbnail", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidencePictureRequest {
    private final String content;
    private final int incidenceId;
    private final String path;
    private final int thumbnail;
    private final String type;

    public IncidencePictureRequest(String type, String content, int i, int i4, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(path, "path");
        this.type = type;
        this.content = content;
        this.thumbnail = i;
        this.incidenceId = i4;
        this.path = path;
    }

    public static /* synthetic */ IncidencePictureRequest copy$default(IncidencePictureRequest incidencePictureRequest, String str, String str2, int i, int i4, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = incidencePictureRequest.type;
        }
        if ((i5 & 2) != 0) {
            str2 = incidencePictureRequest.content;
        }
        if ((i5 & 4) != 0) {
            i = incidencePictureRequest.thumbnail;
        }
        if ((i5 & 8) != 0) {
            i4 = incidencePictureRequest.incidenceId;
        }
        if ((i5 & 16) != 0) {
            str3 = incidencePictureRequest.path;
        }
        String str4 = str3;
        int i6 = i;
        return incidencePictureRequest.copy(str, str2, i6, i4, str4);
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
    public final int getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIncidenceId() {
        return this.incidenceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final IncidencePictureRequest copy(String type, String content, int thumbnail, int incidenceId, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(path, "path");
        return new IncidencePictureRequest(type, content, thumbnail, incidenceId, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidencePictureRequest)) {
            return false;
        }
        IncidencePictureRequest incidencePictureRequest = (IncidencePictureRequest) other;
        return Intrinsics.areEqual(this.type, incidencePictureRequest.type) && Intrinsics.areEqual(this.content, incidencePictureRequest.content) && this.thumbnail == incidencePictureRequest.thumbnail && this.incidenceId == incidencePictureRequest.incidenceId && Intrinsics.areEqual(this.path, incidencePictureRequest.path);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getIncidenceId() {
        return this.incidenceId;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getThumbnail() {
        return this.thumbnail;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.path.hashCode() + w.x(this.incidenceId, w.x(this.thumbnail, a.d(this.content, this.type.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidencePictureRequest(type=");
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
