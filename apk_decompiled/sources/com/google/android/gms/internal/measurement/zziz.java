package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziz extends zzja {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzja zzc;

    public zziz(zzja zzjaVar, int i, int i4) {
        this.zzc = zzjaVar;
        this.zza = i;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzja, java.util.List
    /* renamed from: zzf */
    public final zzja subList(int i, int i4) {
        zzij.zzc(i, i4, this.zzb);
        zzja zzjaVar = this.zzc;
        int i5 = this.zza;
        return zzjaVar.subList(i + i5, i4 + i5);
    }
}
