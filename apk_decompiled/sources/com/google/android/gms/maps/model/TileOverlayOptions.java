package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzah();

    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzap zza;
    private TileProvider zzb;

    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
    }

    public TileOverlayOptions fadeIn(boolean z3) {
        this.zze = z3;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzag(this, tileProvider);
        return this;
    }

    public TileOverlayOptions transparency(float f2) {
        boolean z3 = false;
        if (f2 >= BitmapDescriptorFactory.HUE_RED && f2 <= 1.0f) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "Transparency must be in the range [0..1]");
        this.zzf = f2;
        return this;
    }

    public TileOverlayOptions visible(boolean z3) {
        this.zzc = z3;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzap zzapVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f2) {
        this.zzd = f2;
        return this;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) float f2, @SafeParcelable.Param(id = 5) boolean z4, @SafeParcelable.Param(id = 6) float f4) {
        this.zzc = true;
        this.zze = true;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
        zzap zzc = zzao.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzaf(this);
        this.zzc = z3;
        this.zzd = f2;
        this.zze = z4;
        this.zzf = f4;
    }
}
