package com.google.android.gms.internal.maps;

import C.w;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbe extends zzba {
    final transient Object zza;

    public zzbe(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.maps.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbb(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return w.o("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw
    /* renamed from: zzd */
    public final zzbf iterator() {
        return new zzbb(this.zza);
    }
}
