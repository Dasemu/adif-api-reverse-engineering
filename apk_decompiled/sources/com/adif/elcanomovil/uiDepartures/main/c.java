package com.adif.elcanomovil.uiDepartures.main;

import com.adif.elcanomovil.commonNavGraph.arguments.Filter;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsFragment;
import com.adif.elcanomovil.uiDepartures.main.oneway.CirculationsViewModel;
import com.adif.elcanomovil.uiDepartures.views.StationAction;
import com.adif.elcanomovil.uiStations.main.StationsFragment;
import com.adif.elcanomovil.uiSubscriptions.create.SubscriptionCreationFragment;
import com.adif.elcanomovil.uiTrain.entities.Step;
import com.adif.elcanomovil.uiTrain.main.TrainSituationFragment;
import com.adif.elcanomovil.uiTrain.main.TrainSituationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i, obj, cls, str, str2, i4);
        this.f4934a = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4934a) {
            case 0:
                ((DeparturesViewModel) this.receiver).handleStationSelectedForServices(((Number) obj).intValue());
                return Unit.INSTANCE;
            case 1:
                ((DeparturesViewModel) this.receiver).handleStationSelectedForCommercial(((Number) obj).intValue());
                return Unit.INSTANCE;
            case 2:
                ((CirculationsViewModel) this.receiver).handleCirculationObservationTap((String) obj);
                return Unit.INSTANCE;
            case 3:
                TrainCirculation p02 = (TrainCirculation) obj;
                Intrinsics.checkNotNullParameter(p02, "p0");
                CirculationsFragment.access$handleTrainTap((CirculationsFragment) this.receiver, p02);
                return Unit.INSTANCE;
            case 4:
                TrainType p03 = (TrainType) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((CirculationsViewModel) this.receiver).handleTrainTypeChange(p03);
                return Unit.INSTANCE;
            case 5:
                StationAction p04 = (StationAction) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                ((CirculationsViewModel) this.receiver).handleHeaderButtonTap(p04);
                return Unit.INSTANCE;
            case 6:
                ((CirculationsViewModel) this.receiver).handleCirculationObservationTap((String) obj);
                return Unit.INSTANCE;
            case 7:
                TrainCirculation p05 = (TrainCirculation) obj;
                Intrinsics.checkNotNullParameter(p05, "p0");
                CirculationsFragment.access$handleTrainTap((CirculationsFragment) this.receiver, p05);
                return Unit.INSTANCE;
            case 8:
                String p06 = (String) obj;
                Intrinsics.checkNotNullParameter(p06, "p0");
                ((CirculationsViewModel) this.receiver).handleOriginStationSelected(p06);
                return Unit.INSTANCE;
            case 9:
                String p07 = (String) obj;
                Intrinsics.checkNotNullParameter(p07, "p0");
                ((CirculationsViewModel) this.receiver).handleDestinationStationSelected(p07);
                return Unit.INSTANCE;
            case 10:
                Filter p08 = (Filter) obj;
                Intrinsics.checkNotNullParameter(p08, "p0");
                ((CirculationsViewModel) this.receiver).handleFilterChanged(p08);
                return Unit.INSTANCE;
            case 11:
                String p09 = (String) obj;
                Intrinsics.checkNotNullParameter(p09, "p0");
                ((StationsFragment) this.receiver).handleSelectedStation(p09);
                return Unit.INSTANCE;
            case 12:
                String p010 = (String) obj;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((SubscriptionCreationFragment) this.receiver).handleSelectedStation(p010);
                return Unit.INSTANCE;
            case 13:
                String p011 = (String) obj;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((SubscriptionCreationFragment) this.receiver).handleSelectedStationTo(p011);
                return Unit.INSTANCE;
            case 14:
                Step p012 = (Step) obj;
                Intrinsics.checkNotNullParameter(p012, "p0");
                TrainSituationFragment.access$onTapStep((TrainSituationFragment) this.receiver, p012);
                return Unit.INSTANCE;
            case 15:
                Step p013 = (Step) obj;
                Intrinsics.checkNotNullParameter(p013, "p0");
                TrainSituationFragment.access$onObservationTapped((TrainSituationFragment) this.receiver, p013);
                return Unit.INSTANCE;
            case 16:
                String p014 = (String) obj;
                Intrinsics.checkNotNullParameter(p014, "p0");
                TrainSituationFragment.access$handleSelectedTrain((TrainSituationFragment) this.receiver, p014);
                return Unit.INSTANCE;
            default:
                Filter p015 = (Filter) obj;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ((TrainSituationViewModel) this.receiver).handleFilterChanged(p015);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj) {
        super(1, obj, CirculationsFragment.class, "handleTrainTap", "handleTrainTap(Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;)V", 0);
        this.f4934a = 7;
    }
}
