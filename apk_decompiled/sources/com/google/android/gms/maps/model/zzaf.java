package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaf implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzap zzb;

    public zzaf(TileOverlayOptions tileOverlayOptions) {
        zzap zzapVar;
        this.zza = tileOverlayOptions;
        zzapVar = tileOverlayOptions.zza;
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i4, int i5) {
        try {
            return this.zzb.zzb(i, i4, i5);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
