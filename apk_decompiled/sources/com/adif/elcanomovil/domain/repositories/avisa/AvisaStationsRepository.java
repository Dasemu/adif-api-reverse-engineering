package com.adif.elcanomovil.domain.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00040\u00032\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;", "", RemoteConfigComponent.FETCH_FILE_NAME, "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "shouldFetch", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStationCategories", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "stationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AvisaStationsRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetch$default(AvisaStationsRepository avisaStationsRepository, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                z3 = true;
            }
            return avisaStationsRepository.fetch(z3, continuation);
        }

        public static /* synthetic */ Object fetchStationCategories$default(AvisaStationsRepository avisaStationsRepository, boolean z3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchStationCategories");
            }
            if ((i & 1) != 0) {
                z3 = true;
            }
            return avisaStationsRepository.fetchStationCategories(z3, (Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>>) continuation);
        }
    }

    Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStation>>>> continuation);

    Object fetchStationCategories(String str, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation);

    Object fetchStationCategories(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation);
}
