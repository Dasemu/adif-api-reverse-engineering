package com.adif.elcanomovil.serviceNetworking.avisa.model;

import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceNetworking/avisa/model/IncidenceRequestPicture;", "", "type", "", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-networking_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceRequestPicture {
    private final String content;
    private final String type;

    public IncidenceRequestPicture(String type, String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = type;
        this.content = content;
    }

    public static /* synthetic */ IncidenceRequestPicture copy$default(IncidenceRequestPicture incidenceRequestPicture, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = incidenceRequestPicture.type;
        }
        if ((i & 2) != 0) {
            str2 = incidenceRequestPicture.content;
        }
        return incidenceRequestPicture.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final IncidenceRequestPicture copy(String type, String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new IncidenceRequestPicture(type, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceRequestPicture)) {
            return false;
        }
        IncidenceRequestPicture incidenceRequestPicture = (IncidenceRequestPicture) other;
        return Intrinsics.areEqual(this.type, incidenceRequestPicture.type) && Intrinsics.areEqual(this.content, incidenceRequestPicture.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncidenceRequestPicture(type=");
        sb.append(this.type);
        sb.append(", content=");
        return a.n(sb, this.content, ')');
    }
}
