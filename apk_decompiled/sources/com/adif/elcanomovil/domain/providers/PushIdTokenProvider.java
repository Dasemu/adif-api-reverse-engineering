package com.adif.elcanomovil.domain.providers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "", "saveToken", "", "newToken", "", "token", "tokenHasChanged", "", "tokenRead", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PushIdTokenProvider {
    void saveToken(String newToken);

    String token();

    boolean tokenHasChanged();

    void tokenRead();
}
