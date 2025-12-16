package com.adif.elcanomovil.uiSelectTrain.main;

import Z2.AbstractC0104l;
import Z2.D;
import Z2.G;
import androidx.lifecycle.Q;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.viewmodel.ArgsViewModel;
import com.adif.elcanomovil.domain.entities.StorableTrain;
import com.adif.elcanomovil.domain.entities.utils.Status;
import com.adif.elcanomovil.domain.usecases.circulation.GetSeveralPathsUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentTrainSearchesUseCase;
import com.adif.elcanomovil.domain.usecases.recentSearch.SaveRecentTrainSearchUseCase;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo;
import com.adif.elcanomovil.uiSelectTrain.entities.TrainSituationViewData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b#\u0010$J4\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0&0%2\u0016\u0010(\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&\u0018\u00010%H\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010\u0018J\r\u0010-\u001a\u00020\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0015\u0010.\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u0018J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u0018JO\u00100\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b0\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002070:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u0002070:8\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020C0F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR0\u0010L\u001a\b\u0012\u0004\u0012\u00020)0&2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020)0&8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/adif/elcanomovil/uiSelectTrain/main/SelectTrainViewModel;", "Lcom/adif/elcanomovil/commonNavGraph/viewmodel/ArgsViewModel;", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetSeveralPathsUseCase;", "getSeveralPathsUseCase", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentTrainSearchesUseCase;", "getRecentTrainSearchesUseCase", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentTrainSearchUseCase;", "saveRecentTrainSearchesUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Landroidx/lifecycle/n0;", "savedStateHandle", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/circulation/GetSeveralPathsUseCase;Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentTrainSearchesUseCase;Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentTrainSearchUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Landroidx/lifecycle/n0;)V", "", "searchText", "", "isValidSearchText", "(Ljava/lang/String;)Z", "fillTrainNumberWithZeros", "(Ljava/lang/String;)Ljava/lang/String;", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "", "fetchTrain", "(Ljava/lang/String;)V", "fetchRecentSearches", "()V", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, NavArguments.ARG_DYNAMIC_LINKS_STATION_CODE, NavArguments.ARG_DYNAMIC_LINKS_STATION_TO_CODE, "", "date", NavArguments.ARG_DYNAMIC_LINKS_LAUNCHDATE, "observation", "saveTrainSelected", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "Lcom/adif/elcanomovil/domain/entities/circulation/CommercialPathRouteSidesInfo;", "commercialPathStepListSideInfo", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainInfo;", "mapToTrainInfo", "(Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onViewsLoaded", "handleBackPressed", "handleSearchTextIntroduced", "handleSearchTextChange", "onTrainTapped", "Lcom/adif/elcanomovil/domain/usecases/circulation/GetSeveralPathsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/GetRecentTrainSearchesUseCase;", "Lcom/adif/elcanomovil/domain/usecases/recentSearch/SaveRecentTrainSearchUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Landroidx/lifecycle/n0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/adif/elcanomovil/uiSelectTrain/entities/TrainSituationViewData;", "_viewData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Q;", "viewData", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "_savedSearchData", "savedSearchData", "getSavedSearchData", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "value", "userLastSearches", "Ljava/util/List;", "setUserLastSearches", "(Ljava/util/List;)V", "ui-select-train_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectTrainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectTrainViewModel.kt\ncom/adif/elcanomovil/uiSelectTrain/main/SelectTrainViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1549#2:303\n1620#2,3:304\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n*S KotlinDebug\n*F\n+ 1 SelectTrainViewModel.kt\ncom/adif/elcanomovil/uiSelectTrain/main/SelectTrainViewModel\n*L\n64#1:303\n64#1:304,3\n284#1:307\n284#1:308,3\n286#1:311\n286#1:312,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SelectTrainViewModel extends ArgsViewModel {
    private final MutableStateFlow<TrainSituationViewData> _savedSearchData;
    private final MutableStateFlow<TrainSituationViewData> _viewData;
    private final GetRecentTrainSearchesUseCase getRecentTrainSearchesUseCase;
    private final GetSeveralPathsUseCase getSeveralPathsUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private final SaveRecentTrainSearchUseCase saveRecentTrainSearchesUseCase;
    private final Q savedSearchData;
    private final n0 savedStateHandle;
    private List<TrainInfo> userLastSearches;
    private final Q viewData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SelectTrainViewModel(GetSeveralPathsUseCase getSeveralPathsUseCase, GetRecentTrainSearchesUseCase getRecentTrainSearchesUseCase, SaveRecentTrainSearchUseCase saveRecentTrainSearchesUseCase, GetStationByIdUseCase getStationByIdUseCase, n0 savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(getSeveralPathsUseCase, "getSeveralPathsUseCase");
        Intrinsics.checkNotNullParameter(getRecentTrainSearchesUseCase, "getRecentTrainSearchesUseCase");
        Intrinsics.checkNotNullParameter(saveRecentTrainSearchesUseCase, "saveRecentTrainSearchesUseCase");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.getSeveralPathsUseCase = getSeveralPathsUseCase;
        this.getRecentTrainSearchesUseCase = getRecentTrainSearchesUseCase;
        this.saveRecentTrainSearchesUseCase = saveRecentTrainSearchesUseCase;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.savedStateHandle = savedStateHandle;
        this._viewData = StateFlowKt.MutableStateFlow(null);
        k kVar = new k(this, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        this.viewData = q0.k(emptyCoroutineContext, kVar);
        this._savedSearchData = StateFlowKt.MutableStateFlow(null);
        this.savedSearchData = q0.k(emptyCoroutineContext, new i(this, null));
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        this.userLastSearches = CollectionsKt.emptyList();
    }

    private final void fetchRecentSearches() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new d(this, null), 3, null);
    }

    private final void fetchTrain(String commercialNumber) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new f(this, commercialNumber, null), 3, null);
    }

    private final String fillTrainNumberWithZeros(String searchText) {
        String padStart;
        if (StringsKt.isBlank(searchText) || searchText.length() >= 5) {
            return searchText;
        }
        padStart = StringsKt__StringsKt.padStart(searchText, 5, '0');
        return padStart;
    }

    private final boolean isValidSearchText(String searchText) {
        return !StringsKt.isBlank(searchText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0199, code lost:
    
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0176 -> B:11:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapToTrainInfo(com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<com.adif.elcanomovil.domain.entities.circulation.CommercialPathRouteSidesInfo>> r14, kotlin.coroutines.Continuation<? super com.adif.elcanomovil.domain.entities.utils.AsyncResult<? extends java.util.List<com.adif.elcanomovil.uiSelectTrain.entities.TrainInfo>>> r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adif.elcanomovil.uiSelectTrain.main.SelectTrainViewModel.mapToTrainInfo(com.adif.elcanomovil.domain.entities.utils.AsyncResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTrainSelected(String operator, String commercialProduct, String commercialNumber, String originStationCode, String destinationStationCode, long date, long launchingDate, String observation) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new h(this, operator, commercialProduct, commercialNumber, originStationCode, destinationStationCode, date, launchingDate, observation, null), 3, null);
        AbstractC0104l a2 = new G(new D()).a(StorableTrain.class);
        b1.f fVar = this.navigationFlow;
        String str = (String) this.savedStateHandle.c("result_name");
        if (str == null) {
            str = NavArguments.RESULT_TRAIN;
        }
        fVar.b(new Navigation.BackWithResult(str, a2.toJson(new StorableTrain(operator, commercialProduct, commercialNumber, originStationCode, destinationStationCode, date, launchingDate, observation))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserLastSearches(List<TrainInfo> list) {
        int collectionSizeOrDefault;
        List<TrainInfo> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TrainInfo trainInfo : list2) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Unit unit = Unit.INSTANCE;
            arrayList.add(TrainInfo.copy$default(trainInfo, null, null, null, null, null, 0L, calendar.getTimeInMillis(), null, 191, null));
        }
        this.userLastSearches = arrayList;
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new j(this, null), 3, null);
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getSavedSearchData() {
        return this.savedSearchData;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final void handleBackPressed() {
        this.navigationFlow.b(Navigation.Back.INSTANCE);
    }

    public final void handleSearchTextChange(String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        if (StringsKt.isBlank(searchText)) {
            setUserLastSearches(this.userLastSearches);
        }
    }

    public final void handleSearchTextIntroduced(String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        String fillTrainNumberWithZeros = fillTrainNumberWithZeros(searchText);
        if (isValidSearchText(fillTrainNumberWithZeros)) {
            fetchTrain(fillTrainNumberWithZeros);
        } else {
            setUserLastSearches(this.userLastSearches);
        }
    }

    public final void onTrainTapped(String operator, String commercialProduct, String commercialNumber, String originStationCode, String destinationStationCode, long date, long launchingDate, String observation) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(commercialProduct, "commercialProduct");
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Intrinsics.checkNotNullParameter(originStationCode, "originStationCode");
        Intrinsics.checkNotNullParameter(destinationStationCode, "destinationStationCode");
        saveTrainSelected(operator, commercialProduct, commercialNumber, originStationCode, destinationStationCode, date, launchingDate, observation);
    }

    public final void onViewsLoaded(String commercialNumber) {
        Unit unit;
        if (commercialNumber != null) {
            fetchTrain(commercialNumber);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            fetchRecentSearches();
        }
    }
}
