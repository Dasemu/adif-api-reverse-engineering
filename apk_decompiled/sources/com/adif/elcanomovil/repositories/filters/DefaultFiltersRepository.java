package com.adif.elcanomovil.repositories.filters;

import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import com.adif.elcanomovil.serviceStorage.model.FilterEntity;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/repositories/filters/DefaultFiltersRepository;", "Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", "fetchAllFilters", "", "Lkotlin/Pair;", "", "", "saveFilter", "", "filterId", "isEnabled", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultFiltersRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFiltersRepository.kt\ncom/adif/elcanomovil/repositories/filters/DefaultFiltersRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n1855#2,2:32\n*S KotlinDebug\n*F\n+ 1 DefaultFiltersRepository.kt\ncom/adif/elcanomovil/repositories/filters/DefaultFiltersRepository\n*L\n12#1:28\n12#1:29,3\n18#1:32,2\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultFiltersRepository implements FiltersRepository {
    private final PreferenceStorage preferenceStorage;

    public DefaultFiltersRepository(PreferenceStorage preferenceStorage) {
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        this.preferenceStorage = preferenceStorage;
    }

    @Override // com.adif.elcanomovil.domain.repositories.filters.FiltersRepository
    public List<Pair<Integer, Boolean>> fetchAllFilters() {
        int collectionSizeOrDefault;
        List<FilterEntity> filters = this.preferenceStorage.getFilters();
        if (filters == null) {
            return CollectionsKt.emptyList();
        }
        List<FilterEntity> list = filters;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FilterEntity filterEntity : list) {
            arrayList.add(new Pair(Integer.valueOf(filterEntity.getKey()), Boolean.valueOf(filterEntity.isEnabled())));
        }
        return arrayList;
    }

    @Override // com.adif.elcanomovil.domain.repositories.filters.FiltersRepository
    public void saveFilter(int filterId, boolean isEnabled) {
        List<FilterEntity> filters = this.preferenceStorage.getFilters();
        List<FilterEntity> mutableList = filters != null ? CollectionsKt.toMutableList((Collection) filters) : null;
        if (mutableList == null || !mutableList.contains(new FilterEntity(filterId, isEnabled))) {
            if (mutableList != null) {
                mutableList.add(new FilterEntity(filterId, isEnabled));
            }
        } else if (mutableList != null) {
            for (FilterEntity filterEntity : mutableList) {
                if (filterEntity.getKey() == filterId) {
                    filterEntity.setEnabled(isEnabled);
                }
            }
        }
        this.preferenceStorage.setFilters(mutableList);
    }
}
