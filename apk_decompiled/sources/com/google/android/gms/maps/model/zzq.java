package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = new ArrayList();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        ArrayList arrayList2 = null;
        int i = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i5 = 0;
        float f4 = 0.0f;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.readList(parcel, readHeader, arrayList, zzq.class.getClassLoader());
                    break;
                case 4:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 5:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f4 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PolygonOptions(arrayList3, arrayList, f2, i, i4, f4, z3, z4, z5, i5, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
