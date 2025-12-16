package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.AppVersionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultAppVersionProvider;", "Lcom/adif/elcanomovil/domain/providers/AppVersionProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "version", "", "getVersion", "()Ljava/lang/String;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAppVersionProvider implements AppVersionProvider {
    private final String version;

    public DefaultAppVersionProvider(Context context) {
        String version;
        Intrinsics.checkNotNullParameter(context, "context");
        version = DefaultAppVersionProviderKt.getVersion(context);
        this.version = version;
    }

    @Override // com.adif.elcanomovil.domain.providers.AppVersionProvider
    public String getVersion() {
        return this.version;
    }
}
