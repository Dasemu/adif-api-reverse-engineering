package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.domain.usecases.circulation.SetLastDeparturesArrivalsStationToUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f4973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CirculationsViewModel circulationsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f4973b = circulationsViewModel;
        this.f4974c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f4973b, this.f4974c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SetLastDeparturesArrivalsStationToUseCase setLastDeparturesArrivalsStationToUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4972a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            setLastDeparturesArrivalsStationToUseCase = this.f4973b.setLastDeparturesArrivalsStationToUseCase;
            this.f4972a = 1;
            if (setLastDeparturesArrivalsStationToUseCase.invoke(this.f4974c, this) == coroutine_suspended) {
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
