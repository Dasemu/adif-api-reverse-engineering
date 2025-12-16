package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjo {
    public static int zza(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i, zzjnVar);
        int i4 = zzjnVar.zza;
        if (i4 < 0) {
            throw zzll.zzd();
        }
        if (i4 > bArr.length - zzj) {
            throw zzll.zzf();
        }
        if (i4 == 0) {
            zzjnVar.zzc = zzka.zzb;
            return zzj;
        }
        zzjnVar.zzc = zzka.zzl(bArr, zzj, i4);
        return zzj + i4;
    }

    public static int zzb(byte[] bArr, int i) {
        int i4 = bArr[i] & UByte.MAX_VALUE;
        int i5 = bArr[i + 1] & UByte.MAX_VALUE;
        int i6 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i4 | (i6 << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i, int i4, int i5, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i, i4, i5, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i, int i4, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i, i4, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzmt zzmtVar, int i, byte[] bArr, int i4, int i5, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int zzd = zzd(zzmtVar, bArr, i4, i5, zzjnVar);
        zzliVar.add(zzjnVar.zzc);
        while (zzd < i5) {
            int zzj = zzj(bArr, zzd, zzjnVar);
            if (i != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i5, zzjnVar);
            zzliVar.add(zzjnVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i, zzjnVar);
        int i4 = zzjnVar.zza + zzj;
        while (zzj < i4) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i4) {
            return zzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i, zzjnVar);
        int i4 = zzjnVar.zza;
        if (i4 < 0) {
            throw zzll.zzd();
        }
        if (i4 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        zzjnVar.zzc = new String(bArr, zzj, i4, zzlj.zzb);
        return zzj + i4;
    }

    public static int zzh(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i, zzjnVar);
        int i4 = zzjnVar.zza;
        if (i4 < 0) {
            throw zzll.zzd();
        }
        if (i4 == 0) {
            zzjnVar.zzc = "";
            return zzj;
        }
        int i5 = zznz.zza;
        int length = bArr.length;
        if ((((length - zzj) - i4) | zzj | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i4)));
        }
        int i6 = zzj + i4;
        char[] cArr = new char[i4];
        int i7 = 0;
        while (zzj < i6) {
            byte b4 = bArr[zzj];
            if (!zznv.zzd(b4)) {
                break;
            }
            zzj++;
            cArr[i7] = (char) b4;
            i7++;
        }
        int i8 = i7;
        while (zzj < i6) {
            int i9 = zzj + 1;
            byte b5 = bArr[zzj];
            if (zznv.zzd(b5)) {
                cArr[i8] = (char) b5;
                i8++;
                zzj = i9;
                while (zzj < i6) {
                    byte b6 = bArr[zzj];
                    if (zznv.zzd(b6)) {
                        zzj++;
                        cArr[i8] = (char) b6;
                        i8++;
                    }
                }
            } else if (b5 < -32) {
                if (i9 >= i6) {
                    throw zzll.zzc();
                }
                zzj += 2;
                zznv.zzc(b5, bArr[i9], cArr, i8);
                i8++;
            } else if (b5 < -16) {
                if (i9 >= i6 - 1) {
                    throw zzll.zzc();
                }
                int i10 = zzj + 2;
                zzj += 3;
                zznv.zzb(b5, bArr[i9], bArr[i10], cArr, i8);
                i8++;
            } else {
                if (i9 >= i6 - 2) {
                    throw zzll.zzc();
                }
                byte b7 = bArr[i9];
                int i11 = zzj + 3;
                byte b8 = bArr[zzj + 2];
                zzj += 4;
                zznv.zza(b5, b7, b8, bArr[i11], cArr, i8);
                i8 += 2;
            }
        }
        zzjnVar.zzc = new String(cArr, 0, i8);
        return i6;
    }

    public static int zzi(int i, byte[] bArr, int i4, int i5, zznl zznlVar, zzjn zzjnVar) throws zzll {
        if ((i >>> 3) == 0) {
            throw zzll.zzb();
        }
        int i6 = i & 7;
        if (i6 == 0) {
            int zzm = zzm(bArr, i4, zzjnVar);
            zznlVar.zzj(i, Long.valueOf(zzjnVar.zzb));
            return zzm;
        }
        if (i6 == 1) {
            zznlVar.zzj(i, Long.valueOf(zzp(bArr, i4)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int zzj = zzj(bArr, i4, zzjnVar);
            int i7 = zzjnVar.zza;
            if (i7 < 0) {
                throw zzll.zzd();
            }
            if (i7 > bArr.length - zzj) {
                throw zzll.zzf();
            }
            if (i7 == 0) {
                zznlVar.zzj(i, zzka.zzb);
            } else {
                zznlVar.zzj(i, zzka.zzl(bArr, zzj, i7));
            }
            return zzj + i7;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw zzll.zzb();
            }
            zznlVar.zzj(i, Integer.valueOf(zzb(bArr, i4)));
            return i4 + 4;
        }
        int i8 = (i & (-8)) | 4;
        zznl zzf = zznl.zzf();
        int i9 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int zzj2 = zzj(bArr, i4, zzjnVar);
            i9 = zzjnVar.zza;
            if (i9 == i8) {
                i4 = zzj2;
                break;
            }
            i4 = zzi(i9, bArr, zzj2, i5, zzf, zzjnVar);
        }
        if (i4 > i5 || i9 != i8) {
            throw zzll.zze();
        }
        zznlVar.zzj(i, zzf);
        return i4;
    }

    public static int zzj(byte[] bArr, int i, zzjn zzjnVar) {
        int i4 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return zzk(b4, bArr, i4, zzjnVar);
        }
        zzjnVar.zza = b4;
        return i4;
    }

    public static int zzk(int i, byte[] bArr, int i4, zzjn zzjnVar) {
        byte b4 = bArr[i4];
        int i5 = i4 + 1;
        int i6 = i & WorkQueueKt.MASK;
        if (b4 >= 0) {
            zzjnVar.zza = i6 | (b4 << 7);
            return i5;
        }
        int i7 = i6 | ((b4 & ByteCompanionObject.MAX_VALUE) << 7);
        int i8 = i4 + 2;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            zzjnVar.zza = i7 | (b5 << 14);
            return i8;
        }
        int i9 = i7 | ((b5 & ByteCompanionObject.MAX_VALUE) << 14);
        int i10 = i4 + 3;
        byte b6 = bArr[i8];
        if (b6 >= 0) {
            zzjnVar.zza = i9 | (b6 << 21);
            return i10;
        }
        int i11 = i9 | ((b6 & ByteCompanionObject.MAX_VALUE) << 21);
        int i12 = i4 + 4;
        byte b7 = bArr[i10];
        if (b7 >= 0) {
            zzjnVar.zza = i11 | (b7 << 28);
            return i12;
        }
        int i13 = i11 | ((b7 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                zzjnVar.zza = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    public static int zzl(int i, byte[] bArr, int i4, int i5, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i4, zzjnVar);
        zzlcVar.zzh(zzjnVar.zza);
        while (zzj < i5) {
            int zzj2 = zzj(bArr, zzj, zzjnVar);
            if (i != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzjn zzjnVar) {
        long j4 = bArr[i];
        int i4 = i + 1;
        if (j4 >= 0) {
            zzjnVar.zzb = j4;
            return i4;
        }
        int i5 = i + 2;
        byte b4 = bArr[i4];
        long j5 = (j4 & 127) | ((b4 & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = 7;
        while (b4 < 0) {
            int i7 = i5 + 1;
            i6 += 7;
            j5 |= (r10 & ByteCompanionObject.MAX_VALUE) << i6;
            b4 = bArr[i5];
            i5 = i7;
        }
        zzjnVar.zzb = j5;
        return i5;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i, int i4, int i5, zzjn zzjnVar) throws IOException {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i, i4, i5, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i, int i4, zzjn zzjnVar) throws IOException {
        int i5 = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            i5 = zzk(i6, bArr, i5, zzjnVar);
            i6 = zzjnVar.zza;
        }
        int i7 = i5;
        if (i6 < 0 || i6 > i4 - i7) {
            throw zzll.zzf();
        }
        int i8 = i7 + i6;
        zzmtVar.zzh(obj, bArr, i7, i8, zzjnVar);
        zzjnVar.zzc = obj;
        return i8;
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
