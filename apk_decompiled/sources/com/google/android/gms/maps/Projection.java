package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public final class Projection {
    private final IProjectionDelegate zza;

    public Projection(IProjectionDelegate iProjectionDelegate) {
        this.zza = iProjectionDelegate;
    }

    public LatLng fromScreenLocation(Point point) {
        Preconditions.checkNotNull(point);
        try {
            return this.zza.fromScreenLocation(ObjectWrapper.wrap(point));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.zza.getVisibleRegion();
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public Point toScreenLocation(LatLng latLng) {
        Preconditions.checkNotNull(latLng);
        try {
            return (Point) ObjectWrapper.unwrap(this.zza.toScreenLocation(latLng));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
