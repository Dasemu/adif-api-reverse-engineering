package com.adif.elcanomovil.repositories.stationObservations;

import com.adif.elcanomovil.domain.entities.stationObservations.StationObservation;
import com.adif.elcanomovil.domain.entities.stationObservations.StationObservationType;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.ObservationDTO;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.ObservationTypeDTO;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.StationObservationsDTO;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.StationObservationsRequest;
import com.adif.elcanomovil.serviceNetworking.stationObservations.model.StationObservationsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper;", "", "()V", "domainToRequest", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsRequest;", "stations", "", "", "responseToDomain", "Lcom/adif/elcanomovil/domain/entities/stationObservations/StationObservation;", "obs", "Lcom/adif/elcanomovil/serviceNetworking/stationObservations/model/StationObservationsResponse;", "repositories_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStationObservationsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StationObservationsMapper.kt\ncom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1855#2:36\n1549#2:37\n1620#2,3:38\n1856#2:41\n*S KotlinDebug\n*F\n+ 1 StationObservationsMapper.kt\ncom/adif/elcanomovil/repositories/stationObservations/StationObservationsMapper\n*L\n15#1:36\n17#1:37\n17#1:38,3\n15#1:41\n*E\n"})
/* loaded from: classes.dex */
public final class StationObservationsMapper {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObservationTypeDTO.values().length];
            try {
                iArr[ObservationTypeDTO.INCIDENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObservationTypeDTO.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final StationObservationsRequest domainToRequest(List<String> stations) {
        Intrinsics.checkNotNullParameter(stations, "stations");
        return new StationObservationsRequest(stations);
    }

    public final List<StationObservation> responseToDomain(StationObservationsResponse obs) {
        StationObservationType stationObservationType;
        Intrinsics.checkNotNullParameter(obs, "obs");
        ArrayList arrayList = new ArrayList();
        for (StationObservationsDTO stationObservationsDTO : obs.getObservations()) {
            List<ObservationDTO> observations = stationObservationsDTO.getObservations();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.g(observations));
            for (ObservationDTO observationDTO : observations) {
                boolean avldmd = observationDTO.getAvldmd();
                boolean cercanias = observationDTO.getCercanias();
                String observation = observationDTO.getObservation();
                if (observation == null) {
                    observation = "";
                }
                String stationCode = stationObservationsDTO.getStationCode();
                int i = WhenMappings.$EnumSwitchMapping$0[observationDTO.getType().ordinal()];
                if (i == 1) {
                    stationObservationType = StationObservationType.WARNING;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stationObservationType = StationObservationType.INFO;
                }
                arrayList2.add(new StationObservation(avldmd, cercanias, observation, stationCode, stationObservationType));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
