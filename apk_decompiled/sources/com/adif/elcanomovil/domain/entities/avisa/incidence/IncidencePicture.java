package com.adif.elcanomovil.domain.entities.avisa.incidence;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "", "type", "", FirebaseAnalytics.Param.CONTENT, "thumbnail", "", ServicePaths.IncidenceService.pathIncidenceId, NavArguments.ARG_DYNAMIC_LINKS_TAB, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getIncidenceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "getThumbnail", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "equals", "", "other", "hashCode", "toString", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidencePicture {
    private final String content;
    private final Integer incidenceId;
    private final String path;
    private final Integer thumbnail;
    private final String type;

    public IncidencePicture(String type, String content, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = type;
        this.content = content;
        this.thumbnail = num;
        this.incidenceId = num2;
        this.path = str;
    }

    public static /* synthetic */ IncidencePicture copy$default(IncidencePicture incidencePicture, String str, String str2, Integer num, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = incidencePicture.type;
        }
        if ((i & 2) != 0) {
            str2 = incidencePicture.content;
        }
        if ((i & 4) != 0) {
            num = incidencePicture.thumbnail;
        }
        if ((i & 8) != 0) {
            num2 = incidencePicture.incidenceId;
        }
        if ((i & 16) != 0) {
            str3 = incidencePicture.path;
        }
        String str4 = str3;
        Integer num3 = num;
        return incidencePicture.copy(str, str2, num3, num2, str4);
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

    public final IncidencePicture copy(String type, String content, Integer thumbnail, Integer incidenceId, String path) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new IncidencePicture(type, content, thumbnail, incidenceId, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidencePicture)) {
            return false;
        }
        IncidencePicture incidencePicture = (IncidencePicture) other;
        return Intrinsics.areEqual(this.type, incidencePicture.type) && Intrinsics.areEqual(this.content, incidencePicture.content) && Intrinsics.areEqual(this.thumbnail, incidencePicture.thumbnail) && Intrinsics.areEqual(this.incidenceId, incidencePicture.incidenceId) && Intrinsics.areEqual(this.path, incidencePicture.path);
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
        StringBuilder sb = new StringBuilder("IncidencePicture(type=");
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

    public /* synthetic */ IncidencePicture(String str, String str2, Integer num, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3);
    }
}
