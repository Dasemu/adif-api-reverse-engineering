package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.commonNavGraph.arguments.Filters;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5428a = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f5428a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b1.f fVar;
        Filter filter;
        Filter filter2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TrainSituationViewModel trainSituationViewModel = this.f5428a;
        fVar = trainSituationViewModel.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        filter = trainSituationViewModel.filter_all_stations;
        filter2 = trainSituationViewModel.filter_full_data;
        fVar.b(new Navigation.RootDirection(companion.toFilterListBottomSheet(NavArguments.RESULT_FILTERS, new Filters(CollectionsKt.listOf((Object[]) new Filter[]{filter, filter2}))), null, 2, null));
        return Unit.INSTANCE;
    }
}
