package com.google.android.gms.internal.measurement;

import C.w;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzjx extends zzjw {
    protected final byte[] zza;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || zzd() != ((zzka) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return obj.equals(this);
        }
        zzjx zzjxVar = (zzjx) obj;
        int zzk = zzk();
        int zzk2 = zzjxVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException(w.k("Ran off end of other: 0, ", zzd, zzjxVar.zzd(), ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzjxVar.zza;
        zzjxVar.zzc();
        int i = 0;
        int i4 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i4]) {
                return false;
            }
            i++;
            i4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int zze(int i, int i4, int i5) {
        return zzlj.zzb(i, this.zza, 0, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i, int i4) {
        int zzj = zzka.zzj(0, i4, zzd());
        return zzj == 0 ? zzka.zzb : new zzju(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzh(zzjq zzjqVar) throws IOException {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
