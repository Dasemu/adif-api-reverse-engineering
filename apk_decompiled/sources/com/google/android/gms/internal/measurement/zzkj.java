package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i, int i4) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzp(i, (i4 >> 31) ^ (i4 + i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                zzki zzkiVar = this.zza;
                int intValue = ((Integer) list.get(i4)).intValue();
                zzkiVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += zzki.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i4)).intValue();
            zzkiVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i, long j4) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzr(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                zzki zzkiVar = this.zza;
                long longValue = ((Long) list.get(i4)).longValue();
                zzkiVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += zzki.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long longValue3 = ((Long) list.get(i4)).longValue();
            zzkiVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i, List list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzlq)) {
            while (i4 < list.size()) {
                this.zza.zzm(i, (String) list.get(i4));
                i4++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i4 < list.size()) {
            Object zzf = zzlqVar.zzf(i4);
            if (zzf instanceof String) {
                this.zza.zzm(i, (String) zzf);
            } else {
                this.zza.zze(i, (zzka) zzf);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i, int i4) throws IOException {
        this.zza.zzp(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += zzki.zzx(((Integer) list.get(i6)).intValue());
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzq(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += zzki.zzy(((Long) list.get(i6)).longValue());
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzs(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i, boolean z3) throws IOException {
        this.zza.zzd(i, z3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i, zzka zzkaVar) throws IOException {
        this.zza.zze(i, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i, List list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zze(i, (zzka) list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i, double d4) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += zzki.zzu(((Integer) list.get(i6)).intValue());
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzk(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzg(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzi(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i, float f2) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i, Object obj, zzmt zzmtVar) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i, int i4) throws IOException {
        this.zza.zzj(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += zzki.zzu(((Integer) list.get(i6)).intValue());
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzk(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += zzki.zzy(((Long) list.get(i6)).longValue());
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzs(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i, Object obj, zzmt zzmtVar) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i, int i4) throws IOException {
        this.zza.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzg(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i, List list, boolean z3) throws IOException {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i4 < list.size()) {
            this.zza.zzi(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}
