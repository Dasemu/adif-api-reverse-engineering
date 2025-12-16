package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.domain.usecases.favorites.GetTrainIsFavoriteUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public MutableStateFlow f5466a;

    /* renamed from: b, reason: collision with root package name */
    public int f5467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainSituationViewModel f5468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TrainSituationViewModel trainSituationViewModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f5468c = trainSituationViewModel;
        this.f5469d = str;
        this.f5470e = str2;
        this.f5471f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f5468c, this.f5469d, this.f5470e, this.f5471f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        GetTrainIsFavoriteUseCase getTrainIsFavoriteUseCase;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5467b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrainSituationViewModel trainSituationViewModel = this.f5468c;
            mutableStateFlow = trainSituationViewModel._isFavourite;
            getTrainIsFavoriteUseCase = trainSituationViewModel.getTrainIsFavoriteUseCase;
            this.f5466a = mutableStateFlow;
            this.f5467b = 1;
            obj = getTrainIsFavoriteUseCase.invoke(this.f5469d, this.f5470e, this.f5471f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = mutableStateFlow;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = this.f5466a;
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow2.setValue(obj);
        return Unit.INSTANCE;
    }
}
