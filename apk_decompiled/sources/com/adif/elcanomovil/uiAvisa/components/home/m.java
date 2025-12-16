package com.adif.elcanomovil.uiAvisa.components.home;

import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AvisaHomeViewModel f4918a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AvisaHomeViewModel avisaHomeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4918a = avisaHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f4918a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuthenticationProvider authenticationProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AvisaHomeViewModel avisaHomeViewModel = this.f4918a;
        authenticationProvider = avisaHomeViewModel.authProvider;
        authenticationProvider.handleAuthentication(new J0.e(avisaHomeViewModel, 7));
        return Unit.INSTANCE;
    }
}
