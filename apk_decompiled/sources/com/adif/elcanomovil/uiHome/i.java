package com.adif.elcanomovil.uiHome;

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
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f5079b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f5079b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5078a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeFragment homeFragment = this.f5079b;
            viewModel = homeFragment.getViewModel();
            StateFlow<HomeFragmentViewState> viewState = viewModel.getViewState();
            f fVar = new f(homeFragment, 1);
            this.f5078a = 1;
            if (viewState.collect(fVar, this) == coroutine_suspended) {
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
