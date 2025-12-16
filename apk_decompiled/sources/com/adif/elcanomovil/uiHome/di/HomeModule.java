package com.adif.elcanomovil.uiHome.di;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.stations.GetHomeStationUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationsForRegionUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetWorkStationUseCase;
import com.adif.elcanomovil.domain.usecases.user.GetUserLastLocationUseCase;
import com.adif.elcanomovil.uiHome.views.HomeMapViewModel;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/adif/elcanomovil/uiHome/di/HomeModule;", "", "()V", "provideHomeMapViewModel", "Lcom/adif/elcanomovil/uiHome/views/HomeMapViewModel;", "context", "Landroid/content/Context;", "getStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationsForRegionUseCase;", "getUserLastLocationUseCase", "Lcom/adif/elcanomovil/domain/usecases/user/GetUserLastLocationUseCase;", "getHomeStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetHomeStationUseCase;", "getWorkStationUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetWorkStationUseCase;", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class HomeModule {
    public static final HomeModule INSTANCE = new HomeModule();

    private HomeModule() {
    }

    @Provides
    public final HomeMapViewModel provideHomeMapViewModel(@ApplicationContext Context context, GetStationsForRegionUseCase getStationsUseCase, GetUserLastLocationUseCase getUserLastLocationUseCase, GetHomeStationUseCase getHomeStationUseCase, GetWorkStationUseCase getWorkStationUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
        Intrinsics.checkNotNullParameter(getUserLastLocationUseCase, "getUserLastLocationUseCase");
        Intrinsics.checkNotNullParameter(getHomeStationUseCase, "getHomeStationUseCase");
        Intrinsics.checkNotNullParameter(getWorkStationUseCase, "getWorkStationUseCase");
        return new HomeMapViewModel(context, getStationsUseCase, getUserLastLocationUseCase, getHomeStationUseCase, getWorkStationUseCase);
    }
}
