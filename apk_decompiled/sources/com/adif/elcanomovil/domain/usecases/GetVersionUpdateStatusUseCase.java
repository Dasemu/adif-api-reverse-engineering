package com.adif.elcanomovil.domain.usecases;

import com.adif.elcanomovil.domain.entities.VersionUpdateStatus;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import j1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/GetVersionUpdateStatusUseCase;", "", "appVersionProvider", "Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "remoteConfigVersionRepository", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "(Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/VersionUpdateStatus;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetVersionUpdateStatusUseCase {
    private final AppVersionProvider appVersionProvider;
    private final RemoteConfigVersionRepository remoteConfigVersionRepository;

    public GetVersionUpdateStatusUseCase(AppVersionProvider appVersionProvider, RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        this.appVersionProvider = appVersionProvider;
        this.remoteConfigVersionRepository = remoteConfigVersionRepository;
    }

    public final Flow<VersionUpdateStatus> invoke() {
        return FlowKt.flatMapConcat(this.remoteConfigVersionRepository.getRemoteConfiguration(), new h(this, null));
    }
}
