package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5435a = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f5435a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        b1.f fVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        TrainSituationViewModel trainSituationViewModel = this.f5435a;
        str = trainSituationViewModel.observation;
        Intrinsics.checkNotNull(str);
        Navigation.RootDirection rootDirection = new Navigation.RootDirection(companion.toTrainObservationBottomSheet(str), null, 2, null);
        fVar = trainSituationViewModel.navigationFlow;
        fVar.b(rootDirection);
        return Unit.INSTANCE;
    }
}
