package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceNetworking.avisa.model.AvisaLoginResponse;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/TokenMapper;", "", "()V", "map", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/AvisaToken;", "loginResponse", "Lcom/adif/elcanomovil/serviceNetworking/avisa/model/AvisaLoginResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TokenMapper {
    public final AvisaToken map(AvisaLoginResponse loginResponse) {
        Intrinsics.checkNotNullParameter(loginResponse, "loginResponse");
        return new AvisaToken(loginResponse.getAccessToken(), loginResponse.getTokenType(), loginResponse.getRefreshToken(), loginResponse.getExpiresIn(), loginResponse.getScope());
    }
}
