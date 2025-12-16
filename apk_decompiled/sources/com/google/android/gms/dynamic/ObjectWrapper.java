package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.measurement.internal.a;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
/* loaded from: classes3.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object obj) {
        this.zza = obj;
    }

    @KeepForSdk
    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(a.l(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException("Binder object is null.", e5);
        }
    }

    @KeepForSdk
    public static <T> IObjectWrapper wrap(T t2) {
        return new ObjectWrapper(t2);
    }
}
