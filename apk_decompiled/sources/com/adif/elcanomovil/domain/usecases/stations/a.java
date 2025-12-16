package com.adif.elcanomovil.domain.usecases.stations;

import android.location.Location;
import com.adif.elcanomovil.domain.entities.station.Station;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4488a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Location f4489b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ AsyncResult f4490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.f4488a = i;
        this.f4491d = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Location location = (Location) obj;
        AsyncResult asyncResult = (AsyncResult) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.f4488a) {
            case 0:
                a aVar = new a((GetClosestStationUseCase) this.f4491d, continuation, 0);
                aVar.f4489b = location;
                aVar.f4490c = asyncResult;
                return aVar.invokeSuspend(Unit.INSTANCE);
            default:
                a aVar2 = new a((GetStationsForRegionUseCase) this.f4491d, continuation, 1);
                aVar2.f4489b = location;
                aVar2.f4490c = asyncResult;
                return aVar2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Station findClosestStation;
        int i = this.f4488a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Location location = this.f4489b;
                AsyncResult asyncResult = this.f4490c;
                if (GetClosestStationUseCase$invoke$2$2$WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()] != 1) {
                    return null;
                }
                List list = (List) asyncResult.getData();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                findClosestStation = ((GetClosestStationUseCase) this.f4491d).findClosestStation(list, location);
                return findClosestStation;
            default:
                ResultKt.throwOnFailure(obj);
                Location location2 = this.f4489b;
                AsyncResult asyncResult2 = this.f4490c;
                if (GetStationsForRegionUseCase$invoke$2$2$WhenMappings.$EnumSwitchMapping$0[asyncResult2.getStatus().ordinal()] != 1) {
                    return null;
                }
                List list2 = (List) asyncResult2.getData();
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                ((GetStationsForRegionUseCase) this.f4491d).updateStationsDistance(list2, location2);
                return list2;
        }
    }
}
