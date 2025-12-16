package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.serviceNetworking.stations.StationsService;
import com.adif.elcanomovil.serviceNetworking.stations.model.DetailedInfoDTO;
import com.adif.elcanomovil.serviceNetworking.stations.model.OneStationRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DefaultStationsRepository defaultStationsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4683b = defaultStationsRepository;
        this.f4684c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f4683b, this.f4684c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsService stationsService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4682a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        stationsService = this.f4683b.stationsService;
        OneStationRequest oneStationRequest = new OneStationRequest(new DetailedInfoDTO(false, false, false, false, false, false, false, WorkQueueKt.MASK, null), this.f4684c, "0");
        this.f4682a = 1;
        Object oneStation = stationsService.oneStation(oneStationRequest, this);
        return oneStation == coroutine_suspended ? coroutine_suspended : oneStation;
    }
}
