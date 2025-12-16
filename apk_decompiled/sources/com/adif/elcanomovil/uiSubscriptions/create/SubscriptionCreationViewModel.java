package com.adif.elcanomovil.uiSubscriptions.create;

import android.content.Context;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.MainNavigationDirections;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.entities.subscription.SubscriptionType;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ModifySubscriptionsUseCase;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.resources.StringUtils;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.adif.elcanomovil.uiSubscriptions.create.views.JourneyAction;
import com.adif.elcanomovil.uiSubscriptions.create.views.TrainAction;
import com.adif.elcanomovil.uiSubscriptions.create.views.data.SubscriptionCreateViewData;
import com.adif.elcanomovil.uiSubscriptions.utils.AnticipationType;
import com.adif.elcanomovil.uiSubscriptions.utils.SubscriptionHelper;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@HiltViewModel
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010 \u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b \u0010!J5\u0010\u0014\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0014\u0010$J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b1\u00100J\u0015\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u001c¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0016¢\u0006\u0004\b6\u00100J\u0015\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020;¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020;¢\u0006\u0004\b?\u0010=J\r\u0010@\u001a\u00020\u0010¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0010¢\u0006\u0004\bB\u0010AJ\r\u0010C\u001a\u00020\u0010¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010AJ\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010JR$\u0010L\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120U8\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u0010XR \u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\"0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\"0U8\u0006¢\u0006\f\n\u0004\b^\u0010V\u001a\u0004\b_\u0010XR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010`R\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020d0g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001b\u0010t\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bs\u0010pR\u001d\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100Z0U8F¢\u0006\u0006\u001a\u0004\bu\u0010X¨\u0006w"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/CreateSubscriptionsUseCase;", "createSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "getStationByIdUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;", "deleteSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ModifySubscriptionsUseCase;", "modifySubscriptionsUseCase", "Landroid/content/Context;", "context", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/CreateSubscriptionsUseCase;Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ModifySubscriptionsUseCase;Landroid/content/Context;)V", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "subscriptionData", "", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)V", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;", "viewData", "configure", "(Lcom/adif/elcanomovil/uiSubscriptions/create/views/data/SubscriptionCreateViewData;)V", "", "stationCode", "stationToCode", "trainCode", "", "trainDate", "Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;", "anticipationType", NavArguments.ARG_DYNAMIC_LINKS_OPERATOR, NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_PRODUCT, "configureTrain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;Ljava/lang/String;Ljava/lang/String;)V", "", "isCercanias", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;)V", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/JourneyAction;", "journeyAction", "handleHeaderButtonTap", "(Lcom/adif/elcanomovil/uiSubscriptions/create/views/JourneyAction;)V", "Lcom/adif/elcanomovil/uiSubscriptions/create/views/TrainAction;", "trainAction", "handleHeaderTrainButtonTap", "(Lcom/adif/elcanomovil/uiSubscriptions/create/views/TrainAction;)V", "handleTrainTypeChange", "(Z)V", "changeStation", "(Ljava/lang/String;)V", "changeStationTo", "typeAnticipation", "setAnticipationTime", "(Lcom/adif/elcanomovil/uiSubscriptions/utils/AnticipationType;)V", "day", "setRepetitionDay", "Ljava/util/Date;", "it", "setInitialTimeFrom", "(Ljava/util/Date;)V", "Lkotlinx/coroutines/Job;", "createSusbscription", "()Lkotlinx/coroutines/Job;", "modifySusbscription", "deleteSusbscription", "navigateToStations", "()V", "showErrorDialog", "subscriptiondeleted", "handleSearchButtonTap", "handleSearchToButtonTap", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/CreateSubscriptionsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/stations/GetStationByIdUseCase;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ModifySubscriptionsUseCase;", "Landroid/content/Context;", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "typeOfMode", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "getTypeOfMode", "()Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "setTypeOfMode", "(Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;)V", "Landroidx/lifecycle/X;", "_viewData", "Landroidx/lifecycle/X;", "Landroidx/lifecycle/Q;", "Landroidx/lifecycle/Q;", "getViewData", "()Landroidx/lifecycle/Q;", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "_resultCreateSubscription", "Landroidx/lifecycle/W;", "_deleteSubscription", "deleteSubscription", "getDeleteSubscription", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", "reallyActionPressed", "Z", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryWithOutActions$delegate", "Lkotlin/Lazy;", "getMandatoryWithOutActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryWithOutActions", "mandatoryWithActions$delegate", "getMandatoryWithActions", "mandatoryWithActions", "getResultCreateSubscription", "resultCreateSubscription", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionCreationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionCreationViewModel.kt\ncom/adif/elcanomovil/uiSubscriptions/create/SubscriptionCreationViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
/* loaded from: classes3.dex */
public final class SubscriptionCreationViewModel extends w0 {
    private final W _deleteSubscription;
    private final W _resultCreateSubscription;
    private final X _viewData;
    private final Context context;
    private final CreateSubscriptionsUseCase createSubscriptionsUseCase;
    private final Q deleteSubscription;
    private final DeleteSubscriptionsUseCase deleteSubscriptionsUseCase;
    private final GetStationByIdUseCase getStationByIdUseCase;

