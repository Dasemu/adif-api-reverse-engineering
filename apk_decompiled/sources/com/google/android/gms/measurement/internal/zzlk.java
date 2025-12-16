package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes3.dex */
public final class zzlk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlk> CREATOR = new zzll();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final long zzc;

    @SafeParcelable.Field(id = 4)
    public final Long zzd;

    @SafeParcelable.Field(id = 6)
    public final String zze;

    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @SafeParcelable.Field(id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzlk(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 4) Long l4, @SafeParcelable.Param(id = 5) Float f2, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d4) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j4;
        this.zzd = l4;
        if (i == 1) {
            this.zzg = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.zzg = d4;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzll.zza(this, parcel, i);
    }

    public final Object zza() {
        Long l4 = this.zzd;
        if (l4 != null) {
            return l4;
        }
        Double d4 = this.zzg;
        if (d4 != null) {
            return d4;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzlk(zzlm zzlmVar) {
        this(zzlmVar.zzc, zzlmVar.zzd, zzlmVar.zze, zzlmVar.zzb);
    }

    public zzlk(String str, long j4, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j4;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
