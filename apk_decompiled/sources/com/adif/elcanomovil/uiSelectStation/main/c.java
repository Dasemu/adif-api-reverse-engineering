package com.adif.elcanomovil.uiSelectStation.main;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectStationFragment f5182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SelectStationFragment selectStationFragment, Continuation continuation) {
        super(2, continuation);
        this.f5182b = selectStationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f5182b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SelectStationViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5181a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SelectStationFragment selectStationFragment = this.f5182b;
            viewModel = selectStationFragment.getViewModel();
            StateFlow<SelectStationViewState> viewState = viewModel.getViewState();
            b bVar = new b(selectStationFragment);
            this.f5181a = 1;
            if (viewState.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