    /* renamed from: mandatoryWithActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryWithActions;

    /* renamed from: mandatoryWithOutActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryWithOutActions;
    private final ModifySubscriptionsUseCase modifySubscriptionsUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private boolean reallyActionPressed;
    private Subscription subscriptionData;
    private TypeSubscriptionCreationView typeOfMode;
    private final Q viewData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.JOURNEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.TRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[JourneyAction.values().length];
            try {
                iArr2[JourneyAction.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[JourneyAction.SEARCH_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TrainAction.values().length];
            try {
                iArr3[TrainAction.SEARCH_MY_STATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public SubscriptionCreationViewModel(CreateSubscriptionsUseCase createSubscriptionsUseCase, GetStationByIdUseCase getStationByIdUseCase, DeleteSubscriptionsUseCase deleteSubscriptionsUseCase, ModifySubscriptionsUseCase modifySubscriptionsUseCase, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(createSubscriptionsUseCase, "createSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(getStationByIdUseCase, "getStationByIdUseCase");
        Intrinsics.checkNotNullParameter(deleteSubscriptionsUseCase, "deleteSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(modifySubscriptionsUseCase, "modifySubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.createSubscriptionsUseCase = createSubscriptionsUseCase;
        this.getStationByIdUseCase = getStationByIdUseCase;
        this.deleteSubscriptionsUseCase = deleteSubscriptionsUseCase;
        this.modifySubscriptionsUseCase = modifySubscriptionsUseCase;
        this.context = context;
        ?? q4 = new Q();
        this._viewData = q4;
        this.viewData = q4;
        this._resultCreateSubscription = new W();
        W w3 = new W();
        this._deleteSubscription = w3;
        this.deleteSubscription = w3;
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        this.mandatoryWithOutActions = LazyKt.lazy(new q(this));
        this.mandatoryWithActions = LazyKt.lazy(new p(this));
    }

    private final AlertActions getMandatoryWithActions() {
        return (AlertActions) this.mandatoryWithActions.getValue();
    }

    private final AlertActions getMandatoryWithOutActions() {
        return (AlertActions) this.mandatoryWithOutActions.getValue();
    }

    private final void handleSearchButtonTap() {
        this.navigationFlow.b(new Navigation.RootDirection(MainNavigationDirections.INSTANCE.toSelectStationFragment("STATION"), null, 2, null));
    }

    private final void handleSearchToButtonTap() {
        this.navigationFlow.b(new Navigation.RootDirection(MainNavigationDirections.INSTANCE.toSelectStationFragment("STATION_TO"), null, 2, null));
    }

    public final void changeStation(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new h(this, stationCode, null), 2, null);
    }

    public final void changeStationTo(String stationCode) {
        Intrinsics.checkNotNullParameter(stationCode, "stationCode");
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new i(this, stationCode, null), 2, null);
    }

    public final void configure(SubscriptionCreateViewData viewData) {
        SubscriptionType typeSubscription;
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        this._viewData.j(viewData);
        this._viewData.k(viewData);
        String centerTime = viewData.getCenterTime();
        if (centerTime == null || (typeSubscription = viewData.getTypeSubscription()) == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[typeSubscription.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Date stringToDateShort = StringUtils.INSTANCE.stringToDateShort(centerTime);
            if (stringToDateShort != null) {
                setInitialTimeFrom(stringToDateShort);
            }
        }
    }

    public final void configureTrain(String stationCode, String stationToCode, String trainCode, Long trainDate, AnticipationType anticipationType, String operator, String commercialProduct) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new k(stationCode, this, stationToCode, trainCode, operator, commercialProduct, anticipationType, null), 2, null);
    }

    public final Job createSusbscription() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new n(this, null), 2, null);
        return launch$default;
    }

    public final Job deleteSusbscription() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new o(this, null), 2, null);
        return launch$default;
    }

    public final Q getDeleteSubscription() {
        return this.deleteSubscription;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getResultCreateSubscription() {
        return this._resultCreateSubscription;
    }

    public final TypeSubscriptionCreationView getTypeOfMode() {
        return this.typeOfMode;
    }

    public final Q getViewData() {
        return this.viewData;
    }

    public final void handleHeaderButtonTap(JourneyAction journeyAction) {
        Intrinsics.checkNotNullParameter(journeyAction, "journeyAction");
        int i = WhenMappings.$EnumSwitchMapping$1[journeyAction.ordinal()];
        if (i == 1) {
            handleSearchButtonTap();
        } else {
            if (i != 2) {
                return;
            }
            handleSearchToButtonTap();
        }
    }

    public final void handleHeaderTrainButtonTap(TrainAction trainAction) {
        Intrinsics.checkNotNullParameter(trainAction, "trainAction");
        if (WhenMappings.$EnumSwitchMapping$2[trainAction.ordinal()] == 1) {
            handleSearchButtonTap();
        }
    }

    public final void handleTrainTypeChange(boolean isCercanias) {
        X x3 = this._viewData;
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) x3.d();
        if (subscriptionCreateViewData != null) {
            subscriptionCreateViewData.setCercanias(isCercanias);
        } else {
            subscriptionCreateViewData = null;
        }
        x3.j(subscriptionCreateViewData);
    }

    public final Job modifySusbscription() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new s(this, null), 2, null);
        return launch$default;
    }

    public final void navigateToStations() {
        if (this.reallyActionPressed) {
            this.reallyActionPressed = false;
            BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
            String string = this.context.getString(R.string.create_subscription_success_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.context.getString(R.string.create_subscription_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.navigationFlow.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryWithOutActions(), AlertType.WARNING), null, 2, null));
        }
    }

    public final void setAnticipationTime(AnticipationType typeAnticipation) {
        Intrinsics.checkNotNullParameter(typeAnticipation, "typeAnticipation");
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) this._viewData.d();
        if (subscriptionCreateViewData == null) {
            return;
        }
        subscriptionCreateViewData.setAnticipationTime(typeAnticipation);
    }

    public final void setInitialTimeFrom(Date it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SubscriptionCreateViewData subscriptionCreateViewData = (SubscriptionCreateViewData) this._viewData.d();
        if (subscriptionCreateViewData == null) {
            return;
        }
        subscriptionCreateViewData.setInitialTime(it);
    }

    public final void setRepetitionDay(String day) {
        Unit unit;
        SubscriptionCreateViewData subscriptionCreateViewData;
        String repetitionDays;
        Intrinsics.checkNotNullParameter(day, "day");
        SubscriptionCreateViewData subscriptionCreateViewData2 = (SubscriptionCreateViewData) this._viewData.d();
        if (subscriptionCreateViewData2 == null || (repetitionDays = subscriptionCreateViewData2.getRepetitionDays()) == null) {
            unit = null;
        } else {
            SubscriptionCreateViewData subscriptionCreateViewData3 = (SubscriptionCreateViewData) this._viewData.d();
            if (subscriptionCreateViewData3 != null) {
                SubscriptionHelper.Companion companion = SubscriptionHelper.INSTANCE;
                char[] charArray = day.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                subscriptionCreateViewData3.setRepetitionDays(companion.addOrRemoveDay(charArray[0], repetitionDays));
            }
            unit = Unit.INSTANCE;
        }
        if (unit != null || (subscriptionCreateViewData = (SubscriptionCreateViewData) this._viewData.d()) == null) {
            return;
        }
        subscriptionCreateViewData.setRepetitionDays(day);
    }

    public final void setTypeOfMode(TypeSubscriptionCreationView typeSubscriptionCreationView) {
        this.typeOfMode = typeSubscriptionCreationView;
    }

    public final void showErrorDialog() {
        if (this.reallyActionPressed) {
            this.reallyActionPressed = false;
            BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
            String string = this.context.getString(R.string.generic_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.context.getString(R.string.generic_error_message_subscription);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.navigationFlow.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryWithOutActions(), AlertType.ERROR), null, 2, null));
        }
    }

    public final void subscriptionData(Subscription subscriptionData) {
        this.subscriptionData = subscriptionData;
    }

    public final void subscriptiondeleted() {
        if (this.reallyActionPressed) {
            this.reallyActionPressed = false;
            BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
            String string = this.context.getString(R.string.generic_operation_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.context.getString(R.string.subscription_operation_ok_delete_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.navigationFlow.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryWithActions(), AlertType.INFO), null, 2, null));
        }
    }

    public final void configure(Boolean isCercanias, String stationCode, String stationToCode, AnticipationType anticipationType) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new j(stationCode, stationToCode, this, isCercanias, anticipationType, null), 2, null);
    }
}
