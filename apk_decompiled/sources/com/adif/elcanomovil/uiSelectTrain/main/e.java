package com.adif.elcanomovil.uiSelectTrain.main;

import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainSituationViewData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class e implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectTrainViewModel f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5240b;

    public e(SelectTrainViewModel selectTrainViewModel, String str) {
        this.f5239a = selectTrainViewModel;
        this.f5240b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        MutableStateFlow mutableStateFlow;
        ?? emptyList;
        TrainSituationViewData trainSituationViewData;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        AsyncResult asyncResult = (AsyncResult) obj;
        int i = SelectTrainViewModel$fetchTrain$1$2$WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()];
        SelectTrainViewModel selectTrainViewModel = this.f5239a;
        if (i == 1) {
            mutableStateFlow = selectTrainViewModel._viewData;
            List list = (List) asyncResult.getData();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(((TrainInfo) obj2).getLaunchingDate()));
                    if (calendar.get(6) == Calendar.getInstance().get(6)) {
                        arrayList.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                emptyList = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    TrainInfo trainInfo = (TrainInfo) next;
                    if (hashSet.add(new Triple(trainInfo.getCommercialNumber(), trainInfo.getOriginStation(), trainInfo.getDestinationStation()))) {
                        emptyList.add(next);
                    }
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            int size = emptyList.size();
            if (size == 0) {
                trainSituationViewData = TrainSituationViewData.Empty.INSTANCE;
            } else if (size != 1) {
                trainSituationViewData = new TrainSituationViewData.Data(emptyList);
            } else {
                TrainInfo trainInfo2 = (TrainInfo) emptyList.get(0);
                this.f5239a.saveTrainSelected(trainInfo2.getOperator(), trainInfo2.getCommercialProduct(), this.f5240b, trainInfo2.getOriginStation().getStationCode(), trainInfo2.getDestinationStation().getStationCode(), trainInfo2.getDate(), trainInfo2.getLaunchingDate(), trainInfo2.getObservation());
                trainSituationViewData = new TrainSituationViewData.Data(emptyList);
            }
            mutableStateFlow.setValue(trainSituationViewData);
        } else if (i == 2) {
            mutableStateFlow2 = selectTrainViewModel._viewData;
            mutableStateFlow2.setValue(TrainSituationViewData.Error.INSTANCE);
        } else if (i == 3) {
            mutableStateFlow3 = selectTrainViewModel._viewData;
            mutableStateFlow3.setValue(TrainSituationViewData.Loading.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
