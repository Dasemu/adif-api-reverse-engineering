package com.adif.elcanomovil.uiDepartures.main.oneway;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.uiDepartures.views.TrafficAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function7;

/* loaded from: classes2.dex */
public final class r extends SuspendLambda implements Function7 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Boolean f5016a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Boolean f5017b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ TrainType f5018c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ TrafficAvailability f5019d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f5020e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ String f5021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CirculationsViewModel f5022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CirculationsViewModel circulationsViewModel, Continuation continuation) {
        super(7, continuation);
        this.f5022g = circulationsViewModel;
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        r rVar = new r(this.f5022g, (Continuation) obj7);
        rVar.f5016a = (Boolean) obj;
        rVar.f5017b = (Boolean) obj2;
        rVar.f5018c = (TrainType) obj3;
        rVar.f5019d = (TrafficAvailability) obj4;
        rVar.f5020e = (String) obj5;
        rVar.f5021f = (String) obj6;
        return rVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Filter filter;
        Filter filter2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Boolean bool = this.f5016a;
        Boolean bool2 = this.f5017b;
        TrainType trainType = this.f5018c;
        TrafficAvailability trafficAvailability = this.f5019d;
        String str = this.f5020e;
        String str2 = this.f5021f;
        CirculationsViewModel circulationsViewModel = this.f5022g;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            filter2 = circulationsViewModel.filter_full_data;
            filter2.setEnable(booleanValue);
        }
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            filter = circulationsViewModel.filter_all_stations;
            filter.setEnable(booleanValue2);
        }
        if (trainType == null) {
            trainType = TrainType.CERCANIAS;
        }
        circulationsViewModel.isCercanias = trainType;
        if (trafficAvailability == null) {
            trafficAvailability = TrafficAvailability.BOTH;
        }
        circulationsViewModel.hasBothTraffic = trafficAvailability;
        circulationsViewModel.originStationCode = str;
        circulationsViewModel.destinationStationCode = str2;
        return Unit.INSTANCE;
    }
}
