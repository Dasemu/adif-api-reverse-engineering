package com.adif.elcanomovil.domain.repositories.logos;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/domain/repositories/logos/LogosInfoRepository;", "", "getLogo", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLogo", "", "epoch", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LogosInfoRepository {
    Object getLogo(String str, Continuation<? super Long> continuation);

    Object setLogo(String str, long j4, Continuation<? super Unit> continuation);
}
