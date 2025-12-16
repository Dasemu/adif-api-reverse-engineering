package com.adif.elcanomovil.splash;

import J0.e;
import com.adif.elcanomovil.uiAvisa.components.authenticator.AuthenticationProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplashViewModel f4821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashViewModel splashViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4821a = splashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f4821a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuthenticationProvider authenticationProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SplashViewModel splashViewModel = this.f4821a;
        authenticationProvider = splashViewModel.authProvider;
        authenticationProvider.handleAuthentication(new e(splashViewModel, 6));
        return Unit.INSTANCE;
    }
}
