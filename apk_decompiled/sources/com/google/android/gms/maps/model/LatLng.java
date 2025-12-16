package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LatLngCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<LatLng> CREATOR = new zzj();

    @SafeParcelable.Field(id = 2)
    public final double latitude;

    @SafeParcelable.Field(id = 3)
    public final double longitude;

    @SafeParcelable.Constructor
    public LatLng(@SafeParcelable.Param(id = 2) double d4, @SafeParcelable.Param(id = 3) double d5) {
        if (d5 < -180.0d || d5 >= 180.0d) {
            this.longitude = ((((d5 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.longitude = d5;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long j4 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((((int) j4) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        double d4 = this.latitude;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, d4);
        SafeParcelWriter.writeDouble(parcel, 3, this.longitude);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
