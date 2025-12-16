package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH'J\u001c\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceStationEntity;", "getIncidence", NavArguments.ARG_TYPE_NOTIFICATION_JSON_MESSAGE_TRAIN, "", "insertAll", "incidences", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIncidence", "incidence", "(Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IncidenceDao {
    Object deleteAll(Continuation<? super Unit> continuation);

    Flow<List<IncidenceStationEntity>> getAll();

    Flow<IncidenceStationEntity> getIncidence(int id);

    Object insertAll(List<IncidenceEntity> list, Continuation<? super Unit> continuation);

    Object updateIncidence(IncidenceEntity incidenceEntity, Continuation<? super Unit> continuation);
}
