package com.google.android.gms.internal.measurement;

import C.w;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzka implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzka zzb = new zzjx(zzlj.zzd);
    private static final zzjz zzd;
    private int zzc = 0;

    static {
        int i = zzjm.zza;
        zzd = new zzjz(null);
        zza = new zzjs();
    }

    public static int zzj(int i, int i4, int i5) {
        int i6 = i4 - i;
        if ((i | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(w.i(i, "Beginning index: ", " < 0"));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(w.k("Beginning index larger than ending index: ", i, i4, ", "));
        }
        throw new IndexOutOfBoundsException(w.k("End index: ", i4, i5, " >= "));
    }

    public static zzka zzl(byte[] bArr, int i, int i4) {
        zzj(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new zzjx(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzjr(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzni.zza(this) : zzni.zza(zzf(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return w.r(sb, zza2, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i4, int i5);

    public abstract zzka zzf(int i, int i4);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzjq zzjqVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
