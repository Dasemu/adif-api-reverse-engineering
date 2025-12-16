package com.adif.elcanomovil.repositories.providers;

import com.adif.elcanomovil.domain.providers.Check24hProvider;
import com.adif.elcanomovil.repositories.utils.DateExtensionKt;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultCheck24hProvider;", "Lcom/adif/elcanomovil/domain/providers/Check24hProvider;", "preferenceStorage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", "checkfetchInfo", "", "shouldFetch", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultCheck24hProvider implements Check24hProvider {
    private final PreferenceStorage preferenceStorage;

    public DefaultCheck24hProvider(PreferenceStorage preferenceStorage) {
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        this.preferenceStorage = preferenceStorage;
    }

    @Override // com.adif.elcanomovil.domain.providers.Check24hProvider
    public boolean checkfetchInfo(boolean shouldFetch) {
        return shouldFetch || DateExtensionKt.check24Hours(new Date(), this.preferenceStorage.getLastFetchStationsDate());
    }
}
