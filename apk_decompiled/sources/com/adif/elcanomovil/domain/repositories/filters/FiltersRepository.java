package com.adif.elcanomovil.domain.repositories.filters;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "", "fetchAllFilters", "", "Lkotlin/Pair;", "", "", "saveFilter", "", "filterId", "isEnabled", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FiltersRepository {
    List<Pair<Integer, Boolean>> fetchAllFilters();

    void saveFilter(int filterId, boolean isEnabled);
}
