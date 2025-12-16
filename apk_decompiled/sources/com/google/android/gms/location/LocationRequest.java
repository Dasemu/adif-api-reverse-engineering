package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.dataflow.qual.Pure;
import u.AbstractC0629f;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @SafeParcelable.Field(getter = "getModuleId", id = 14)
    private final String zzl;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzn;

    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zzd zzo;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j4) {
        return j4 == LongCompanionObject.MAX_VALUE ? "∞" : zzdj.zza(j4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.zze;
        long j5 = elapsedRealtime + j4;
        return ((elapsedRealtime ^ j5) & (j4 ^ j5)) < 0 ? LongCompanionObject.MAX_VALUE : j5;
    }

    @Deprecated
    @Pure
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @Pure
    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    @Pure
    public long getInterval() {
        return getIntervalMillis();
    }

    @Pure
    public long getIntervalMillis() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @Pure
    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @Pure
    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    @Pure
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Pure
    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @Pure
    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    @Pure
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    @Pure
    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    @Pure
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    @Pure
    public boolean isBatched() {
        long j4 = this.zzd;
        return j4 > 0 && (j4 >> 1) >= this.zzb;
    }

    @Deprecated
    @Pure
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @Pure
    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j4) {
        Preconditions.checkArgument(j4 > 0, "durationMillis must be greater than 0");
        this.zze = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j4) {
        this.zze = Math.max(1L, j4 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j4) {
        Preconditions.checkArgument(j4 >= 0, "illegal fastest interval: %d", Long.valueOf(j4));
        this.zzc = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j4) {
        Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
        long j5 = this.zzc;
        long j6 = this.zzb;
        if (j5 == j6 / 6) {
            this.zzc = j4 / 6;
        }
        if (this.zzi == j6) {
            this.zzi = j4;
        }
        this.zzb = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j4) {
        Preconditions.checkArgument(j4 >= 0, "illegal max wait time: %d", Long.valueOf(j4));
        this.zzd = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.l(i, "invalid numUpdates: "));
        }
        this.zzf = i;
        return this;
    }

    @Deprecated
    public LocationRequest setPriority(int i) {
        zzae.zza(i);
        this.zza = i;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f2) {
        if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            this.zzg = f2;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f2);
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z3) {
        this.zzh = z3;
        return this;
    }

    public String toString() {
        StringBuilder a2 = AbstractC0629f.a("Request[");
        if (isPassive()) {
            a2.append(zzae.zzb(this.zza));
        } else {
            a2.append("@");
            if (isBatched()) {
                zzdj.zzb(this.zzb, a2);
                a2.append(RemoteSettings.FORWARD_SLASH_STRING);
                zzdj.zzb(this.zzd, a2);
            } else {
                zzdj.zzb(this.zzb, a2);
            }
            a2.append(" ");
            a2.append(zzae.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            a2.append(", minUpdateInterval=");
            a2.append(zzf(this.zzc));
        }
        if (this.zzg > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            a2.append(", minUpdateDistance=");
            a2.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != LongCompanionObject.MAX_VALUE) {
            a2.append(", maxUpdateAge=");
            a2.append(zzf(this.zzi));
        }
        if (this.zze != LongCompanionObject.MAX_VALUE) {
            a2.append(", duration=");
            zzdj.zzb(this.zze, a2);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            a2.append(", maxUpdates=");
            a2.append(this.zzf);
        }
        if (this.zzk != 0) {
            a2.append(", ");
            a2.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            a2.append(", ");
            a2.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            a2.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            a2.append(", bypass");
        }
        if (this.zzl != null) {
            a2.append(", moduleId=");
            a2.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            a2.append(", ");
            a2.append(this.zzn);
        }
        if (this.zzo != null) {
            a2.append(", impersonation=");
            a2.append(this.zzo);
        }
        a2.append(']');
        return a2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzk;
    }

    @Pure
    public final WorkSource zzb() {
        return this.zzn;
    }

    @Pure
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzo;
    }

    @Deprecated
    @Pure
    public final String zzd() {
        return this.zzl;
    }

    @Pure
    public final boolean zze() {
        return this.zzm;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private String zzl;
        private boolean zzm;
        private WorkSource zzn;
        private com.google.android.gms.internal.location.zzd zzo;

        public Builder(int i, long j4) {
            Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i);
            this.zza = i;
            this.zzb = j4;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = LongCompanionObject.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = BitmapDescriptorFactory.HUE_RED;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public LocationRequest build() {
            int i = this.zza;
            long j4 = this.zzb;
            long j5 = this.zzc;
            if (j5 == -1) {
                j5 = j4;
            } else if (i != 105) {
                j5 = Math.min(j5, j4);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j6 = j5;
            long j7 = this.zze;
            int i4 = this.zzf;
            float f2 = this.zzg;
            boolean z3 = this.zzh;
            long j8 = this.zzi;
            if (j8 == -1) {
                j8 = this.zzb;
            }
            return new LocationRequest(i, j4, j6, max, LongCompanionObject.MAX_VALUE, j7, i4, f2, z3, j8, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        public Builder setDurationMillis(long j4) {
            Preconditions.checkArgument(j4 > 0, "durationMillis must be greater than 0");
            this.zze = j4;
            return this;
        }

        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzj = i;
            return this;
        }

        public Builder setIntervalMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j4;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j4) {
            boolean z3 = true;
            if (j4 != -1 && j4 < 0) {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j4;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j4;
            return this;
        }

        public Builder setMaxUpdates(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.zzf = i;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f2) {
            Preconditions.checkArgument(f2 >= BitmapDescriptorFactory.HUE_RED, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f2;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j4) {
            boolean z3 = true;
            if (j4 != -1 && j4 < 0) {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j4;
            return this;
        }

        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zza = i;
            return this;
        }

        public Builder setWaitForAccurateLocation(boolean z3) {
            this.zzh = z3;
            return this;
        }

        public final Builder zza(boolean z3) {
            this.zzm = z3;
            return this;
        }

        @Deprecated
        public final Builder zzb(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        public final Builder zzc(int i) {
            int i4;
            boolean z3 = true;
            if (i != 0 && i != 1) {
                i4 = 2;
                if (i == 2) {
                    i = 2;
                    Preconditions.checkArgument(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                    this.zzk = i4;
                    return this;
                }
                z3 = false;
            }
            i4 = i;
            Preconditions.checkArgument(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.zzk = i4;
            return this;
        }

        public final Builder zzd(WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }

        public Builder(long j4) {
            Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j4;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = LongCompanionObject.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = BitmapDescriptorFactory.HUE_RED;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 3) long j5, @SafeParcelable.Param(id = 8) long j6, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j7, @SafeParcelable.Param(id = 10) long j8, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 11) long j9, @SafeParcelable.Param(id = 12) int i5, @SafeParcelable.Param(id = 13) int i6, @SafeParcelable.Param(id = 14) String str, @SafeParcelable.Param(id = 15) boolean z4, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = i;
        this.zzb = j4;
        this.zzc = j5;
        this.zzd = j6;
        this.zze = j7 == LongCompanionObject.MAX_VALUE ? j8 : Math.min(Math.max(1L, j7 - SystemClock.elapsedRealtime()), j8);
        this.zzf = i4;
        this.zzg = f2;
        this.zzh = z3;
        this.zzi = j9 != -1 ? j9 : j4;
        this.zzj = i5;
        this.zzk = i6;
        this.zzl = str;
        this.zzm = z4;
        this.zzn = workSource;
        this.zzo = zzdVar;
    }
}
