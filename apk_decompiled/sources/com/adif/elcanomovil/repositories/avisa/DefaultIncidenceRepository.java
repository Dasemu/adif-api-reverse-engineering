package com.adif.elcanomovil.repositories.avisa;

import C.w;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.adif.elcanomovil.serviceNetworking.avisa.IncidenceService;
import com.adif.elcanomovil.serviceStorage.database.IncidenceDao;
import com.adif.elcanomovil.serviceStorage.model.avisa.AvisaToken;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import d1.InterfaceC0307a;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Singleton
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u001a0\u0019H\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u00192\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/adif/elcanomovil/repositories/avisa/DefaultIncidenceRepository;", "Lcom/adif/elcanomovil/domain/repositories/avisa/IncidenceRepository;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;", "incidenceService", "Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "incidenceDao", "Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "incidencePictureMapper", "Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;", "incidenceMapper", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "preferenceStorage", "Ld1/a;", "appDispatcher", "<init>", "(Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;Ld1/a;)V", "", "categoryId", "description", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;", "notificationTypeId", "stationId", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "listPictures", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "createIncidence", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceNotificationType;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "incidences", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ServicePaths.IncidenceService.pathIncidenceId, "incidenceDetails", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adif/elcanomovil/serviceNetworking/avisa/IncidenceService;", "Lcom/adif/elcanomovil/serviceStorage/database/IncidenceDao;", "Lcom/adif/elcanomovil/repositories/avisa/IncidencePictureMapper;", "Lcom/adif/elcanomovil/repositories/avisa/IncidenceMapper;", "Ld1/a;", "header", "Ljava/lang/String;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultIncidenceRepository implements IncidenceRepository {
    private final InterfaceC0307a appDispatcher;
    private final String header;
    private final IncidenceDao incidenceDao;
    private final IncidenceMapper incidenceMapper;
    private final IncidencePictureMapper incidencePictureMapper;
    private final IncidenceService incidenceService;

    @Inject
    public DefaultIncidenceRepository(IncidenceService incidenceService, IncidenceDao incidenceDao, IncidencePictureMapper incidencePictureMapper, IncidenceMapper incidenceMapper, PreferenceStorage preferenceStorage, InterfaceC0307a appDispatcher) {
        Intrinsics.checkNotNullParameter(incidenceService, "incidenceService");
        Intrinsics.checkNotNullParameter(incidenceDao, "incidenceDao");
        Intrinsics.checkNotNullParameter(incidencePictureMapper, "incidencePictureMapper");
        Intrinsics.checkNotNullParameter(incidenceMapper, "incidenceMapper");
        Intrinsics.checkNotNullParameter(preferenceStorage, "preferenceStorage");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        this.incidenceService = incidenceService;
        this.incidenceDao = incidenceDao;
        this.incidencePictureMapper = incidencePictureMapper;
        this.incidenceMapper = incidenceMapper;
        this.appDispatcher = appDispatcher;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        AvisaToken avisaToken = preferenceStorage.getAvisaToken();
        this.header = w.s(new Object[]{avisaToken != null ? avisaToken.getAccessToken() : null}, 1, "Bearer %s", "format(...)");
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository
    public Object createIncidence(String str, String str2, IncidenceNotificationType incidenceNotificationType, String str3, List<IncidencePicture> list, Continuation<? super Flow<AsyncResult>> continuation) {
        return FlowKt.flow(new n(this, str, str2, incidenceNotificationType, str3, list, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository
    public Object incidenceDetails(int i, Continuation<? super Flow<AsyncResult<IncidenceStation>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new o(this, i, null), continuation);
    }

    @Override // com.adif.elcanomovil.domain.repositories.avisa.IncidenceRepository
    public Object incidences(Continuation<? super Flow<? extends AsyncResult<? extends List<IncidenceStation>>>> continuation) {
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new r(this, null), continuation);
    }
}
