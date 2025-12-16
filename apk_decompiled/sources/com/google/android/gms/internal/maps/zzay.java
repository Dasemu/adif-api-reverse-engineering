package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    public zzay(zzaz zzazVar, int i, int i4) {
        this.zzc = zzazVar;
        this.zza = i;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzas.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzaz, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaz subList(int i, int i4) {
        zzas.zzc(i, i4, this.zzb);
        int i5 = this.zza;
        return this.zzc.subList(i + i5, i4 + i5);
    }
}
