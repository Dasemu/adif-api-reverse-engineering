package com.adif.elcanomovil.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import b1.InterfaceC0266a;
import com.adif.elcanomovil.commonNavGraph.arguments.BottomNavInitialTab;
import com.adif.elcanomovil.commonNavGraph.arguments.ChildDirections;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.DeeplinkRoutes;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntentDestination;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.TrainType;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import com.adif.elcanomovil.domain.usecases.DynamicLinkUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.MuteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.tabs.TabDataHolder;
import com.adif.elcanomovil.notifications.NotificationProvider;
import com.adif.elcanomovil.serviceNetworking.ServicePaths;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J1\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b,\u0010\u0017J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b-\u0010\u0017J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b.\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020(058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002060:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020(0:8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020B0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/adif/elcanomovil/main/MainViewModel;", "Landroidx/lifecycle/w0;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "dynamicLinkUseCase", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "tabDataHolder", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "notificationProvider", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "muteSubscriptionsUseCase", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "navigationIntents", "<init>", "(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;Lcom/adif/elcanomovil/notifications/NotificationProvider;Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;)V", "", "observeForegroundNotifications", "()V", "requestFirebaseMessagingToken", "Landroid/content/Intent;", "intent", "checkForDynamicLink", "(Landroid/content/Intent;)V", "checkForNotification", "", "origin", FirebaseAnalytics.Param.DESTINATION, "Lcom/adif/elcanomovil/domain/entities/CirculationType;", "circulationType", "", "isCercanias", "navigateToDepartures", "(Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/CirculationType;Z)V", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "navigateToTrainDetails", "(Ljava/lang/String;)V", ServicePaths.IncidenceService.pathIncidenceId, "navigateToAvisaIssueDetails", "navigateToAvisaHome", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "notificationPayload", "muteSubscription", "(Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;)V", "onNewIntent", "handleOnCreate", "handleSnackBarTap", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/adif/elcanomovil/domain/usecases/DynamicLinkUseCase;", "Lcom/adif/elcanomovil/domain/usecases/tabs/TabDataHolder;", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "Lcom/adif/elcanomovil/domain/usecases/subscriptions/subscriptions/MuteSubscriptionsUseCase;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "Lb1/f;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "navigationEventCreator", "Lb1/f;", "snackBarEventCreator", "Lb1/a;", "navigation", "Lb1/a;", "getNavigation", "()Lb1/a;", "snackBarEvent", "getSnackBarEvent", "Lkotlinx/coroutines/channels/Channel;", "Landroid/net/Uri;", "_deepLinkNavigation", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "deepLinkNavigation", "Lkotlinx/coroutines/flow/Flow;", "getDeepLinkNavigation", "()Lkotlinx/coroutines/flow/Flow;", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainViewModel extends w0 {
    private final Channel<Uri> _deepLinkNavigation;
    private final Flow<Uri> deepLinkNavigation;
    private final DynamicLinkUseCase dynamicLinkUseCase;
    private final FirebaseMessaging firebaseMessaging;
    private final MuteSubscriptionsUseCase muteSubscriptionsUseCase;
    private final InterfaceC0266a navigation;
    private final b1.f navigationEventCreator;
    private final NavigationIntents navigationIntents;
    private final NotificationProvider notificationProvider;
    private final InterfaceC0266a snackBarEvent;
    private final b1.f snackBarEventCreator;
    private final TabDataHolder tabDataHolder;

    @Inject
    public MainViewModel(FirebaseMessaging firebaseMessaging, DynamicLinkUseCase dynamicLinkUseCase, TabDataHolder tabDataHolder, NotificationProvider notificationProvider, MuteSubscriptionsUseCase muteSubscriptionsUseCase, NavigationIntents navigationIntents) {
        Intrinsics.checkNotNullParameter(firebaseMessaging, "firebaseMessaging");
        Intrinsics.checkNotNullParameter(dynamicLinkUseCase, "dynamicLinkUseCase");
        Intrinsics.checkNotNullParameter(tabDataHolder, "tabDataHolder");
        Intrinsics.checkNotNullParameter(notificationProvider, "notificationProvider");
        Intrinsics.checkNotNullParameter(muteSubscriptionsUseCase, "muteSubscriptionsUseCase");
        Intrinsics.checkNotNullParameter(navigationIntents, "navigationIntents");
        this.firebaseMessaging = firebaseMessaging;
        this.dynamicLinkUseCase = dynamicLinkUseCase;
        this.tabDataHolder = tabDataHolder;
        this.notificationProvider = notificationProvider;
        this.muteSubscriptionsUseCase = muteSubscriptionsUseCase;
        this.navigationIntents = navigationIntents;
        b1.f fVar = new b1.f();
        this.navigationEventCreator = fVar;
        b1.f fVar2 = new b1.f();
        this.snackBarEventCreator = fVar2;
        this.navigation = fVar;
        this.snackBarEvent = fVar2;
        Channel<Uri> Channel$default = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        this._deepLinkNavigation = Channel$default;
        this.deepLinkNavigation = FlowKt.receiveAsFlow(Channel$default);
    }

    public static final /* synthetic */ b1.f access$getSnackBarEventCreator$p(MainViewModel mainViewModel) {
        return mainViewModel.snackBarEventCreator;
    }

    private final void checkForDynamicLink(Intent intent) {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new v(this, intent, null), 3, null);
    }

    private final void checkForNotification(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        NavigationIntentDestination decodePayload = this.navigationIntents.decodePayload(extras);
        if (decodePayload instanceof NavigationIntentDestination.RoutesView) {
            NavigationIntentDestination.RoutesView routesView = (NavigationIntentDestination.RoutesView) decodePayload;
            navigateToDepartures(routesView.getOriginStationId(), routesView.getDestinationStationId(), CirculationType.BETWEEN_STATIONS, routesView.isCercanias());
        } else if (decodePayload instanceof NavigationIntentDestination.TrainView) {
            navigateToTrainDetails(((NavigationIntentDestination.TrainView) decodePayload).getCommercialNumber());
        } else if (decodePayload instanceof NavigationIntentDestination.AvisaView) {
            navigateToAvisaIssueDetails(((NavigationIntentDestination.AvisaView) decodePayload).getIncidenceId());
        }
    }

    private final void muteSubscription(NotificationPayload notificationPayload) {
        if (notificationPayload instanceof NotificationPayload.Journey) {
            NotificationPayload.Journey journey = (NotificationPayload.Journey) notificationPayload;
            this.muteSubscriptionsUseCase.invoke(journey.getOrigin(), journey.getDestination(), journey.getStart(), journey.getEnd(), journey.getRepeat(), null);
        } else if (!(notificationPayload instanceof NotificationPayload.Train)) {
            boolean z3 = notificationPayload instanceof NotificationPayload.Avisa;
        } else {
            NotificationPayload.Train train = (NotificationPayload.Train) notificationPayload;
            this.muteSubscriptionsUseCase.invoke(null, null, train.getStart(), train.getEnd(), train.getRepeat(), train.getCommercialNumber());
        }
    }

    private final void navigateToAvisaHome() {
        ChildDirections.Companion companion = ChildDirections.INSTANCE;
        Uri build = Uri.parse(DeeplinkRoutes.avisa).buildUpon().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.navigationEventCreator.b(new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toBottomNav(new BottomNavInitialTab.MoreAdif(companion.fromRoutes(build))), null, 2, null));
    }

    private final void navigateToAvisaIssueDetails(String r4) {
        if (StringsKt.isBlank(r4)) {
            navigateToAvisaHome();
            return;
        }
        ChildDirections.Companion companion = ChildDirections.INSTANCE;
        Uri build = Uri.parse(DeeplinkRoutes.avisaIncidenceDetails).buildUpon().appendQueryParameter(NavArguments.ARG_AVISA_INCIDENCE_ID, r4).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.navigationEventCreator.b(new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toBottomNav(new BottomNavInitialTab.MoreAdif(companion.fromRoutes(build))), null, 2, null));
    }

    public final void navigateToDepartures(String origin, String r4, CirculationType circulationType, boolean isCercanias) {
        this.tabDataHolder.push(new TabDataHolder.TabData.Departures(origin, r4, circulationType, isCercanias ? TrainType.CERCANIAS : TrainType.AVELDMD));
        this.navigationEventCreator.b(new Navigation.Direction(BottomNavFragmentDirections.INSTANCE.toBottomNav(BottomNavInitialTab.INSTANCE.getDEPARTURES()), null, 2, null));
    }

    public final void navigateToTrainDetails(String r22) {
        this._deepLinkNavigation.mo1630trySendJP2dKIU(DeeplinkRoutes.INSTANCE.getTrainDetailsLink(r22));
    }

    private final void observeForegroundNotifications() {
        BuildersKt__Builders_commonKt.launch$default(q0.j(this), null, null, new w(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestFirebaseMessagingToken() {
        this.firebaseMessaging.getToken().addOnCompleteListener(new Object());
    }

    public static final void requestFirebaseMessagingToken$lambda$0(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            return;
        }
        Intrinsics.checkNotNullParameter("getInstanceId failed", "message");
        t3.c.f8551a.a("getInstanceId failed", new Object[0]);
    }

    public final Flow<Uri> getDeepLinkNavigation() {
        return this.deepLinkNavigation;
    }

    public final InterfaceC0266a getNavigation() {
        return this.navigation;
    }

    public final InterfaceC0266a getSnackBarEvent() {
        return this.snackBarEvent;
    }

    public final void handleOnCreate(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        requestFirebaseMessagingToken();
        checkForDynamicLink(intent);
        observeForegroundNotifications();
    }

    public final void handleSnackBarTap(NotificationPayload notificationPayload) {
        Intrinsics.checkNotNullParameter(notificationPayload, "notificationPayload");
        if (notificationPayload instanceof NotificationPayload.Avisa) {
            navigateToAvisaIssueDetails(((NotificationPayload.Avisa) notificationPayload).getIncidenceId());
        } else {
            muteSubscription(notificationPayload);
        }
    }

    public final void onNewIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        checkForDynamicLink(intent);
        checkForNotification(intent);
    }
}
