package com.adif.elcanomovil.uiStations.main;

import com.adif.elcanomovil.commonViews.EmptyCirculationsState;
import com.adif.elcanomovil.uiStations.R;
import com.adif.elcanomovil.uiStations.databinding.FragmentStationsPageActivitiesBinding;
import com.adif.elcanomovil.uiStations.entities.ActivitiesTabViewData;
import com.adif.elcanomovil.uiStations.entities.Activity;
import com.adif.elcanomovil.uiStations.main.ActivitiesTabViewDataWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StationsPageActivitiesFragment f5271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StationsPageActivitiesFragment stationsPageActivitiesFragment) {
        super(1);
        this.f5271a = stationsPageActivitiesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        ActivitiesTabViewDataWrapper activitiesTabViewDataWrapper = (ActivitiesTabViewDataWrapper) obj;
        boolean z3 = activitiesTabViewDataWrapper instanceof ActivitiesTabViewDataWrapper.Data;
        StationsPageActivitiesFragment stationsPageActivitiesFragment = this.f5271a;
        FragmentStationsPageActivitiesBinding fragmentStationsPageActivitiesBinding = null;
        if (z3) {
            ActivitiesTabViewData results = ((ActivitiesTabViewDataWrapper.Data) activitiesTabViewDataWrapper).getResults();
            if (results != null) {
                List<Activity> activities = results.getActivities();
                if (activities == null || !activities.isEmpty()) {
                    FragmentStationsPageActivitiesBinding access$getBinding$p = StationsPageActivitiesFragment.access$getBinding$p(stationsPageActivitiesFragment);
                    if (access$getBinding$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        access$getBinding$p = null;
                    }
                    access$getBinding$p.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.EmptyDefault.INSTANCE);
                    StationsPageActivitiesFragment.access$updateVisibility(stationsPageActivitiesFragment, false);
                    StationsPageActivitiesFragment.access$updateResults(stationsPageActivitiesFragment, results);
                } else {
                    FragmentStationsPageActivitiesBinding access$getBinding$p2 = StationsPageActivitiesFragment.access$getBinding$p(stationsPageActivitiesFragment);
                    if (access$getBinding$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        access$getBinding$p2 = null;
                    }
                    access$getBinding$p2.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(0, R.string.not_activities_zone, 1, null));
                    StationsPageActivitiesFragment.access$updateVisibility(stationsPageActivitiesFragment, true);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                FragmentStationsPageActivitiesBinding access$getBinding$p3 = StationsPageActivitiesFragment.access$getBinding$p(stationsPageActivitiesFragment);
                if (access$getBinding$p3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentStationsPageActivitiesBinding = access$getBinding$p3;
                }
                fragmentStationsPageActivitiesBinding.loadingEmptyOrErrorCommonView.update(new EmptyCirculationsState.NoResults(R.string.stations_no_results_title, R.string.stations_no_results_message));
                StationsPageActivitiesFragment.access$updateVisibility(stationsPageActivitiesFragment, true);
            }
        } else if (activitiesTabViewDataWrapper instanceof ActivitiesTabViewDataWrapper.Error) {
            FragmentStationsPageActivitiesBinding access$getBinding$p4 = StationsPageActivitiesFragment.access$getBinding$p(stationsPageActivitiesFragment);
            if (access$getBinding$p4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageActivitiesBinding = access$getBinding$p4;
            }
            fragmentStationsPageActivitiesBinding.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.GenericError.INSTANCE);
            StationsPageActivitiesFragment.access$updateVisibility(stationsPageActivitiesFragment, true);
        } else if (activitiesTabViewDataWrapper instanceof ActivitiesTabViewDataWrapper.Loading) {
            FragmentStationsPageActivitiesBinding access$getBinding$p5 = StationsPageActivitiesFragment.access$getBinding$p(stationsPageActivitiesFragment);
            if (access$getBinding$p5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentStationsPageActivitiesBinding = access$getBinding$p5;
            }
            fragmentStationsPageActivitiesBinding.loadingEmptyOrErrorCommonView.update(EmptyCirculationsState.Loading.INSTANCE);
            StationsPageActivitiesFragment.access$updateVisibility(stationsPageActivitiesFragment, true);
        }
        return Unit.INSTANCE;
    }
}
