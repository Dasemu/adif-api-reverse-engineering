package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzu();

    @SafeParcelable.Field(id = 4)
    public final float bearing;

    @SafeParcelable.Field(id = 3)
    public final float tilt;

    @SafeParcelable.Field(id = 2)
    public final float zoom;
    private final StreetViewPanoramaOrientation zza;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder bearing(float f2) {
            this.bearing = f2;
            return this;
        }

        public StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        public Builder orientation(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, "orientation must not be null.");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public Builder tilt(float f2) {
            this.tilt = f2;
            return this;
        }

        public Builder zoom(float f2) {
            this.zoom = f2;
            return this;
        }

        public Builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera must not be null.");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(id = 2) float f2, @SafeParcelable.Param(id = 3) float f4, @SafeParcelable.Param(id = 4) float f5) {
        boolean z3 = false;
        if (f4 >= -90.0f && f4 <= 90.0f) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "Tilt needs to be between -90 and 90 inclusive: " + f4);
        this.zoom = ((double) f2) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0.0f : f2;
        this.tilt = BitmapDescriptorFactory.HUE_RED + f4;
        this.bearing = (((double) f5) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (f5 % 360.0f) + 360.0f : f5) % 360.0f;
        StreetViewPanoramaOrientation.Builder builder = new StreetViewPanoramaOrientation.Builder();
        builder.tilt(f4);
        builder.bearing(f5);
        this.zza = builder.build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        float f2 = this.zoom;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f2);
        SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static Builder builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }
}
