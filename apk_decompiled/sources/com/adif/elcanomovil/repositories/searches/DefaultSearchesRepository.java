package com.adif.elcanomovil.repositories.searches;

import com.adif.elcanomovil.domain.entities.StorableData;
import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.domain.repositories.searches.SearchesRepository;
import com.adif.elcanomovil.serviceStorage.model.StationStored;
import com.adif.elcanomovil.serviceStorage.model.StationStoredEntity;
import com.adif.elcanomovil.serviceStorage.model.TrainStored;
import com.adif.elcanomovil.serviceStorage.model.TrainStoredEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import w1.C0650a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/repositories/searches/DefaultSearchesRepository;", "Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "storage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "searchesMapper", "Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;", "trainSearchesMapper", "Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Lcom/adif/elcanomovil/repositories/searches/SearchesMapper;Lcom/adif/elcanomovil/repositories/searches/TrainSearchesMapper;)V", "fetchStations", "", "Lcom/adif/elcanomovil/domain/entities/StorableData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTrainsSelected", "insert", "", "storableStation", "saveSearch", "stations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTrainSelected", "storableTrain", "(Lcom/adif/elcanomovil/domain/entities/StorableData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultSearchesRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSearchesRepository.kt\ncom/adif/elcanomovil/repositories/searches/DefaultSearchesRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1855#2,2:60\n*S KotlinDebug\n*F\n+ 1 DefaultSearchesRepository.kt\ncom/adif/elcanomovil/repositories/searches/DefaultSearchesRepository\n*L\n22#1:60,2\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultSearchesRepository implements SearchesRepository {
    private final SearchesMapper searchesMapper;
    private final PreferenceStorage storage;
    private final TrainSearchesMapper trainSearchesMapper;

    public DefaultSearchesRepository(PreferenceStorage storage, SearchesMapper searchesMapper, TrainSearchesMapper trainSearchesMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(searchesMapper, "searchesMapper");
        Intrinsics.checkNotNullParameter(trainSearchesMapper, "trainSearchesMapper");
        this.storage = storage;
        this.searchesMapper = searchesMapper;
        this.trainSearchesMapper = trainSearchesMapper;
    }

    private final void insert(StorableData storableStation) {
        List<? extends StationStored> mutableList;
        StationStoredEntity domainToEntity = this.searchesMapper.domainToEntity(storableStation);
        List<StationStored> lastStationsSearched = this.storage.getLastStationsSearched();
        if (lastStationsSearched == null || (mutableList = CollectionsKt.toMutableList((Collection) lastStationsSearched)) == null) {
            return;
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new C0650a(storableStation, 0));
        if (mutableList.size() >= 10) {
            mutableList.remove(0);
        }
        mutableList.add(domainToEntity);
        this.storage.setLastStationsSearched(mutableList);
    }

    @Override // com.adif.elcanomovil.domain.repositories.searches.SearchesRepository
    public Object fetchStations(Continuation<? super List<? extends StorableData>> continuation) {
        SearchesMapper searchesMapper = this.searchesMapper;
        List<StationStored> lastStationsSearched = this.storage.getLastStationsSearched();
        if (lastStationsSearched == null) {
            lastStationsSearched = CollectionsKt.emptyList();
        }
        return searchesMapper.entitiesToDomain(lastStationsSearched);
    }

    @Override // com.adif.elcanomovil.domain.repositories.searches.SearchesRepository
    public Object fetchTrainsSelected(Continuation<? super List<? extends StorableData>> continuation) {
        TrainSearchesMapper trainSearchesMapper = this.trainSearchesMapper;
        List<TrainStored> lastTrainsSearched = this.storage.getLastTrainsSearched();
        if (lastTrainsSearched == null) {
            lastTrainsSearched = CollectionsKt.emptyList();
        }
        return trainSearchesMapper.entitiesToDomain(lastTrainsSearched);
    }

    @Override // com.adif.elcanomovil.domain.repositories.searches.SearchesRepository
    public Object saveSearch(List<? extends StorableData> list, Continuation<? super Unit> continuation) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            insert((StorableData) it.next());
        }
        return Unit.INSTANCE;
    }

    @Override // com.adif.elcanomovil.domain.repositories.searches.SearchesRepository
    public Object saveTrainSelected(StorableData storableData, Continuation<? super Unit> continuation) {
        List<? extends TrainStored> mutableList;
        TrainSearchesMapper trainSearchesMapper = this.trainSearchesMapper;
        Intrinsics.checkNotNull(storableData, "null cannot be cast to non-null type com.adif.elcanomovil.domain.entities.StorableTrain");
        TrainStoredEntity domainToEntity = trainSearchesMapper.domainToEntity((StorableTrain) storableData);
        List<TrainStored> lastTrainsSearched = this.storage.getLastTrainsSearched();
        if (lastTrainsSearched == null || (mutableList = CollectionsKt.toMutableList((Collection) lastTrainsSearched)) == null) {
            return Unit.INSTANCE;
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new C0650a(storableData, 1));
        if (mutableList.size() >= 10) {
            mutableList.remove(0);
        }
        mutableList.add(domainToEntity);
        this.storage.setLastTrainsSearched(mutableList);
        return Unit.INSTANCE;
    }
}
