package com.adif.elcanomovil.repositories.avisa;

import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository;
import com.adif.elcanomovil.serviceNetworking.avisa.AvisaStationsService;
import com.adif.elcanomovil.serviceStorage.database.AvisaStationDao;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import d1.InterfaceC0307a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J*\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00130\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/DefaultAvisaStationsRepository;", "Lcom/adif/elcanomovil/domain/repositories/avisa/AvisaStationsRepository;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;", "stationsService", "Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "stationsDao", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "avisaStationMapper", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "avisaStationCategoryMapper", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Ld1/a;", "appDispatcher", "<init>", "(Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Ld1/a;)V", "", "shouldFetch", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", RemoteConfigComponent.FETCH_FILE_NAME, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "fetchStationCategories", "", "stationId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/AvisaStationsService;", "Lcom/adif/elcanomovil/serviceStorage/database/AvisaStationDao;", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationMapper;", "Lcom/adif/elcanomovil/repositories/avisa/AvisaStationCategoryMapper;", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "Ld1/a;", "", "categoriesCache", "Ljava/util/Map;", "", "CACHE_SIZE", "I", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAvisaStationsRepository implements AvisaStationsRepository {
    private final int CACHE_SIZE;
    private final InterfaceC0307a appDispatcher;
    private final AvisaStationCategoryMapper avisaStationCategoryMapper;
    private final AvisaStationMapper avisaStationMapper;
    private final Map<String, List<AvisaStationCategory>> categoriesCache;
    private final PreferenceStorage preferenceStorage;
    private final AvisaStationDao stationsDao;
    private final AvisaStationsService stationsService;

    @Inject
    public DefaultAvisaStationsRepository(AvisaStationsService stationsService, AvisaStationDao stationsDao, AvisaStationMapper avisaStationMapper, AvisaStationCategoryMapper avisaStationCategoryMapper, PreferenceStorage preferenceStorage, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(stationsService, "stationsService");
        Intrinsics.checkNotNullParameter(stationsDao, "stationsDao");
        Intrinsics.checkNotNullParameter(avisaStationMapper, "avisaStationMapper");
        Intrinsics.checkNotNullParameter(avisaStationCategoryMapper, "avisaStationCategoryMapper");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.stationsService = stationsService;
        this.stationsDao = stationsDao;
        this.avisaStationMapper = avisaStationMapper;
        this.avisaStationCategoryMapper = avisaStationCategoryMapper;
        this.preferenceStorage = preferenceStorage;
        this.appDispatcher = appDispatcher;
        this.CACHE_SIZE = 5;
        this.categoriesCache = new HashMap();
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository
    public Object fetch(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStation>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new f(this, z3, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository
    public Object fetchStationCategories(boolean z3, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new i(this, z3, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.AvisaStationsRepository
    public Object fetchStationCategories(String str, Continuation<? super Flow<? extends AsyncResult<? extends List<AvisaStationCategory>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new l(this, str, null), continuation);
    }
}
