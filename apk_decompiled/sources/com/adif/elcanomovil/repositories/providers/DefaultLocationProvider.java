package com.adif.elcanomovil.repositories.providers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.adif.elcanomovil.domain.providers.LocationProvider;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/adif/elcanomovil/repositories/providers/DefaultLocationProvider;", "Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/content/Context;)V", "_lastLocation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/location/Location;", "locationCallback", "com/adif/elcanomovil/repositories/providers/DefaultLocationProvider$locationCallback$1", "Lcom/adif/elcanomovil/repositories/providers/DefaultLocationProvider$locationCallback$1;", "distanceTo", "", FirebaseAnalytics.Param.LOCATION, "fetchLastLocation", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLastSyncLocation", "isLocated", "", "requestLocationUpdates", "", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class DefaultLocationProvider implements LocationProvider {
    private final MutableStateFlow<Location> _lastLocation;
    private final Context context;
    private final FusedLocationProviderClient fusedLocationClient;
    private final DefaultLocationProvider$locationCallback$1 locationCallback;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.adif.elcanomovil.repositories.providers.DefaultLocationProvider$locationCallback$1] */
    @Inject
    public DefaultLocationProvider(FusedLocationProviderClient fusedLocationClient, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(fusedLocationClient, "fusedLocationClient");
        Intrinsics.checkNotNullParameter(context, "context");
        this.fusedLocationClient = fusedLocationClient;
        this.context = context;
        this._lastLocation = StateFlowKt.MutableStateFlow(null);
        this.locationCallback = new LocationCallback() { // from class: com.adif.elcanomovil.repositories.providers.DefaultLocationProvider$locationCallback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                FusedLocationProviderClient fusedLocationProviderClient;
                MutableStateFlow mutableStateFlow;
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                fusedLocationProviderClient = DefaultLocationProvider.this.fusedLocationClient;
                fusedLocationProviderClient.removeLocationUpdates(this);
                mutableStateFlow = DefaultLocationProvider.this._lastLocation;
                mutableStateFlow.setValue(locationResult.getLastLocation());
            }
        };
    }

    private final void requestLocationUpdates() {
        LocationRequest create = LocationRequest.create();
        create.setInterval(30000L);
        create.setFastestInterval(30000L);
        create.setPriority(102);
        Intrinsics.checkNotNullExpressionValue(create, "apply(...)");
        this.fusedLocationClient.requestLocationUpdates(create, this.locationCallback, Looper.getMainLooper());
    }

    @Override // com.adif.elcanomovil.domain.providers.LocationProvider
    public float distanceTo(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Location value = this._lastLocation.getValue();
        return value != null ? value.distanceTo(location) : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.adif.elcanomovil.domain.providers.LocationProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchLastLocation(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends android.location.Location>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.adif.elcanomovil.repositories.providers.g
            if (r0 == 0) goto L13
            r0 = r8
            com.adif.elcanomovil.repositories.providers.g r0 = (com.adif.elcanomovil.repositories.providers.g) r0
            int r1 = r0.f4653d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4653d = r1
            goto L18
        L13:
            com.adif.elcanomovil.repositories.providers.g r0 = new com.adif.elcanomovil.repositories.providers.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f4651b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4653d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.adif.elcanomovil.repositories.providers.DefaultLocationProvider r7 = r0.f4650a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            android.content.Context r8 = r7.context
            int r2 = android.os.Binder.getCallingPid()
            int r4 = android.os.Process.myPid()
            if (r2 != r4) goto L47
            java.lang.String r2 = r8.getPackageName()
            goto L48
        L47:
            r2 = 0
        L48:
            int r4 = android.os.Binder.getCallingPid()
            int r5 = android.os.Binder.getCallingUid()
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            int r8 = m3.l.h(r8, r6, r2, r4, r5)
            if (r8 != 0) goto L7a
            com.google.android.gms.location.FusedLocationProviderClient r8 = r7.fusedLocationClient
            com.google.android.gms.tasks.Task r8 = r8.getLastLocation()
            java.lang.String r2 = "getLastLocation(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f4650a = r7
            r0.f4653d = r3
            java.lang.Object r8 = kotlinx.coroutines.tasks.TasksKt.await(r8, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            android.location.Location r8 = (android.location.Location) r8
            if (r8 == 0) goto L77
            kotlinx.coroutines.flow.MutableStateFlow<android.location.Location> r0 = r7._lastLocation
            r0.setValue(r8)
        L77:
            r7.requestLocationUpdates()
        L7a:
            kotlinx.coroutines.flow.MutableStateFlow<android.location.Location> r7 = r7._lastLocation
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.repositories.providers.DefaultLocationProvider.fetchLastLocation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.adif.elcanomovil.domain.providers.LocationProvider
    public Location fetchLastSyncLocation() {
        return this._lastLocation.getValue();
    }

    @Override // com.adif.elcanomovil.domain.providers.LocationProvider
    public boolean isLocated() {
        Location value = this._lastLocation.getValue();
        if (value != null) {
            return (value.getLatitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && value.getLongitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? false : true;
        }
        return false;
    }
}
