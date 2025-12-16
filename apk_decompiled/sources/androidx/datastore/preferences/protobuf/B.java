package androidx.datastore.preferences.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum B {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0116g.class, C0116g.f2909c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: a, reason: collision with root package name */
    public final Serializable f2836a;

    B(Class cls, Serializable serializable) {
        this.f2836a = serializable;
    }
}
