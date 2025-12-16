package com.google.android.gms.measurement.internal;

import C.w;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzet zzf;

    public zzeq(zzet zzetVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        long j4;
        char c5;
        long j5;
        zzfi zzm = this.zzf.zzt.zzm();
        if (!zzm.zzy()) {
            Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzet zzetVar = this.zzf;
        c4 = zzetVar.zza;
        if (c4 == 0) {
            if (zzetVar.zzt.zzf().zzy()) {
                zzet zzetVar2 = this.zzf;
                zzetVar2.zzt.zzay();
                zzetVar2.zza = 'C';
            } else {
                zzet zzetVar3 = this.zzf;
                zzetVar3.zzt.zzay();
                zzetVar3.zza = 'c';
            }
        }
        zzet zzetVar4 = this.zzf;
        j4 = zzetVar4.zzb;
        if (j4 < 0) {
            zzetVar4.zzt.zzf().zzh();
            zzetVar4.zzb = 79000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        zzet zzetVar5 = this.zzf;
        c5 = zzetVar5.zza;
        j5 = zzetVar5.zzb;
        String zzo = zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder("2");
        sb.append(charAt);
        sb.append(c5);
        sb.append(j5);
        String r4 = w.r(sb, ":", zzo);
        if (r4.length() > 1024) {
            r4 = this.zzb.substring(0, 1024);
        }
        zzfg zzfgVar = zzm.zzb;
        if (zzfgVar != null) {
            zzfgVar.zzb(r4, 1L);
        }
    }
}
