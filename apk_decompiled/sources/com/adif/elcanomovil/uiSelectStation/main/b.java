package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.uiSelectStation.main.SelectStationViewState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class b implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectStationFragment f5180a;

    public b(SelectStationFragment selectStationFragment) {
        this.f5180a = selectStationFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        SelectStationViewState selectStationViewState = (SelectStationViewState) obj;
        boolean z3 = selectStationViewState instanceof SelectStationViewState.MainSearch;
        SelectStationFragment selectStationFragment = this.f5180a;
        if (z3) {
            selectStationFragment.showMainSearch((SelectStationViewState.MainSearch) selectStationViewState);
        } else if (selectStationViewState instanceof SelectStationViewState.ShowSearchResults) {
            selectStationFragment.showSearchResults(((SelectStationViewState.ShowSearchResults) selectStationViewState).getStations());
        } else if (selectStationViewState instanceof SelectStationViewState.NoResults) {
            selectStationFragment.showNoResults();
        }
        return Unit.INSTANCE;
    }
}
