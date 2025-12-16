package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class zzgq implements Callable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgv zzc;

    public zzgq(zzgv zzgvVar, zzau zzauVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        byte[] bArr;
        zzlh zzlhVar3;
        zzlm zzlmVar;
        List list;
        com.google.android.gms.internal.measurement.zzga zzgaVar;
        Bundle bundle;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        String str;
        zzaq zzc;
        long j4;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzc.zza;
        zzip zzr = zzlhVar2.zzr();
        zzau zzauVar = this.zza;
        String str2 = this.zzb;
        zzr.zzg();
        zzgd.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str2);
        if (!zzr.zzt.zzf().zzs(str2, zzeg.zzU)) {
            zzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzga zza = com.google.android.gms.internal.measurement.zzgb.zza();
        zzr.zzf.zzh().zzw();
        try {
            zzh zzj = zzr.zzf.zzh().zzj(str2);
            if (zzj == null) {
                zzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str2);
                return new byte[0];
            }
            if (!zzj.zzan()) {
                zzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str2);
                return new byte[0];
            }
            com.google.android.gms.internal.measurement.zzgc zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
            zzu.zzad(1);
            zzu.zzZ("android");
            if (!TextUtils.isEmpty(zzj.zzv())) {
                zzu.zzD(zzj.zzv());
            }
            if (!TextUtils.isEmpty(zzj.zzx())) {
                zzu.zzF((String) Preconditions.checkNotNull(zzj.zzx()));
            }
            if (!TextUtils.isEmpty(zzj.zzy())) {
                zzu.zzG((String) Preconditions.checkNotNull(zzj.zzy()));
            }
            if (zzj.zzb() != -2147483648L) {
                zzu.zzH((int) zzj.zzb());
            }
            zzu.zzV(zzj.zzm());
            zzu.zzP(zzj.zzk());
            String zzA = zzj.zzA();
            String zzt = zzj.zzt();
            if (!TextUtils.isEmpty(zzA)) {
                zzu.zzU(zzA);
            } else if (!TextUtils.isEmpty(zzt)) {
                zzu.zzC(zzt);
            }
            zzpz.zzc();
            if (zzr.zzt.zzf().zzs(null, zzeg.zzaE)) {
                zzu.zzaj(zzj.zzr());
            }
            zzhb zzq = zzr.zzf.zzq(str2);
            zzu.zzM(zzj.zzj());
            if (zzr.zzt.zzJ() && zzr.zzt.zzf().zzt(zzu.zzaq()) && zzq.zzj(zzha.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                zzu.zzO(null);
            }
            zzu.zzL(zzq.zzi());
            if (zzq.zzj(zzha.AD_STORAGE) && zzj.zzam()) {
                Pair zzd = zzr.zzf.zzs().zzd(zzj.zzv(), zzq);
                if (zzj.zzam() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                    try {
                        zzu.zzae(zzip.zza((String) zzd.first, Long.toString(zzauVar.zzd)));
                        Object obj = zzd.second;
                        if (obj != null) {
                            zzu.zzX(((Boolean) obj).booleanValue());
                        }
                    } catch (SecurityException e4) {
                        zzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e4.getMessage());
                        bArr = new byte[0];
                        zzlhVar3 = zzr.zzf;
                        zzlhVar3.zzh().zzx();
                        return bArr;
                    }
                }
            }
            zzr.zzt.zzg().zzv();
            zzu.zzN(Build.MODEL);
            zzr.zzt.zzg().zzv();
            zzu.zzY(Build.VERSION.RELEASE);
            zzu.zzak((int) zzr.zzt.zzg().zzb());
            zzu.zzao(zzr.zzt.zzg().zzc());
            try {
                if (zzq.zzj(zzha.ANALYTICS_STORAGE) && zzj.zzw() != null) {
                    zzu.zzE(zzip.zza((String) Preconditions.checkNotNull(zzj.zzw()), Long.toString(zzauVar.zzd)));
                }
                if (!TextUtils.isEmpty(zzj.zzz())) {
                    zzu.zzT((String) Preconditions.checkNotNull(zzj.zzz()));
                }
                String zzv = zzj.zzv();
                List zzu2 = zzr.zzf.zzh().zzu(zzv);
                Iterator it = zzu2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzlmVar = null;
                        break;
                    }
                    zzlmVar = (zzlm) it.next();
                    if ("_lte".equals(zzlmVar.zzc)) {
                        break;
                    }
                }
                if (zzlmVar == null || zzlmVar.zze == null) {
                    list = zzu2;
                    zzlm zzlmVar2 = new zzlm(zzv, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzr.zzt.zzax().currentTimeMillis(), 0L);
                    list.add(zzlmVar2);
                    zzr.zzf.zzh().zzL(zzlmVar2);
                } else {
                    list = zzu2;
                }
                zzlj zzu3 = zzr.zzf.zzu();
                zzu3.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                if (zzu3.zzt.zzg().zze()) {
                    String zzv2 = zzj.zzv();
                    Preconditions.checkNotNull(zzv2);
                    if (zzj.zzam() && zzu3.zzf.zzm().zzn(zzv2)) {
                        zzu3.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if ("_npa".equals(((zzlm) it2.next()).zzc)) {
                                it2.remove();
                                break;
                            }
                        }
                        list.add(new zzlm(zzv2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzu3.zzt.zzax().currentTimeMillis(), 1L));
                    }
                }
                com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    com.google.android.gms.internal.measurement.zzgl zzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                    zzd2.zzf(((zzlm) list.get(i)).zzc);
                    zzd2.zzg(((zzlm) list.get(i)).zzd);
                    zzr.zzf.zzu().zzv(zzd2, ((zzlm) list.get(i)).zze);
                    zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzd2.zzaD();
                }
                zzu.zzj(Arrays.asList(zzgmVarArr));
                zzeu zzb = zzeu.zzb(zzauVar);
                zzr.zzt.zzv().zzL(zzb.zzd, zzr.zzf.zzh().zzi(str2));
                zzr.zzt.zzv().zzN(zzb, zzr.zzt.zzf().zzd(str2));
                Bundle bundle2 = zzb.zzd;
                bundle2.putLong("_c", 1L);
                zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                bundle2.putLong("_r", 1L);
                bundle2.putString("_o", zzauVar.zzc);
                if (zzr.zzt.zzv().zzaf(zzu.zzaq())) {
                    zzr.zzt.zzv().zzP(bundle2, "_dbg", 1L);
                    zzr.zzt.zzv().zzP(bundle2, "_r", 1L);
                }
                zzaq zzn = zzr.zzf.zzh().zzn(str2, zzauVar.zza);
                if (zzn == null) {
                    zzhVar = zzj;
                    zzgaVar = zza;
                    bundle = bundle2;
                    zzgcVar = zzu;
                    zzc = new zzaq(str2, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                    str = null;
                    j4 = 0;
                } else {
                    zzgaVar = zza;
                    bundle = bundle2;
                    zzhVar = zzj;
                    zzgcVar = zzu;
                    str = null;
                    long j5 = zzn.zzf;
                    zzc = zzn.zzc(zzauVar.zzd);
                    j4 = j5;
                }
                zzaq zzaqVar = zzc;
                zzr.zzf.zzh().zzE(zzaqVar);
                zzap zzapVar = new zzap(zzr.zzt, zzauVar.zzc, str2, zzauVar.zza, zzauVar.zzd, j4, bundle);
                com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
                zze.zzm(zzapVar.zzd);
                zze.zzi(zzapVar.zzb);
                zze.zzl(zzapVar.zze);
                zzar zzarVar = new zzar(zzapVar.zzf);
                while (zzarVar.hasNext()) {
                    String next = zzarVar.next();
                    com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                    zze2.zzj(next);
                    Object zzf = zzapVar.zzf.zzf(next);
                    if (zzf != null) {
                        zzr.zzf.zzu().zzu(zze2, zzf);
                        zze.zze(zze2);
                    }
                }
                zzgcVar.zzk(zze);
                com.google.android.gms.internal.measurement.zzge zza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                com.google.android.gms.internal.measurement.zzfu zza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                zza3.zza(zzaqVar.zzc);
                zza3.zzb(zzauVar.zza);
                zza2.zza(zza3);
                zzgcVar.zzaa(zza2);
                zzgcVar.zzf(zzr.zzf.zzf().zza(zzhVar.zzv(), Collections.EMPTY_LIST, zzgcVar.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                if (zze.zzq()) {
                    zzgcVar.zzai(zze.zzc());
                    zzgcVar.zzQ(zze.zzc());
                }
                long zzn2 = zzhVar.zzn();
                if (zzn2 != 0) {
                    zzgcVar.zzab(zzn2);
                }
                long zzp = zzhVar.zzp();
                if (zzp != 0) {
                    zzgcVar.zzac(zzp);
                } else if (zzn2 != 0) {
                    zzgcVar.zzac(zzn2);
                }
                String zzD = zzhVar.zzD();
                zzqu.zzc();
                if (zzr.zzt.zzf().zzs(str2, zzeg.zzao) && zzD != null) {
                    zzgcVar.zzah(zzD);
                }
                zzhVar.zzG();
                zzgcVar.zzI((int) zzhVar.zzo());
                zzr.zzt.zzf().zzh();
                zzgcVar.zzam(79000L);
                zzgcVar.zzal(zzr.zzt.zzax().currentTimeMillis());
                zzgcVar.zzag(true);
                if (zzr.zzt.zzf().zzs(str, zzeg.zzas)) {
                    zzr.zzf.zzC(zzgcVar.zzaq(), zzgcVar);
                }
                com.google.android.gms.internal.measurement.zzga zzgaVar2 = zzgaVar;
                zzgaVar2.zza(zzgcVar);
                zzh zzhVar2 = zzhVar;
                zzhVar2.zzad(zzgcVar.zzd());
                zzhVar2.zzab(zzgcVar.zzc());
                zzr.zzf.zzh().zzD(zzhVar2);
                zzr.zzf.zzh().zzC();
                try {
                    return zzr.zzf.zzu().zzz(((com.google.android.gms.internal.measurement.zzgb) zzgaVar2.zzaD()).zzbx());
                } catch (IOException e5) {
                    zzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzet.zzn(str2), e5);
                    return str;
                }
            } catch (SecurityException e6) {
                zzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e6.getMessage());
                bArr = new byte[0];
                zzlhVar3 = zzr.zzf;
                zzlhVar3.zzh().zzx();
                return bArr;
            }
        } finally {
            zzr.zzf.zzh().zzx();
        }
    }
}
