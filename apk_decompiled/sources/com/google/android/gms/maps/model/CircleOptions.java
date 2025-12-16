package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng zza;

    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zze = 0;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    public CircleOptions center(LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z3) {
        this.zzh = z3;
        return this;
    }

    public CircleOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    public CircleOptions radius(double d4) {
        this.zzb = d4;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    public CircleOptions strokeWidth(float f2) {
        this.zzc = f2;
        return this;
    }

    public CircleOptions visible(boolean z3) {
        this.zzg = z3;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CircleOptions zIndex(float f2) {
        this.zzf = f2;
        return this;
    }

    @SafeParcelable.Constructor
    public CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d4, @SafeParcelable.Param(id = 4) float f2, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) float f4, @SafeParcelable.Param(id = 8) boolean z3, @SafeParcelable.Param(id = 9) boolean z4, @SafeParcelable.Param(id = 10) List list) {
        this.zza = latLng;
        this.zzb = d4;
        this.zzc = f2;
        this.zzd = i;
        this.zze = i4;
        this.zzf = f4;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = list;
    }
}
