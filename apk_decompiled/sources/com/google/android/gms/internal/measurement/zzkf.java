package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.KotlinVersion;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzkf(byte[] bArr, int i, int i4) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b4) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i, int i4) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i4);
            this.zze += i4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i4)), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i, boolean z3) throws IOException {
        zzq(i << 3);
        zzb(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i, zzka zzkaVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i, int i4) throws IOException {
        zzq((i << 3) | 5);
        zzg(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i4 = this.zze;
            int i5 = i4 + 1;
            this.zze = i5;
            bArr[i4] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i4 + 2;
            this.zze = i6;
            bArr[i5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i4 + 3;
            this.zze = i7;
            bArr[i6] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zze = i4 + 4;
            bArr[i7] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i, long j4) throws IOException {
        zzq((i << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j4) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i4 = i + 1;
            this.zze = i4;
            bArr[i] = (byte) (((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 2;
            this.zze = i5;
            bArr[i4] = (byte) (((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 3;
            this.zze = i6;
            bArr[i5] = (byte) (((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 4;
            this.zze = i7;
            bArr[i6] = (byte) (((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 5;
            this.zze = i8;
            bArr[i7] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i9 = i + 6;
            this.zze = i9;
            bArr[i8] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i10 = i + 7;
            this.zze = i10;
            bArr[i9] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zze = i + 8;
            bArr[i10] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i, int i4) throws IOException {
        zzq(i << 3);
        zzk(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i, int i4) throws IOException {
        zzc(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zze;
        try {
            int zzx = zzki.zzx(str.length() * 3);
            int zzx2 = zzki.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i4 = this.zze;
                this.zze = zznz.zzb(str, bArr, i4, this.zzd - i4);
                return;
            }
            int i5 = i + zzx2;
            this.zze = i5;
            int zzb = zznz.zzb(str, this.zzc, i5, this.zzd - i5);
            this.zze = i;
            zzq((zzb - i) - zzx2);
            this.zze = zzb;
        } catch (zzny e4) {
            this.zze = i;
            zzB(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzkg(e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i, int i4) throws IOException {
        zzq((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i, int i4) throws IOException {
        zzq(i << 3);
        zzq(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i4 = this.zze;
                this.zze = i4 + 1;
                bArr[i4] = (byte) ((i & WorkQueueKt.MASK) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }
        byte[] bArr2 = this.zzc;
        int i5 = this.zze;
        this.zze = i5 + 1;
        bArr2[i5] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i, long j4) throws IOException {
        zzq(i << 3);
        zzs(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j4) throws IOException {
        boolean z3;
        z3 = zzki.zzd;
        if (z3 && this.zzd - this.zze >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i = this.zze;
                this.zze = i + 1;
                zznu.zzn(bArr, i, (byte) ((((int) j4) & WorkQueueKt.MASK) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i4 = this.zze;
            this.zze = i4 + 1;
            zznu.zzn(bArr2, i4, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i5 = this.zze;
                this.zze = i5 + 1;
                bArr3[i5] = (byte) ((((int) j4) & WorkQueueKt.MASK) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e4);
            }
        }
        byte[] bArr4 = this.zzc;
        int i6 = this.zze;
        this.zze = i6 + 1;
        bArr4[i6] = (byte) j4;
    }
}
