package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.KotlinVersion;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 236, 233, 225));

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i, -1));
        }
        int i4 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i4, false));
        }
        int i5 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i5, false));
        }
        int i6 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i11, true));
        }
        int i12 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i15, false));
        }
        int i16 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i16, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i17 = R.styleable.MapAttrs_backgroundColor;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes.getColor(i17, zza.intValue())));
        }
        int i18 = R.styleable.MapAttrs_mapId;
        if (obtainAttributes.hasValue(i18) && (string = obtainAttributes.getString(i18)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_cameraTargetLat;
        LatLng latLng = new LatLng(obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED) : 0.0f, obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(r0, BitmapDescriptorFactory.HUE_RED) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i4 = R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i4)) {
            builder.zoom(obtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED));
        }
        int i5 = R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i5)) {
            builder.bearing(obtainAttributes.getFloat(i5, BitmapDescriptorFactory.HUE_RED));
        }
        int i6 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i6)) {
            builder.tilt(obtainAttributes.getFloat(i6, BitmapDescriptorFactory.HUE_RED));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, BitmapDescriptorFactory.HUE_RED)) : null;
        int i4 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, BitmapDescriptorFactory.HUE_RED)) : null;
        int i5 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i5) ? Float.valueOf(obtainAttributes.getFloat(i5, BitmapDescriptorFactory.HUE_RED)) : null;
        int i6 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i6) ? Float.valueOf(obtainAttributes.getFloat(i6, BitmapDescriptorFactory.HUE_RED)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    public GoogleMapOptions ambientEnabled(boolean z3) {
        this.zzn = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzs = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z3) {
        this.zzg = Boolean.valueOf(z3);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    public Integer getBackgroundColor() {
        return this.zzs;
    }

    public CameraPosition getCamera() {
        return this.zze;
    }

    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    public Boolean getLiteMode() {
        return this.zzl;
    }

    public String getMapId() {
        return this.zzt;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    public Float getMinZoomPreference() {
        return this.zzo;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z3) {
        this.zzl = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzt = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z3) {
        this.zzm = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzd = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f2) {
        this.zzp = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f2) {
        this.zzo = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z3) {
        this.zzk = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z3) {
        this.zzh = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z3) {
        this.zzr = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z3) {
        this.zzj = Boolean.valueOf(z3);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z3) {
        this.zzc = Boolean.valueOf(z3);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z3) {
        this.zzb = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z3) {
        this.zzf = Boolean.valueOf(z3);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z3) {
        this.zzi = Boolean.valueOf(z3);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b4, @SafeParcelable.Param(id = 3) byte b5, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b6, @SafeParcelable.Param(id = 7) byte b7, @SafeParcelable.Param(id = 8) byte b8, @SafeParcelable.Param(id = 9) byte b9, @SafeParcelable.Param(id = 10) byte b10, @SafeParcelable.Param(id = 11) byte b11, @SafeParcelable.Param(id = 12) byte b12, @SafeParcelable.Param(id = 14) byte b13, @SafeParcelable.Param(id = 15) byte b14, @SafeParcelable.Param(id = 16) Float f2, @SafeParcelable.Param(id = 17) Float f4, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b15, @SafeParcelable.Param(id = 20) Integer num, @SafeParcelable.Param(id = 21) String str) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzo = f2;
        this.zzp = f4;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzs = num;
        this.zzt = str;
    }
}
