package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationEntity;
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
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4589a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaStationsRepository f4592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, DefaultAvisaStationsRepository defaultAvisaStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4591c = list;
        this.f4592d = defaultAvisaStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f4591c, this.f4592d, continuation);
        dVar.f4590b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        AvisaStationMapper avisaStationMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4589a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4590b;
            List<AvisaStationEntity> list = this.f4591c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (AvisaStationEntity avisaStationEntity : list) {
                avisaStationMapper = this.f4592d.avisaStationMapper;
                arrayList.add(avisaStationMapper.entityToDomain(avisaStationEntity));
            }
            this.f4589a = 1;
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
