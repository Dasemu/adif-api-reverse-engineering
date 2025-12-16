package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f5075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f5075b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f5075b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5074a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeFragment homeFragment = this.f5075b;
            viewModel = homeFragment.getViewModel();
            Flow<Navigation> navigation = viewModel.getNavigation();
            f fVar = new f(homeFragment, 0);
            this.f5074a = 1;
            if (navigation.collect(fVar, this) == coroutine_suspended) {
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
