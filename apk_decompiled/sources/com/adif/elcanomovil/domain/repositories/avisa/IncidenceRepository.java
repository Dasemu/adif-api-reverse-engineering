package com.adif.elcanomovil.domain.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00040\u0003H¦@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "", "createIncidence", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "categoryId", "", "description", "notificationTypeId", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;", "stationId", "incidence", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incidenceDetails", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", ServicePaths.IncidenceService.pathIncidenceId, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incidences", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IncidenceRepository {
    Object createIncidence(String str, String str2, IncidenceNotificationType incidenceNotificationType, String str3, List<IncidencePicture> list, Continuation<? super Flow<AsyncResult<Unit>>> continuation);

    Object incidenceDetails(int i, Continuation<? super Flow<AsyncResult<IncidenceStation>>> continuation);

    Object incidences(Continuation<? super Flow<? extends AsyncResult<? extends List<IncidenceStation>>>> continuation);
}
