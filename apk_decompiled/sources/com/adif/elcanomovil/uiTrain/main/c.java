package com.adif.elcanomovil.uiTrain.main;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainSituationFragment f5403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrainSituationFragment trainSituationFragment, Continuation continuation) {
        super(2, continuation);
        this.f5403b = trainSituationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f5403b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrainSituationViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5402a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrainSituationFragment trainSituationFragment = this.f5403b;
            viewModel = trainSituationFragment.getViewModel();
            Flow<Uri> deepLinkNavigation = viewModel.getDeepLinkNavigation();
            C1.b bVar = new C1.b(trainSituationFragment, 16);
            this.f5402a = 1;
            if (deepLinkNavigation.collect(bVar, this) == coroutine_suspended) {
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
