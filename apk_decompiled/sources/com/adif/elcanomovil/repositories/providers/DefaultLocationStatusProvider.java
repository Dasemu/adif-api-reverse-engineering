package com.adif.elcanomovil.repositories.providers;

import android.content.IntentFilter;
import android.location.LocationManager;
import com.adif.elcanomovil.domain.providers.LocationStatusProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import d1.InterfaceC0307a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultLocationStatusProvider;", "Lcom/adif/elcanomovil/domain/providers/LocationStatusProvider;", "Lkotlinx/coroutines/CoroutineScope;", "LZ0/c;", "locationStatusReceiver", "LZ0/a;", "isLocationEnabled", "Ld1/a;", "appDispatcher", "<init>", "(LZ0/c;LZ0/a;Ld1/a;)V", "", "onAccessed", "()V", "LZ0/c;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "", "receiverRegistered", "Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_locationStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getLocationStatus", "()Lkotlinx/coroutines/flow/SharedFlow;", "locationStatus", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLocationStatusProvider implements LocationStatusProvider, CoroutineScope {
    private final MutableStateFlow<Boolean> _locationStatus;
    private final CoroutineContext coroutineContext;
    private final Z0.c locationStatusReceiver;
    private boolean receiverRegistered;

    @Inject
    public DefaultLocationStatusProvider(Z0.c locationStatusReceiver, Z0.a isLocationEnabled, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(locationStatusReceiver, "locationStatusReceiver");
        Intrinsics.checkNotNullParameter(isLocationEnabled, "isLocationEnabled");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.locationStatusReceiver = locationStatusReceiver;
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        ((d1.d) appDispatcher).getClass();
        this.coroutineContext = SupervisorJob$default.plus(Dispatchers.getMain());
        Object systemService = isLocationEnabled.f2160a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this._locationStatus = StateFlowKt.MutableStateFlow(Boolean.valueOf(((LocationManager) systemService).isLocationEnabled()));
    }

    public static final /* synthetic */ MutableStateFlow access$get_locationStatus$p(DefaultLocationStatusProvider defaultLocationStatusProvider) {
        return defaultLocationStatusProvider._locationStatus;
    }

    private final void onAccessed() {
        if (this.receiverRegistered) {
            return;
        }
        this.receiverRegistered = true;
        BuildersKt__Builders_commonKt.launch$default(this, null, CoroutineStart.UNDISPATCHED, new h(this, null), 1, null);
        Z0.c cVar = this.locationStatusReceiver;
        cVar.getClass();
        cVar.f2164a.registerReceiver(cVar, new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.adif.elcanomovil.domain.providers.LocationStatusProvider
    public SharedFlow<Boolean> getLocationStatus() {
        onAccessed();
        return this._locationStatus;
    }
}
