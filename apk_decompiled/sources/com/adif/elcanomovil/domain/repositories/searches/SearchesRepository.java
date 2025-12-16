package com.adif.elcanomovil.domain.repositories.searches;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.StorableData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/searches/SearchesRepository;", "", "fetchStations", "", "Lcom/adif/elcanomovil/domain/entities/StorableData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTrainsSelected", "saveSearch", "", "stations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTrainSelected", NavArguments.ARG_DYNAMIC_TRAIN, "(Lcom/adif/elcanomovil/domain/entities/StorableData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SearchesRepository {
    Object fetchStations(Continuation<? super List<? extends StorableData>> continuation);

    Object fetchTrainsSelected(Continuation<? super List<? extends StorableData>> continuation);

    Object saveSearch(List<? extends StorableData> list, Continuation<? super Unit> continuation);

    Object saveTrainSelected(StorableData storableData, Continuation<? super Unit> continuation);
}
