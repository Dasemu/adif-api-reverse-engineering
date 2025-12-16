package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzaa();

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final float zza;

    @SafeParcelable.Field(getter = "getColor", id = 3)
    private final int zzb;

    @SafeParcelable.Field(getter = "getToColor", id = 4)
    private final int zzc;

    @SafeParcelable.Field(getter = "isVisible", id = 5)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getStamp", id = 6)
    private final StampStyle zze;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private float zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        private StampStyle zze;

        private Builder() {
        }

        public StrokeStyle build() {
            return new StrokeStyle(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder stamp(StampStyle stampStyle) {
            this.zze = stampStyle;
            return this;
        }

        public final Builder zza(int i) {
            this.zzb = i;
            this.zzc = i;
            return this;
        }

        public final Builder zzb(int i, int i4) {
            this.zzb = i;
            this.zzc = i4;
            return this;
        }

        public final Builder zzc(boolean z3) {
            this.zzd = z3;
            return this;
        }

        public final Builder zzd(float f2) {
            this.zza = f2;
            return this;
        }

        public /* synthetic */ Builder(zzz zzzVar) {
        }

        public Builder(StrokeStyle strokeStyle) {
            this.zza = strokeStyle.zza();
            Pair zzb = strokeStyle.zzb();
            this.zzb = ((Integer) zzb.first).intValue();
            this.zzc = ((Integer) zzb.second).intValue();
            this.zzd = strokeStyle.isVisible();
            this.zze = strokeStyle.getStamp();
        }
    }

    @SafeParcelable.Constructor
    public StrokeStyle(@SafeParcelable.Param(id = 2) float f2, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) StampStyle stampStyle) {
        this.zza = f2;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = z3;
        this.zze = stampStyle;
    }

    public static Builder colorBuilder(int i) {
        Builder builder = new Builder((zzz) null);
        builder.zza(i);
        return builder;
    }

    public static Builder gradientBuilder(int i, int i4) {
        Builder builder = new Builder((zzz) null);
        builder.zzb(i, i4);
        return builder;
    }

    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzz) null);
        builder.zza(0);
        return builder;
    }

    public StampStyle getStamp() {
        return this.zze;
    }

    public boolean isVisible() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zza;
    }

    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }
}
