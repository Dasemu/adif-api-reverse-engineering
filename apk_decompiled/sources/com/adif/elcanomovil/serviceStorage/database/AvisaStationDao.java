package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007H'J\u001c\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH§@¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCategories", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationEntity;", "getAllCategories", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaStationCategoryEntity;", "insertAll", "stations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCategories", "categories", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AvisaStationDao {
    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteCategories(Continuation<? super Unit> continuation);

    Flow<List<AvisaStationEntity>> getAll();

    Flow<List<AvisaStationCategoryEntity>> getAllCategories();

    Object insertAll(List<AvisaStationEntity> list, Continuation<? super Unit> continuation);

    Object insertCategories(List<AvisaStationCategoryEntity> list, Continuation<? super Unit> continuation);
}
