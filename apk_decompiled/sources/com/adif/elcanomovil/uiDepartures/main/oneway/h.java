package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.domain.usecases.filters.SaveFilterUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Filter f4982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Filter filter, CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4982a = filter;
        this.f4983b = circulationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f4982a, this.f4983b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        SaveFilterUseCase saveFilterUseCase;
        MutableStateFlow mutableStateFlow2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int[] iArr = CirculationsViewModel$handleFilterChanged$1$WhenMappings.$EnumSwitchMapping$0;
        Filter filter = this.f4982a;
        int i = iArr[filter.ordinal()];
        CirculationsViewModel circulationsViewModel = this.f4983b;
        if (i == 1) {
            mutableStateFlow = circulationsViewModel.isShowExpandedFlow;
            mutableStateFlow.setValue(Boxing.boxBoolean(filter.getEnable()));
        } else if (i == 2 || i == 3) {
            mutableStateFlow2 = circulationsViewModel.isShowCorporateStopsFlow;
            mutableStateFlow2.setValue(Boxing.boxBoolean(filter.getEnable()));
        }
        saveFilterUseCase = circulationsViewModel.saveFilterUseCase;
        saveFilterUseCase.invoke(filter.getId(), filter.getEnable());
        return Unit.INSTANCE;
    }
}
