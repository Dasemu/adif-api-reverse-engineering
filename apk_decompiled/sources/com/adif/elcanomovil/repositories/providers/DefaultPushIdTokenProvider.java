package com.adif.elcanomovil.repositories.providers;

import com.adif.elcanomovil.domain.providers.PushIdTokenProvider;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultPushIdTokenProvider;", "Lcom/adif/elcanomovil/domain/providers/PushIdTokenProvider;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", "saveToken", "", "newToken", "", "token", "tokenHasChanged", "", "tokenRead", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultPushIdTokenProvider implements PushIdTokenProvider {
    private final PreferenceStorage preferenceStorage;

    public DefaultPushIdTokenProvider(PreferenceStorage preferenceStorage) {
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        this.preferenceStorage = preferenceStorage;
    }

    @Override // com.adif.elcanomovil.domain.providers.PushIdTokenProvider
    public void saveToken(String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        PreferenceStorage preferenceStorage = this.preferenceStorage;
        preferenceStorage.setPushTokenChanged(Intrinsics.areEqual(preferenceStorage.getPushToken(), newToken));
        this.preferenceStorage.setPushToken(newToken);
    }

    @Override // com.adif.elcanomovil.domain.providers.PushIdTokenProvider
    public String token() {
        return this.preferenceStorage.getPushToken();
    }

    @Override // com.adif.elcanomovil.domain.providers.PushIdTokenProvider
    public boolean tokenHasChanged() {
        return this.preferenceStorage.isPushTokenChanged();
    }

    @Override // com.adif.elcanomovil.domain.providers.PushIdTokenProvider
    public void tokenRead() {
        this.preferenceStorage.setPushTokenChanged(false);
    }
}
