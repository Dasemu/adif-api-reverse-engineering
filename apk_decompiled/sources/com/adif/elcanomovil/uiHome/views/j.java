package com.adif.elcanomovil.uiHome.views;

import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.databinding.ViewStationNearBinding;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes2.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StationNearView f5137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StationNearView stationNearView, Continuation continuation) {
        super(2, continuation);
        this.f5137b = stationNearView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f5137b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ViewStationNearBinding viewStationNearBinding;
        ViewStationNearBinding viewStationNearBinding2;
        ViewStationNearBinding viewStationNearBinding3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5136a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f5136a = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        StationNearView stationNearView = this.f5137b;
        viewStationNearBinding = stationNearView.binding;
        ViewStationNearBinding viewStationNearBinding4 = null;
        if (viewStationNearBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding = null;
        }
        viewStationNearBinding.permissionStatusTextView.setVisibility(8);
        stationNearView.updateShowStationOption(8);
        viewStationNearBinding2 = stationNearView.binding;
        if (viewStationNearBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewStationNearBinding2 = null;
        }
        viewStationNearBinding2.nearStationInfo.setVisibility(8);
        viewStationNearBinding3 = stationNearView.binding;
        if (viewStationNearBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewStationNearBinding4 = viewStationNearBinding3;
        }
        viewStationNearBinding4.stationOptionsLoading.setVisibility(0);
        stationNearView.updateStationTitle(stationNearView.getRootView().getContext().getString(R.string.near_station_loading_title));
        return Unit.INSTANCE;
    }
}
