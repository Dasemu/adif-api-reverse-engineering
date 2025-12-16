package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzx();

    @SafeParcelable.Field(id = 3)
    public final float bearing;

    @SafeParcelable.Field(id = 2)
    public final float tilt;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder bearing(float f2) {
            this.bearing = f2;
            return this;
        }

        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public Builder tilt(float f2) {
            this.tilt = f2;
            return this;
        }

        public Builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation must not be null.");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(id = 2) float f2, @SafeParcelable.Param(id = 3) float f4) {
        boolean z3 = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.tilt = f2 + BitmapDescriptorFactory.HUE_RED;
        this.bearing = (((double) f4) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        float f2 = this.tilt;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f2);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static Builder builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }
}
