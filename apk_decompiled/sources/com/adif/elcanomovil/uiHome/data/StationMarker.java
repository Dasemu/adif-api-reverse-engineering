package com.adif.elcanomovil.uiHome.data;

import D.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.adif.elcanomovil.resources.ResourcesUtils;
import com.adif.elcanomovil.uiHome.R;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J5\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\b\u0010$\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020*HÖ\u0001J\u000e\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/adif/elcanomovil/uiHome/data/StationMarker;", "", "marker", "Lcom/google/android/gms/maps/model/Marker;", "station", "Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", FirebaseAnalytics.Param.LOCATION, "Lcom/google/android/gms/maps/model/LatLng;", "isSelected", "", "(Lcom/google/android/gms/maps/model/Marker;Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;Lcom/google/android/gms/maps/model/LatLng;Z)V", "icon", "", "getIcon", "()I", "()Z", "setSelected", "(Z)V", "getLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "getStation", "()Lcom/adif/elcanomovil/commonViews/data/StationViewEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "iconForStationType", "markerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "context", "Landroid/content/Context;", "toString", "", "updateMarkerIcon", "", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StationMarker {
    private boolean isSelected;
    private LatLng location;
    private Marker marker;
    private final StationViewEntity station;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StationViewEntity.Type.values().length];
            try {
                iArr[StationViewEntity.Type.STATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StationViewEntity.Type.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StationViewEntity.Type.WORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StationViewEntity.Type.NEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StationMarker(Marker marker, StationViewEntity station, LatLng latLng, boolean z3) {
        Intrinsics.checkNotNullParameter(station, "station");
        this.marker = marker;
        this.station = station;
        this.location = latLng;
        this.isSelected = z3;
    }

    public static /* synthetic */ StationMarker copy$default(StationMarker stationMarker, Marker marker, StationViewEntity stationViewEntity, LatLng latLng, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            marker = stationMarker.marker;
        }
        if ((i & 2) != 0) {
            stationViewEntity = stationMarker.station;
        }
        if ((i & 4) != 0) {
            latLng = stationMarker.location;
        }
        if ((i & 8) != 0) {
            z3 = stationMarker.isSelected;
        }
        return stationMarker.copy(marker, stationViewEntity, latLng, z3);
    }

    private final int getIcon() {
        return iconForStationType();
    }

    private final int iconForStationType() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.station.getType().ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? this.isSelected ? R.drawable.ic_marker_selected : R.drawable.ic_marker : this.isSelected ? R.drawable.ic_marker_selected : R.drawable.ic_marker : this.isSelected ? R.drawable.ic_marker_work_selected : R.drawable.ic_marker_work : this.isSelected ? R.drawable.ic_marker_home_selected : R.drawable.ic_marker_home;
    }

    /* renamed from: component1, reason: from getter */
    public final Marker getMarker() {
        return this.marker;
    }

    /* renamed from: component2, reason: from getter */
    public final StationViewEntity getStation() {
        return this.station;
    }

    /* renamed from: component3, reason: from getter */
    public final LatLng getLocation() {
        return this.location;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final StationMarker copy(Marker marker, StationViewEntity station, LatLng location, boolean isSelected) {
        Intrinsics.checkNotNullParameter(station, "station");
        return new StationMarker(marker, station, location, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StationMarker)) {
            return false;
        }
        StationMarker stationMarker = (StationMarker) other;
        return Intrinsics.areEqual(this.marker, stationMarker.marker) && Intrinsics.areEqual(this.station, stationMarker.station) && Intrinsics.areEqual(this.location, stationMarker.location) && this.isSelected == stationMarker.isSelected;
    }

    public final LatLng getLocation() {
        return this.location;
    }

    public final Marker getMarker() {
        return this.marker;
    }

    public final StationViewEntity getStation() {
        return this.station;
    }

    public int hashCode() {
        Marker marker = this.marker;
        int hashCode = (this.station.hashCode() + ((marker == null ? 0 : marker.hashCode()) * 31)) * 31;
        LatLng latLng = this.location;
        return Boolean.hashCode(this.isSelected) + ((hashCode + (latLng != null ? latLng.hashCode() : 0)) * 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final BitmapDescriptor markerIcon(Context context) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        if (WhenMappings.$EnumSwitchMapping$0[this.station.getType().ordinal()] == 1) {
            bitmap = ResourcesUtils.INSTANCE.vectorToBitmap(context, getIcon());
        } else {
            Drawable drawable = h.getDrawable(context, getIcon());
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() == null) {
                        throw new IllegalArgumentException("bitmap is null");
                    }
                    bitmap = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                } else {
                    Rect bounds = drawable.getBounds();
                    int i = bounds.left;
                    int i4 = bounds.top;
                    int i5 = bounds.right;
                    int i6 = bounds.bottom;
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    drawable.draw(new Canvas(createBitmap));
                    drawable.setBounds(i, i4, i5, i6);
                    bitmap = createBitmap;
                }
            } else {
                bitmap = null;
            }
        }
        if (bitmap == null) {
            return null;
        }
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    public final void setLocation(LatLng latLng) {
        this.location = latLng;
    }

    public final void setMarker(Marker marker) {
        this.marker = marker;
    }

    public final void setSelected(boolean z3) {
        this.isSelected = z3;
    }

    public String toString() {
        return "StationMarker(marker=" + this.marker + ", station=" + this.station + ", location=" + this.location + ", isSelected=" + this.isSelected + ')';
    }

    public final void updateMarkerIcon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BitmapDescriptor markerIcon = markerIcon(context);
        Marker marker = this.marker;
        if (marker != null) {
            marker.setIcon(markerIcon);
        }
    }

    public /* synthetic */ StationMarker(Marker marker, StationViewEntity stationViewEntity, LatLng latLng, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marker, stationViewEntity, latLng, (i & 8) != 0 ? false : z3);
    }
}
