package com.adif.elcanomovil.domain.usecases.avisa.user;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/avisa/user/LoginAvisaUserUseCase;", "", "avisaLoginRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "(Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoginAvisaUserUseCase {
    private final AvisaLoginRepository avisaLoginRepository;

    public LoginAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository) {
        Intrinsics.checkNotNullParameter(avisaLoginRepository, "avisaLoginRepository");
        this.avisaLoginRepository = avisaLoginRepository;
    }

    public final Object invoke(Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return this.avisaLoginRepository.login(continuation);
    }
}
