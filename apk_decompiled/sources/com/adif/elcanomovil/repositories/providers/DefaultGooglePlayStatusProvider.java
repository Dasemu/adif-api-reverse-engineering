package com.adif.elcanomovil.repositories.providers;

import android.content.Context;
import com.adif.elcanomovil.domain.providers.GooglePlayVersionProvider;
import com.google.android.gms.common.GoogleApiAvailability;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultGooglePlayStatusProvider;", "Lcom/adif/elcanomovil/domain/providers/GooglePlayVersionProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isActive", "", "()Z", "statusGooglePlayService", "", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultGooglePlayStatusProvider implements GooglePlayVersionProvider {
    private final Context context;
    private final boolean isActive;
    private final int statusGooglePlayService;

    public DefaultGooglePlayStatusProvider(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        this.statusGooglePlayService = isGooglePlayServicesAvailable;
        this.isActive = isGooglePlayServicesAvailable == 0;
    }

    @Override // com.adif.elcanomovil.domain.providers.GooglePlayVersionProvider
    /* renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }
}
