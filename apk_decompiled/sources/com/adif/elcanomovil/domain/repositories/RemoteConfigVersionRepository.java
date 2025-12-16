package com.adif.elcanomovil.domain.repositories;

import com.adif.elcanomovil.domain.entities.RemoteConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "", "circulationsFetchInterval", "", "getCirculationsFetchInterval", "()J", "lastNotifiedVersion", "", "getLastNotifiedVersion", "()Ljava/lang/String;", "remoteConfiguration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/RemoteConfiguration;", "getRemoteConfiguration", "()Lkotlinx/coroutines/flow/Flow;", "fetchRemoteConfiguration", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeLastNotifiedVersion", "version", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RemoteConfigVersionRepository {
    Object fetchRemoteConfiguration(Continuation<? super Unit> continuation);

    long getCirculationsFetchInterval();

    String getLastNotifiedVersion();

    Flow<RemoteConfiguration> getRemoteConfiguration();

    void storeLastNotifiedVersion(String version);
}
