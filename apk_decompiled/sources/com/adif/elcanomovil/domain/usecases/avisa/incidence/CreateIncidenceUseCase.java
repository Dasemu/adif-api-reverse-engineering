package com.adif.elcanomovil.domain.usecases.avisa.incidence;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/CreateIncidenceUseCase;", "", "incidenceRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "(Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "categoryId", "", "description", "notificationTypeId", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;", "stationId", "pictures", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreateIncidenceUseCase {
    private final IncidenceRepository incidenceRepository;

    public CreateIncidenceUseCase(IncidenceRepository incidenceRepository) {
        Intrinsics.checkNotNullParameter(incidenceRepository, "incidenceRepository");
        this.incidenceRepository = incidenceRepository;
    }

    public final Object invoke(String str, String str2, IncidenceNotificationType incidenceNotificationType, String str3, List<IncidencePicture> list, Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return this.incidenceRepository.createIncidence(str, str2, incidenceNotificationType, str3, list, continuation);
    }
}
