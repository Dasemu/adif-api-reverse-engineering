package com.adif.elcanomovil.uiSelectStation.main;

import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentSearchUseCase;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectStationViewModel f5216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, SelectStationViewModel selectStationViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5215b = str;
        this.f5216c = selectStationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f5215b, this.f5216c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SaveRecentSearchUseCase saveRecentSearchUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5214a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f5215b);
            saveRecentSearchUseCase = this.f5216c.saveRecentSearchUseCase;
            this.f5214a = 1;
            if (saveRecentSearchUseCase.invoke(arrayList, this) == coroutine_suspended) {
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
