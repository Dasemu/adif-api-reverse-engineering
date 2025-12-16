package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaStationResponse;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "responseToCategoryEntity", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;", "responseToEntity", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaStationResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AvisaStationMapper {
    public final AvisaStation entityToDomain(AvisaStationEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStation(source.getStId(), source.getName(), source.getCode(), source.getLatitude(), source.getLongitude());
    }

    public final AvisaStationCategory responseToCategoryEntity(AvisaStationCategoryEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStationCategory(source.getCatId(), source.getTitle());
    }

    public final AvisaStationEntity responseToEntity(AvisaStationResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStationEntity(source.getStId(), source.getName(), source.getCode(), source.getLatitude(), source.getLongitude());
    }
}
