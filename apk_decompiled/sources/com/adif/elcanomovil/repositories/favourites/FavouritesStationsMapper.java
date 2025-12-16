package com.adif.elcanomovil.repositories.favourites;

import com.adif.elcanomovil.domain.entities.DataType;
import com.adif.elcanomovil.domain.entities.FavouriteStation;
import com.adif.elcanomovil.domain.entities.StationFavourites;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.repositories.stations.StationMapper;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.serviceStorage.model.StationFavouritesEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper;", "", "()V", "entityToDomain", "Lcom/adif/elcanomovil/domain/entities/StationFavourites;", "source", "Lcom/adif/elcanomovil/serviceStorage/model/StationFavouritesEntity;", "favouriteEntityToDomain", "Lcom/adif/elcanomovil/domain/entities/FavouriteStation;", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFavouritesStationsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavouritesStationsMapper.kt\ncom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 FavouritesStationsMapper.kt\ncom/adif/elcanomovil/repositories/favourites/FavouritesStationsMapper\n*L\n13#1:29\n13#1:30,3\n*E\n"})
/* loaded from: classes.dex */
public final class FavouritesStationsMapper {
    public final StationFavourites entityToDomain(StationFavouritesEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Station entityToDomain = new StationMapper().entityToDomain(source.getStation());
        List<FavouriteEntity> favourites = source.getFavourites();
        ArrayList arrayList = new ArrayList(CollectionsKt.g(favourites));
        Iterator<T> it = favourites.iterator();
        while (it.hasNext()) {
            arrayList.add(DataType.valueOf(((FavouriteEntity) it.next()).getType()));
        }
        return new StationFavourites(entityToDomain, arrayList);
    }

    public final FavouriteStation favouriteEntityToDomain(FavouriteEntity source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new FavouriteStation(source.getFavouriteId(), source.getIdentifierStation(), source.getStationName(), source.getIdentifierToStation(), source.getStationToName(), source.getType(), source.isCercanias());
    }
}
