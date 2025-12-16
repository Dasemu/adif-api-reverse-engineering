package com.adif.elcanomovil.repositories.searches;

import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStoredEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;", "", "()V", "domainToEntity", "Lcom/adif/elcanomovil/serviceStorage/model/TrainStoredEntity;", "source", "Lcom/adif/elcanomovil/domain/entities/StorableTrain;", "entitiesToDomain", "", "Lcom/adif/elcanomovil/serviceStorage/model/TrainStored;", "entityToDomain", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainSearchesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainSearchesMapper.kt\ncom/adif/elcanomovil/repositories/searches/TrainSearchesMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n*S KotlinDebug\n*F\n+ 1 TrainSearchesMapper.kt\ncom/adif/elcanomovil/repositories/searches/TrainSearchesMapper\n*L\n20#1:34\n20#1:35,3\n*E\n"})
/* loaded from: classes.dex */
public final class TrainSearchesMapper {
    public final TrainStoredEntity domainToEntity(StorableTrain source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new TrainStoredEntity(source.getOperator(), source.getCommercialProduct(), source.getCommercialNumber(), source.getOriginStationCode(), source.getDestinationStationCode(), source.getDate(), source.getLaunchingDate(), source.getObservation());
    }

    public final List<StorableTrain> entitiesToDomain(List<? extends TrainStored> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        List<? extends TrainStored> list = source;
        ArrayList arrayList = new ArrayList(CollectionsKt.g(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(entityToDomain((TrainStored) it.next()));
        }
        return arrayList;
    }

    public final StorableTrain entityToDomain(TrainStored source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new StorableTrain(source.getOperator(), source.getCommercialProduct(), source.getCommercialNumber(), source.getOriginStationCode(), source.getDestinationStationCode(), source.getDate(), source.getLaunchingDate(), source.getObservation());
    }
}
