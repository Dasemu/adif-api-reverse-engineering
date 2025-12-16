package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public BottomNavFragmentDirections.Companion f4944a;

    /* renamed from: b, reason: collision with root package name */
    public String f4945b;

    /* renamed from: c, reason: collision with root package name */
    public int f4946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeparturesViewModel f4947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DeparturesViewModel departuresViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4947d = departuresViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f4947d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase;
        GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase;
        CirculationType circulationType;
        CirculationType circulationType2;
        CirculationType circulationType3;
        b1.f fVar;
        Object readStations;
        BottomNavFragmentDirections.Companion companion;
        String str;
        b1.f fVar2;
        b1.f fVar3;
        b1.f fVar4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4946c;
        DeparturesViewModel departuresViewModel = this.f4947d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getLastDeparturesArrivalsStationUseCase = departuresViewModel.getLastDeparturesArrivalsStationUseCase;
            String invoke = getLastDeparturesArrivalsStationUseCase.invoke();
            getLastDeparturesArrivalsStationToUseCase = departuresViewModel.getLastDeparturesArrivalsStationToUseCase;
            String invoke2 = getLastDeparturesArrivalsStationToUseCase.invoke();
            circulationType = departuresViewModel.currentTab;
            if (circulationType == CirculationType.DEPARTURE && (invoke == null || invoke.length() == 0)) {
                fVar3 = departuresViewModel._showNoStationsSnackbar;
                fVar3.b(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            circulationType2 = departuresViewModel.currentTab;
            if (circulationType2 == CirculationType.ARRIVAL && (invoke == null || invoke.length() == 0)) {
                fVar2 = departuresViewModel._showNoStationsSnackbar;
                fVar2.b(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            circulationType3 = departuresViewModel.currentTab;
            if (circulationType3 != CirculationType.BETWEEN_STATIONS) {
                departuresViewModel.navigateToStations(invoke, StationServiceType.COMMERCIAL);
                return Unit.INSTANCE;
            }
            if (invoke != null && invoke.length() != 0 && (invoke2 == null || invoke2.length() == 0)) {
                departuresViewModel.navigateToStations(invoke, StationServiceType.COMMERCIAL);
                return Unit.INSTANCE;
            }
            if ((invoke == null || invoke.length() == 0) && invoke2 != null && invoke2.length() != 0) {
                departuresViewModel.navigateToStations(invoke2, StationServiceType.COMMERCIAL);
                return Unit.INSTANCE;
            }
            if ((invoke == null || invoke.length() == 0) && (invoke2 == null || invoke2.length() == 0)) {
                fVar = departuresViewModel._showNoStationsSnackbar;
                fVar.b(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            BottomNavFragmentDirections.Companion companion2 = BottomNavFragmentDirections.INSTANCE;
            this.f4944a = companion2;
            this.f4945b = DeparturesFragment.bottomSheetToCommercialTag;
            this.f4946c = 1;
            readStations = departuresViewModel.readStations(this);
            if (readStations == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = readStations;
            companion = companion2;
            str = DeparturesFragment.bottomSheetToCommercialTag;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f4945b;
            companion = this.f4944a;
            ResultKt.throwOnFailure(obj);
        }
        Navigation.RootDirection rootDirection = new Navigation.RootDirection(companion.toSelectableBottomSheet(str, (String[]) obj), null, 2, null);
        fVar4 = departuresViewModel.navigationFlow;
        fVar4.b(rootDirection);
        return Unit.INSTANCE;
    }
}
