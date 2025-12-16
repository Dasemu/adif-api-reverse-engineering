package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Filter f5433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Filter filter, TrainSituationViewModel trainSituationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5433b = filter;
        this.f5434c = trainSituationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f5433b, this.f5434c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Filter filter;
        SaveFilterUseCase saveFilterUseCase;
        Object fetchPath;
        Filter filter2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5432a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int[] iArr = TrainSituationViewModel$handleFilterChanged$1$WhenMappings.$EnumSwitchMapping$0;
            Filter filter3 = this.f5433b;
            int i4 = iArr[filter3.ordinal()];
            TrainSituationViewModel trainSituationViewModel = this.f5434c;
            if (i4 == 1) {
                filter = trainSituationViewModel.filter_full_data;
                filter.setEnable(filter3.getEnable());
            } else if (i4 == 2 || i4 == 3) {
                filter2 = trainSituationViewModel.filter_all_stations;
                filter2.setEnable(filter3.getEnable());
            }
            saveFilterUseCase = trainSituationViewModel.saveFilterUseCase;
            saveFilterUseCase.invoke(filter3.getId(), filter3.getEnable());
            this.f5432a = 1;
            fetchPath = trainSituationViewModel.fetchPath(this);
            if (fetchPath == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
