package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaStationCategoryResponse;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;", "responseToDomain", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaStationCategoryResponse;", "responseToEntity", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AvisaStationCategoryMapper {
    public final AvisaStationCategory entityToDomain(AvisaStationCategoryEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStationCategory(source.getCatId(), source.getTitle());
    }

    public final AvisaStationCategory responseToDomain(AvisaStationCategoryResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStationCategory(source.getCatId(), source.getTitle());
    }

    public final AvisaStationCategoryEntity responseToEntity(AvisaStationCategoryResponse source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new AvisaStationCategoryEntity(source.getCatId(), source.getTitle());
    }
}
