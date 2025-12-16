package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                z3 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 3) {
                z4 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 4) {
                iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z5 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzo(str, z3, z4, iBinder, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
