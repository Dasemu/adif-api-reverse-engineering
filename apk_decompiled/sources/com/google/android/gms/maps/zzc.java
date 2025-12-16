package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* loaded from: classes3.dex */
final class zzc extends com.google.android.gms.maps.internal.zzac {
    final /* synthetic */ GoogleMap.OnInfoWindowClickListener zza;

    public zzc(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zza = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzb(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza.onInfoWindowClick(new Marker(zzadVar));
    }
}
