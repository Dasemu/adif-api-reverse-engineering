package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i = 0;
        short s4 = 0;
        int i4 = 0;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f2 = 0.0f;
        long j4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s4 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d4 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d5 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzdh(str, i, s4, d4, d5, f2, j4, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdh[i];
    }
}
