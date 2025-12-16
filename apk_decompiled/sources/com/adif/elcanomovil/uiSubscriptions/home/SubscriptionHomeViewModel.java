package com.adif.elcanomovil.uiSubscriptions.home;

import android.content.Context;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertAction;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.subscription.Subscription;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ActiveSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.GetSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import com.adif.elcanomovil.enums.TypeSubscriptionCreationView;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiSubscriptions.R;
import com.google.firebase.messaging.Constants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010!J\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'JI\u0010/\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010(2\b\u0010.\u001a\u0004\u0018\u00010(¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001c¢\u0006\u0004\b1\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0<0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R(\u0010@\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00120?0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R(\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00120?0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020D0G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR\u001b\u0010W\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u001b\u0010Z\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010N\u001a\u0004\bY\u0010PR#\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0<0;0[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R%\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00120?0[8F¢\u0006\u0006\u001a\u0004\b_\u0010]R%\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00120?0[8F¢\u0006\u0006\u001a\u0004\b`\u0010]R\u001d\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0;0[8F¢\u0006\u0006\u001a\u0004\ba\u0010]¨\u0006c"}, d2 = {"Lcom/adif/elcanomovil/uiSubscriptions/home/SubscriptionHomeViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/GetSubscriptionsUseCase;", "getSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;", "deleteSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ActiveSubscriptionsUseCase;", "activeSubscriptionsUseCase", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "muteSubscriptionsUseCase", "Landroid/content/Context;", "context", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/GetSubscriptionsUseCase;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ActiveSubscriptionsUseCase;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;Landroid/content/Context;)V", "Lkotlinx/coroutines/Job;", "loadSubscriptions$ui_subscriptions_proNon_corporateRelease", "()Lkotlinx/coroutines/Job;", "loadSubscriptions", "", "subscriptionId", "", "isUnregister", "deleteSubscription", "(IZ)Lkotlinx/coroutines/Job;", "activeSusbscription", "(I)Lkotlinx/coroutines/Job;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;", "action", "", "handleStatusAction", "(Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction$Style;)V", "handleDeleteAction", "()V", "(I)V", "enableSubscription", "disableSubscription", "Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onSelectedItem", "(Lcom/adif/elcanomovil/domain/entities/subscription/Subscription;)V", "", "stationId", "destinationId", "msgStart", "msgEnd", "repeat", "trainId", "muteSubscription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "showErrorDialog", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/GetSubscriptionsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/DeleteSubscriptionsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/ActiveSubscriptionsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "Landroid/content/Context;", "I", "isDisable", "Z", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "", "_userListSubscriptions", "Landroidx/lifecycle/W;", "Lkotlin/Pair;", "_deleteSubscription", "_muteSubscription", "_resultCreateSubscription", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationFlow", "Lb1/f;", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryActiveActions$delegate", "Lkotlin/Lazy;", "getMandatoryActiveActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryActiveActions", "mandatoryDisableActions$delegate", "getMandatoryDisableActions", "mandatoryDisableActions", "mandatoryDeleteActions$delegate", "getMandatoryDeleteActions", "mandatoryDeleteActions", "mandatoryWithOutActions$delegate", "getMandatoryWithOutActions", "mandatoryWithOutActions", "Landroidx/lifecycle/Q;", "getUserListSubscriptions", "()Landroidx/lifecycle/Q;", "userListSubscriptions", "getDeleteSubscription", "getMuteSubscription", "getResultCreateSubscription", "resultCreateSubscription", "ui-subscriptions_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionHomeViewModel extends w0 {
    private final W _deleteSubscription;
    private final W _muteSubscription;
    private final W _resultCreateSubscription;
    private final W _userListSubscriptions;
    private final ActiveSubscriptionsUseCase activeSubscriptionsUseCase;
    private final Context context;
    private final DeleteSubscriptionsUseCase deleteSubscriptionsUseCase;
    private final GetSubscriptionsUseCase getSubscriptionsUseCase;
    private boolean isDisable;

    /* renamed from: mandatoryActiveActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryActiveActions;

    /* renamed from: mandatoryDeleteActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryDeleteActions;

    /* renamed from: mandatoryDisableActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryDisableActions;

    /* renamed from: mandatoryWithOutActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryWithOutActions;
    private final MuteSubscriptionsUseCase muteSubscriptionsUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationFlow;
    private int subscriptionId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertAction.Style.values().length];
            try {
                iArr[AlertAction.Style.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertAction.Style.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertAction.Style.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public SubscriptionHomeViewModel(GetSubscriptionsUseCase getSubscriptionsUseCase, DeleteSubscriptionsUseCase deleteSubscriptionsUseCase, ActiveSubscriptionsUseCase activeSubscriptionsUseCase, MuteSubscriptionsUseCase muteSubscriptionsUseCase, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(getSubscriptionsUseCase, "getSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(deleteSubscriptionsUseCase, "deleteSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(activeSubscriptionsUseCase, "activeSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(muteSubscriptionsUseCase, "muteSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.getSubscriptionsUseCase = getSubscriptionsUseCase;
        this.deleteSubscriptionsUseCase = deleteSubscriptionsUseCase;
        this.activeSubscriptionsUseCase = activeSubscriptionsUseCase;
        this.muteSubscriptionsUseCase = muteSubscriptionsUseCase;
        this.context = context;
        this.subscriptionId = -1;
        this.isDisable = true;
        this._userListSubscriptions = new W();
        this._deleteSubscription = new W();
        this._muteSubscription = new W();
        this._resultCreateSubscription = new W();
        b1.f fVar = new b1.f();
        this.navigationFlow = fVar;
        this.navigation = fVar;
        loadSubscriptions$ui_subscriptions_proNon_corporateRelease();
        this.mandatoryActiveActions = LazyKt.lazy(new o(this));
        this.mandatoryDisableActions = LazyKt.lazy(new q(this));
        this.mandatoryDeleteActions = LazyKt.lazy(new p(this));
        this.mandatoryWithOutActions = LazyKt.lazy(new r(this));
    }

    public static /* synthetic */ Job deleteSubscription$default(SubscriptionHomeViewModel subscriptionHomeViewModel, int i, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return subscriptionHomeViewModel.deleteSubscription(i, z3);
    }

    private final AlertActions getMandatoryActiveActions() {
        return (AlertActions) this.mandatoryActiveActions.getValue();
    }

    private final AlertActions getMandatoryDeleteActions() {
        return (AlertActions) this.mandatoryDeleteActions.getValue();
    }

    private final AlertActions getMandatoryDisableActions() {
        return (AlertActions) this.mandatoryDisableActions.getValue();
    }

    private final AlertActions getMandatoryWithOutActions() {
        return (AlertActions) this.mandatoryWithOutActions.getValue();
    }

    public final Job activeSusbscription(int subscriptionId) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new j(this, subscriptionId, null), 2, null);
        return launch$default;
    }

    public final Job deleteSubscription(int subscriptionId, boolean isUnregister) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new l(this, isUnregister, subscriptionId, null), 2, null);
        return launch$default;
    }

    public final void disableSubscription(int subscriptionId) {
        this.isDisable = true;
        this.subscriptionId = subscriptionId;
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_operation_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.subscription_operation_deactivate_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        fVar.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryDisableActions(), AlertType.INFO), null, 2, null));
    }

    public final void enableSubscription(int subscriptionId) {
        this.isDisable = false;
        this.subscriptionId = subscriptionId;
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_operation_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.subscription_operation_active_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        fVar.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryActiveActions(), AlertType.INFO), null, 2, null));
    }

    public final Q getDeleteSubscription() {
        return this._deleteSubscription;
    }

    public final Q getMuteSubscription() {
        return this._muteSubscription;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final Q getResultCreateSubscription() {
        return this._resultCreateSubscription;
    }

    public final Q getUserListSubscriptions() {
        return this._userListSubscriptions;
    }

    public final void handleDeleteAction() {
        deleteSubscription(this.subscriptionId, false);
    }

    public final void handleStatusAction(AlertAction.Style action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            loadSubscriptions$ui_subscriptions_proNon_corporateRelease();
        } else if (this.isDisable) {
            deleteSubscription(this.subscriptionId, true);
        } else {
            activeSusbscription(this.subscriptionId);
        }
    }

    public final Job loadSubscriptions$ui_subscriptions_proNon_corporateRelease() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getIO(), null, new n(this, null), 2, null);
        return launch$default;
    }

    public final Job muteSubscription(String stationId, String destinationId, String msgStart, String msgEnd, String repeat, String trainId) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new s(this, stationId, destinationId, msgStart, msgEnd, repeat, trainId, null), 2, null);
        return launch$default;
    }

    public final void onSelectedItem(Subscription data) {
        if (data != null) {
            this.navigationFlow.b(new Navigation.Direction(SubscriptionHomeFragmentDirections.INSTANCE.toEditSubscriptionFragment(TypeSubscriptionCreationView.MODIFICATION.getValue(), data.getTypeSubscription().getValue(), new Q2.d().f(data), null, null, null, null, false, null, null), null, 2, null));
        }
    }

    public final void showErrorDialog() {
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.generic_error_message_subscription);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        fVar.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryWithOutActions(), AlertType.ERROR), null, 2, null));
    }

    public final void deleteSubscription(int subscriptionId) {
        this.subscriptionId = subscriptionId;
        b1.f fVar = this.navigationFlow;
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_operation_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.subscription_operation_dele_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        fVar.b(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryDeleteActions(), AlertType.INFO), null, 2, null));
    }
}
