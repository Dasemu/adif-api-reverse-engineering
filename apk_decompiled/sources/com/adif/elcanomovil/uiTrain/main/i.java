package com.adif.elcanomovil.uiTrain.main;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;

/* loaded from: classes3.dex */
public final class i extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5415a;

    /* renamed from: b, reason: collision with root package name */
    public int f5416b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5417c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.f5415a = i;
        this.f5419e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f5415a) {
            case 0:
                i iVar = new i((TrainSituationViewModel) this.f5419e, (Continuation) obj3, 0);
                iVar.f5417c = (AsyncResult) obj;
                iVar.f5418d = (AsyncResult) obj2;
                return iVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                i iVar2 = new i((TrainSituationViewModel) this.f5419e, (Continuation) obj3, 1);
                iVar2.f5417c = (AsyncResult) obj;
                iVar2.f5418d = (AsyncResult) obj2;
                return iVar2.invokeSuspend(Unit.INSTANCE);
            default:
                i iVar3 = new i((Function7) this.f5419e, (Continuation) obj3, 2);
                iVar3.f5417c = (Triple) obj;
                iVar3.f5418d = (Triple) obj2;
                return iVar3.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrainSituationViewModel trainSituationViewModel;
        TrainSituationViewModel trainSituationViewModel2;
        switch (this.f5415a) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f5416b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AsyncResult asyncResult = (AsyncResult) this.f5417c;
                    AsyncResult asyncResult2 = (AsyncResult) this.f5418d;
                    TrainSituationViewModel trainSituationViewModel3 = (TrainSituationViewModel) this.f5419e;
                    this.f5417c = trainSituationViewModel3;
                    this.f5416b = 1;
                    obj = trainSituationViewModel3.mapToTrainInfo(asyncResult, asyncResult2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    trainSituationViewModel = trainSituationViewModel3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    trainSituationViewModel = (TrainSituationViewModel) this.f5417c;
                    ResultKt.throwOnFailure(obj);
                }
                trainSituationViewModel.mapToViewData((AsyncResult) obj, true);
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f5416b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AsyncResult asyncResult3 = (AsyncResult) this.f5417c;
                    AsyncResult asyncResult4 = (AsyncResult) this.f5418d;
                    TrainSituationViewModel trainSituationViewModel4 = (TrainSituationViewModel) this.f5419e;
                    this.f5417c = trainSituationViewModel4;
                    this.f5416b = 1;
                    obj = trainSituationViewModel4.mapToTrainInfo(asyncResult3, asyncResult4, this);
                    if (obj == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                    trainSituationViewModel2 = trainSituationViewModel4;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    trainSituationViewModel2 = (TrainSituationViewModel) this.f5417c;
                    ResultKt.throwOnFailure(obj);
                }
                trainSituationViewModel2.mapToViewData((AsyncResult) obj, false);
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f5416b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.f5417c;
                Triple triple2 = (Triple) this.f5418d;
                Object first = triple.getFirst();
                Object second = triple.getSecond();
                Object third = triple.getThird();
                Object first2 = triple2.getFirst();
                Object second2 = triple2.getSecond();
                Object third2 = triple2.getThird();
                this.f5417c = null;
                this.f5416b = 1;
                Object invoke = ((Function7) this.f5419e).invoke(first, second, third, first2, second2, third2, this);
                return invoke == coroutine_suspended3 ? coroutine_suspended3 : invoke;
        }
    }
}
