package com.google.android.gms.maps.model;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class AdvancedMarkerOptions extends MarkerOptions {

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions alpha(float f2) {
        super.alpha(f2);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions anchor(float f2, float f4) {
        super.anchor(f2, f4);
        return this;
    }

    public AdvancedMarkerOptions collisionBehavior(@CollisionBehavior int i) {
        zzd(i);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions contentDescription(String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions draggable(boolean z3) {
        super.draggable(z3);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions flat(boolean z3) {
        super.flat(z3);
        return this;
    }

    public int getCollisionBehavior() {
        return zza();
    }

    public View getIconView() {
        return zzc();
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    public AdvancedMarkerOptions iconView(View view) {
        zze(view);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions infoWindowAnchor(float f2, float f4) {
        super.infoWindowAnchor(f2, f4);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions position(LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions rotation(float f2) {
        super.rotation(f2);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions snippet(String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions title(String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions visible(boolean z3) {
        super.visible(z3);
        return this;
    }

    @Override // com.google.android.gms.maps.model.MarkerOptions
    public AdvancedMarkerOptions zIndex(float f2) {
        super.zIndex(f2);
        return this;
    }
}
