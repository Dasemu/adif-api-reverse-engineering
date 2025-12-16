package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        int i = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 102;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 2:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, readHeader, WorkSource.CREATOR);
                    break;
                case 7:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CurrentLocationRequest(j4, i, i5, j5, z3, i4, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
