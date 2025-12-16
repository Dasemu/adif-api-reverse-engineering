package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.serviceNetworking.avisa.IncidenceService;
import com.adif.elcanomovil.serviceNetworking.avisa.model.CreateIncidenceRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultIncidenceRepository f4612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IncidenceNotificationType f4615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(DefaultIncidenceRepository defaultIncidenceRepository, String str, String str2, IncidenceNotificationType incidenceNotificationType, String str3, List list, Continuation continuation) {
        super(2, continuation);
        this.f4612b = defaultIncidenceRepository;
        this.f4613c = str;
        this.f4614d = str2;
        this.f4615e = incidenceNotificationType;
        this.f4616f = str3;
        this.f4617g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f4612b, this.f4613c, this.f4614d, this.f4615e, this.f4616f, this.f4617g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IncidenceService incidenceService;
        String str;
        int collectionSizeOrDefault;
        IncidencePictureMapper incidencePictureMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4611a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DefaultIncidenceRepository defaultIncidenceRepository = this.f4612b;
        incidenceService = defaultIncidenceRepository.incidenceService;
        str = defaultIncidenceRepository.header;
        String valueOf = String.valueOf(this.f4615e.getValue());
        List<IncidencePicture> list = this.f4617g;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IncidencePicture incidencePicture : list) {
            incidencePictureMapper = defaultIncidenceRepository.incidencePictureMapper;
            arrayList.add(incidencePictureMapper.domainToRequest(incidencePicture));
        }
        CreateIncidenceRequest createIncidenceRequest = new CreateIncidenceRequest(this.f4613c, this.f4614d, valueOf, this.f4616f, arrayList);
        this.f4611a = 1;
        Object createIncidence = incidenceService.createIncidence(str, createIncidenceRequest, this);
        return createIncidence == coroutine_suspended ? coroutine_suspended : createIncidence;
    }
}
