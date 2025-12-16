package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class TextureStyle extends StampStyle {

    /* loaded from: classes3.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        public /* synthetic */ Builder(zzac zzacVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        /* renamed from: self, reason: avoid collision after fix types in other method */
        public Builder self2() {
            return this;
        }
    }

    public /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzad zzadVar) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
