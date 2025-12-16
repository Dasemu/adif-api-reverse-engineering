package com.adif.elcanomovil.uiHome.views;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeMapViewModel f5115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5115b = homeMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f5115b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchUserWorkStation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5114a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f5114a = 1;
        fetchUserWorkStation = this.f5115b.fetchUserWorkStation(this);
        return fetchUserWorkStation == coroutine_suspended ? coroutine_suspended : fetchUserWorkStation;
    }
}
