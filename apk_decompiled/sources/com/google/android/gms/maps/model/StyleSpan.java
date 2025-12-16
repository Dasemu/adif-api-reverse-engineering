package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzab();

    @SafeParcelable.Field(getter = "getStyle", id = 2)
    private final StrokeStyle zza;

    @SafeParcelable.Field(getter = "getSegments", id = 3)
    private final double zzb;

    public StyleSpan(int i) {
        this.zza = StrokeStyle.colorBuilder(i).build();
        this.zzb = 1.0d;
    }

    public double getSegments() {
        return this.zzb;
    }

    public StrokeStyle getStyle() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StyleSpan(int i, double d4) {
        if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.zza = StrokeStyle.colorBuilder(i).build();
            this.zzb = d4;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public StyleSpan(StrokeStyle strokeStyle) {
        this.zza = strokeStyle;
        this.zzb = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@SafeParcelable.Param(id = 2) StrokeStyle strokeStyle, @SafeParcelable.Param(id = 3) double d4) {
        if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.zza = strokeStyle;
            this.zzb = d4;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }
}
