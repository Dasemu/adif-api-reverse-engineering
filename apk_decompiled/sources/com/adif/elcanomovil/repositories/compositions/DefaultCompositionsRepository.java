package com.adif.elcanomovil.repositories.compositions;

import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.domain.entities.compositions.Composition;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.domain.repositories.circulation.CirculationRepository;
import com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository;
import com.adif.elcanomovil.serviceNetworking.compositions.CompositionsService;
import com.adif.elcanomovil.serviceStorage.preferences.PreferenceStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import r1.C0566a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ@\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b0\u000e2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/repositories/compositions/DefaultCompositionsRepository;", "Lcom/adif/elcanomovil/domain/repositories/compositions/CompositionsRepository;", "compositionService", "Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;", "compositionsMapper", "Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;", "storage", "Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;", "(Lcom/adif/elcanomovil/serviceNetworking/compositions/CompositionsService;Lcom/adif/elcanomovil/repositories/compositions/CompositionsMapper;Lcom/adif/elcanomovil/serviceStorage/preferences/PreferenceStorage;)V", NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "getDestinationStationCode", "()Ljava/lang/String;", "destinationStationCodeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "getDestinationStationCodeAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "destinationStationCodeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, "getOriginStationCode", "originStationCodeAsFlow", "getOriginStationCodeAsFlow", "originStationCodeFlow", "trainTypeRequest", "Lcom/adif/elcanomovil/domain/repositories/circulation/CirculationRepository$TrainTypeRequest;", "compositions", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/compositions/Composition;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLastValues", "", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultCompositionsRepository implements CompositionsRepository {
    private final CompositionsService compositionService;
    private final CompositionsMapper compositionsMapper;
    private final Flow<String> destinationStationCodeAsFlow;
    private MutableStateFlow<String> destinationStationCodeFlow;
    private final Flow<String> originStationCodeAsFlow;
    private MutableStateFlow<String> originStationCodeFlow;
    private final PreferenceStorage storage;
    private CirculationRepository.TrainTypeRequest trainTypeRequest;

    public DefaultCompositionsRepository(CompositionsService compositionService, CompositionsMapper compositionsMapper, PreferenceStorage storage) {
        Intrinsics.checkNotNullParameter(compositionService, "compositionService");
        Intrinsics.checkNotNullParameter(compositionsMapper, "compositionsMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.compositionService = compositionService;
        this.compositionsMapper = compositionsMapper;
        this.storage = storage;
        this.originStationCodeFlow = StateFlowKt.MutableStateFlow(null);
        this.destinationStationCodeFlow = StateFlowKt.MutableStateFlow(null);
        this.originStationCodeAsFlow = FlowKt.filterNotNull(this.originStationCodeFlow);
        this.destinationStationCodeAsFlow = FlowKt.filterNotNull(this.destinationStationCodeFlow);
        readLastValues();
    }

    private final void readLastValues() {
        this.originStationCodeFlow.setValue(this.storage.getLastDeparturesArrivalsStationCode());
        this.destinationStationCodeFlow.setValue(this.storage.getLastDeparturesArrivalsStationToCode());
    }

    @Override // com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository
    public Object compositions(String str, String str2, long j4, String str3, Continuation<? super Flow<? extends AsyncResult<? extends List<Composition>>>> continuation) {
        return FlowKt.flow(new C0566a(this, str, str2, j4, str3, null));
    }

    @Override // com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository
    public String getDestinationStationCode() {
        return this.destinationStationCodeFlow.getValue();
    }

    @Override // com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository
    public Flow<String> getDestinationStationCodeAsFlow() {
        return this.destinationStationCodeAsFlow;
    }

    @Override // com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository
    public String getOriginStationCode() {
        return this.originStationCodeFlow.getValue();
    }

    @Override // com.adif.elcanomovil.domain.repositories.compositions.CompositionsRepository
    public Flow<String> getOriginStationCodeAsFlow() {
        return this.originStationCodeAsFlow;
    }
}
