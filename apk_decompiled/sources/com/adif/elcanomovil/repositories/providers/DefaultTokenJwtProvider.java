package com.adif.elcanomovil.repositories.providers;

import com.adif.elcanomovil.domain.providers.TokenJwtProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultTokenJwtProvider;", "Lcom/adif/elcanomovil/domain/providers/TokenJwtProvider;", "()V", "tokenJwt", "", "getTokenJwt", "()Ljava/lang/String;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTokenJwtProvider implements TokenJwtProvider {
    private final String tokenJwt = "Bearer b9034774-c6e4-4663-a1a8-74bf7102651b";

    @Override // com.adif.elcanomovil.domain.providers.TokenJwtProvider
    public String getTokenJwt() {
        return this.tokenJwt;
    }
}
