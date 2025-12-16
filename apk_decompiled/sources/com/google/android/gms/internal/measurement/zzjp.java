package com.google.android.gms.internal.measurement;

import C.w;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzjp extends zzjl implements RandomAccess, zzli, zzmp {
    private static final zzjp zza = new zzjp(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    public zzjp() {
        this(new boolean[10], 0, true);
    }

    private final String zzf(int i) {
        return w.k("Index:", i, this.zzc, ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbW();
        if (i >= 0 && i <= (i4 = this.zzc)) {
            boolean[] zArr = this.zzb;
            if (i4 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i4 - i);
            } else {
                boolean[] zArr2 = new boolean[((i4 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.zzb, i, zArr2, i + 1, this.zzc - i);
                this.zzb = zArr2;
            }
            this.zzb[i] = booleanValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzjp)) {
            return super.addAll(collection);
        }
        zzjp zzjpVar = (zzjp) collection;
        int i = zzjpVar.zzc;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzc;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i;
        boolean[] zArr = this.zzb;
        if (i5 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i5);
        }
        System.arraycopy(zzjpVar.zzb, 0, this.zzb, this.zzc, zzjpVar.zzc);
        this.zzc = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjp)) {
            return super.equals(obj);
        }
        zzjp zzjpVar = (zzjp) obj;
        if (this.zzc != zzjpVar.zzc) {
            return false;
        }
        boolean[] zArr = zzjpVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Boolean.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            i = (i * 31) + zzlj.zza(this.zzb[i4]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.zzc;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zzb[i4] == booleanValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbW();
        zzg(i);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zzbW();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i4, zArr, i, this.zzc - i4);
        this.zzc -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbW();
        zzg(i);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i >= this.zzc) {
            return new zzjp(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z3) {
        zzbW();
        int i = this.zzc;
        boolean[] zArr = this.zzb;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        zArr3[i4] = z3;
    }

    private zzjp(boolean[] zArr, int i, boolean z3) {
        super(z3);
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
