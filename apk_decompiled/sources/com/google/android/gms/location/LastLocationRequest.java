package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzdj;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.dataflow.qual.Pure;
import u.AbstractC0629f;

@SafeParcelable.Class(creator = "LastLocationRequestCreator")
/* loaded from: classes3.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzv();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getModuleId", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getImpersonation", id = 5)
    private final com.google.android.gms.internal.location.zzd zze;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;
        private String zzd;
        private com.google.android.gms.internal.location.zzd zze;

        public Builder() {
            this.zza = LongCompanionObject.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
            this.zze = null;
        }

        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j4) {
            Preconditions.checkArgument(j4 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j4;
            return this;
        }

        public Builder(LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zzc();
            this.zzd = lastLocationRequest.zzb();
            this.zze = lastLocationRequest.zza();
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j4, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = j4;
        this.zzb = i;
        this.zzc = z3;
        this.zzd = str;
        this.zze = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd) && Objects.equal(this.zze, lastLocationRequest.zze);
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public String toString() {
        StringBuilder a2 = AbstractC0629f.a("LastLocationRequest[");
        if (this.zza != LongCompanionObject.MAX_VALUE) {
            a2.append("maxAge=");
            zzdj.zzb(this.zza, a2);
        }
        if (this.zzb != 0) {
            a2.append(", ");
            a2.append(zzo.zzb(this.zzb));
        }
        if (this.zzc) {
            a2.append(", bypass");
        }
        if (this.zzd != null) {
            a2.append(", moduleId=");
            a2.append(this.zzd);
        }
        if (this.zze != null) {
            a2.append(", impersonation=");
            a2.append(this.zze);
        }
        a2.append(']');
        return a2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final com.google.android.gms.internal.location.zzd zza() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public final String zzb() {
        return this.zzd;
    }

    @Pure
    public final boolean zzc() {
        return this.zzc;
    }
}
