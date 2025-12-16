package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "StampStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getWrappedStampBinder", id = 2, type = "android.os.IBinder")
    protected final BitmapDescriptor zza;

    /* loaded from: classes3.dex */
    public static abstract class Builder<T extends Builder<T>> {
        BitmapDescriptor zza;

        public abstract T self();

        public T stamp(BitmapDescriptor bitmapDescriptor) {
            this.zza = bitmapDescriptor;
            return self();
        }
    }

    @SafeParcelable.Constructor
    public StampStyle(@SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
    }

    public BitmapDescriptor getStamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BitmapDescriptor bitmapDescriptor = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StampStyle(BitmapDescriptor bitmapDescriptor) {
        this.zza = bitmapDescriptor;
    }
}
