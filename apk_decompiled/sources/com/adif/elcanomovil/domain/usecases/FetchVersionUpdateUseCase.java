package com.adif.elcanomovil.domain.usecases;

import com.adif.elcanomovil.domain.repositories.RemoteConfigVersionRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086B¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/FetchVersionUpdateUseCase;", "", "remoteConfigVersionRepository", "Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;", "(Lcom/adif/elcanomovil/domain/repositories/RemoteConfigVersionRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchVersionUpdateUseCase {
    private final RemoteConfigVersionRepository remoteConfigVersionRepository;

    public FetchVersionUpdateUseCase(RemoteConfigVersionRepository remoteConfigVersionRepository) {
        Intrinsics.checkNotNullParameter(remoteConfigVersionRepository, "remoteConfigVersionRepository");
        this.remoteConfigVersionRepository = remoteConfigVersionRepository;
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        Object fetchRemoteConfiguration = this.remoteConfigVersionRepository.fetchRemoteConfiguration(continuation);
        return fetchRemoteConfiguration == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? fetchRemoteConfiguration : Unit.INSTANCE;
    }
}
