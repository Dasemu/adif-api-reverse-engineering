package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageComercialBinding;
import com.adif.elcanomovil.uiStations.entities.CommercialTabViewData;
import com.adif.elcanomovil.uiStations.main.CommercialTabViewDataWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StationsPageCommercialFragment f5277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StationsPageCommercialFragment stationsPageCommercialFragment) {
        super(1);
        this.f5277a = stationsPageCommercialFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        CommercialTabViewDataWrapper commercialTabViewDataWrapper = (CommercialTabViewDataWrapper) obj;
        boolean z3 = commercialTabViewDataWrapper instanceof CommercialTabViewDataWrapper.Data;
        StationsPageCommercialFragment stationsPageCommercialFragment = this.f5277a;
        FragmentStationsPageComercialBinding fragmentStationsPageComercialBinding = null;
        if (z3) {
            CommercialTabViewData results = ((CommercialTabViewDataWrapper.Data) commercialTabViewDataWrapper).getResults();
            if (results != null) {
                String commercialZoneType = results.getCommercialZoneType();
                if (Intrinsics.areEqual(commercialZoneType, "EXTERNAL_MANAGEMENT")) {
                    FragmentStationsPageComercialBinding access$getBinding$p = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
                    if (access$getBinding$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        access$getBinding$p = null;
                    }
                    access$getBinding$p.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(0, R.string.external_management, 1, null));
                    StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, true);
                } else if (Intrinsics.areEqual(commercialZoneType, "NOT")) {
                    FragmentStationsPageComercialBinding access$getBinding$p2 = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
                    if (access$getBinding$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        access$getBinding$p2 = null;
                    }
                    access$getBinding$p2.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(0, R.string.not_commercial_zone, 1, null));
                    StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, true);
                } else {
                    FragmentStationsPageComercialBinding access$getBinding$p3 = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
                    if (access$getBinding$p3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        access$getBinding$p3 = null;
                    }
                    access$getBinding$p3.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.EmptyDefault.INSTANCE);
                    StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, false);
                    StationsPageCommercialFragment.access$updateResults(stationsPageCommercialFragment, results);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                FragmentStationsPageComercialBinding access$getBinding$p4 = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
                if (access$getBinding$p4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentStationsPageComercialBinding = access$getBinding$p4;
                }
                fragmentStationsPageComercialBinding.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(R.string.stations_no_results_title, R.string.stations_no_results_message));
                StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, true);
            }
        } else if (commercialTabViewDataWrapper instanceof CommercialTabViewDataWrapper.Error) {
            FragmentStationsPageComercialBinding access$getBinding$p5 = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
            if (access$getBinding$p5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageComercialBinding = access$getBinding$p5;
            }
            fragmentStationsPageComercialBinding.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.GenericError.INSTANCE);
            StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, true);
        } else if (Intrinsics.areEqual(commercialTabViewDataWrapper, CommercialTabViewDataWrapper.Loading.INSTANCE)) {
            FragmentStationsPageComercialBinding access$getBinding$p6 = StationsPageCommercialFragment.access$getBinding$p(stationsPageCommercialFragment);
            if (access$getBinding$p6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageComercialBinding = access$getBinding$p6;
            }
            fragmentStationsPageComercialBinding.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.Loading.INSTANCE);
            StationsPageCommercialFragment.access$updateVisibility(stationsPageCommercialFragment, true);
        }
        return Unit.INSTANCE;
    }
}
