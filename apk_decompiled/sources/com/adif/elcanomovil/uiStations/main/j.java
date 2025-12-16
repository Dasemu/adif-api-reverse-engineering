package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageServicesBinding;
import com.adif.elcanomovil.uiStations.entities.ServicesTabViewData;
import com.adif.elcanomovil.uiStations.main.OneStationViewData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StationsPageServicesFragment f5283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StationsPageServicesFragment stationsPageServicesFragment) {
        super(1);
        this.f5283a = stationsPageServicesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding2;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding3;
        Unit unit;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding4;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding5;
        OneStationViewData oneStationViewData = (OneStationViewData) obj;
        StationsPageServicesFragment stationsPageServicesFragment = this.f5283a;
        fragmentStationsPageServicesBinding = stationsPageServicesFragment.binding;
        FragmentStationsPageServicesBinding fragmentStationsPageServicesBinding6 = null;
        if (fragmentStationsPageServicesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStationsPageServicesBinding = null;
        }
        fragmentStationsPageServicesBinding.viewNotEmptyStation.setVisibility(0);
        if (oneStationViewData instanceof OneStationViewData.Data) {
            ServicesTabViewData results = ((OneStationViewData.Data) oneStationViewData).getResults();
            if (results != null) {
                stationsPageServicesFragment.updateResults(results);
                fragmentStationsPageServicesBinding5 = stationsPageServicesFragment.binding;
                if (fragmentStationsPageServicesBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentStationsPageServicesBinding5 = null;
                }
                fragmentStationsPageServicesBinding5.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.EmptyDefault.INSTANCE);
                stationsPageServicesFragment.updateVisibility(false);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                fragmentStationsPageServicesBinding4 = stationsPageServicesFragment.binding;
                if (fragmentStationsPageServicesBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentStationsPageServicesBinding6 = fragmentStationsPageServicesBinding4;
                }
                fragmentStationsPageServicesBinding6.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(R.string.stations_no_results_title, R.string.stations_no_results_message));
                stationsPageServicesFragment.updateVisibility(true);
            }
        } else if (oneStationViewData instanceof OneStationViewData.Error) {
            fragmentStationsPageServicesBinding3 = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageServicesBinding6 = fragmentStationsPageServicesBinding3;
            }
            fragmentStationsPageServicesBinding6.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.GenericError.INSTANCE);
            stationsPageServicesFragment.updateVisibility(true);
        } else if (Intrinsics.areEqual(oneStationViewData, OneStationViewData.Loading.INSTANCE)) {
            fragmentStationsPageServicesBinding2 = stationsPageServicesFragment.binding;
            if (fragmentStationsPageServicesBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageServicesBinding6 = fragmentStationsPageServicesBinding2;
            }
            fragmentStationsPageServicesBinding6.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.Loading.INSTANCE);
            stationsPageServicesFragment.updateVisibility(true);
        }
        return Unit.INSTANCE;
    }
}
