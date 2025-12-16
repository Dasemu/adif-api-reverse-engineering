package com.adif.elcanomovil.domain.providers;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H¦@¢\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/domain/providers/LocationProvider;", "", "distanceTo", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "fetchLastLocation", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLastSyncLocation", "isLocated", "", "domain_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LocationProvider {
    float distanceTo(Location location);

    Object fetchLastLocation(Continuation<? super Flow<? extends Location>> continuation);

    Location fetchLastSyncLocation();

    boolean isLocated();
}
