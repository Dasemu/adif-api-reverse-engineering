package com.adif.elcanomovil.uiHome.views;

import com.adif.elcanomovil.commonViews.data.StationViewEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeMapView f5111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(HomeMapView homeMapView, int i) {
        super(1);
        this.f5110a = i;
        this.f5111b = homeMapView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5110a) {
            case 0:
                StationViewEntity stationViewEntity = (StationViewEntity) obj;
                Function1<StationViewEntity, Unit> listener = this.f5111b.getListener();
                if (listener != null) {
                    listener.invoke(stationViewEntity);
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNull(arrayList);
                HomeMapView.access$addMarkers(this.f5111b, arrayList);
                return Unit.INSTANCE;
            case 2:
                LatLng latLng = (LatLng) obj;
                Intrinsics.checkNotNull(latLng);
                HomeMapView.access$moveMapCameraTo(this.f5111b, latLng, Float.valueOf(14.0f));
                return Unit.INSTANCE;
            default:
                HomeMapView.access$configureMapLocation(this.f5111b);
                return Unit.INSTANCE;
        }
    }
}
