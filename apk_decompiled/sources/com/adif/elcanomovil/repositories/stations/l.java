package com.adif.elcanomovil.repositories.stations;

import com.adif.elcanomovil.repositories.utils.REGEX_UNACCENTKt;
import com.adif.elcanomovil.serviceStorage.database.StationsDao;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultStationsRepository f4701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DefaultStationsRepository defaultStationsRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.f4701a = defaultStationsRepository;
        this.f4702b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f4701a, this.f4702b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StationsDao stationsDao;
        String replace$default;
        int collectionSizeOrDefault;
        StationMapper stationMapper;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DefaultStationsRepository defaultStationsRepository = this.f4701a;
        stationsDao = defaultStationsRepository.stationsDao;
        replace$default = StringsKt__StringsJVMKt.replace$default(REGEX_UNACCENTKt.unaccent(this.f4702b), " ", "%", false, 4, (Object) null);
        List<StationEntity> coincidences = stationsDao.getCoincidences(replace$default);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(coincidences, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (StationEntity stationEntity : coincidences) {
            stationMapper = defaultStationsRepository.stationMapper;
            arrayList.add(stationMapper.entityToDomain(stationEntity));
        }
        return arrayList;
    }
}
