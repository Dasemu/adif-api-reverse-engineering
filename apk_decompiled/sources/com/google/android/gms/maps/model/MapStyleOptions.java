package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzk();
    private static final String zza = "MapStyleOptions";

    @SafeParcelable.Field(getter = "getJson", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(id = 2) String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e4) {
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + e4.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
