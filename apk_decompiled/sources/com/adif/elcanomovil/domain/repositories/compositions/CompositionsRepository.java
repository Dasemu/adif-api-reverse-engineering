package com.adif.elcanomovil.domain.repositories.compositions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u00072\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "getDestinationStationCode", "()Ljava/lang/String;", "destinationStationCodeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "getDestinationStationCodeAsFlow", "()Lkotlinx/coroutines/flow/Flow;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "getOriginStationCode", "originStationCodeAsFlow", "getOriginStationCodeAsFlow", "compositions", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositionsRepository {
    Object compositions(String str, String str2, long j4, String str3, Continuation<? super Flow<? extends AsyncResult<? extends List<Composition>>>> continuation);

    String getDestinationStationCode();

    Flow<String> getDestinationStationCodeAsFlow();

    String getOriginStationCode();

    Flow<String> getOriginStationCodeAsFlow();
}
