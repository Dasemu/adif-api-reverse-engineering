package com.adif.elcanomovil.uiHome;

import com.adif.elcanomovil.uiHome.views.HomeMapViewModel;
import com.adif.elcanomovil.uiHome.views.HomeMapViewModelKt;
import com.google.android.gms.maps.model.LatLng;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5103a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Continuation continuation, int i4) {
        super(i, continuation);
        this.f5103a = i4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.f5103a) {
            case 0:
                u uVar = new u(3, continuation, 0);
                uVar.f5104b = th;
                return uVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                u uVar2 = new u(3, continuation, 1);
                uVar2.f5104b = th;
                return uVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                u uVar3 = new u(3, continuation, 2);
                uVar3.f5104b = th;
                return uVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                u uVar4 = new u(3, continuation, 3);
                uVar4.f5104b = th;
                return uVar4.invokeSuspend(Unit.INSTANCE);
            case 4:
                u uVar5 = new u(3, continuation, 4);
                uVar5.f5104b = th;
                return uVar5.invokeSuspend(Unit.INSTANCE);
            default:
                return new u((HomeMapViewModel) this.f5104b, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LatLng latLng;
        int i = this.f5103a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                String message = "fetchUserFavorites ERROR " + ((Throwable) this.f5104b);
                Intrinsics.checkNotNullParameter(message, "message");
                t3.c.f8551a.a(message, new Object[0]);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                String message2 = "fetchUserFavorites ERROR " + ((Throwable) this.f5104b);
                Intrinsics.checkNotNullParameter(message2, "message");
                t3.c.f8551a.a(message2, new Object[0]);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                String message3 = "fetchUserFavorites ERROR " + ((Throwable) this.f5104b);
                Intrinsics.checkNotNullParameter(message3, "message");
                t3.c.f8551a.a(message3, new Object[0]);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                String message4 = "getStationsUseCase ERROR " + ((Throwable) this.f5104b);
                Intrinsics.checkNotNullParameter(message4, "message");
                t3.c.f8551a.a(message4, new Object[0]);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                String message5 = "SelectStationViewModel getClosestStationUseCase ERROR " + ((Throwable) this.f5104b);
                Intrinsics.checkNotNullParameter(message5, "message");
                t3.c.f8551a.a(message5, new Object[0]);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                HomeMapViewModel homeMapViewModel = (HomeMapViewModel) this.f5104b;
                latLng = HomeMapViewModelKt.DEFAULT_LOCATION;
                homeMapViewModel.notifyViewMoveCameraToLocation(latLng);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(HomeMapViewModel homeMapViewModel, Continuation continuation) {
        super(3, continuation);
        this.f5103a = 5;
        this.f5104b = homeMapViewModel;
    }
}
