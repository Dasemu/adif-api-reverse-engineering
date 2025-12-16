package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzim zzb;

    public zzhc(Context context, zzim zzimVar) {
        this.zza = context;
        this.zzb = zzimVar;
    }

    public final boolean equals(Object obj) {
        zzim zzimVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza()) && ((zzimVar = this.zzb) != null ? zzimVar.equals(zzhzVar.zzb()) : zzhzVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzim zzimVar = this.zzb;
        return (zzimVar == null ? 0 : zzimVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final zzim zzb() {
        return this.zzb;
    }
}
