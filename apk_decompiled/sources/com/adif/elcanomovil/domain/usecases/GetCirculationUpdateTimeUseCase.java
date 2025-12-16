package com.adif.elcanomovil.domain.usecases;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/GetCirculationUpdateTimeUseCase;", "", "remoteConfigVersionRepository", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "(Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;)V", "delayTime", "", "getDelayTime", "()J", "updateTime", "getUpdateTime", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetCirculationUpdateTimeUseCase {
    private final RemoteConfigVersionRepository remoteConfigVersionRepository;

    public GetCirculationUpdateTimeUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        this.remoteConfigVersionRepository = remoteConfigVersionRepository;
    }

    public final long getDelayTime() {
        return 300L;
    }

    public final long getUpdateTime() {
        return this.remoteConfigVersionRepository.getCirculationsFetchInterval() * 1000;
    }
}
