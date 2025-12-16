package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzja implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjz zzf;

    public zzja(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z3, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z3;
        this.zze = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e4;
        Bundle bundle2;
        zzej zzejVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzjz zzjzVar = this.zzf;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzlk> zzh = zzejVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzlk zzlkVar : zzh) {
                        String str = zzlkVar.zze;
                        if (str != null) {
                            bundle.putString(zzlkVar.zzb, str);
                        } else {
                            Long l4 = zzlkVar.zzd;
                            if (l4 != null) {
                                bundle.putLong(zzlkVar.zzb, l4.longValue());
                            } else {
                                Double d4 = zzlkVar.zzg;
                                if (d4 != null) {
                                    bundle.putDouble(zzlkVar.zzb, d4.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (RemoteException e5) {
                    e4 = e5;
                    this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e4);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                throw th;
            }
        } catch (RemoteException e6) {
            bundle = bundle3;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle3);
            throw th;
        }
    }
}
