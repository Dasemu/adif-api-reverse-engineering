package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z3 = false;
        boolean z4 = false;
        float f2 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 4:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 5:
                    f4 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, readHeader, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    f6 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 9:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    f7 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 11:
                    f8 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 12:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 13:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GroundOverlayOptions(iBinder, latLng, f2, f4, latLngBounds, f5, f6, z3, f7, f8, f9, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
