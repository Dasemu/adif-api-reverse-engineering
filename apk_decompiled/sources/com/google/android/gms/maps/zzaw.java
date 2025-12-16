package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.K;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaw extends DeferredLifecycleHelper {
    protected OnDelegateCreatedListener zza;
    private final K zzb;
    private Activity zzc;
    private final List zzd = new ArrayList();

    public zzaw(K k4) {
        this.zzb = k4;
    }

    public static /* synthetic */ void zza(zzaw zzawVar, Activity activity) {
        zzawVar.zzc = activity;
        zzawVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzav) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            IMapFragmentDelegate zzf = zzcc.zza(this.zzc, null).zzf(ObjectWrapper.wrap(this.zzc));
            if (zzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new zzav(this.zzb, zzf));
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzav) getDelegate()).getMapAsync((OnMapReadyCallback) it.next());
            }
            this.zzd.clear();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
