package com.adif.elcanomovil.repositories.favourites;

import com.adif.elcanomovil.domain.entities.FavouriteTrain;
import com.adif.elcanomovil.serviceStorage.model.FavouriteTrainEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/repositories/favourites/FavouritesTrainsMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/FavouriteTrain;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteTrainEntity;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavouritesTrainsMapper {
    public final FavouriteTrain entityToDomain(FavouriteTrainEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new FavouriteTrain(source.getCommercialNumber(), source.getOriginStationCode(), source.getDestinationStationCode(), source.getLaunchingDate(), source.getOperator(), source.getCommercialProduct(), source.getTimeStationFrom(), source.getTimeStationTo());
    }
}
