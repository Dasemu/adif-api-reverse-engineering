package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i4 = 0;
        int i5 = 0;
        Long l4 = null;
        Long l5 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                i4 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 3) {
                l4 = SafeParcelReader.readLongObject(parcel, readHeader);
            } else if (fieldId == 4) {
                l5 = SafeParcelReader.readLongObject(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i5 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ModuleInstallStatusUpdate(i, i4, l4, l5, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
