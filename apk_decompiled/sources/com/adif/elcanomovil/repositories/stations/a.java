package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.serviceStorage.model.StationEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4663a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, DefaultStationsRepository defaultStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4665c = list;
        this.f4666d = defaultStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f4665c, this.f4666d, continuation);
        aVar.f4664b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        StationMapper stationMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4663a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4664b;
            List<StationEntity> list = this.f4665c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (StationEntity stationEntity : list) {
                stationMapper = this.f4666d.stationMapper;
                arrayList.add(stationMapper.entityToDomain(stationEntity));
            }
            this.f4663a = 1;
            if (flowCollector.emit(arrayList, this) == coroutine_suspended) {
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
