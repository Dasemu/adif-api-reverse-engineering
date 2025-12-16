package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.test.TestBuildersKt;
import org.checkerframework.dataflow.qual.Pure;
import u.AbstractC0629f;

@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int zzf;

    @SafeParcelable.Field(getter = "getModuleId", id = 8)
    private final String zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzh;

    @SafeParcelable.Field(getter = "getImpersonation", id = 9)
    private final com.google.android.gms.internal.location.zzd zzi;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private int zzf;
        private String zzg;
        private WorkSource zzh;
        private com.google.android.gms.internal.location.zzd zzi;

        public Builder() {
            this.zza = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = LongCompanionObject.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
        }

        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, new WorkSource(this.zzh), this.zzi);
        }

        public Builder setDurationMillis(long j4) {
            Preconditions.checkArgument(j4 > 0, "durationMillis must be greater than 0");
            this.zzd = j4;
            return this;
        }

        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j4;
            return this;
        }

        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zzc = i;
            return this;
        }

        public Builder(CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zze();
            this.zzf = currentLocationRequest.zza();
            this.zzg = currentLocationRequest.zzd();
            this.zzh = new WorkSource(currentLocationRequest.zzb());
            this.zzi = currentLocationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    public CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j4, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) long j5, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) String str, @SafeParcelable.Param(id = 6) WorkSource workSource, @SafeParcelable.Param(id = 9) com.google.android.gms.internal.location.zzd zzdVar) {
        boolean z4 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        this.zza = j4;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = j5;
        this.zze = z3;
        this.zzf = i5;
        this.zzg = str;
        this.zzh = workSource;
        this.zzi = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && Objects.equal(this.zzg, currentLocationRequest.zzg) && Objects.equal(this.zzh, currentLocationRequest.zzh) && Objects.equal(this.zzi, currentLocationRequest.zzi);
    }

    @Pure
    public long getDurationMillis() {
        return this.zzd;
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    @Pure
    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public String toString() {
        StringBuilder a2 = AbstractC0629f.a("CurrentLocationRequest[");
        a2.append(zzae.zzb(this.zzc));
        if (this.zza != LongCompanionObject.MAX_VALUE) {
            a2.append(", maxAge=");
            zzdj.zzb(this.zza, a2);
        }
        if (this.zzd != LongCompanionObject.MAX_VALUE) {
            a2.append(", duration=");
            a2.append(this.zzd);
            a2.append("ms");
        }
        if (this.zzb != 0) {
            a2.append(", ");
            a2.append(zzo.zzb(this.zzb));
        }
        if (this.zze) {
            a2.append(", bypass");
        }
        if (this.zzf != 0) {
            a2.append(", ");
            a2.append(zzai.zza(this.zzf));
        }
        if (this.zzg != null) {
            a2.append(", moduleId=");
            a2.append(this.zzg);
        }
        if (!WorkSourceUtil.isEmpty(this.zzh)) {
            a2.append(", workSource=");
            a2.append(this.zzh);
        }
        if (this.zzi != null) {
            a2.append(", impersonation=");
            a2.append(this.zzi);
        }
        a2.append(']');
        return a2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzh, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzf;
    }

    @Pure
    public final WorkSource zzb() {
        return this.zzh;
    }

    @Pure
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzi;
    }

    @Deprecated
    @Pure
    public final String zzd() {
        return this.zzg;
    }

    @Pure
    public final boolean zze() {
        return this.zze;
    }
}
