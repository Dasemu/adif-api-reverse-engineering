package com.adif.elcanomovil.serviceStorage.database;

import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\nH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\bH'J\b\u0010\u000e\u001a\u00020\u000fH'J\u001c\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/database/StationsDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lcom/adif/elcanomovil/serviceStorage/model/StationEntity;", "stationCode", "", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "getCoincidences", "searchText", "getNumberOfStations", "", "insertAll", "stations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StationsDao {
    Object deleteAll(Continuation<? super Unit> continuation);

    StationEntity get(String stationCode);

    Flow<List<StationEntity>> getAll();

    List<StationEntity> getCoincidences(String searchText);

    int getNumberOfStations();

    Object insertAll(List<StationEntity> list, Continuation<? super Unit> continuation);
}
