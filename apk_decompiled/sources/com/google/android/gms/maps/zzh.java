package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzh extends com.google.android.gms.maps.internal.zzay {
    final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener zza;

    public zzh(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zza = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final boolean zzb() throws RemoteException {
        return this.zza.onMyLocationButtonClick();
    }
}
