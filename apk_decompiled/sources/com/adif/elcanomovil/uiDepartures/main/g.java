package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.domain.entities.StationServiceType;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationToUseCase;
import com.adif.elcanomovil.domain.usecases.circulation.GetLastDeparturesArrivalsStationUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeparturesViewModel f4943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i, DeparturesViewModel departuresViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4942a = i;
        this.f4943b = departuresViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f4942a, this.f4943b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetLastDeparturesArrivalsStationToUseCase getLastDeparturesArrivalsStationToUseCase;
        String invoke;
        GetLastDeparturesArrivalsStationUseCase getLastDeparturesArrivalsStationUseCase;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.f4942a;
        DeparturesViewModel departuresViewModel = this.f4943b;
        if (i == 0) {
            getLastDeparturesArrivalsStationUseCase = departuresViewModel.getLastDeparturesArrivalsStationUseCase;
            invoke = getLastDeparturesArrivalsStationUseCase.invoke();
        } else {
            getLastDeparturesArrivalsStationToUseCase = departuresViewModel.getLastDeparturesArrivalsStationToUseCase;
            invoke = getLastDeparturesArrivalsStationToUseCase.invoke();
        }
        departuresViewModel.navigateToStations(invoke, StationServiceType.SERVICES);
        return Unit.INSTANCE;
    }
}
