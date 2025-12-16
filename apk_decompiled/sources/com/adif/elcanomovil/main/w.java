package com.adif.elcanomovil.main;

import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import com.adif.elcanomovil.notifications.NotificationProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f4573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4573b = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f4573b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NotificationProvider notificationProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4572a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainViewModel mainViewModel = this.f4573b;
            notificationProvider = mainViewModel.notificationProvider;
            Flow<NotificationPayload> notifications = notificationProvider.getNotifications();
            C1.b bVar = new C1.b(mainViewModel, 5);
            this.f4572a = 1;
            if (notifications.collect(bVar, this) == coroutine_suspended) {
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
