package com.adif.elcanomovil.domain.entities.avisa.incidence;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "", "incidence", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "avisaStation", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "categoryAvisa", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;)V", "getAvisaStation", "()Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "getCategoryAvisa", "()Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "getIncidence", "()Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IncidenceStation {
    private final AvisaStation avisaStation;
    private final AvisaStationCategory categoryAvisa;
    private final Incidence incidence;

    public IncidenceStation(Incidence incidence, AvisaStation avisaStation, AvisaStationCategory categoryAvisa) {
        Intrinsics.checkNotNullParameter(incidence, "incidence");
        Intrinsics.checkNotNullParameter(avisaStation, "avisaStation");
        Intrinsics.checkNotNullParameter(categoryAvisa, "categoryAvisa");
        this.incidence = incidence;
        this.avisaStation = avisaStation;
        this.categoryAvisa = categoryAvisa;
    }

    public static /* synthetic */ IncidenceStation copy$default(IncidenceStation incidenceStation, Incidence incidence, AvisaStation avisaStation, AvisaStationCategory avisaStationCategory, int i, Object obj) {
        if ((i & 1) != 0) {
            incidence = incidenceStation.incidence;
        }
        if ((i & 2) != 0) {
            avisaStation = incidenceStation.avisaStation;
        }
        if ((i & 4) != 0) {
            avisaStationCategory = incidenceStation.categoryAvisa;
        }
        return incidenceStation.copy(incidence, avisaStation, avisaStationCategory);
    }

    /* renamed from: component1, reason: from getter */
    public final Incidence getIncidence() {
        return this.incidence;
    }

    /* renamed from: component2, reason: from getter */
    public final AvisaStation getAvisaStation() {
        return this.avisaStation;
    }

    /* renamed from: component3, reason: from getter */
    public final AvisaStationCategory getCategoryAvisa() {
        return this.categoryAvisa;
    }

    public final IncidenceStation copy(Incidence incidence, AvisaStation avisaStation, AvisaStationCategory categoryAvisa) {
        Intrinsics.checkNotNullParameter(incidence, "incidence");
        Intrinsics.checkNotNullParameter(avisaStation, "avisaStation");
        Intrinsics.checkNotNullParameter(categoryAvisa, "categoryAvisa");
        return new IncidenceStation(incidence, avisaStation, categoryAvisa);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncidenceStation)) {
            return false;
        }
        IncidenceStation incidenceStation = (IncidenceStation) other;
        return Intrinsics.areEqual(this.incidence, incidenceStation.incidence) && Intrinsics.areEqual(this.avisaStation, incidenceStation.avisaStation) && Intrinsics.areEqual(this.categoryAvisa, incidenceStation.categoryAvisa);
    }

    public final AvisaStation getAvisaStation() {
        return this.avisaStation;
    }

    public final AvisaStationCategory getCategoryAvisa() {
        return this.categoryAvisa;
    }

    public final Incidence getIncidence() {
        return this.incidence;
    }

    public int hashCode() {
        return this.categoryAvisa.hashCode() + ((this.avisaStation.hashCode() + (this.incidence.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "IncidenceStation(incidence=" + this.incidence + ", avisaStation=" + this.avisaStation + ", categoryAvisa=" + this.categoryAvisa + ')';
    }
}
