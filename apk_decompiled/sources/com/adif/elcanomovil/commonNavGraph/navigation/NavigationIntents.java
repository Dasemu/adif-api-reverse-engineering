package com.adif.elcanomovil.commonNavGraph.navigation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.arguments.NavArguments;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntentDestination;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ \u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createOpenAvisaViewIntent", "Landroid/content/Intent;", "incidenceId", "", "createOpenAvisaViewPendingIntent", "Landroid/app/PendingIntent;", "requestCode", "", "createOpenRoutesViewIntent", "originStationId", "destinationStationId", "isCercanias", "", "createOpenRoutesViewPendingIntent", "createOpenTrainViewIntent", NavArguments.ARG_DYNAMIC_LINKS_COMMERCIAL_NUMBER, "createOpenTrainViewPendingIntent", "decodeAvisaNotification", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$AvisaView;", "bundle", "Landroid/os/Bundle;", "decodePayload", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination;", "decodeRouteNotification", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$RoutesView;", "decodeTrainNotification", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntentDestination$TrainView;", "Companion", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationIntents {
    private static final String NOTIFICATION_JSON_AVISA_ID = "incidenceId";
    private static final String NOTIFICATION_JSON_MESSAGE_DESTINATIONID = "d";
    private static final String NOTIFICATION_JSON_MESSAGE_IS_CERCANIAS = "ce";
    private static final String NOTIFICATION_JSON_MESSAGE_STATIONID = "o";
    private static final String NOTIFICATION_JSON_MESSAGE_TRAIN_NUMBER = "trainNumber";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_AVISA = "300";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_ROUTE = "103";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN = "202";
    private static final String NOTIFICATION_JSON_TYPE = "t";
    private final Context context;

    @Inject
    public NavigationIntents(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Intent createOpenAvisaViewIntent(String incidenceId) {
        Intent launchIntentForPackage = this.context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.putExtra("incidenceId", incidenceId);
        launchIntentForPackage.putExtra(NOTIFICATION_JSON_TYPE, "300");
        return launchIntentForPackage;
    }

    private final Intent createOpenTrainViewIntent(String commercialNumber) {
        Intent launchIntentForPackage = this.context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.putExtra(NOTIFICATION_JSON_MESSAGE_TRAIN_NUMBER, commercialNumber);
        launchIntentForPackage.putExtra(NOTIFICATION_JSON_TYPE, NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN);
        return launchIntentForPackage;
    }

    private final NavigationIntentDestination.AvisaView decodeAvisaNotification(Bundle bundle) {
        String string = bundle.getString("incidenceId");
        if (string == null) {
            return null;
        }
        return new NavigationIntentDestination.AvisaView(string);
    }

    private final NavigationIntentDestination.RoutesView decodeRouteNotification(Bundle bundle) {
        String string;
        String string2 = bundle.getString("o");
        if (string2 == null || (string = bundle.getString("d")) == null) {
            return null;
        }
        return new NavigationIntentDestination.RoutesView(string2, string, bundle.getBoolean("ce"));
    }

    private final NavigationIntentDestination.TrainView decodeTrainNotification(Bundle bundle) {
        String string = bundle.getString(NOTIFICATION_JSON_MESSAGE_TRAIN_NUMBER);
        if (string == null) {
            return null;
        }
        return new NavigationIntentDestination.TrainView(string);
    }

    public final PendingIntent createOpenAvisaViewPendingIntent(int requestCode, String incidenceId) {
        Intrinsics.checkNotNullParameter(incidenceId, "incidenceId");
        Intent createOpenAvisaViewIntent = createOpenAvisaViewIntent(incidenceId);
        if (createOpenAvisaViewIntent != null) {
            return NavigationIntentsKt.toPendingActivityIntent(createOpenAvisaViewIntent, this.context, requestCode);
        }
        return null;
    }

    public final Intent createOpenRoutesViewIntent(String originStationId, String destinationStationId, boolean isCercanias) {
        Intrinsics.checkNotNullParameter(originStationId, "originStationId");
        Intrinsics.checkNotNullParameter(destinationStationId, "destinationStationId");
        Intent launchIntentForPackage = this.context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(268435456);
        launchIntentForPackage.putExtra("o", originStationId);
        launchIntentForPackage.putExtra("d", destinationStationId);
        launchIntentForPackage.putExtra("ce", isCercanias);
        launchIntentForPackage.putExtra(NOTIFICATION_JSON_TYPE, NOTIFICATION_JSON_MESSAGE_TYPE_ROUTE);
        return launchIntentForPackage;
    }

    public final PendingIntent createOpenRoutesViewPendingIntent(int requestCode, String originStationId, String destinationStationId, boolean isCercanias) {
        Intrinsics.checkNotNullParameter(originStationId, "originStationId");
        Intrinsics.checkNotNullParameter(destinationStationId, "destinationStationId");
        Intent createOpenRoutesViewIntent = createOpenRoutesViewIntent(originStationId, destinationStationId, isCercanias);
        if (createOpenRoutesViewIntent != null) {
            return NavigationIntentsKt.toPendingActivityIntent(createOpenRoutesViewIntent, this.context, requestCode);
        }
        return null;
    }

    public final PendingIntent createOpenTrainViewPendingIntent(int requestCode, String commercialNumber) {
        Intrinsics.checkNotNullParameter(commercialNumber, "commercialNumber");
        Intent createOpenTrainViewIntent = createOpenTrainViewIntent(commercialNumber);
        if (createOpenTrainViewIntent != null) {
            return NavigationIntentsKt.toPendingActivityIntent(createOpenTrainViewIntent, this.context, requestCode);
        }
        return null;
    }

    public final NavigationIntentDestination decodePayload(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString(NOTIFICATION_JSON_TYPE);
        if (string == null) {
            return null;
        }
        int hashCode = string.hashCode();
        if (hashCode == 48628) {
            if (string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_ROUTE)) {
                return decodeRouteNotification(bundle);
            }
            return null;
        }
        if (hashCode == 49588) {
            if (string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN)) {
                return decodeTrainNotification(bundle);
            }
            return null;
        }
        if (hashCode == 50547 && string.equals("300")) {
            return decodeAvisaNotification(bundle);
        }
        return null;
    }
}
