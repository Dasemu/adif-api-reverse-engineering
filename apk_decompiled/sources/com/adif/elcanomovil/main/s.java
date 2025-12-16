package com.adif.elcanomovil.main;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4566b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f4566b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f4566b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MainViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4565a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainActivity mainActivity = this.f4566b;
            viewModel = mainActivity.getViewModel();
            Flow<Uri> deepLinkNavigation = viewModel.getDeepLinkNavigation();
            C1.b bVar = new C1.b(mainActivity, 4);
            this.f4565a = 1;
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
