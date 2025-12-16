package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class SpriteStyle extends StampStyle {

    /* loaded from: classes3.dex */
    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
        }

        public SpriteStyle build() {
            return new SpriteStyle(this.zza);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public Builder self() {
            return this;
        }

        public /* synthetic */ Builder(zzs zzsVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }
    }

    public SpriteStyle(BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
