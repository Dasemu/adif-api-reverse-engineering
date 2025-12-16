package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TileCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new zzae();

    @SafeParcelable.Field(id = 4)
    public final byte[] data;

    @SafeParcelable.Field(id = 3)
    public final int height;

    @SafeParcelable.Field(id = 2)
    public final int width;

    @SafeParcelable.Constructor
    public Tile(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.width = i;
        this.height = i4;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i4 = this.width;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i4);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
