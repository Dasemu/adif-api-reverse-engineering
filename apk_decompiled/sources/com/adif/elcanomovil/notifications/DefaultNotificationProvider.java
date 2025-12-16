package com.adif.elcanomovil.notifications;

import C.u;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.provider.Settings;
import com.adif.elcanomovil.ElcanoApplication;
import com.adif.elcanomovil.R;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import com.adif.elcanomovil.lifecycle.AppStatus;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0011028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/adif/elcanomovil/notifications/DefaultNotificationProvider;", "Lcom/adif/elcanomovil/notifications/NotificationProvider;", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;", "notificationPayloadHandler", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "navigationIntents", "<init>", "(Landroid/content/Context;Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;)V", "Landroid/os/Bundle;", "message", "Lcom/adif/elcanomovil/lifecycle/AppStatus;", "statusApp", "", "logicNotification", "(Landroid/os/Bundle;Lcom/adif/elcanomovil/lifecycle/AppStatus;)V", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "notificationPayload", "pushForegroundNotification", "(Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;)V", "generateNotification", "", "channel", "channelID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;)V", "Landroid/app/PendingIntent;", "buildPendingIntentFromNavigation", "(Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;)Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "channelGroup", "Landroid/app/Notification;", "buildNotification", "(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;", "buildNotificationButton", "", "getUniqueId", "()I", AppMeasurementSdk.ConditionalUserProperty.NAME, "LC/u;", "buildGroupNotification", "(Landroid/content/Context;Ljava/lang/String;)LC/u;", "handleNotification", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "notificationsCreator", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "getNotifications", "()Lkotlinx/coroutines/flow/Flow;", "notifications", "Companion", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultNotificationProvider implements NotificationProvider {
    private static final String CHANNEL_DESCRIPTION = "Adif App";
    private static final String CHANNEL_GROUP_ADIF = "Adif";
    private static final String CHANNEL_GROUP_AVISA = "Avisa";
    private static final String CHANNEL_NAME = "Channel_adif";
    private static final String NOTIFICATION_JSON_AVISA_MESSAGE_TYPE = "300";
    private final Context context;
    private final NavigationIntents navigationIntents;
    private final NotificationPayloadHandler notificationPayloadHandler;
    private final MutableStateFlow<NotificationPayload> notificationsCreator;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppStatus.values().length];
            try {
                iArr[AppStatus.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultNotificationProvider(@ApplicationContext Context context, NotificationPayloadHandler notificationPayloadHandler, NavigationIntents navigationIntents) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationPayloadHandler, "notificationPayloadHandler");
        Intrinsics.checkNotNullParameter(navigationIntents, "navigationIntents");
        this.context = context;
        this.notificationPayloadHandler = notificationPayloadHandler;
        this.navigationIntents = navigationIntents;
        this.notificationsCreator = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [C.s, java.lang.Object, C.v] */
    private final u buildGroupNotification(Context context, String name) {
        u uVar = new u(context, context.getPackageName() + '-' + name);
        uVar.f265u.icon = R.drawable.ic_adif_logo_simple;
        uVar.f252e = u.b(name);
        uVar.f253f = u.b(context.getString(R.string.group_notificatiosen_for, name));
        ?? obj = new Object();
        obj.f247b = u.b(context.getString(R.string.group_notificatiosen_for, name));
        uVar.e(obj);
        uVar.c(true);
        uVar.f259n = true;
        uVar.f258m = name;
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [C.s, java.lang.Object, C.v] */
    private final Notification buildNotification(PendingIntent pendingIntent, String message, String channelGroup) {
        u uVar = new u(this.context, this.context.getPackageName() + '-' + channelGroup);
        uVar.f265u.icon = R.drawable.ic_adif_logo_simple;
        uVar.f252e = u.b(this.context.getString(R.string.not_title));
        uVar.f253f = u.b(message);
        uVar.c(true);
        uVar.f258m = channelGroup;
        ?? obj = new Object();
        obj.f247b = u.b(message);
        uVar.e(obj);
        uVar.f254g = pendingIntent;
        uVar.f255j = 2;
        uVar.d(-1);
        Notification a2 = uVar.a();
        Intrinsics.checkNotNullExpressionValue(a2, "build(...)");
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [C.s, java.lang.Object, C.v] */
    private final Notification buildNotificationButton(PendingIntent pendingIntent, String message, String channelGroup) {
        u uVar = new u(this.context, this.context.getPackageName() + '-' + channelGroup);
        uVar.f265u.icon = R.drawable.ic_adif_logo_simple;
        uVar.f252e = u.b(this.context.getString(R.string.not_title));
        uVar.f253f = u.b(message);
        uVar.f258m = channelGroup;
        ?? obj = new Object();
        obj.f247b = u.b(message);
        uVar.e(obj);
        uVar.c(true);
        uVar.f254g = pendingIntent;
        uVar.f255j = 2;
        uVar.d(-1);
        Notification a2 = uVar.a();
        Intrinsics.checkNotNullExpressionValue(a2, "build(...)");
        return a2;
    }

    private final PendingIntent buildPendingIntentFromNavigation(NotificationPayload notificationPayload) {
        if (notificationPayload instanceof NotificationPayload.Avisa) {
            return this.navigationIntents.createOpenAvisaViewPendingIntent(0, ((NotificationPayload.Avisa) notificationPayload).getIncidenceId());
        }
        if (notificationPayload instanceof NotificationPayload.Journey) {
            NotificationPayload.Journey journey = (NotificationPayload.Journey) notificationPayload;
            return this.navigationIntents.createOpenRoutesViewPendingIntent(0, journey.getOrigin(), journey.getDestination(), journey.getIsCercanias());
        }
        if (notificationPayload instanceof NotificationPayload.Train) {
            return this.navigationIntents.createOpenTrainViewPendingIntent(0, ((NotificationPayload.Train) notificationPayload).getCommercialNumber());
        }
        return null;
    }

    private final void generateNotification(NotificationPayload notificationPayload) {
        if (notificationPayload instanceof NotificationPayload.Avisa) {
            generateNotification(notificationPayload.getMessage(), CHANNEL_GROUP_AVISA, "300", notificationPayload);
        } else if (notificationPayload instanceof NotificationPayload.Journey) {
            generateNotification(notificationPayload.getMessage(), CHANNEL_GROUP_ADIF, ((NotificationPayload.Journey) notificationPayload).getType(), notificationPayload);
        } else if (notificationPayload instanceof NotificationPayload.Train) {
            generateNotification(notificationPayload.getMessage(), CHANNEL_GROUP_ADIF, ((NotificationPayload.Train) notificationPayload).getType(), notificationPayload);
        }
    }

    private final int getUniqueId() {
        return (int) (System.currentTimeMillis() % 10000);
    }

    private final void logicNotification(Bundle message, AppStatus statusApp) {
        NotificationPayload handlePayload = this.notificationPayloadHandler.handlePayload(message);
        if (handlePayload == null) {
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[statusApp.ordinal()] == 1) {
            pushForegroundNotification(handlePayload);
        } else {
            generateNotification(handlePayload);
        }
    }

    private final void pushForegroundNotification(NotificationPayload notificationPayload) {
        this.notificationsCreator.setValue(notificationPayload);
    }

    @Override // com.adif.elcanomovil.notifications.NotificationProvider
    public Flow<NotificationPayload> getNotifications() {
        return FlowKt.filterNotNull(this.notificationsCreator);
    }

    @Override // com.adif.elcanomovil.notifications.NotificationProvider
    public void handleNotification(Bundle message) {
        AppStatus appStatus;
        Intrinsics.checkNotNullParameter(message, "message");
        Context applicationContext = this.context.getApplicationContext();
        ElcanoApplication elcanoApplication = applicationContext instanceof ElcanoApplication ? (ElcanoApplication) applicationContext : null;
        if (elcanoApplication == null || (appStatus = elcanoApplication.getStatusApp()) == null) {
            appStatus = AppStatus.ON_STOP;
        }
        logicNotification(message, appStatus);
    }

    private final void generateNotification(String message, String channel, String channelID, NotificationPayload notificationPayload) {
        Notification buildNotificationButton;
        u buildGroupNotification = buildGroupNotification(this.context, channel);
        PendingIntent buildPendingIntentFromNavigation = buildPendingIntentFromNavigation(notificationPayload);
        if (Intrinsics.areEqual(channel, CHANNEL_GROUP_AVISA)) {
            Intrinsics.checkNotNull(buildPendingIntentFromNavigation);
            buildNotificationButton = buildNotification(buildPendingIntentFromNavigation, message, channel);
        } else {
            Intrinsics.checkNotNull(buildPendingIntentFromNavigation);
            buildNotificationButton = buildNotificationButton(buildPendingIntentFromNavigation, message, channel);
        }
        String str = this.context.getPackageName() + '-' + channel;
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel notificationChannel = new NotificationChannel(str, CHANNEL_NAME, 4);
        notificationChannel.setDescription(CHANNEL_DESCRIPTION);
        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, build);
        NotificationManager notificationManager2 = (NotificationManager) this.context.getSystemService(NotificationManager.class);
        Intrinsics.checkNotNull(notificationManager2);
        notificationManager2.createNotificationChannel(notificationChannel);
        notificationManager.notify(Integer.parseInt(channelID), buildGroupNotification.a());
        notificationManager.notify(getUniqueId(), buildNotificationButton);
    }
}
