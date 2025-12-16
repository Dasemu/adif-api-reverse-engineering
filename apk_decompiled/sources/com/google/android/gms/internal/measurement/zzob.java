package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public enum zzob {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzka.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzob(Object obj) {
        this.zzk = obj;
    }
}
