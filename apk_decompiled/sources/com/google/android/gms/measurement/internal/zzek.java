package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzek extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzek(zzgd zzgdVar, long j4) {
        super(zzgdVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:67|68|(1:70)(2:85|(1:87))|71|72|(20:74|(1:76)(1:83)|78|79|5|(1:66)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:54)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|66|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a2, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c5, code lost:
    
        r11.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzet.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:17:0x0159, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a6, B:30:0x01bc, B:31:0x01c1, B:33:0x01bf), top: B:16:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:17:0x0159, B:20:0x0173, B:22:0x017b, B:25:0x0199, B:26:0x0195, B:28:0x01a6, B:30:0x01bc, B:31:0x01c1, B:33:0x01bf), top: B:16:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzek.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String format;
        zzg();
        if (this.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        }
        this.zzt.zzaA().zzc().zza("Resetting session stitching token to ".concat(format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z3 = false;
        if (str2 != null && !str2.equals(str)) {
            z3 = true;
        }
        this.zzo = str;
        return z3;
    }
}
