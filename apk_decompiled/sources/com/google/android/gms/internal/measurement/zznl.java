package com.google.android.gms.internal.measurement;

import C.w;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z3;
    }

    public static zznl zzc() {
        return zza;
    }

    public static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i = zznlVar.zzb + zznlVar2.zzb;
        int[] copyOf = Arrays.copyOf(zznlVar.zzc, i);
        System.arraycopy(zznlVar2.zzc, 0, copyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zznlVar.zzd, i);
        System.arraycopy(zznlVar2.zzd, 0, copyOf2, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i, copyOf, copyOf2, true);
    }

    public static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i4 = this.zzb;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i) {
                i = i5;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i = this.zzb;
        if (i == zznlVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznlVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznlVar.zzd;
                    int i5 = this.zzb;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i4 = i + 527;
        int[] iArr = this.zzc;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 * 31) + i6;
        Object[] objArr = this.zzd;
        int i9 = this.zzb;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return (i8 * 31) + i5;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                i4 = w.B(i7 << 3, zzki.zzy(((Long) this.zzd[i5]).longValue()), i4);
            } else if (i8 == 1) {
                ((Long) this.zzd[i5]).getClass();
                i4 = w.B(i7 << 3, 8, i4);
            } else if (i8 == 2) {
                zzka zzkaVar = (zzka) this.zzd[i5];
                int i9 = zzki.zzb;
                int zzd = zzkaVar.zzd();
                i4 = w.B(i7 << 3, zzki.zzx(zzd) + zzd, i4);
            } else if (i8 == 3) {
                int i10 = i7 << 3;
                int i11 = zzki.zzb;
                int zza2 = ((zznl) this.zzd[i5]).zza();
                int zzx = zzki.zzx(i10);
                i4 = zzx + zzx + zza2 + i4;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(zzll.zza());
                }
                ((Integer) this.zzd[i5]).getClass();
                i4 = w.B(i7 << 3, 4, i4);
            }
        }
        this.zze = i4;
        return i4;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5] >>> 3;
            zzka zzkaVar = (zzka) this.zzd[i5];
            int i7 = zzki.zzb;
            int zzd = zzkaVar.zzd();
            int zzx = zzki.zzx(zzd) + zzd;
            int zzx2 = zzki.zzx(16);
            int zzx3 = zzki.zzx(i6);
            int zzx4 = zzki.zzx(8);
            i4 = w.y(24, zzx, zzx2 + zzx3 + zzx4 + zzx4, i4);
        }
        this.zze = i4;
        return i4;
    }

    public final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zznlVar.zzb;
        zzl(i);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzmk.zzb(sb, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final void zzk(zzoc zzocVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i4 = this.zzc[i];
                Object obj = this.zzd[i];
                int i5 = i4 & 7;
                int i6 = i4 >>> 3;
                if (i5 == 0) {
                    zzocVar.zzt(i6, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzocVar.zzm(i6, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzocVar.zzd(i6, (zzka) obj);
                } else if (i5 == 3) {
                    zzocVar.zzE(i6);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i6);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(zzll.zza());
                    }
                    zzocVar.zzk(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }
}
