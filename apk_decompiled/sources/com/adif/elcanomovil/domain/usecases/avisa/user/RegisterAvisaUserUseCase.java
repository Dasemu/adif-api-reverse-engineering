package com.adif.elcanomovil.domain.usecases.avisa.user;

import android.os.Build;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaLoginRepository;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePasswordUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GeneratePersistentUserIdUseCase;
import com.adif.elcanomovil.domain.usecases.credentials.GenerateUserIdUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0086B¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/avisa/user/RegisterAvisaUserUseCase;", "", "avisaLoginRepository", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;", "generatePasswordUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePasswordUseCase;", "generateUserIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GenerateUserIdUseCase;", "generateSubscriptinUserIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePersistentUserIdUseCase;", "pushIdToken", "Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "tokenProvider", "Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;", "(Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaLoginRepository;Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePasswordUseCase;Lcom/adif/elcanomovil/domain/usecases/credentials/GenerateUserIdUseCase;Lcom/adif/elcanomovil/domain/usecases/credentials/GeneratePersistentUserIdUseCase;Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegisterAvisaUserUseCase {
    private final AvisaLoginRepository avisaLoginRepository;
    private final GeneratePasswordUseCase generatePasswordUseCase;
    private final GeneratePersistentUserIdUseCase generateSubscriptinUserIdUseCase;
    private final GenerateUserIdUseCase generateUserIdUseCase;
    private final PushIdTokenProvider pushIdToken;
    private final TokenJwtProvider tokenProvider;

    public RegisterAvisaUserUseCase(AvisaLoginRepository avisaLoginRepository, GeneratePasswordUseCase generatePasswordUseCase, GenerateUserIdUseCase generateUserIdUseCase, GeneratePersistentUserIdUseCase generateSubscriptinUserIdUseCase, PushIdTokenProvider pushIdToken, TokenJwtProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(avisaLoginRepository, "avisaLoginRepository");
        Intrinsics.checkNotNullParameter(generatePasswordUseCase, "generatePasswordUseCase");
        Intrinsics.checkNotNullParameter(generateUserIdUseCase, "generateUserIdUseCase");
        Intrinsics.checkNotNullParameter(generateSubscriptinUserIdUseCase, "generateSubscriptinUserIdUseCase");
        Intrinsics.checkNotNullParameter(pushIdToken, "pushIdToken");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.avisaLoginRepository = avisaLoginRepository;
        this.generatePasswordUseCase = generatePasswordUseCase;
        this.generateUserIdUseCase = generateUserIdUseCase;
        this.generateSubscriptinUserIdUseCase = generateSubscriptinUserIdUseCase;
        this.pushIdToken = pushIdToken;
        this.tokenProvider = tokenProvider;
    }

    public final Object invoke(Continuation<? super Flow<AsyncResult<Unit>>> continuation) {
        return this.avisaLoginRepository.register(this.tokenProvider.getTokenJwt(), this.generateUserIdUseCase.invoke(), this.generateSubscriptinUserIdUseCase.invoke(), this.pushIdToken.token(), this.generatePasswordUseCase.invoke(), "android", String.valueOf(Build.VERSION.SDK_INT), continuation);
    }
}
