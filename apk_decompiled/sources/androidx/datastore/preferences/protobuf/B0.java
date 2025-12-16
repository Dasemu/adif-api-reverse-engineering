package androidx.datastore.preferences.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum B0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0116g.f2909c),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Serializable f2845a;

    B0(Serializable serializable) {
        this.f2845a = serializable;
    }
}
