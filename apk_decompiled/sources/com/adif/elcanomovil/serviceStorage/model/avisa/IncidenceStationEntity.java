package com.adif.elcanomovil.serviceStorage.model.avisa;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceStationEntity;", "", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "incidence", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;", "avisaStation", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "categoryAvisa", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;", "(Ljava/lang/Integer;Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;)V", "getAvisaStation", "()Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "getCategoryAvisa", "()Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIncidence", "()Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;)Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceStationEntity;", "equals", "", "other", "hashCode", "toString", "", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceStationEntity {
    private final AvisaStationEntity avisaStation;
    private final AvisaStationCategoryEntity categoryAvisa;
    private final Integer id;
    private final IncidenceEntity incidence;

    public IncidenceStationEntity(Integer num, IncidenceEntity incidence, AvisaStationEntity avisaStation, AvisaStationCategoryEntity categoryAvisa) {
        Intrinsics.checkNotNullParameter(incidence, "incidence");
        Intrinsics.checkNotNullParameter(avisaStation, "avisaStation");
        Intrinsics.checkNotNullParameter(categoryAvisa, "categoryAvisa");
        this.id = num;
        this.incidence = incidence;
        this.avisaStation = avisaStation;
        this.categoryAvisa = categoryAvisa;
    }

    public static /* synthetic */ IncidenceStationEntity copy$default(IncidenceStationEntity incidenceStationEntity, Integer num, IncidenceEntity incidenceEntity, AvisaStationEntity avisaStationEntity, AvisaStationCategoryEntity avisaStationCategoryEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            num = incidenceStationEntity.id;
        }
        if ((i & 2) != 0) {
            incidenceEntity = incidenceStationEntity.incidence;
        }
        if ((i & 4) != 0) {
            avisaStationEntity = incidenceStationEntity.avisaStation;
        }
        if ((i & 8) != 0) {
            avisaStationCategoryEntity = incidenceStationEntity.categoryAvisa;
        }
        return incidenceStationEntity.copy(num, incidenceEntity, avisaStationEntity, avisaStationCategoryEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final IncidenceEntity getIncidence() {
        return this.incidence;
    }

    /* renamed from: component3, reason: from getter */
    public final AvisaStationEntity getAvisaStation() {
        return this.avisaStation;
    }

    /* renamed from: component4, reason: from getter */
    public final AvisaStationCategoryEntity getCategoryAvisa() {
        return this.categoryAvisa;
    }

    public final IncidenceStationEntity copy(Integer id, IncidenceEntity incidence, AvisaStationEntity avisaStation, AvisaStationCategoryEntity categoryAvisa) {
        Intrinsics.checkNotNullParameter(incidence, "incidence");
        Intrinsics.checkNotNullParameter(avisaStation, "avisaStation");
        Intrinsics.checkNotNullParameter(categoryAvisa, "categoryAvisa");
        return new IncidenceStationEntity(id, incidence, avisaStation, categoryAvisa);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceStationEntity)) {
            return false;
        }
        IncidenceStationEntity incidenceStationEntity = (IncidenceStationEntity) other;
        return Intrinsics.areEqual(this.id, incidenceStationEntity.id) && Intrinsics.areEqual(this.incidence, incidenceStationEntity.incidence) && Intrinsics.areEqual(this.avisaStation, incidenceStationEntity.avisaStation) && Intrinsics.areEqual(this.categoryAvisa, incidenceStationEntity.categoryAvisa);
    }

    public final AvisaStationEntity getAvisaStation() {
        return this.avisaStation;
    }

    public final AvisaStationCategoryEntity getCategoryAvisa() {
        return this.categoryAvisa;
    }

    public final Integer getId() {
        return this.id;
    }

    public final IncidenceEntity getIncidence() {
        return this.incidence;
    }

    public int hashCode() {
        Integer num = this.id;
        return this.categoryAvisa.hashCode() + ((this.avisaStation.hashCode() + ((this.incidence.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "IncidenceStationEntity(id=" + this.id + ", incidence=" + this.incidence + ", avisaStation=" + this.avisaStation + ", categoryAvisa=" + this.categoryAvisa + ')';
    }

    public /* synthetic */ IncidenceStationEntity(Integer num, IncidenceEntity incidenceEntity, AvisaStationEntity avisaStationEntity, AvisaStationCategoryEntity avisaStationCategoryEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, incidenceEntity, avisaStationEntity, avisaStationCategoryEntity);
    }
}
