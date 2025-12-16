package com.adif.elcanomovil.notifications;

import android.os.Bundle;
import com.adif.elcanomovil.domain.entities.CirculationType;
import com.adif.elcanomovil.domain.entities.notifications.NotificationPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/notifications/DefaultNotificationPayloadHandler;", "Lcom/adif/elcanomovil/notifications/NotificationPayloadHandler;", "()V", "handlePayload", "Lcom/adif/elcanomovil/domain/entities/notifications/NotificationPayload;", "bundle", "Landroid/os/Bundle;", "parseAvisaNotification", "parseCirculationNotification", "parseTrainNotification", "Companion", "app_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultNotificationPayloadHandler implements NotificationPayloadHandler {
    private static final String ARG_TYPE_NOTIFICATION_JSON_MESSAGE_END = "en";
    private static final String ARG_TYPE_NOTIFICATION_JSON_MESSAGE_REPEAT = "rp";
    private static final String ARG_TYPE_NOTIFICATION_JSON_MESSAGE_START = "st";
    private static final String NOTIFICATION_JSON_AVISA_ID = "incidenceId";
    private static final String NOTIFICATION_JSON_AVISA_MESSAGE_TYPE = "300";
    private static final String NOTIFICATION_JSON_AVISA_MSG = "body";
    private static final String NOTIFICATION_JSON_AVISA_TITLE = "title";
    private static final String NOTIFICATION_JSON_MESSAGE_DESTINATIONID = "d";
    private static final String NOTIFICATION_JSON_MESSAGE_STATIONID = "o";
    private static final String NOTIFICATION_JSON_MESSAGE_SUBSCRIPTION_TYPE = "su";
    private static final String NOTIFICATION_JSON_MESSAGE_TRAIN = "id";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_PATH_ALERT = "104";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_PATH_END = "102";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_PATH_START = "103";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_ALERT = "204";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_END = "202";
    private static final String NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_START = "203";
    private static final String NOTIFICATION_JSON_TYPE = "t";

    private final NotificationPayload parseAvisaNotification(Bundle bundle) {
        String string = bundle.getString(NOTIFICATION_JSON_AVISA_MSG);
        String string2 = bundle.getString("incidenceId");
        String string3 = bundle.getString(NOTIFICATION_JSON_AVISA_TITLE);
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        if (string == null) {
            string = "";
        }
        return new NotificationPayload.Avisa(string2, string3, string);
    }

    private final NotificationPayload parseCirculationNotification(Bundle bundle) {
        String string = bundle.getString("o");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("d");
        if (string2 == null) {
            string2 = "";
        }
        CirculationType circulationType = CirculationType.BETWEEN_STATIONS;
        boolean areEqual = Intrinsics.areEqual(bundle.getString("su"), "cercanias");
        String string3 = bundle.getString(NOTIFICATION_JSON_TYPE);
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle.getString("st");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = bundle.getString("en");
        if (string5 == null) {
            string5 = "";
        }
        String string6 = bundle.getString("rp");
        if (string6 == null) {
            string6 = "";
        }
        String string7 = bundle.getString(NOTIFICATION_JSON_AVISA_TITLE);
        if (string7 == null) {
            string7 = "";
        }
        String string8 = bundle.getString(NOTIFICATION_JSON_AVISA_MSG);
        return new NotificationPayload.Journey(string, string2, circulationType, areEqual, string3, string4, string5, string6, string7, string8 == null ? "" : string8);
    }

    private final NotificationPayload parseTrainNotification(Bundle bundle) {
        String string = bundle.getString("id");
        String str = string == null ? "" : string;
        String string2 = bundle.getString(NOTIFICATION_JSON_TYPE);
        String str2 = string2 == null ? "" : string2;
        String string3 = bundle.getString("st");
        String str3 = string3 == null ? "" : string3;
        String string4 = bundle.getString("en");
        String str4 = string4 == null ? "" : string4;
        String string5 = bundle.getString("rp");
        String str5 = string5 == null ? "" : string5;
        String string6 = bundle.getString(NOTIFICATION_JSON_AVISA_TITLE);
        String str6 = string6 == null ? "" : string6;
        String string7 = bundle.getString(NOTIFICATION_JSON_AVISA_MSG);
        return new NotificationPayload.Train(str, str2, str3, str4, str5, str6, string7 == null ? "" : string7);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001b. Please report as an issue. */
    @Override // com.adif.elcanomovil.notifications.NotificationPayloadHandler
    public NotificationPayload handlePayload(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString(NOTIFICATION_JSON_TYPE);
        if (string == null) {
            string = "";
        }
        int hashCode = string.hashCode();
        if (hashCode == 50547) {
            if (string.equals("300")) {
                return parseAvisaNotification(bundle);
            }
            return null;
        }
        switch (hashCode) {
            case 48627:
                if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_PATH_END)) {
                    return null;
                }
                break;
            case 48628:
                if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_PATH_START)) {
                    return null;
                }
                break;
            case 48629:
                if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_PATH_ALERT)) {
                    return null;
                }
                break;
            default:
                switch (hashCode) {
                    case 49588:
                        if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_END)) {
                            return null;
                        }
                        return parseTrainNotification(bundle);
                    case 49589:
                        if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_START)) {
                            return null;
                        }
                        return parseTrainNotification(bundle);
                    case 49590:
                        if (!string.equals(NOTIFICATION_JSON_MESSAGE_TYPE_TRAIN_ALERT)) {
                            return null;
                        }
                        return parseTrainNotification(bundle);
                    default:
                        return null;
                }
        }
        return parseCirculationNotification(bundle);
    }
}
