package com.adif.elcanomovil.commonViews.data;

import C.w;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.google.android.gms.measurement.internal.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "title", "subtitle", "type", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "isEnabled", "", "distance", "", "commercialZoneType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;ZLjava/lang/Float;Ljava/lang/String;)V", "getCommercialZoneType", "()Ljava/lang/String;", "setCommercialZoneType", "(Ljava/lang/String;)V", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getId", "setId", "()Z", "setEnabled", "(Z)V", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "getType", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;", "setType", "(Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity$Type;ZLjava/lang/Float;Ljava/lang/String;)Lcom/adif/elcanomovil/commonViews/data/StationOptionViewEntity;", "equals", "other", "hashCode", "", "toString", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StationOptionViewEntity {
    private String commercialZoneType;
    private Float distance;
    private String id;
    private boolean isEnabled;
    private String subtitle;
    private String title;
    private StationViewEntity.Type type;

    public StationOptionViewEntity(String str, String str2, String str3, StationViewEntity.Type type, boolean z3, Float f2, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.type = type;
        this.isEnabled = z3;
        this.distance = f2;
        this.commercialZoneType = str4;
    }

    public static /* synthetic */ StationOptionViewEntity copy$default(StationOptionViewEntity stationOptionViewEntity, String str, String str2, String str3, StationViewEntity.Type type, boolean z3, Float f2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stationOptionViewEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = stationOptionViewEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = stationOptionViewEntity.subtitle;
        }
        if ((i & 8) != 0) {
            type = stationOptionViewEntity.type;
        }
        if ((i & 16) != 0) {
            z3 = stationOptionViewEntity.isEnabled;
        }
        if ((i & 32) != 0) {
            f2 = stationOptionViewEntity.distance;
        }
        if ((i & 64) != 0) {
            str4 = stationOptionViewEntity.commercialZoneType;
        }
        Float f4 = f2;
        String str5 = str4;
        boolean z4 = z3;
        String str6 = str3;
        return stationOptionViewEntity.copy(str, str2, str6, type, z4, f4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StationViewEntity.Type getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final StationOptionViewEntity copy(String id, String title, String subtitle, StationViewEntity.Type type, boolean isEnabled, Float distance, String commercialZoneType) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StationOptionViewEntity(id, title, subtitle, type, isEnabled, distance, commercialZoneType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationOptionViewEntity)) {
            return false;
        }
        StationOptionViewEntity stationOptionViewEntity = (StationOptionViewEntity) other;
        return Intrinsics.areEqual(this.id, stationOptionViewEntity.id) && Intrinsics.areEqual(this.title, stationOptionViewEntity.title) && Intrinsics.areEqual(this.subtitle, stationOptionViewEntity.subtitle) && this.type == stationOptionViewEntity.type && this.isEnabled == stationOptionViewEntity.isEnabled && Intrinsics.areEqual((Object) this.distance, (Object) stationOptionViewEntity.distance) && Intrinsics.areEqual(this.commercialZoneType, stationOptionViewEntity.commercialZoneType);
    }

    public final String getCommercialZoneType() {
        return this.commercialZoneType;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final StationViewEntity.Type getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int c4 = w.c((this.type.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.isEnabled);
        Float f2 = this.distance;
        int hashCode3 = (c4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str4 = this.commercialZoneType;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setCommercialZoneType(String str) {
        this.commercialZoneType = str;
    }

    public final void setDistance(Float f2) {
        this.distance = f2;
    }

    public final void setEnabled(boolean z3) {
        this.isEnabled = z3;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(StationViewEntity.Type type) {
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        this.type = type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationOptionViewEntity(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", commercialZoneType=");
        return a.n(sb, this.commercialZoneType, ')');
    }

    public /* synthetic */ StationOptionViewEntity(String str, String str2, String str3, StationViewEntity.Type type, boolean z3, Float f2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, type, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? null : f2, (i & 64) != 0 ? null : str4);
    }
}
