package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.internal.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb >= this.zza.zzc()) {
            throw new NoSuchElementException(a.l(this.zzb, "Out of bounds index: "));
        }
        zzae zzaeVar = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return zzaeVar.zze(i);
    }
}
