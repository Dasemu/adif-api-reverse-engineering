package com.adif.elcanomovil.uiStations.entities;

import android.content.Context;
import android.graphics.Bitmap;
import com.adif.elcanomovil.resources.ResourcesUtils;
import com.adif.elcanomovil.uiStations.R;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/uiStations/entities/StationMarker;", "", "latitude", "", "longitude", "icon", "", "(DDI)V", "getLatitude", "()D", "getLongitude", "markerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "context", "Landroid/content/Context;", "ui-stations_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationMarker.kt\ncom/adif/elcanomovil/uiStations/entities/StationMarker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/* loaded from: classes2.dex */
public final class StationMarker {
    private final int icon;
    private final double latitude;
    private final double longitude;

    public StationMarker(double d4, double d5, int i) {
        this.latitude = d4;
        this.longitude = d5;
        this.icon = i;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final BitmapDescriptor markerIcon(Context context) {
        BitmapDescriptor fromBitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Bitmap vectorToBitmap = ResourcesUtils.INSTANCE.vectorToBitmap(context, this.icon);
        if (vectorToBitmap == null || (fromBitmap = BitmapDescriptorFactory.fromBitmap(vectorToBitmap)) == null) {
            return null;
        }
        return fromBitmap;
    }

    public /* synthetic */ StationMarker(double d4, double d5, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(d4, d5, (i4 & 4) != 0 ? R.drawable.ic_marker_selected : i);
    }
}
