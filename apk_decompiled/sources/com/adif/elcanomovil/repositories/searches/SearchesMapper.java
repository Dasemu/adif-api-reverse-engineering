package com.adif.elcanomovil.repositories.searches;

import com.adif.elcanomovil.domain.entities.StorableData;
import com.adif.elcanomovil.domain.entities.StorableStation;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.StationStoredEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\bJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;", "", "()V", "domainToEntity", "Lcom/adif/elcanomovil/serviceStorage/model/StationStoredEntity;", "source", "Lcom/adif/elcanomovil/domain/entities/StorableData;", "entitiesToDomain", "", "Lcom/adif/elcanomovil/domain/entities/StorableStation;", "Lcom/adif/elcanomovil/serviceStorage/model/StationStored;", "entityToDomain", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSearchesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchesMapper.kt\ncom/adif/elcanomovil/repositories/searches/SearchesMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1549#2:16\n1620#2,3:17\n*S KotlinDebug\n*F\n+ 1 SearchesMapper.kt\ncom/adif/elcanomovil/repositories/searches/SearchesMapper\n*L\n11#1:16\n11#1:17,3\n*E\n"})
/* loaded from: classes.dex */
public final class SearchesMapper {
    public final StationStoredEntity domainToEntity(StorableData source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new StationStoredEntity(source.getIdentifier());
    }

    public final List<StorableStation> entitiesToDomain(List<? extends StationStored> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        List<? extends StationStored> list = source;
        ArrayList arrayList = new ArrayList(CollectionsKt.g(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(entityToDomain((StationStored) it.next()));
        }
        return arrayList;
    }

    public final StorableStation entityToDomain(StationStored source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new StorableStation(source.getIdentifier());
    }
}
