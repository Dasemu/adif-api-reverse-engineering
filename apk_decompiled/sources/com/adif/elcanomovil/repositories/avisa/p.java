package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceStationEntity;
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
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4627a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List list, DefaultIncidenceRepository defaultIncidenceRepository, Continuation continuation) {
        super(2, continuation);
        this.f4629c = list;
        this.f4630d = defaultIncidenceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f4629c, this.f4630d, continuation);
        pVar.f4628b = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        IncidenceMapper incidenceMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4627a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4628b;
            List<IncidenceStationEntity> list = this.f4629c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IncidenceStationEntity incidenceStationEntity : list) {
                incidenceMapper = this.f4630d.incidenceMapper;
                arrayList.add(incidenceMapper.entityToDomainIncidenceStation(incidenceStationEntity));
            }
            this.f4627a = 1;
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
