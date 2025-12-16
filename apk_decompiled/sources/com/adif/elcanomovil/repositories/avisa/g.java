package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaStationCategoryEntity;
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
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4597a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultAvisaStationsRepository f4600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, DefaultAvisaStationsRepository defaultAvisaStationsRepository, Continuation continuation) {
        super(2, continuation);
        this.f4599c = list;
        this.f4600d = defaultAvisaStationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f4599c, this.f4600d, continuation);
        gVar.f4598b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        AvisaStationCategoryMapper avisaStationCategoryMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4597a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f4598b;
            List<AvisaStationCategoryEntity> list = this.f4599c;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (AvisaStationCategoryEntity avisaStationCategoryEntity : list) {
                avisaStationCategoryMapper = this.f4600d.avisaStationCategoryMapper;
                arrayList.add(avisaStationCategoryMapper.entityToDomain(avisaStationCategoryEntity));
            }
            this.f4597a = 1;
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
