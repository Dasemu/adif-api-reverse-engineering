package com.adif.elcanomovil.domain.usecases;

import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/domain/usecases/GetAppVersionUseCase;", "", "appVersionProvider", "Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "(Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;)V", "invoke", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetAppVersionUseCase {
    private final AppVersionProvider appVersionProvider;

    public GetAppVersionUseCase(AppVersionProvider appVersionProvider) {
        Intrinsics.checkNotNullParameter(appVersionProvider, "appVersionProvider");
        this.appVersionProvider = appVersionProvider;
    }

    public final String invoke() {
        return this.appVersionProvider.getVersion();
    }
}
