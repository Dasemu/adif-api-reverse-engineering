package com.adif.elcanomovil.domain.usecases.filters;

import com.adif.elcanomovil.domain.repositories.filters.FiltersRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/filters/GetFiltersUseCase;", "", "filtersRepository", "Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;", "(Lcom/adif/elcanomovil/domain/repositories/filters/FiltersRepository;)V", "invoke", "", "Lkotlin/Pair;", "", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetFiltersUseCase {
    private final FiltersRepository filtersRepository;

    public GetFiltersUseCase(FiltersRepository filtersRepository) {
        Intrinsics.checkNotNullParameter(filtersRepository, "filtersRepository");
        this.filtersRepository = filtersRepository;
    }

    public final List<Pair<Integer, Boolean>> invoke() {
        return this.filtersRepository.fetchAllFilters();
    }
}
