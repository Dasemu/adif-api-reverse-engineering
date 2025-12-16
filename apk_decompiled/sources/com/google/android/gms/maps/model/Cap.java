package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.measurement.internal.a;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    public Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public String toString() {
        return a.m(new StringBuilder("[Cap: type="), this.zzb, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i4 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i4);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Cap zza() {
        int i = this.zzb;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            Preconditions.checkState(this.zzc != null, "bitmapDescriptor must not be null");
            Preconditions.checkState(this.zzd != null, "bitmapRefWidth must not be null");
            return new CustomCap(this.zzc, this.zzd.floatValue());
        }
        Log.w(zza, "Unknown Cap type: " + i);
        return this;
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) Float f2) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f2);
    }

    private Cap(int i, BitmapDescriptor bitmapDescriptor, Float f2) {
        boolean z3 = f2 != null && f2.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (i == 3) {
            r0 = bitmapDescriptor != null && z3;
            i = 3;
        }
        Preconditions.checkArgument(r0, "Invalid Cap: type=" + i + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f2);
        this.zzb = i;
        this.zzc = bitmapDescriptor;
        this.zzd = f2;
    }

    public Cap(BitmapDescriptor bitmapDescriptor, float f2) {
        this(3, bitmapDescriptor, Float.valueOf(f2));
    }
}
